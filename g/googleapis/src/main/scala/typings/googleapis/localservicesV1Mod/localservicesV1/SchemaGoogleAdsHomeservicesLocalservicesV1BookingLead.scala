package typings.googleapis.localservicesV1Mod.localservicesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAdsHomeservicesLocalservicesV1BookingLead extends StObject {
  
  /**
    * Timestamp of when service is provided by advertiser.
    */
  var bookingAppointmentTimestamp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Consumer email associated with the booking lead.
    */
  var consumerEmail: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Consumer phone number associated with the booking lead.
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
}
object SchemaGoogleAdsHomeservicesLocalservicesV1BookingLead {
  
  inline def apply(): SchemaGoogleAdsHomeservicesLocalservicesV1BookingLead = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAdsHomeservicesLocalservicesV1BookingLead]
  }
  
  extension [Self <: SchemaGoogleAdsHomeservicesLocalservicesV1BookingLead](x: Self) {
    
    inline def setBookingAppointmentTimestamp(value: String): Self = StObject.set(x, "bookingAppointmentTimestamp", value.asInstanceOf[js.Any])
    
    inline def setBookingAppointmentTimestampNull: Self = StObject.set(x, "bookingAppointmentTimestamp", null)
    
    inline def setBookingAppointmentTimestampUndefined: Self = StObject.set(x, "bookingAppointmentTimestamp", js.undefined)
    
    inline def setConsumerEmail(value: String): Self = StObject.set(x, "consumerEmail", value.asInstanceOf[js.Any])
    
    inline def setConsumerEmailNull: Self = StObject.set(x, "consumerEmail", null)
    
    inline def setConsumerEmailUndefined: Self = StObject.set(x, "consumerEmail", js.undefined)
    
    inline def setConsumerPhoneNumber(value: String): Self = StObject.set(x, "consumerPhoneNumber", value.asInstanceOf[js.Any])
    
    inline def setConsumerPhoneNumberNull: Self = StObject.set(x, "consumerPhoneNumber", null)
    
    inline def setConsumerPhoneNumberUndefined: Self = StObject.set(x, "consumerPhoneNumber", js.undefined)
    
    inline def setCustomerName(value: String): Self = StObject.set(x, "customerName", value.asInstanceOf[js.Any])
    
    inline def setCustomerNameNull: Self = StObject.set(x, "customerName", null)
    
    inline def setCustomerNameUndefined: Self = StObject.set(x, "customerName", js.undefined)
    
    inline def setJobType(value: String): Self = StObject.set(x, "jobType", value.asInstanceOf[js.Any])
    
    inline def setJobTypeNull: Self = StObject.set(x, "jobType", null)
    
    inline def setJobTypeUndefined: Self = StObject.set(x, "jobType", js.undefined)
  }
}
