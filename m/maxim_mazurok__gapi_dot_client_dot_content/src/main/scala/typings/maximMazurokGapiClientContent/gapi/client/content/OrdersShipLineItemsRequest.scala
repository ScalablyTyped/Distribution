package typings.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrdersShipLineItemsRequest extends js.Object {
  
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
  implicit class OrdersShipLineItemsRequestOps[Self <: OrdersShipLineItemsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLineItemsVarargs(value: OrderShipmentLineItemShipment*): Self = this.set("lineItems", js.Array(value :_*))
    
    @scala.inline
    def setLineItems(value: js.Array[OrderShipmentLineItemShipment]): Self = this.set("lineItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineItems: Self = this.set("lineItems", js.undefined)
    
    @scala.inline
    def setOperationId(value: String): Self = this.set("operationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperationId: Self = this.set("operationId", js.undefined)
    
    @scala.inline
    def setShipmentGroupId(value: String): Self = this.set("shipmentGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShipmentGroupId: Self = this.set("shipmentGroupId", js.undefined)
    
    @scala.inline
    def setShipmentInfosVarargs(value: OrdersCustomBatchRequestEntryShipLineItemsShipmentInfo*): Self = this.set("shipmentInfos", js.Array(value :_*))
    
    @scala.inline
    def setShipmentInfos(value: js.Array[OrdersCustomBatchRequestEntryShipLineItemsShipmentInfo]): Self = this.set("shipmentInfos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShipmentInfos: Self = this.set("shipmentInfos", js.undefined)
  }
}
