package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResetPasswordResponse extends StObject {
  
  /**
    * The user's email. If the out-of-band code is for email recovery, the user's original email.
    */
  var email: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The fixed string "identitytoolkit#ResetPasswordResponse".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If the out-of-band code is for email recovery, the user's new email.
    */
  var newEmail: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The request type.
    */
  var requestType: js.UndefOr[String | Null] = js.undefined
}
object SchemaResetPasswordResponse {
  
  inline def apply(): SchemaResetPasswordResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResetPasswordResponse]
  }
  
  extension [Self <: SchemaResetPasswordResponse](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNewEmail(value: String): Self = StObject.set(x, "newEmail", value.asInstanceOf[js.Any])
    
    inline def setNewEmailNull: Self = StObject.set(x, "newEmail", null)
    
    inline def setNewEmailUndefined: Self = StObject.set(x, "newEmail", js.undefined)
    
    inline def setRequestType(value: String): Self = StObject.set(x, "requestType", value.asInstanceOf[js.Any])
    
    inline def setRequestTypeNull: Self = StObject.set(x, "requestType", null)
    
    inline def setRequestTypeUndefined: Self = StObject.set(x, "requestType", js.undefined)
  }
}
