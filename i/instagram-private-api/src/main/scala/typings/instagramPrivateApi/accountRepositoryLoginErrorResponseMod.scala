package typings.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accountRepositoryLoginErrorResponseMod {
  
  trait AccountRepositoryLoginBadPasswordResponseButtonsItem extends StObject {
    
    var action: String
    
    var title: String
  }
  object AccountRepositoryLoginBadPasswordResponseButtonsItem {
    
    @scala.inline
    def apply(action: String, title: String): AccountRepositoryLoginBadPasswordResponseButtonsItem = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccountRepositoryLoginBadPasswordResponseButtonsItem]
    }
    
    @scala.inline
    implicit class AccountRepositoryLoginBadPasswordResponseButtonsItemMutableBuilder[Self <: AccountRepositoryLoginBadPasswordResponseButtonsItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait AccountRepositoryLoginErrorResponse extends StObject {
    
    var buttons: js.Array[AccountRepositoryLoginBadPasswordResponseButtonsItem]
    
    var error_title: String
    
    var error_type: String
    
    var invalid_credentials: Boolean
    
    var message: String
    
    var phone_verification_settings: AccountRepositoryLoginErrorResponsePhoneVerificationSettings
    
    var status: String
    
    var two_factor_info: AccountRepositoryLoginErrorResponseTwoFactorInfo
    
    var two_factor_required: Boolean
  }
  object AccountRepositoryLoginErrorResponse {
    
    @scala.inline
    def apply(
      buttons: js.Array[AccountRepositoryLoginBadPasswordResponseButtonsItem],
      error_title: String,
      error_type: String,
      invalid_credentials: Boolean,
      message: String,
      phone_verification_settings: AccountRepositoryLoginErrorResponsePhoneVerificationSettings,
      status: String,
      two_factor_info: AccountRepositoryLoginErrorResponseTwoFactorInfo,
      two_factor_required: Boolean
    ): AccountRepositoryLoginErrorResponse = {
      val __obj = js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any], error_title = error_title.asInstanceOf[js.Any], error_type = error_type.asInstanceOf[js.Any], invalid_credentials = invalid_credentials.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], phone_verification_settings = phone_verification_settings.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], two_factor_info = two_factor_info.asInstanceOf[js.Any], two_factor_required = two_factor_required.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccountRepositoryLoginErrorResponse]
    }
    
    @scala.inline
    implicit class AccountRepositoryLoginErrorResponseMutableBuilder[Self <: AccountRepositoryLoginErrorResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setButtons(value: js.Array[AccountRepositoryLoginBadPasswordResponseButtonsItem]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonsVarargs(value: AccountRepositoryLoginBadPasswordResponseButtonsItem*): Self = StObject.set(x, "buttons", js.Array(value :_*))
      
      @scala.inline
      def setError_title(value: String): Self = StObject.set(x, "error_title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError_type(value: String): Self = StObject.set(x, "error_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvalid_credentials(value: Boolean): Self = StObject.set(x, "invalid_credentials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhone_verification_settings(value: AccountRepositoryLoginErrorResponsePhoneVerificationSettings): Self = StObject.set(x, "phone_verification_settings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTwo_factor_info(value: AccountRepositoryLoginErrorResponseTwoFactorInfo): Self = StObject.set(x, "two_factor_info", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTwo_factor_required(value: Boolean): Self = StObject.set(x, "two_factor_required", value.asInstanceOf[js.Any])
    }
  }
  
  trait AccountRepositoryLoginErrorResponsePhoneVerificationSettings extends StObject {
    
    var max_sms_count: Double
    
    var resend_sms_delay_sec: Double
    
    var robocall_after_max_sms: Boolean
    
    var robocall_count_down_time_sec: Double
  }
  object AccountRepositoryLoginErrorResponsePhoneVerificationSettings {
    
    @scala.inline
    def apply(
      max_sms_count: Double,
      resend_sms_delay_sec: Double,
      robocall_after_max_sms: Boolean,
      robocall_count_down_time_sec: Double
    ): AccountRepositoryLoginErrorResponsePhoneVerificationSettings = {
      val __obj = js.Dynamic.literal(max_sms_count = max_sms_count.asInstanceOf[js.Any], resend_sms_delay_sec = resend_sms_delay_sec.asInstanceOf[js.Any], robocall_after_max_sms = robocall_after_max_sms.asInstanceOf[js.Any], robocall_count_down_time_sec = robocall_count_down_time_sec.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccountRepositoryLoginErrorResponsePhoneVerificationSettings]
    }
    
    @scala.inline
    implicit class AccountRepositoryLoginErrorResponsePhoneVerificationSettingsMutableBuilder[Self <: AccountRepositoryLoginErrorResponsePhoneVerificationSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMax_sms_count(value: Double): Self = StObject.set(x, "max_sms_count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResend_sms_delay_sec(value: Double): Self = StObject.set(x, "resend_sms_delay_sec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRobocall_after_max_sms(value: Boolean): Self = StObject.set(x, "robocall_after_max_sms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRobocall_count_down_time_sec(value: Double): Self = StObject.set(x, "robocall_count_down_time_sec", value.asInstanceOf[js.Any])
    }
  }
  
  trait AccountRepositoryLoginErrorResponseTwoFactorInfo extends StObject {
    
    var obfuscated_phone_number: String
    
    var phone_verification_settings: AccountRepositoryLoginErrorResponsePhoneVerificationSettings
    
    var show_messenger_code_option: Boolean
    
    var show_new_login_screen: Boolean
    
    var show_trusted_device_option: Boolean
    
    var sms_two_factor_on: Boolean
    
    var totp_two_factor_on: Boolean
    
    var two_factor_identifier: String
    
    var username: String
  }
  object AccountRepositoryLoginErrorResponseTwoFactorInfo {
    
    @scala.inline
    def apply(
      obfuscated_phone_number: String,
      phone_verification_settings: AccountRepositoryLoginErrorResponsePhoneVerificationSettings,
      show_messenger_code_option: Boolean,
      show_new_login_screen: Boolean,
      show_trusted_device_option: Boolean,
      sms_two_factor_on: Boolean,
      totp_two_factor_on: Boolean,
      two_factor_identifier: String,
      username: String
    ): AccountRepositoryLoginErrorResponseTwoFactorInfo = {
      val __obj = js.Dynamic.literal(obfuscated_phone_number = obfuscated_phone_number.asInstanceOf[js.Any], phone_verification_settings = phone_verification_settings.asInstanceOf[js.Any], show_messenger_code_option = show_messenger_code_option.asInstanceOf[js.Any], show_new_login_screen = show_new_login_screen.asInstanceOf[js.Any], show_trusted_device_option = show_trusted_device_option.asInstanceOf[js.Any], sms_two_factor_on = sms_two_factor_on.asInstanceOf[js.Any], totp_two_factor_on = totp_two_factor_on.asInstanceOf[js.Any], two_factor_identifier = two_factor_identifier.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccountRepositoryLoginErrorResponseTwoFactorInfo]
    }
    
    @scala.inline
    implicit class AccountRepositoryLoginErrorResponseTwoFactorInfoMutableBuilder[Self <: AccountRepositoryLoginErrorResponseTwoFactorInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setObfuscated_phone_number(value: String): Self = StObject.set(x, "obfuscated_phone_number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhone_verification_settings(value: AccountRepositoryLoginErrorResponsePhoneVerificationSettings): Self = StObject.set(x, "phone_verification_settings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShow_messenger_code_option(value: Boolean): Self = StObject.set(x, "show_messenger_code_option", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShow_new_login_screen(value: Boolean): Self = StObject.set(x, "show_new_login_screen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShow_trusted_device_option(value: Boolean): Self = StObject.set(x, "show_trusted_device_option", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSms_two_factor_on(value: Boolean): Self = StObject.set(x, "sms_two_factor_on", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotp_two_factor_on(value: Boolean): Self = StObject.set(x, "totp_two_factor_on", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTwo_factor_identifier(value: String): Self = StObject.set(x, "two_factor_identifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
}
