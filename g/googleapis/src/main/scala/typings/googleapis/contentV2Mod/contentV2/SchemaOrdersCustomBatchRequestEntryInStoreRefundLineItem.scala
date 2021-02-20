package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaOrdersCustomBatchRequestEntryInStoreRefundLineItem extends StObject {
  
  /**
    * The amount that is refunded. Required.
    */
  var amountPretax: js.UndefOr[SchemaPrice] = js.native
  
  /**
    * Tax amount that correspond to refund amount in amountPretax. Required.
    */
  var amountTax: js.UndefOr[SchemaPrice] = js.native
  
  /**
    * The ID of the line item to return. Either lineItemId or productId is
    * required.
    */
  var lineItemId: js.UndefOr[String] = js.native
  
  /**
    * The ID of the product to return. This is the REST ID used in the products
    * service. Either lineItemId or productId is required.
    */
  var productId: js.UndefOr[String] = js.native
  
  /**
    * The quantity to return and refund.
    */
  var quantity: js.UndefOr[Double] = js.native
  
  /**
    * The reason for the return.
    */
  var reason: js.UndefOr[String] = js.native
  
  /**
    * The explanation of the reason.
    */
  var reasonText: js.UndefOr[String] = js.native
}
object SchemaOrdersCustomBatchRequestEntryInStoreRefundLineItem {
  
  @scala.inline
  def apply(): SchemaOrdersCustomBatchRequestEntryInStoreRefundLineItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrdersCustomBatchRequestEntryInStoreRefundLineItem]
  }
  
  @scala.inline
  implicit class SchemaOrdersCustomBatchRequestEntryInStoreRefundLineItemMutableBuilder[Self <: SchemaOrdersCustomBatchRequestEntryInStoreRefundLineItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmountPretax(value: SchemaPrice): Self = StObject.set(x, "amountPretax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmountPretaxUndefined: Self = StObject.set(x, "amountPretax", js.undefined)
    
    @scala.inline
    def setAmountTax(value: SchemaPrice): Self = StObject.set(x, "amountTax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmountTaxUndefined: Self = StObject.set(x, "amountTax", js.undefined)
    
    @scala.inline
    def setLineItemId(value: String): Self = StObject.set(x, "lineItemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineItemIdUndefined: Self = StObject.set(x, "lineItemId", js.undefined)
    
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
