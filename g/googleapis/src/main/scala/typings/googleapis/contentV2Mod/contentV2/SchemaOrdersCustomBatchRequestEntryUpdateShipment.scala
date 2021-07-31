package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrdersCustomBatchRequestEntryUpdateShipment extends StObject {
  
  /**
    * The carrier handling the shipment. Not updated if missing. See
    * shipments[].carrier in the  Orders resource representation for a list of
    * acceptable values.
    */
  var carrier: js.UndefOr[String] = js.undefined
  
  /**
    * Date on which the shipment has been delivered, in ISO 8601 format.
    * Optional and can be provided only if status is delivered.
    */
  var deliveryDate: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the shipment.
    */
  var shipmentId: js.UndefOr[String] = js.undefined
  
  /**
    * New status for the shipment. Not updated if missing.
    */
  var status: js.UndefOr[String] = js.undefined
  
  /**
    * The tracking ID for the shipment. Not updated if missing.
    */
  var trackingId: js.UndefOr[String] = js.undefined
}
object SchemaOrdersCustomBatchRequestEntryUpdateShipment {
  
  @scala.inline
  def apply(): SchemaOrdersCustomBatchRequestEntryUpdateShipment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrdersCustomBatchRequestEntryUpdateShipment]
  }
  
  @scala.inline
  implicit class SchemaOrdersCustomBatchRequestEntryUpdateShipmentMutableBuilder[Self <: SchemaOrdersCustomBatchRequestEntryUpdateShipment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCarrier(value: String): Self = StObject.set(x, "carrier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCarrierUndefined: Self = StObject.set(x, "carrier", js.undefined)
    
    @scala.inline
    def setDeliveryDate(value: String): Self = StObject.set(x, "deliveryDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliveryDateUndefined: Self = StObject.set(x, "deliveryDate", js.undefined)
    
    @scala.inline
    def setShipmentId(value: String): Self = StObject.set(x, "shipmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShipmentIdUndefined: Self = StObject.set(x, "shipmentId", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTrackingId(value: String): Self = StObject.set(x, "trackingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackingIdUndefined: Self = StObject.set(x, "trackingId", js.undefined)
  }
}
