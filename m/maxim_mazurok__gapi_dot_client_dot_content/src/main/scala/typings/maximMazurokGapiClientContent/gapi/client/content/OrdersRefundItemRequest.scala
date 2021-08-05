package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrdersRefundItemRequest extends StObject {
  
  /** The items that are refunded. Either Item or Shipping must be provided in the request. */
  var items: js.UndefOr[js.Array[OrdersCustomBatchRequestEntryRefundItemItem]] = js.undefined
  
  /** The ID of the operation. Unique across all operations for a given order. */
  var operationId: js.UndefOr[String] = js.undefined
  
  /**
    * The reason for the refund. Acceptable values are: - "`shippingCostAdjustment`" - "`priceAdjustment`" - "`taxAdjustment`" - "`feeAdjustment`" - "`courtesyAdjustment`" -
    * "`adjustment`" - "`customerCancelled`" - "`noInventory`" - "`productNotAsDescribed`" - "`undeliverableShippingAddress`" - "`wrongProductShipped`" - "`lateShipmentCredit`" -
    * "`deliveredLateByCarrier`" - "`productArrivedDamaged`"
    */
  var reason: js.UndefOr[String] = js.undefined
  
  /** The explanation of the reason. */
  var reasonText: js.UndefOr[String] = js.undefined
  
  /** The refund on shipping. Optional, but either Item or Shipping must be provided in the request. */
  var shipping: js.UndefOr[OrdersCustomBatchRequestEntryRefundItemShipping] = js.undefined
}
object OrdersRefundItemRequest {
  
  inline def apply(): OrdersRefundItemRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrdersRefundItemRequest]
  }
  
  extension [Self <: OrdersRefundItemRequest](x: Self) {
    
    inline def setItems(value: js.Array[OrdersCustomBatchRequestEntryRefundItemItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: OrdersCustomBatchRequestEntryRefundItemItem*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setOperationId(value: String): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
    
    inline def setOperationIdUndefined: Self = StObject.set(x, "operationId", js.undefined)
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonText(value: String): Self = StObject.set(x, "reasonText", value.asInstanceOf[js.Any])
    
    inline def setReasonTextUndefined: Self = StObject.set(x, "reasonText", js.undefined)
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setShipping(value: OrdersCustomBatchRequestEntryRefundItemShipping): Self = StObject.set(x, "shipping", value.asInstanceOf[js.Any])
    
    inline def setShippingUndefined: Self = StObject.set(x, "shipping", js.undefined)
  }
}
