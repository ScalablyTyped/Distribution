package typings.instagramDashPrivateDashApi.distResponsesAccountDotRepositoryDotLoginDotErrorDotResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountRepositoryLoginErrorResponse extends js.Object {
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
    val __obj = js.Dynamic.literal(buttons = buttons, error_title = error_title, error_type = error_type, invalid_credentials = invalid_credentials, message = message, phone_verification_settings = phone_verification_settings, status = status, two_factor_info = two_factor_info, two_factor_required = two_factor_required)
  
    __obj.asInstanceOf[AccountRepositoryLoginErrorResponse]
  }
}

