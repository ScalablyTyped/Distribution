package typings.googleapis.mybusinessverificationsV1Mod.mybusinessverificationsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVerifyLocationRequest extends StObject {
  
  /**
    * Optional. Extra context information for the verification of service businesses. It is only required for the locations whose business type is CUSTOMER_LOCATION_ONLY. For ADDRESS verification, the address will be used to send out postcard. For other methods, it should be the same as the one that is passed to GetVerificationOptions. INVALID_ARGUMENT will be thrown if it is set for other types of business locations.
    */
  var context: js.UndefOr[SchemaServiceBusinessContext] = js.undefined
  
  /**
    * Optional. The input for EMAIL method. Email address where the PIN should be sent to. An email address is accepted only if it is one of the addresses provided by FetchVerificationOptions. If the EmailVerificationData has is_user_name_editable set to true, the client may specify a different user name (local-part) but must match the domain name.
    */
  var emailAddress: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The BCP 47 language code representing the language that is to be used for the verification process.
    */
  var languageCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The input for ADDRESS method. Contact name the mail should be sent to.
    */
  var mailerContact: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Verification method.
    */
  var method: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The input for PHONE_CALL/SMS method The phone number that should be called or be sent SMS to. It must be one of the phone numbers in the eligible options.
    */
  var phoneNumber: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The input for VETTED_PARTNER method available to select [partners.](https://support.google.com/business/answer/7674102) The input is not needed for a vetted account. Token that is associated to the location. Token that is associated to the location.
    */
  var token: js.UndefOr[SchemaVerificationToken] = js.undefined
}
object SchemaVerifyLocationRequest {
  
  inline def apply(): SchemaVerifyLocationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVerifyLocationRequest]
  }
  
  extension [Self <: SchemaVerifyLocationRequest](x: Self) {
    
    inline def setContext(value: SchemaServiceBusinessContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setEmailAddress(value: String): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
    
    inline def setEmailAddressNull: Self = StObject.set(x, "emailAddress", null)
    
    inline def setEmailAddressUndefined: Self = StObject.set(x, "emailAddress", js.undefined)
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeNull: Self = StObject.set(x, "languageCode", null)
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setMailerContact(value: String): Self = StObject.set(x, "mailerContact", value.asInstanceOf[js.Any])
    
    inline def setMailerContactNull: Self = StObject.set(x, "mailerContact", null)
    
    inline def setMailerContactUndefined: Self = StObject.set(x, "mailerContact", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodNull: Self = StObject.set(x, "method", null)
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberNull: Self = StObject.set(x, "phoneNumber", null)
    
    inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
    
    inline def setToken(value: SchemaVerificationToken): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
  }
}
