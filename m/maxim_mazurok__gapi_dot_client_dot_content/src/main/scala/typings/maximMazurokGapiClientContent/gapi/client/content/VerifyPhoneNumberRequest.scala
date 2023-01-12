package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerifyPhoneNumberRequest extends StObject {
  
  /** Verification method used to receive verification code. */
  var phoneVerificationMethod: js.UndefOr[String] = js.undefined
  
  /** The verification code that was sent to the phone number for validation. */
  var verificationCode: js.UndefOr[String] = js.undefined
  
  /** The verification ID returned by `requestphoneverification`. */
  var verificationId: js.UndefOr[String] = js.undefined
}
object VerifyPhoneNumberRequest {
  
  inline def apply(): VerifyPhoneNumberRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VerifyPhoneNumberRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VerifyPhoneNumberRequest] (val x: Self) extends AnyVal {
    
    inline def setPhoneVerificationMethod(value: String): Self = StObject.set(x, "phoneVerificationMethod", value.asInstanceOf[js.Any])
    
    inline def setPhoneVerificationMethodUndefined: Self = StObject.set(x, "phoneVerificationMethod", js.undefined)
    
    inline def setVerificationCode(value: String): Self = StObject.set(x, "verificationCode", value.asInstanceOf[js.Any])
    
    inline def setVerificationCodeUndefined: Self = StObject.set(x, "verificationCode", js.undefined)
    
    inline def setVerificationId(value: String): Self = StObject.set(x, "verificationId", value.asInstanceOf[js.Any])
    
    inline def setVerificationIdUndefined: Self = StObject.set(x, "verificationId", js.undefined)
  }
}
