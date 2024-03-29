package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrdersCustomBatchRequestEntryShipLineItems extends StObject {
  
  /**
    * Deprecated. Please use shipmentInfo instead. The carrier handling the shipment. See `shipments[].carrier` in the Orders resource representation for a list of acceptable values.
    */
  var carrier: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Line items to ship.
    */
  var lineItems: js.UndefOr[js.Array[SchemaOrderShipmentLineItemShipment]] = js.undefined
  
  /**
    * ID of the shipment group. Required for orders that use the orderinvoices service.
    */
  var shipmentGroupId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Deprecated. Please use shipmentInfo instead. The ID of the shipment.
    */
  var shipmentId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Shipment information. This field is repeated because a single line item can be shipped in several packages (and have several tracking IDs).
    */
  var shipmentInfos: js.UndefOr[js.Array[SchemaOrdersCustomBatchRequestEntryShipLineItemsShipmentInfo]] = js.undefined
  
  /**
    * Deprecated. Please use shipmentInfo instead. The tracking ID for the shipment.
    */
  var trackingId: js.UndefOr[String | Null] = js.undefined
}
object SchemaOrdersCustomBatchRequestEntryShipLineItems {
  
  inline def apply(): SchemaOrdersCustomBatchRequestEntryShipLineItems = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrdersCustomBatchRequestEntryShipLineItems]
  }
  
  extension [Self <: SchemaOrdersCustomBatchRequestEntryShipLineItems](x: Self) {
    
    inline def setCarrier(value: String): Self = StObject.set(x, "carrier", value.asInstanceOf[js.Any])
    
    inline def setCarrierNull: Self = StObject.set(x, "carrier", null)
    
    inline def setCarrierUndefined: Self = StObject.set(x, "carrier", js.undefined)
    
    inline def setLineItems(value: js.Array[SchemaOrderShipmentLineItemShipment]): Self = StObject.set(x, "lineItems", value.asInstanceOf[js.Any])
    
    inline def setLineItemsUndefined: Self = StObject.set(x, "lineItems", js.undefined)
    
    inline def setLineItemsVarargs(value: SchemaOrderShipmentLineItemShipment*): Self = StObject.set(x, "lineItems", js.Array(value*))
    
    inline def setShipmentGroupId(value: String): Self = StObject.set(x, "shipmentGroupId", value.asInstanceOf[js.Any])
    
    inline def setShipmentGroupIdNull: Self = StObject.set(x, "shipmentGroupId", null)
    
    inline def setShipmentGroupIdUndefined: Self = StObject.set(x, "shipmentGroupId", js.undefined)
    
    inline def setShipmentId(value: String): Self = StObject.set(x, "shipmentId", value.asInstanceOf[js.Any])
    
    inline def setShipmentIdNull: Self = StObject.set(x, "shipmentId", null)
    
    inline def setShipmentIdUndefined: Self = StObject.set(x, "shipmentId", js.undefined)
    
    inline def setShipmentInfos(value: js.Array[SchemaOrdersCustomBatchRequestEntryShipLineItemsShipmentInfo]): Self = StObject.set(x, "shipmentInfos", value.asInstanceOf[js.Any])
    
    inline def setShipmentInfosUndefined: Self = StObject.set(x, "shipmentInfos", js.undefined)
    
    inline def setShipmentInfosVarargs(value: SchemaOrdersCustomBatchRequestEntryShipLineItemsShipmentInfo*): Self = StObject.set(x, "shipmentInfos", js.Array(value*))
    
    inline def setTrackingId(value: String): Self = StObject.set(x, "trackingId", value.asInstanceOf[js.Any])
    
    inline def setTrackingIdNull: Self = StObject.set(x, "trackingId", null)
    
    inline def setTrackingIdUndefined: Self = StObject.set(x, "trackingId", js.undefined)
  }
}
