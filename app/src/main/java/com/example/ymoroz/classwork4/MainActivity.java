package com.example.ymoroz.classwork4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.label1)
    TextView label1;
    @BindView(R.id.button1)
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @OnClick(R.id.button1)
    void clicked(){
        label1.setText("clicked!");
    }
}
