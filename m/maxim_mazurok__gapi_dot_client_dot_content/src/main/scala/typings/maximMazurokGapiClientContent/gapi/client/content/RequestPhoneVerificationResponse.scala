package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestPhoneVerificationResponse extends StObject {
  
  /** The verification ID to use in subsequent calls to `verifyphonenumber`. */
  var verificationId: js.UndefOr[String] = js.undefined
}
object RequestPhoneVerificationResponse {
  
  inline def apply(): RequestPhoneVerificationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestPhoneVerificationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestPhoneVerificationResponse] (val x: Self) extends AnyVal {
    
    inline def setVerificationId(value: String): Self = StObject.set(x, "verificationId", value.asInstanceOf[js.Any])
    
    inline def setVerificationIdUndefined: Self = StObject.set(x, "verificationId", js.undefined)
  }
}
