package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrdersCustomBatchRequestEntryRefundItemShipping extends StObject {
  
  /** The amount that is refunded. If this is not the first refund for the shipment, this should be the newly refunded amount. */
  var amount: js.UndefOr[Price] = js.native
  
  /** If set to true, all shipping costs for the order will be refunded. If this is true, amount should not be provided and will be ignored. */
  var fullRefund: js.UndefOr[Boolean] = js.native
}
object OrdersCustomBatchRequestEntryRefundItemShipping {
  
  @scala.inline
  def apply(): OrdersCustomBatchRequestEntryRefundItemShipping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrdersCustomBatchRequestEntryRefundItemShipping]
  }
  
  @scala.inline
  implicit class OrdersCustomBatchRequestEntryRefundItemShippingMutableBuilder[Self <: OrdersCustomBatchRequestEntryRefundItemShipping] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: Price): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    @scala.inline
    def setFullRefund(value: Boolean): Self = StObject.set(x, "fullRefund", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullRefundUndefined: Self = StObject.set(x, "fullRefund", js.undefined)
  }
}
