package typings.instagramPrivateApi.accountRepositoryLoginErrorResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountRepositoryLoginErrorResponseTwoFactorInfo extends js.Object {
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
}

