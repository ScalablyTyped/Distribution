package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReturnPricingInfo extends StObject {
  
  /**
    * Default option for whether merchant should charge the customer for return shipping costs, based on customer selected return reason and merchant's return policy for the items being returned.
    */
  var chargeReturnShippingFee: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Maximum return shipping costs that may be charged to the customer depending on merchant's assessment of the return reason and the merchant's return policy for the items being returned.
    */
  var maxReturnShippingFee: js.UndefOr[SchemaMonetaryAmount] = js.undefined
  
  /**
    * Total amount that can be refunded for the items in this return. It represents the total amount received by the merchant for the items, after applying merchant coupons.
    */
  var refundableItemsTotalAmount: js.UndefOr[SchemaMonetaryAmount] = js.undefined
  
  /**
    * Maximum amount that can be refunded for the original shipping fee.
    */
  var refundableShippingAmount: js.UndefOr[SchemaMonetaryAmount] = js.undefined
  
  /**
    * Total amount already refunded by the merchant. It includes all types of refunds (items, shipping, etc.) Not provided if no refund has been applied yet.
    */
  var totalRefundedAmount: js.UndefOr[SchemaMonetaryAmount] = js.undefined
}
object SchemaReturnPricingInfo {
  
  inline def apply(): SchemaReturnPricingInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReturnPricingInfo]
  }
  
  extension [Self <: SchemaReturnPricingInfo](x: Self) {
    
    inline def setChargeReturnShippingFee(value: Boolean): Self = StObject.set(x, "chargeReturnShippingFee", value.asInstanceOf[js.Any])
    
    inline def setChargeReturnShippingFeeNull: Self = StObject.set(x, "chargeReturnShippingFee", null)
    
    inline def setChargeReturnShippingFeeUndefined: Self = StObject.set(x, "chargeReturnShippingFee", js.undefined)
    
    inline def setMaxReturnShippingFee(value: SchemaMonetaryAmount): Self = StObject.set(x, "maxReturnShippingFee", value.asInstanceOf[js.Any])
    
    inline def setMaxReturnShippingFeeUndefined: Self = StObject.set(x, "maxReturnShippingFee", js.undefined)
    
    inline def setRefundableItemsTotalAmount(value: SchemaMonetaryAmount): Self = StObject.set(x, "refundableItemsTotalAmount", value.asInstanceOf[js.Any])
    
    inline def setRefundableItemsTotalAmountUndefined: Self = StObject.set(x, "refundableItemsTotalAmount", js.undefined)
    
    inline def setRefundableShippingAmount(value: SchemaMonetaryAmount): Self = StObject.set(x, "refundableShippingAmount", value.asInstanceOf[js.Any])
    
    inline def setRefundableShippingAmountUndefined: Self = StObject.set(x, "refundableShippingAmount", js.undefined)
    
    inline def setTotalRefundedAmount(value: SchemaMonetaryAmount): Self = StObject.set(x, "totalRefundedAmount", value.asInstanceOf[js.Any])
    
    inline def setTotalRefundedAmountUndefined: Self = StObject.set(x, "totalRefundedAmount", js.undefined)
  }
}
