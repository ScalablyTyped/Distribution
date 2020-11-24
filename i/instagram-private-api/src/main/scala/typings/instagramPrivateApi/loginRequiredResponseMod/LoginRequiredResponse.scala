package typings.instagramPrivateApi.loginRequiredResponseMod

import typings.instagramPrivateApi.instagramPrivateApiStrings.fail
import typings.instagramPrivateApi.instagramPrivateApiStrings.login_required
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoginRequiredResponse extends js.Object {
  
  var logout_reason: Double = js.native
  
  var message: login_required = js.native
  
  var status: fail = js.native
}
object LoginRequiredResponse {
  
  @scala.inline
  def apply(logout_reason: Double, message: login_required, status: fail): LoginRequiredResponse = {
    val __obj = js.Dynamic.literal(logout_reason = logout_reason.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginRequiredResponse]
  }
  
  @scala.inline
  implicit class LoginRequiredResponseOps[Self <: LoginRequiredResponse] (val x: Self) extends AnyVal {
    
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
    def setLogout_reason(value: Double): Self = this.set("logout_reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: login_required): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: fail): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
