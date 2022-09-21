package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrdersCustomBatchRequestEntryUpdateShipmentScheduledDeliveryDetails extends StObject {
  
  /** The phone number of the carrier fulfilling the delivery. The phone number should be formatted as the international notation in */
  var carrierPhoneNumber: js.UndefOr[String] = js.undefined
  
  /** The date a shipment is scheduled for delivery, in ISO 8601 format. */
  var scheduledDate: js.UndefOr[String] = js.undefined
}
object OrdersCustomBatchRequestEntryUpdateShipmentScheduledDeliveryDetails {
  
  inline def apply(): OrdersCustomBatchRequestEntryUpdateShipmentScheduledDeliveryDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrdersCustomBatchRequestEntryUpdateShipmentScheduledDeliveryDetails]
  }
  
  extension [Self <: OrdersCustomBatchRequestEntryUpdateShipmentScheduledDeliveryDetails](x: Self) {
    
    inline def setCarrierPhoneNumber(value: String): Self = StObject.set(x, "carrierPhoneNumber", value.asInstanceOf[js.Any])
    
    inline def setCarrierPhoneNumberUndefined: Self = StObject.set(x, "carrierPhoneNumber", js.undefined)
    
    inline def setScheduledDate(value: String): Self = StObject.set(x, "scheduledDate", value.asInstanceOf[js.Any])
    
    inline def setScheduledDateUndefined: Self = StObject.set(x, "scheduledDate", js.undefined)
  }
}
