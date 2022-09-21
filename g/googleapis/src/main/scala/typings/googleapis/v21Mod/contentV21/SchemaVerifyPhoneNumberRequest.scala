package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVerifyPhoneNumberRequest extends StObject {
  
  /**
    * Verification method used to receive verification code.
    */
  var phoneVerificationMethod: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The verification code that was sent to the phone number for validation.
    */
  var verificationCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The verification ID returned by `requestphoneverification`.
    */
  var verificationId: js.UndefOr[String | Null] = js.undefined
}
object SchemaVerifyPhoneNumberRequest {
  
  inline def apply(): SchemaVerifyPhoneNumberRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVerifyPhoneNumberRequest]
  }
  
  extension [Self <: SchemaVerifyPhoneNumberRequest](x: Self) {
    
    inline def setPhoneVerificationMethod(value: String): Self = StObject.set(x, "phoneVerificationMethod", value.asInstanceOf[js.Any])
    
    inline def setPhoneVerificationMethodNull: Self = StObject.set(x, "phoneVerificationMethod", null)
    
    inline def setPhoneVerificationMethodUndefined: Self = StObject.set(x, "phoneVerificationMethod", js.undefined)
    
    inline def setVerificationCode(value: String): Self = StObject.set(x, "verificationCode", value.asInstanceOf[js.Any])
    
    inline def setVerificationCodeNull: Self = StObject.set(x, "verificationCode", null)
    
    inline def setVerificationCodeUndefined: Self = StObject.set(x, "verificationCode", js.undefined)
    
    inline def setVerificationId(value: String): Self = StObject.set(x, "verificationId", value.asInstanceOf[js.Any])
    
    inline def setVerificationIdNull: Self = StObject.set(x, "verificationId", null)
    
    inline def setVerificationIdUndefined: Self = StObject.set(x, "verificationId", js.undefined)
  }
}
