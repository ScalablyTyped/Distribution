package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrdersCustomBatchRequestEntryReturnRefundLineItem extends StObject {
  
  /**
    * The amount that is refunded. If omitted, refundless return is assumed (same as calling returnLineItem method).
    */
  var amountPretax: js.UndefOr[SchemaPrice] = js.undefined
  
  /**
    * Tax amount that corresponds to refund amount in amountPretax. Optional, but if filled, then amountPretax must be set. Calculated automatically if not provided.
    */
  var amountTax: js.UndefOr[SchemaPrice] = js.undefined
  
  /**
    * The ID of the line item to return. Either lineItemId or productId is required.
    */
  var lineItemId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID of the product to return. This is the REST ID used in the products service. Either lineItemId or productId is required.
    */
  var productId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The quantity to return and refund.
    */
  var quantity: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The reason for the return. Acceptable values are: - "`customerDiscretionaryReturn`" - "`customerInitiatedMerchantCancel`" - "`deliveredTooLate`" - "`expiredItem`" - "`invalidCoupon`" - "`malformedShippingAddress`" - "`other`" - "`productArrivedDamaged`" - "`productNotAsDescribed`" - "`qualityNotAsExpected`" - "`undeliverableShippingAddress`" - "`unsupportedPoBoxAddress`" - "`wrongProductShipped`"
    */
  var reason: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The explanation of the reason.
    */
  var reasonText: js.UndefOr[String | Null] = js.undefined
}
object SchemaOrdersCustomBatchRequestEntryReturnRefundLineItem {
  
  inline def apply(): SchemaOrdersCustomBatchRequestEntryReturnRefundLineItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrdersCustomBatchRequestEntryReturnRefundLineItem]
  }
  
  extension [Self <: SchemaOrdersCustomBatchRequestEntryReturnRefundLineItem](x: Self) {
    
    inline def setAmountPretax(value: SchemaPrice): Self = StObject.set(x, "amountPretax", value.asInstanceOf[js.Any])
    
    inline def setAmountPretaxUndefined: Self = StObject.set(x, "amountPretax", js.undefined)
    
    inline def setAmountTax(value: SchemaPrice): Self = StObject.set(x, "amountTax", value.asInstanceOf[js.Any])
    
    inline def setAmountTaxUndefined: Self = StObject.set(x, "amountTax", js.undefined)
    
    inline def setLineItemId(value: String): Self = StObject.set(x, "lineItemId", value.asInstanceOf[js.Any])
    
    inline def setLineItemIdNull: Self = StObject.set(x, "lineItemId", null)
    
    inline def setLineItemIdUndefined: Self = StObject.set(x, "lineItemId", js.undefined)
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdNull: Self = StObject.set(x, "productId", null)
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
    
    inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityNull: Self = StObject.set(x, "quantity", null)
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonNull: Self = StObject.set(x, "reason", null)
    
    inline def setReasonText(value: String): Self = StObject.set(x, "reasonText", value.asInstanceOf[js.Any])
    
    inline def setReasonTextNull: Self = StObject.set(x, "reasonText", null)
    
    inline def setReasonTextUndefined: Self = StObject.set(x, "reasonText", js.undefined)
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
