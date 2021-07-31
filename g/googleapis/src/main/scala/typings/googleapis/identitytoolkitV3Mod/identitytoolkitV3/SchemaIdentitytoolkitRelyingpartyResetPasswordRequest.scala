package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request to reset the password.
  */
trait SchemaIdentitytoolkitRelyingpartyResetPasswordRequest extends StObject {
  
  /**
    * The email address of the user.
    */
  var email: js.UndefOr[String] = js.undefined
  
  /**
    * The new password inputted by the user.
    */
  var newPassword: js.UndefOr[String] = js.undefined
  
  /**
    * The old password inputted by the user.
    */
  var oldPassword: js.UndefOr[String] = js.undefined
  
  /**
    * The confirmation code.
    */
  var oobCode: js.UndefOr[String] = js.undefined
}
object SchemaIdentitytoolkitRelyingpartyResetPasswordRequest {
  
  @scala.inline
  def apply(): SchemaIdentitytoolkitRelyingpartyResetPasswordRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIdentitytoolkitRelyingpartyResetPasswordRequest]
  }
  
  @scala.inline
  implicit class SchemaIdentitytoolkitRelyingpartyResetPasswordRequestMutableBuilder[Self <: SchemaIdentitytoolkitRelyingpartyResetPasswordRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setNewPassword(value: String): Self = StObject.set(x, "newPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewPasswordUndefined: Self = StObject.set(x, "newPassword", js.undefined)
    
    @scala.inline
    def setOldPassword(value: String): Self = StObject.set(x, "oldPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldPasswordUndefined: Self = StObject.set(x, "oldPassword", js.undefined)
    
    @scala.inline
    def setOobCode(value: String): Self = StObject.set(x, "oobCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOobCodeUndefined: Self = StObject.set(x, "oobCode", js.undefined)
  }
}
