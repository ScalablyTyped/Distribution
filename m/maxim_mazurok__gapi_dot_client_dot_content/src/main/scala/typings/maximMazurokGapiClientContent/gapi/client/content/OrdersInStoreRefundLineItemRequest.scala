package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrdersInStoreRefundLineItemRequest extends StObject {
  
  /** The ID of the line item to return. Either lineItemId or productId is required. */
  var lineItemId: js.UndefOr[String] = js.undefined
  
  /** The ID of the operation. Unique across all operations for a given order. */
  var operationId: js.UndefOr[String] = js.undefined
  
  /** The amount to be refunded. This may be pre-tax or post-tax depending on the location of the order. Required. */
  var priceAmount: js.UndefOr[Price] = js.undefined
  
  /** The ID of the product to return. This is the REST ID used in the products service. Either lineItemId or productId is required. */
  var productId: js.UndefOr[String] = js.undefined
  
  /** The quantity to return and refund. */
  var quantity: js.UndefOr[Double] = js.undefined
  
  /**
    * The reason for the return. Acceptable values are: - "`customerDiscretionaryReturn`" - "`customerInitiatedMerchantCancel`" - "`deliveredTooLate`" - "`expiredItem`" -
    * "`invalidCoupon`" - "`malformedShippingAddress`" - "`other`" - "`productArrivedDamaged`" - "`productNotAsDescribed`" - "`qualityNotAsExpected`" - "`undeliverableShippingAddress`" -
    * "`unsupportedPoBoxAddress`" - "`wrongProductShipped`"
    */
  var reason: js.UndefOr[String] = js.undefined
  
  /** The explanation of the reason. */
  var reasonText: js.UndefOr[String] = js.undefined
  
  /** The amount of tax to be refunded. Required. */
  var taxAmount: js.UndefOr[Price] = js.undefined
}
object OrdersInStoreRefundLineItemRequest {
  
  inline def apply(): OrdersInStoreRefundLineItemRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrdersInStoreRefundLineItemRequest]
  }
  
  extension [Self <: OrdersInStoreRefundLineItemRequest](x: Self) {
    
    inline def setLineItemId(value: String): Self = StObject.set(x, "lineItemId", value.asInstanceOf[js.Any])
    
    inline def setLineItemIdUndefined: Self = StObject.set(x, "lineItemId", js.undefined)
    
    inline def setOperationId(value: String): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
    
    inline def setOperationIdUndefined: Self = StObject.set(x, "operationId", js.undefined)
    
    inline def setPriceAmount(value: Price): Self = StObject.set(x, "priceAmount", value.asInstanceOf[js.Any])
    
    inline def setPriceAmountUndefined: Self = StObject.set(x, "priceAmount", js.undefined)
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
    
    inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonText(value: String): Self = StObject.set(x, "reasonText", value.asInstanceOf[js.Any])
    
    inline def setReasonTextUndefined: Self = StObject.set(x, "reasonText", js.undefined)
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setTaxAmount(value: Price): Self = StObject.set(x, "taxAmount", value.asInstanceOf[js.Any])
    
    inline def setTaxAmountUndefined: Self = StObject.set(x, "taxAmount", js.undefined)
  }
}
