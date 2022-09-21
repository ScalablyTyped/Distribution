package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrdersUpdateShipmentRequest extends StObject {
  
  /**
    * The carrier handling the shipment. Not updated if missing. See `shipments[].carrier` in the Orders resource representation for a list of acceptable values.
    */
  var carrier: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Date on which the shipment has been delivered, in ISO 8601 format. Optional and can be provided only if `status` is `delivered`.
    */
  var deliveryDate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Date after which the pickup will expire, in ISO 8601 format. Required only when order is buy-online-pickup-in-store(BOPIS) and `status` is `ready for pickup`.
    */
  var lastPickupDate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID of the operation. Unique across all operations for a given order.
    */
  var operationId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Date on which the shipment has been ready for pickup, in ISO 8601 format. Optional and can be provided only if `status` is `ready for pickup`.
    */
  var readyPickupDate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Delivery details of the shipment if scheduling is needed.
    */
  var scheduledDeliveryDetails: js.UndefOr[SchemaOrdersCustomBatchRequestEntryUpdateShipmentScheduledDeliveryDetails] = js.undefined
  
  /**
    * The ID of the shipment.
    */
  var shipmentId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * New status for the shipment. Not updated if missing. Acceptable values are: - "`delivered`" - "`undeliverable`" - "`readyForPickup`"
    */
  var status: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The tracking ID for the shipment. Not updated if missing.
    */
  var trackingId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Date on which the shipment has been undeliverable, in ISO 8601 format. Optional and can be provided only if `status` is `undeliverable`.
    */
  var undeliveredDate: js.UndefOr[String | Null] = js.undefined
}
object SchemaOrdersUpdateShipmentRequest {
  
  inline def apply(): SchemaOrdersUpdateShipmentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrdersUpdateShipmentRequest]
  }
  
  extension [Self <: SchemaOrdersUpdateShipmentRequest](x: Self) {
    
    inline def setCarrier(value: String): Self = StObject.set(x, "carrier", value.asInstanceOf[js.Any])
    
    inline def setCarrierNull: Self = StObject.set(x, "carrier", null)
    
    inline def setCarrierUndefined: Self = StObject.set(x, "carrier", js.undefined)
    
    inline def setDeliveryDate(value: String): Self = StObject.set(x, "deliveryDate", value.asInstanceOf[js.Any])
    
    inline def setDeliveryDateNull: Self = StObject.set(x, "deliveryDate", null)
    
    inline def setDeliveryDateUndefined: Self = StObject.set(x, "deliveryDate", js.undefined)
    
    inline def setLastPickupDate(value: String): Self = StObject.set(x, "lastPickupDate", value.asInstanceOf[js.Any])
    
    inline def setLastPickupDateNull: Self = StObject.set(x, "lastPickupDate", null)
    
    inline def setLastPickupDateUndefined: Self = StObject.set(x, "lastPickupDate", js.undefined)
    
    inline def setOperationId(value: String): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
    
    inline def setOperationIdNull: Self = StObject.set(x, "operationId", null)
    
    inline def setOperationIdUndefined: Self = StObject.set(x, "operationId", js.undefined)
    
    inline def setReadyPickupDate(value: String): Self = StObject.set(x, "readyPickupDate", value.asInstanceOf[js.Any])
    
    inline def setReadyPickupDateNull: Self = StObject.set(x, "readyPickupDate", null)
    
    inline def setReadyPickupDateUndefined: Self = StObject.set(x, "readyPickupDate", js.undefined)
    
    inline def setScheduledDeliveryDetails(value: SchemaOrdersCustomBatchRequestEntryUpdateShipmentScheduledDeliveryDetails): Self = StObject.set(x, "scheduledDeliveryDetails", value.asInstanceOf[js.Any])
    
    inline def setScheduledDeliveryDetailsUndefined: Self = StObject.set(x, "scheduledDeliveryDetails", js.undefined)
    
    inline def setShipmentId(value: String): Self = StObject.set(x, "shipmentId", value.asInstanceOf[js.Any])
    
    inline def setShipmentIdNull: Self = StObject.set(x, "shipmentId", null)
    
    inline def setShipmentIdUndefined: Self = StObject.set(x, "shipmentId", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTrackingId(value: String): Self = StObject.set(x, "trackingId", value.asInstanceOf[js.Any])
    
    inline def setTrackingIdNull: Self = StObject.set(x, "trackingId", null)
    
    inline def setTrackingIdUndefined: Self = StObject.set(x, "trackingId", js.undefined)
    
    inline def setUndeliveredDate(value: String): Self = StObject.set(x, "undeliveredDate", value.asInstanceOf[js.Any])
    
    inline def setUndeliveredDateNull: Self = StObject.set(x, "undeliveredDate", null)
    
    inline def setUndeliveredDateUndefined: Self = StObject.set(x, "undeliveredDate", js.undefined)
  }
}
