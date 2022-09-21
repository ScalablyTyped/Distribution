package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerifyPhoneNumberResponse extends StObject {
  
  /** Verified phone number if verification is successful. This phone number can only be replaced by another verified phone number. */
  var verifiedPhoneNumber: js.UndefOr[String] = js.undefined
}
object VerifyPhoneNumberResponse {
  
  inline def apply(): VerifyPhoneNumberResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VerifyPhoneNumberResponse]
  }
  
  extension [Self <: VerifyPhoneNumberResponse](x: Self) {
    
    inline def setVerifiedPhoneNumber(value: String): Self = StObject.set(x, "verifiedPhoneNumber", value.asInstanceOf[js.Any])
    
    inline def setVerifiedPhoneNumberUndefined: Self = StObject.set(x, "verifiedPhoneNumber", js.undefined)
  }
}
