package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnPricingInfo extends StObject {
  
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
  implicit class ReturnPricingInfoMutableBuilder[Self <: ReturnPricingInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChargeReturnShippingFee(value: Boolean): Self = StObject.set(x, "chargeReturnShippingFee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChargeReturnShippingFeeUndefined: Self = StObject.set(x, "chargeReturnShippingFee", js.undefined)
    
    @scala.inline
    def setMaxReturnShippingFee(value: MonetaryAmount): Self = StObject.set(x, "maxReturnShippingFee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxReturnShippingFeeUndefined: Self = StObject.set(x, "maxReturnShippingFee", js.undefined)
    
    @scala.inline
    def setRefundableItemsTotalAmount(value: MonetaryAmount): Self = StObject.set(x, "refundableItemsTotalAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefundableItemsTotalAmountUndefined: Self = StObject.set(x, "refundableItemsTotalAmount", js.undefined)
    
    @scala.inline
    def setRefundableShippingAmount(value: MonetaryAmount): Self = StObject.set(x, "refundableShippingAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefundableShippingAmountUndefined: Self = StObject.set(x, "refundableShippingAmount", js.undefined)
    
    @scala.inline
    def setTotalRefundedAmount(value: MonetaryAmount): Self = StObject.set(x, "totalRefundedAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalRefundedAmountUndefined: Self = StObject.set(x, "totalRefundedAmount", js.undefined)
  }
}
