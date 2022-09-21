package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrdersCustomBatchRequestEntryUpdateShipmentScheduledDeliveryDetails extends StObject {
  
  /**
    * The phone number of the carrier fulfilling the delivery. The phone number should be formatted as the international notation in
    */
  var carrierPhoneNumber: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The date a shipment is scheduled for delivery, in ISO 8601 format.
    */
  var scheduledDate: js.UndefOr[String | Null] = js.undefined
}
object SchemaOrdersCustomBatchRequestEntryUpdateShipmentScheduledDeliveryDetails {
  
  inline def apply(): SchemaOrdersCustomBatchRequestEntryUpdateShipmentScheduledDeliveryDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrdersCustomBatchRequestEntryUpdateShipmentScheduledDeliveryDetails]
  }
  
  extension [Self <: SchemaOrdersCustomBatchRequestEntryUpdateShipmentScheduledDeliveryDetails](x: Self) {
    
    inline def setCarrierPhoneNumber(value: String): Self = StObject.set(x, "carrierPhoneNumber", value.asInstanceOf[js.Any])
    
    inline def setCarrierPhoneNumberNull: Self = StObject.set(x, "carrierPhoneNumber", null)
    
    inline def setCarrierPhoneNumberUndefined: Self = StObject.set(x, "carrierPhoneNumber", js.undefined)
    
    inline def setScheduledDate(value: String): Self = StObject.set(x, "scheduledDate", value.asInstanceOf[js.Any])
    
    inline def setScheduledDateNull: Self = StObject.set(x, "scheduledDate", null)
    
    inline def setScheduledDateUndefined: Self = StObject.set(x, "scheduledDate", js.undefined)
  }
}
