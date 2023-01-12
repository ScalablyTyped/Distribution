package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestPhoneVerificationRequest extends StObject {
  
  /**
    * Language code [IETF BCP 47 syntax](https://tools.ietf.org/html/bcp47) (for example, en-US). Language code is used to provide localized `SMS` and `PHONE_CALL`. Default language used
    * is en-US if not provided.
    */
  var languageCode: js.UndefOr[String] = js.undefined
  
  /** Phone number to be verified. */
  var phoneNumber: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Two letter country code for the phone number, for example `CA` for Canadian numbers. See the [ISO 3166-1
    * alpha-2](https://wikipedia.org/wiki/ISO_3166-1_alpha-2#Officially_assigned_code_elements) officially assigned codes.
    */
  var phoneRegionCode: js.UndefOr[String] = js.undefined
  
  /** Verification method to receive verification code. */
  var phoneVerificationMethod: js.UndefOr[String] = js.undefined
}
object RequestPhoneVerificationRequest {
  
  inline def apply(): RequestPhoneVerificationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestPhoneVerificationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestPhoneVerificationRequest] (val x: Self) extends AnyVal {
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
    
    inline def setPhoneRegionCode(value: String): Self = StObject.set(x, "phoneRegionCode", value.asInstanceOf[js.Any])
    
    inline def setPhoneRegionCodeUndefined: Self = StObject.set(x, "phoneRegionCode", js.undefined)
    
    inline def setPhoneVerificationMethod(value: String): Self = StObject.set(x, "phoneVerificationMethod", value.asInstanceOf[js.Any])
    
    inline def setPhoneVerificationMethodUndefined: Self = StObject.set(x, "phoneVerificationMethod", js.undefined)
  }
}
