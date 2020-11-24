package typings.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrdersRefundItemRequest extends js.Object {
  
  /** The items that are refunded. Either Item or Shipping must be provided in the request. */
  var items: js.UndefOr[js.Array[OrdersCustomBatchRequestEntryRefundItemItem]] = js.native
  
  /** The ID of the operation. Unique across all operations for a given order. */
  var operationId: js.UndefOr[String] = js.native
  
  /**
    * The reason for the refund. Acceptable values are: - "`shippingCostAdjustment`" - "`priceAdjustment`" - "`taxAdjustment`" - "`feeAdjustment`" - "`courtesyAdjustment`" -
    * "`adjustment`" - "`customerCancelled`" - "`noInventory`" - "`productNotAsDescribed`" - "`undeliverableShippingAddress`" - "`wrongProductShipped`" - "`lateShipmentCredit`" -
    * "`deliveredLateByCarrier`" - "`productArrivedDamaged`"
    */
  var reason: js.UndefOr[String] = js.native
  
  /** The explanation of the reason. */
  var reasonText: js.UndefOr[String] = js.native
  
  /** The refund on shipping. Optional, but either Item or Shipping must be provided in the request. */
  var shipping: js.UndefOr[OrdersCustomBatchRequestEntryRefundItemShipping] = js.native
}
object OrdersRefundItemRequest {
  
  @scala.inline
  def apply(): OrdersRefundItemRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrdersRefundItemRequest]
  }
  
  @scala.inline
  implicit class OrdersRefundItemRequestOps[Self <: OrdersRefundItemRequest] (val x: Self) extends AnyVal {
    
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
    def setItemsVarargs(value: OrdersCustomBatchRequestEntryRefundItemItem*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[OrdersCustomBatchRequestEntryRefundItemItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setOperationId(value: String): Self = this.set("operationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperationId: Self = this.set("operationId", js.undefined)
    
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
    
    @scala.inline
    def setReasonText(value: String): Self = this.set("reasonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReasonText: Self = this.set("reasonText", js.undefined)
    
    @scala.inline
    def setShipping(value: OrdersCustomBatchRequestEntryRefundItemShipping): Self = this.set("shipping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShipping: Self = this.set("shipping", js.undefined)
  }
}
