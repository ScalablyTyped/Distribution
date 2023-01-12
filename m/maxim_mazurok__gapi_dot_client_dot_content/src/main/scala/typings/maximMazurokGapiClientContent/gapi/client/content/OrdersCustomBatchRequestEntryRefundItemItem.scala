package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrdersCustomBatchRequestEntryRefundItemItem extends StObject {
  
  /**
    * The total amount that is refunded. (for example, refunding $5 each for 2 products should be done by setting quantity to 2 and amount to 10$) In case of multiple refunds, this should
    * be the amount you currently want to refund to the customer.
    */
  var amount: js.UndefOr[MonetaryAmount] = js.undefined
  
  /** If true, the full item will be refunded. If this is true, amount shouldn't be provided and will be ignored. */
  var fullRefund: js.UndefOr[Boolean] = js.undefined
  
  /** The ID of the line item. Either lineItemId or productId is required. */
  var lineItemId: js.UndefOr[String] = js.undefined
  
  /** The ID of the product. This is the REST ID used in the products service. Either lineItemId or productId is required. */
  var productId: js.UndefOr[String] = js.undefined
  
  /** The number of products that are refunded. */
  var quantity: js.UndefOr[Double] = js.undefined
}
object OrdersCustomBatchRequestEntryRefundItemItem {
  
  inline def apply(): OrdersCustomBatchRequestEntryRefundItemItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrdersCustomBatchRequestEntryRefundItemItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrdersCustomBatchRequestEntryRefundItemItem] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: MonetaryAmount): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setFullRefund(value: Boolean): Self = StObject.set(x, "fullRefund", value.asInstanceOf[js.Any])
    
    inline def setFullRefundUndefined: Self = StObject.set(x, "fullRefund", js.undefined)
    
    inline def setLineItemId(value: String): Self = StObject.set(x, "lineItemId", value.asInstanceOf[js.Any])
    
    inline def setLineItemIdUndefined: Self = StObject.set(x, "lineItemId", js.undefined)
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
    
    inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
  }
}
