package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrdersCancelLineItemRequest extends StObject {
  
  /**
    * Deprecated. Please use amountPretax and amountTax instead.
    */
  var amount: js.UndefOr[SchemaPrice] = js.undefined
  
  /**
    * Amount to refund for the cancelation. Optional. If not set, Google will
    * calculate the default based on the price and tax of the items involved.
    * The amount must not be larger than the net amount left on the order.
    */
  var amountPretax: js.UndefOr[SchemaPrice] = js.undefined
  
  /**
    * Tax amount that corresponds to cancellation amount in amountPretax.
    * Optional, but if filled, then amountPretax must be set. Calculated
    * automatically if not provided.
    */
  var amountTax: js.UndefOr[SchemaPrice] = js.undefined
  
  /**
    * The ID of the line item to cancel. Either lineItemId or productId is
    * required.
    */
  var lineItemId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the operation. Unique across all operations for a given order.
    */
  var operationId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the product to cancel. This is the REST ID used in the products
    * service. Either lineItemId or productId is required.
    */
  var productId: js.UndefOr[String] = js.undefined
  
  /**
    * The quantity to cancel.
    */
  var quantity: js.UndefOr[Double] = js.undefined
  
  /**
    * The reason for the cancellation.
    */
  var reason: js.UndefOr[String] = js.undefined
  
  /**
    * The explanation of the reason.
    */
  var reasonText: js.UndefOr[String] = js.undefined
}
object SchemaOrdersCancelLineItemRequest {
  
  @scala.inline
  def apply(): SchemaOrdersCancelLineItemRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrdersCancelLineItemRequest]
  }
  
  @scala.inline
  implicit class SchemaOrdersCancelLineItemRequestMutableBuilder[Self <: SchemaOrdersCancelLineItemRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: SchemaPrice): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmountPretax(value: SchemaPrice): Self = StObject.set(x, "amountPretax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmountPretaxUndefined: Self = StObject.set(x, "amountPretax", js.undefined)
    
    @scala.inline
    def setAmountTax(value: SchemaPrice): Self = StObject.set(x, "amountTax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmountTaxUndefined: Self = StObject.set(x, "amountTax", js.undefined)
    
    @scala.inline
    def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    @scala.inline
    def setLineItemId(value: String): Self = StObject.set(x, "lineItemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineItemIdUndefined: Self = StObject.set(x, "lineItemId", js.undefined)
    
    @scala.inline
    def setOperationId(value: String): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationIdUndefined: Self = StObject.set(x, "operationId", js.undefined)
    
    @scala.inline
    def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
    
    @scala.inline
    def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonText(value: String): Self = StObject.set(x, "reasonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonTextUndefined: Self = StObject.set(x, "reasonText", js.undefined)
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
