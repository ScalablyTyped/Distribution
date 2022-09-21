package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAccountBusinessInformation extends StObject {
  
  /**
    * The address of the business. Use `\n` to add a second address line.
    */
  var address: js.UndefOr[SchemaAccountAddress] = js.undefined
  
  /**
    * The customer service information of the business.
    */
  var customerService: js.UndefOr[SchemaAccountCustomerService] = js.undefined
  
  /**
    * The 10-digit [Korean business registration number](https://support.google.com/merchants/answer/9037766) separated with dashes in the format: XXX-XX-XXXXX. This field will only be updated if explicitly set.
    */
  var koreanBusinessRegistrationNumber: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The phone number of the business. This can only be updated if a verified phone number is not already set. To replace a verified phone number use the `Accounts.requestphoneverification` and `Accounts.verifyphonenumber`.
    */
  var phoneNumber: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Verification status of the phone number of the business. This status is read only and can be updated only by successful phone verification. Acceptable values are: - "`verified`" - "`unverified`"
    */
  var phoneVerificationStatus: js.UndefOr[String | Null] = js.undefined
}
object SchemaAccountBusinessInformation {
  
  inline def apply(): SchemaAccountBusinessInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountBusinessInformation]
  }
  
  extension [Self <: SchemaAccountBusinessInformation](x: Self) {
    
    inline def setAddress(value: SchemaAccountAddress): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setCustomerService(value: SchemaAccountCustomerService): Self = StObject.set(x, "customerService", value.asInstanceOf[js.Any])
    
    inline def setCustomerServiceUndefined: Self = StObject.set(x, "customerService", js.undefined)
    
    inline def setKoreanBusinessRegistrationNumber(value: String): Self = StObject.set(x, "koreanBusinessRegistrationNumber", value.asInstanceOf[js.Any])
    
    inline def setKoreanBusinessRegistrationNumberNull: Self = StObject.set(x, "koreanBusinessRegistrationNumber", null)
    
    inline def setKoreanBusinessRegistrationNumberUndefined: Self = StObject.set(x, "koreanBusinessRegistrationNumber", js.undefined)
    
    inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberNull: Self = StObject.set(x, "phoneNumber", null)
    
    inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
    
    inline def setPhoneVerificationStatus(value: String): Self = StObject.set(x, "phoneVerificationStatus", value.asInstanceOf[js.Any])
    
    inline def setPhoneVerificationStatusNull: Self = StObject.set(x, "phoneVerificationStatus", null)
    
    inline def setPhoneVerificationStatusUndefined: Self = StObject.set(x, "phoneVerificationStatus", js.undefined)
  }
}
