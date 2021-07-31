package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrdersShipLineItemsRequest extends StObject {
  
  /**
    * Deprecated. Please use shipmentInfo instead. The carrier handling the
    * shipment. See shipments[].carrier in the  Orders resource representation
    * for a list of acceptable values.
    */
  var carrier: js.UndefOr[String] = js.undefined
  
  /**
    * Line items to ship.
    */
  var lineItems: js.UndefOr[js.Array[SchemaOrderShipmentLineItemShipment]] = js.undefined
  
  /**
    * The ID of the operation. Unique across all operations for a given order.
    */
  var operationId: js.UndefOr[String] = js.undefined
  
  /**
    * ID of the shipment group. Required for orders that use the orderinvoices
    * service.
    */
  var shipmentGroupId: js.UndefOr[String] = js.undefined
  
  /**
    * Deprecated. Please use shipmentInfo instead. The ID of the shipment.
    */
  var shipmentId: js.UndefOr[String] = js.undefined
  
  /**
    * Shipment information. This field is repeated because a single line item
    * can be shipped in several packages (and have several tracking IDs).
    */
  var shipmentInfos: js.UndefOr[js.Array[SchemaOrdersCustomBatchRequestEntryShipLineItemsShipmentInfo]] = js.undefined
  
  /**
    * Deprecated. Please use shipmentInfo instead. The tracking ID for the
    * shipment.
    */
  var trackingId: js.UndefOr[String] = js.undefined
}
object SchemaOrdersShipLineItemsRequest {
  
  @scala.inline
  def apply(): SchemaOrdersShipLineItemsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrdersShipLineItemsRequest]
  }
  
  @scala.inline
  implicit class SchemaOrdersShipLineItemsRequestMutableBuilder[Self <: SchemaOrdersShipLineItemsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCarrier(value: String): Self = StObject.set(x, "carrier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCarrierUndefined: Self = StObject.set(x, "carrier", js.undefined)
    
    @scala.inline
    def setLineItems(value: js.Array[SchemaOrderShipmentLineItemShipment]): Self = StObject.set(x, "lineItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineItemsUndefined: Self = StObject.set(x, "lineItems", js.undefined)
    
    @scala.inline
    def setLineItemsVarargs(value: SchemaOrderShipmentLineItemShipment*): Self = StObject.set(x, "lineItems", js.Array(value :_*))
    
    @scala.inline
    def setOperationId(value: String): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationIdUndefined: Self = StObject.set(x, "operationId", js.undefined)
    
    @scala.inline
    def setShipmentGroupId(value: String): Self = StObject.set(x, "shipmentGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShipmentGroupIdUndefined: Self = StObject.set(x, "shipmentGroupId", js.undefined)
    
    @scala.inline
    def setShipmentId(value: String): Self = StObject.set(x, "shipmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShipmentIdUndefined: Self = StObject.set(x, "shipmentId", js.undefined)
    
    @scala.inline
    def setShipmentInfos(value: js.Array[SchemaOrdersCustomBatchRequestEntryShipLineItemsShipmentInfo]): Self = StObject.set(x, "shipmentInfos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShipmentInfosUndefined: Self = StObject.set(x, "shipmentInfos", js.undefined)
    
    @scala.inline
    def setShipmentInfosVarargs(value: SchemaOrdersCustomBatchRequestEntryShipLineItemsShipmentInfo*): Self = StObject.set(x, "shipmentInfos", js.Array(value :_*))
    
    @scala.inline
    def setTrackingId(value: String): Self = StObject.set(x, "trackingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackingIdUndefined: Self = StObject.set(x, "trackingId", js.undefined)
  }
}
