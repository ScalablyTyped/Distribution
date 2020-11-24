package typings.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrdersCustomBatchRequestEntryRefundItemItem extends js.Object {
  
  /**
    * The total amount that is refunded. (e.g. refunding $5 each for 2 products should be done by setting quantity to 2 and amount to 10$) In case of multiple refunds, this should be the
    * amount you currently want to refund to the customer.
    */
  var amount: js.UndefOr[MonetaryAmount] = js.native
  
  /** If true, the full item will be refunded. If this is true, amount should not be provided and will be ignored. */
  var fullRefund: js.UndefOr[Boolean] = js.native
  
  /** The ID of the line item. Either lineItemId or productId is required. */
  var lineItemId: js.UndefOr[String] = js.native
  
  /** The ID of the product. This is the REST ID used in the products service. Either lineItemId or productId is required. */
  var productId: js.UndefOr[String] = js.native
  
  /** The number of products that are refunded. */
  var quantity: js.UndefOr[Double] = js.native
}
object OrdersCustomBatchRequestEntryRefundItemItem {
  
  @scala.inline
  def apply(): OrdersCustomBatchRequestEntryRefundItemItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrdersCustomBatchRequestEntryRefundItemItem]
  }
  
  @scala.inline
  implicit class OrdersCustomBatchRequestEntryRefundItemItemOps[Self <: OrdersCustomBatchRequestEntryRefundItemItem] (val x: Self) extends AnyVal {
    
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
    def setAmount(value: MonetaryAmount): Self = this.set("amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmount: Self = this.set("amount", js.undefined)
    
    @scala.inline
    def setFullRefund(value: Boolean): Self = this.set("fullRefund", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullRefund: Self = this.set("fullRefund", js.undefined)
    
    @scala.inline
    def setLineItemId(value: String): Self = this.set("lineItemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineItemId: Self = this.set("lineItemId", js.undefined)
    
    @scala.inline
    def setProductId(value: String): Self = this.set("productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductId: Self = this.set("productId", js.undefined)
    
    @scala.inline
    def setQuantity(value: Double): Self = this.set("quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuantity: Self = this.set("quantity", js.undefined)
  }
}
