package typings.instagramPrivateApi

import typings.instagramPrivateApi.instagramPrivateApiStrings.fail
import typings.instagramPrivateApi.instagramPrivateApiStrings.login_required
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loginRequiredResponseMod {
  
  @js.native
  trait LoginRequiredResponse extends StObject {
    
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
    implicit class LoginRequiredResponseMutableBuilder[Self <: LoginRequiredResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLogout_reason(value: Double): Self = StObject.set(x, "logout_reason", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: login_required): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: fail): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
