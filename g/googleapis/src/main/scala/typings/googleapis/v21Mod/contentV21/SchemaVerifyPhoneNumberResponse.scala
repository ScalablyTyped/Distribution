package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVerifyPhoneNumberResponse extends StObject {
  
  /**
    * Verified phone number if verification is successful. This phone number can only be replaced by another verified phone number.
    */
  var verifiedPhoneNumber: js.UndefOr[String | Null] = js.undefined
}
object SchemaVerifyPhoneNumberResponse {
  
  inline def apply(): SchemaVerifyPhoneNumberResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVerifyPhoneNumberResponse]
  }
  
  extension [Self <: SchemaVerifyPhoneNumberResponse](x: Self) {
    
    inline def setVerifiedPhoneNumber(value: String): Self = StObject.set(x, "verifiedPhoneNumber", value.asInstanceOf[js.Any])
    
    inline def setVerifiedPhoneNumberNull: Self = StObject.set(x, "verifiedPhoneNumber", null)
    
    inline def setVerifiedPhoneNumberUndefined: Self = StObject.set(x, "verifiedPhoneNumber", js.undefined)
  }
}
