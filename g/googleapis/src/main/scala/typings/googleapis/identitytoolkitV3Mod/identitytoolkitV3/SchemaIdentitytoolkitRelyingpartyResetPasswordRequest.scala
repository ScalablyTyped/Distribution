package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIdentitytoolkitRelyingpartyResetPasswordRequest extends StObject {
  
  /**
    * The email address of the user.
    */
  var email: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The new password inputted by the user.
    */
  var newPassword: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The old password inputted by the user.
    */
  var oldPassword: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The confirmation code.
    */
  var oobCode: js.UndefOr[String | Null] = js.undefined
}
object SchemaIdentitytoolkitRelyingpartyResetPasswordRequest {
  
  inline def apply(): SchemaIdentitytoolkitRelyingpartyResetPasswordRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIdentitytoolkitRelyingpartyResetPasswordRequest]
  }
  
  extension [Self <: SchemaIdentitytoolkitRelyingpartyResetPasswordRequest](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setNewPassword(value: String): Self = StObject.set(x, "newPassword", value.asInstanceOf[js.Any])
    
    inline def setNewPasswordNull: Self = StObject.set(x, "newPassword", null)
    
    inline def setNewPasswordUndefined: Self = StObject.set(x, "newPassword", js.undefined)
    
    inline def setOldPassword(value: String): Self = StObject.set(x, "oldPassword", value.asInstanceOf[js.Any])
    
    inline def setOldPasswordNull: Self = StObject.set(x, "oldPassword", null)
    
    inline def setOldPasswordUndefined: Self = StObject.set(x, "oldPassword", js.undefined)
    
    inline def setOobCode(value: String): Self = StObject.set(x, "oobCode", value.asInstanceOf[js.Any])
    
    inline def setOobCodeNull: Self = StObject.set(x, "oobCode", null)
    
    inline def setOobCodeUndefined: Self = StObject.set(x, "oobCode", js.undefined)
  }
}
