package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGetOobConfirmationCodeResponse extends StObject {
  
  /**
    * The email address that the email is sent to.
    */
  var email: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The fixed string "identitytoolkit#GetOobConfirmationCodeResponse".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The code to be send to the user.
    */
  var oobCode: js.UndefOr[String | Null] = js.undefined
}
object SchemaGetOobConfirmationCodeResponse {
  
  inline def apply(): SchemaGetOobConfirmationCodeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetOobConfirmationCodeResponse]
  }
  
  extension [Self <: SchemaGetOobConfirmationCodeResponse](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setOobCode(value: String): Self = StObject.set(x, "oobCode", value.asInstanceOf[js.Any])
    
    inline def setOobCodeNull: Self = StObject.set(x, "oobCode", null)
    
    inline def setOobCodeUndefined: Self = StObject.set(x, "oobCode", js.undefined)
  }
}
