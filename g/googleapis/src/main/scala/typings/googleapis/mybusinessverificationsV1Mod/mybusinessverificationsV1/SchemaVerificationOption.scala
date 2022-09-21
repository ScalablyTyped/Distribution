package typings.googleapis.mybusinessverificationsV1Mod.mybusinessverificationsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVerificationOption extends StObject {
  
  /**
    * Set only if the method is MAIL.
    */
  var addressData: js.UndefOr[SchemaAddressVerificationData] = js.undefined
  
  /**
    * Set only if the method is EMAIL.
    */
  var emailData: js.UndefOr[SchemaEmailVerificationData] = js.undefined
  
  /**
    * Set only if the method is PHONE_CALL or SMS. Phone number that the PIN will be sent to.
    */
  var phoneNumber: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Method to verify the location.
    */
  var verificationMethod: js.UndefOr[String | Null] = js.undefined
}
object SchemaVerificationOption {
  
  inline def apply(): SchemaVerificationOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVerificationOption]
  }
  
  extension [Self <: SchemaVerificationOption](x: Self) {
    
    inline def setAddressData(value: SchemaAddressVerificationData): Self = StObject.set(x, "addressData", value.asInstanceOf[js.Any])
    
    inline def setAddressDataUndefined: Self = StObject.set(x, "addressData", js.undefined)
    
    inline def setEmailData(value: SchemaEmailVerificationData): Self = StObject.set(x, "emailData", value.asInstanceOf[js.Any])
    
    inline def setEmailDataUndefined: Self = StObject.set(x, "emailData", js.undefined)
    
    inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberNull: Self = StObject.set(x, "phoneNumber", null)
    
    inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
    
    inline def setVerificationMethod(value: String): Self = StObject.set(x, "verificationMethod", value.asInstanceOf[js.Any])
    
    inline def setVerificationMethodNull: Self = StObject.set(x, "verificationMethod", null)
    
    inline def setVerificationMethodUndefined: Self = StObject.set(x, "verificationMethod", js.undefined)
  }
}
