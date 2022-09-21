package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRequestPhoneVerificationResponse extends StObject {
  
  /**
    * The verification ID to use in subsequent calls to `verifyphonenumber`.
    */
  var verificationId: js.UndefOr[String | Null] = js.undefined
}
object SchemaRequestPhoneVerificationResponse {
  
  inline def apply(): SchemaRequestPhoneVerificationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRequestPhoneVerificationResponse]
  }
  
  extension [Self <: SchemaRequestPhoneVerificationResponse](x: Self) {
    
    inline def setVerificationId(value: String): Self = StObject.set(x, "verificationId", value.asInstanceOf[js.Any])
    
    inline def setVerificationIdNull: Self = StObject.set(x, "verificationId", null)
    
    inline def setVerificationIdUndefined: Self = StObject.set(x, "verificationId", js.undefined)
  }
}
