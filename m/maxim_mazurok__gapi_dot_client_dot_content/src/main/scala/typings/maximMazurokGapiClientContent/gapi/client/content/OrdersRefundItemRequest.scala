package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrdersRefundItemRequest extends StObject {
  
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
  implicit class OrdersRefundItemRequestMutableBuilder[Self <: OrdersRefundItemRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[OrdersCustomBatchRequestEntryRefundItemItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: OrdersCustomBatchRequestEntryRefundItemItem*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setOperationId(value: String): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationIdUndefined: Self = StObject.set(x, "operationId", js.undefined)
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonText(value: String): Self = StObject.set(x, "reasonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonTextUndefined: Self = StObject.set(x, "reasonText", js.undefined)
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    @scala.inline
    def setShipping(value: OrdersCustomBatchRequestEntryRefundItemShipping): Self = StObject.set(x, "shipping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShippingUndefined: Self = StObject.set(x, "shipping", js.undefined)
  }
}
