package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrderShipmentScheduledDeliveryDetails extends StObject {
  
  /**
    * The phone number of the carrier fulfilling the delivery. The phone number is formatted as the international notation in ITU-T Recommendation E.123 (e.g., "+41 44 668 1800").
    */
  var carrierPhoneNumber: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The date a shipment is scheduled for delivery, in ISO 8601 format.
    */
  var scheduledDate: js.UndefOr[String | Null] = js.undefined
}
object SchemaOrderShipmentScheduledDeliveryDetails {
  
  inline def apply(): SchemaOrderShipmentScheduledDeliveryDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderShipmentScheduledDeliveryDetails]
  }
  
  extension [Self <: SchemaOrderShipmentScheduledDeliveryDetails](x: Self) {
    
    inline def setCarrierPhoneNumber(value: String): Self = StObject.set(x, "carrierPhoneNumber", value.asInstanceOf[js.Any])
    
    inline def setCarrierPhoneNumberNull: Self = StObject.set(x, "carrierPhoneNumber", null)
    
    inline def setCarrierPhoneNumberUndefined: Self = StObject.set(x, "carrierPhoneNumber", js.undefined)
    
    inline def setScheduledDate(value: String): Self = StObject.set(x, "scheduledDate", value.asInstanceOf[js.Any])
    
    inline def setScheduledDateNull: Self = StObject.set(x, "scheduledDate", null)
    
    inline def setScheduledDateUndefined: Self = StObject.set(x, "scheduledDate", js.undefined)
  }
}
