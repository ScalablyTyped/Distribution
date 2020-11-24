package typings.instagramPrivateApi.accountRepositoryLoginErrorResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountRepositoryLoginErrorResponse extends js.Object {
  
  var buttons: js.Array[AccountRepositoryLoginBadPasswordResponseButtonsItem] = js.native
  
  var error_title: String = js.native
  
  var error_type: String = js.native
  
  var invalid_credentials: Boolean = js.native
  
  var message: String = js.native
  
  var phone_verification_settings: AccountRepositoryLoginErrorResponsePhoneVerificationSettings = js.native
  
  var status: String = js.native
  
  var two_factor_info: AccountRepositoryLoginErrorResponseTwoFactorInfo = js.native
  
  var two_factor_required: Boolean = js.native
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
  implicit class AccountRepositoryLoginErrorResponseOps[Self <: AccountRepositoryLoginErrorResponse] (val x: Self) extends AnyVal {
    
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
    def setButtonsVarargs(value: AccountRepositoryLoginBadPasswordResponseButtonsItem*): Self = this.set("buttons", js.Array(value :_*))
    
    @scala.inline
    def setButtons(value: js.Array[AccountRepositoryLoginBadPasswordResponseButtonsItem]): Self = this.set("buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError_title(value: String): Self = this.set("error_title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError_type(value: String): Self = this.set("error_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalid_credentials(value: Boolean): Self = this.set("invalid_credentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhone_verification_settings(value: AccountRepositoryLoginErrorResponsePhoneVerificationSettings): Self = this.set("phone_verification_settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwo_factor_info(value: AccountRepositoryLoginErrorResponseTwoFactorInfo): Self = this.set("two_factor_info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwo_factor_required(value: Boolean): Self = this.set("two_factor_required", value.asInstanceOf[js.Any])
  }
}
