package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrdersShipLineItemsRequest extends StObject {
  
  /** Line items to ship. */
  var lineItems: js.UndefOr[js.Array[OrderShipmentLineItemShipment]] = js.native
  
  /** The ID of the operation. Unique across all operations for a given order. */
  var operationId: js.UndefOr[String] = js.native
  
  /** ID of the shipment group. Required for orders that use the orderinvoices service. */
  var shipmentGroupId: js.UndefOr[String] = js.native
  
  /** Shipment information. This field is repeated because a single line item can be shipped in several packages (and have several tracking IDs). */
  var shipmentInfos: js.UndefOr[js.Array[OrdersCustomBatchRequestEntryShipLineItemsShipmentInfo]] = js.native
}
object OrdersShipLineItemsRequest {
  
  @scala.inline
  def apply(): OrdersShipLineItemsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrdersShipLineItemsRequest]
  }
  
  @scala.inline
  implicit class OrdersShipLineItemsRequestMutableBuilder[Self <: OrdersShipLineItemsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLineItems(value: js.Array[OrderShipmentLineItemShipment]): Self = StObject.set(x, "lineItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineItemsUndefined: Self = StObject.set(x, "lineItems", js.undefined)
    
    @scala.inline
    def setLineItemsVarargs(value: OrderShipmentLineItemShipment*): Self = StObject.set(x, "lineItems", js.Array(value :_*))
    
    @scala.inline
    def setOperationId(value: String): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationIdUndefined: Self = StObject.set(x, "operationId", js.undefined)
    
    @scala.inline
    def setShipmentGroupId(value: String): Self = StObject.set(x, "shipmentGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShipmentGroupIdUndefined: Self = StObject.set(x, "shipmentGroupId", js.undefined)
    
    @scala.inline
    def setShipmentInfos(value: js.Array[OrdersCustomBatchRequestEntryShipLineItemsShipmentInfo]): Self = StObject.set(x, "shipmentInfos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShipmentInfosUndefined: Self = StObject.set(x, "shipmentInfos", js.undefined)
    
    @scala.inline
    def setShipmentInfosVarargs(value: OrdersCustomBatchRequestEntryShipLineItemsShipmentInfo*): Self = StObject.set(x, "shipmentInfos", js.Array(value :_*))
  }
}
