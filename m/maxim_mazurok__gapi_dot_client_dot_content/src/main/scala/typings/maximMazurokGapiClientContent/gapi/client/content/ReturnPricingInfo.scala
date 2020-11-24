package typings.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnPricingInfo extends js.Object {
  
  /**
    * Default option for whether merchant should charge the customer for return shipping costs, based on customer selected return reason and merchant's return policy for the items being
    * returned.
    */
  var chargeReturnShippingFee: js.UndefOr[Boolean] = js.native
  
  /**
    * Maximum return shipping costs that may be charged to the customer depending on merchant's assessment of the return reason and the merchant's return policy for the items being
    * returned.
    */
  var maxReturnShippingFee: js.UndefOr[MonetaryAmount] = js.native
  
  /** Total amount that can be refunded for the items in this return. It represents the total amount received by the merchant for the items, after applying merchant coupons. */
  var refundableItemsTotalAmount: js.UndefOr[MonetaryAmount] = js.native
  
  /** Maximum amount that can be refunded for the original shipping fee. */
  var refundableShippingAmount: js.UndefOr[MonetaryAmount] = js.native
  
  /** Total amount already refunded by the merchant. It includes all types of refunds (items, shipping, etc.) Not provided if no refund has been applied yet. */
  var totalRefundedAmount: js.UndefOr[MonetaryAmount] = js.native
}
object ReturnPricingInfo {
  
  @scala.inline
  def apply(): ReturnPricingInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReturnPricingInfo]
  }
  
  @scala.inline
  implicit class ReturnPricingInfoOps[Self <: ReturnPricingInfo] (val x: Self) extends AnyVal {
    
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
    def setChargeReturnShippingFee(value: Boolean): Self = this.set("chargeReturnShippingFee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChargeReturnShippingFee: Self = this.set("chargeReturnShippingFee", js.undefined)
    
    @scala.inline
    def setMaxReturnShippingFee(value: MonetaryAmount): Self = this.set("maxReturnShippingFee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxReturnShippingFee: Self = this.set("maxReturnShippingFee", js.undefined)
    
    @scala.inline
    def setRefundableItemsTotalAmount(value: MonetaryAmount): Self = this.set("refundableItemsTotalAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefundableItemsTotalAmount: Self = this.set("refundableItemsTotalAmount", js.undefined)
    
    @scala.inline
    def setRefundableShippingAmount(value: MonetaryAmount): Self = this.set("refundableShippingAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefundableShippingAmount: Self = this.set("refundableShippingAmount", js.undefined)
    
    @scala.inline
    def setTotalRefundedAmount(value: MonetaryAmount): Self = this.set("totalRefundedAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalRefundedAmount: Self = this.set("totalRefundedAmount", js.undefined)
  }
}
