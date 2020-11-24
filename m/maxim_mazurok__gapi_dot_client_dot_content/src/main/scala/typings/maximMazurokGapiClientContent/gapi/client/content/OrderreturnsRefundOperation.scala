package typings.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrderreturnsRefundOperation extends js.Object {
  
  /**
    * If true, the item will be fully refunded. Allowed only when payment_type is FOP. Merchant can choose this refund option to indicate the full remaining amount of corresponding object
    * to be refunded to the customer via FOP.
    */
  var fullRefund: js.UndefOr[Boolean] = js.native
  
  /** If this is set, the item will be partially refunded. Merchant can choose this refund option to specify the customized amount that to be refunded to the customer. */
  var partialRefund: js.UndefOr[OrderreturnsPartialRefund] = js.native
  
  /** The payment way of issuing refund. Default value is ORIGINAL_FOP if not set. */
  var paymentType: js.UndefOr[String] = js.native
  
  /** The explanation of the reason. */
  var reasonText: js.UndefOr[String] = js.native
  
  /** Code of the refund reason. */
  var returnRefundReason: js.UndefOr[String] = js.native
}
object OrderreturnsRefundOperation {
  
  @scala.inline
  def apply(): OrderreturnsRefundOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderreturnsRefundOperation]
  }
  
  @scala.inline
  implicit class OrderreturnsRefundOperationOps[Self <: OrderreturnsRefundOperation] (val x: Self) extends AnyVal {
    
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
    def setFullRefund(value: Boolean): Self = this.set("fullRefund", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullRefund: Self = this.set("fullRefund", js.undefined)
    
    @scala.inline
    def setPartialRefund(value: OrderreturnsPartialRefund): Self = this.set("partialRefund", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartialRefund: Self = this.set("partialRefund", js.undefined)
    
    @scala.inline
    def setPaymentType(value: String): Self = this.set("paymentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaymentType: Self = this.set("paymentType", js.undefined)
    
    @scala.inline
    def setReasonText(value: String): Self = this.set("reasonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReasonText: Self = this.set("reasonText", js.undefined)
    
    @scala.inline
    def setReturnRefundReason(value: String): Self = this.set("returnRefundReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnRefundReason: Self = this.set("returnRefundReason", js.undefined)
  }
}
