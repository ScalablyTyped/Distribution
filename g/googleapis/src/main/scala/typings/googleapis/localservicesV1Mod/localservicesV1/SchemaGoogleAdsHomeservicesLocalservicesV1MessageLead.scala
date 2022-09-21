package typings.googleapis.localservicesV1Mod.localservicesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAdsHomeservicesLocalservicesV1MessageLead extends StObject {
  
  /**
    * Consumer phone number associated with the message lead.
    */
  var consumerPhoneNumber: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of the customer who created the lead.
    */
  var customerName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The job type of the specified lead.
    */
  var jobType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The postal code of the customer who created the lead.
    */
  var postalCode: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleAdsHomeservicesLocalservicesV1MessageLead {
  
  inline def apply(): SchemaGoogleAdsHomeservicesLocalservicesV1MessageLead = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAdsHomeservicesLocalservicesV1MessageLead]
  }
  
  extension [Self <: SchemaGoogleAdsHomeservicesLocalservicesV1MessageLead](x: Self) {
    
    inline def setConsumerPhoneNumber(value: String): Self = StObject.set(x, "consumerPhoneNumber", value.asInstanceOf[js.Any])
    
    inline def setConsumerPhoneNumberNull: Self = StObject.set(x, "consumerPhoneNumber", null)
    
    inline def setConsumerPhoneNumberUndefined: Self = StObject.set(x, "consumerPhoneNumber", js.undefined)
    
    inline def setCustomerName(value: String): Self = StObject.set(x, "customerName", value.asInstanceOf[js.Any])
    
    inline def setCustomerNameNull: Self = StObject.set(x, "customerName", null)
    
    inline def setCustomerNameUndefined: Self = StObject.set(x, "customerName", js.undefined)
    
    inline def setJobType(value: String): Self = StObject.set(x, "jobType", value.asInstanceOf[js.Any])
    
    inline def setJobTypeNull: Self = StObject.set(x, "jobType", null)
    
    inline def setJobTypeUndefined: Self = StObject.set(x, "jobType", js.undefined)
    
    inline def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
    
    inline def setPostalCodeNull: Self = StObject.set(x, "postalCode", null)
    
    inline def setPostalCodeUndefined: Self = StObject.set(x, "postalCode", js.undefined)
  }
}
