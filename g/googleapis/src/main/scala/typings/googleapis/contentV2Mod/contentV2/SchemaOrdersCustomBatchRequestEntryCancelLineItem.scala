package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrdersCustomBatchRequestEntryCancelLineItem extends StObject {
  
  /**
    * Deprecated. Please use amountPretax and amountTax instead.
    */
  var amount: js.UndefOr[SchemaPrice] = js.undefined
  
  /**
    * Amount to refund for the cancelation. Optional. If not set, Google will calculate the default based on the price and tax of the items involved. The amount must not be larger than the net amount left on the order.
    */
  var amountPretax: js.UndefOr[SchemaPrice] = js.undefined
  
  /**
    * Tax amount that corresponds to cancellation amount in amountPretax. Optional, but if filled, then amountPretax must be set. Calculated automatically if not provided.
    */
  var amountTax: js.UndefOr[SchemaPrice] = js.undefined
  
  /**
    * The ID of the line item to cancel. Either lineItemId or productId is required.
    */
  var lineItemId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID of the product to cancel. This is the REST ID used in the products service. Either lineItemId or productId is required.
    */
  var productId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The quantity to cancel.
    */
  var quantity: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The reason for the cancellation. Acceptable values are: - "`customerInitiatedCancel`" - "`invalidCoupon`" - "`malformedShippingAddress`" - "`noInventory`" - "`other`" - "`priceError`" - "`shippingPriceError`" - "`taxError`" - "`undeliverableShippingAddress`" - "`unsupportedPoBoxAddress`"
    */
  var reason: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The explanation of the reason.
    */
  var reasonText: js.UndefOr[String | Null] = js.undefined
}
object SchemaOrdersCustomBatchRequestEntryCancelLineItem {
  
  inline def apply(): SchemaOrdersCustomBatchRequestEntryCancelLineItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrdersCustomBatchRequestEntryCancelLineItem]
  }
  
  extension [Self <: SchemaOrdersCustomBatchRequestEntryCancelLineItem](x: Self) {
    
    inline def setAmount(value: SchemaPrice): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountPretax(value: SchemaPrice): Self = StObject.set(x, "amountPretax", value.asInstanceOf[js.Any])
    
    inline def setAmountPretaxUndefined: Self = StObject.set(x, "amountPretax", js.undefined)
    
    inline def setAmountTax(value: SchemaPrice): Self = StObject.set(x, "amountTax", value.asInstanceOf[js.Any])
    
    inline def setAmountTaxUndefined: Self = StObject.set(x, "amountTax", js.undefined)
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
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
