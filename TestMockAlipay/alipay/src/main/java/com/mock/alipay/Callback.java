package com.mock.alipay;


public interface Callback {

    void onForgetPassword();

    void onInputCompleted(CharSequence password);

    void onPasswordCorrectly();

    void onCancel();
}
