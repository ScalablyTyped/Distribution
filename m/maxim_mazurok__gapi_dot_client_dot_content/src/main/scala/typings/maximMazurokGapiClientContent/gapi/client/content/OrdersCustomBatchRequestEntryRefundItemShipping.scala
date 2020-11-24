package typings.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrdersCustomBatchRequestEntryRefundItemShipping extends js.Object {
  
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
  implicit class OrdersCustomBatchRequestEntryRefundItemShippingOps[Self <: OrdersCustomBatchRequestEntryRefundItemShipping] (val x: Self) extends AnyVal {
    
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
    def setAmount(value: Price): Self = this.set("amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmount: Self = this.set("amount", js.undefined)
    
    @scala.inline
    def setFullRefund(value: Boolean): Self = this.set("fullRefund", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullRefund: Self = this.set("fullRefund", js.undefined)
  }
}
