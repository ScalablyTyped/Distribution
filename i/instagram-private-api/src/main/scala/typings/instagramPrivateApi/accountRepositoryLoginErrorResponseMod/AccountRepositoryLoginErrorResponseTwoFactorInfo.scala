package typings.instagramPrivateApi.accountRepositoryLoginErrorResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountRepositoryLoginErrorResponseTwoFactorInfo extends js.Object {
  
  var obfuscated_phone_number: String = js.native
  
  var phone_verification_settings: AccountRepositoryLoginErrorResponsePhoneVerificationSettings = js.native
  
  var show_messenger_code_option: Boolean = js.native
  
  var show_new_login_screen: Boolean = js.native
  
  var show_trusted_device_option: Boolean = js.native
  
  var sms_two_factor_on: Boolean = js.native
  
  var totp_two_factor_on: Boolean = js.native
  
  var two_factor_identifier: String = js.native
  
  var username: String = js.native
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
  implicit class AccountRepositoryLoginErrorResponseTwoFactorInfoOps[Self <: AccountRepositoryLoginErrorResponseTwoFactorInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setObfuscated_phone_number(value: String): Self = this.set("obfuscated_phone_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhone_verification_settings(value: AccountRepositoryLoginErrorResponsePhoneVerificationSettings): Self = this.set("phone_verification_settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShow_messenger_code_option(value: Boolean): Self = this.set("show_messenger_code_option", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShow_new_login_screen(value: Boolean): Self = this.set("show_new_login_screen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShow_trusted_device_option(value: Boolean): Self = this.set("show_trusted_device_option", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSms_two_factor_on(value: Boolean): Self = this.set("sms_two_factor_on", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotp_two_factor_on(value: Boolean): Self = this.set("totp_two_factor_on", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwo_factor_identifier(value: String): Self = this.set("two_factor_identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
  }
}
