package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderPromotionItem extends StObject {
  
  /** The line item ID of a product. Do not provide for `orders.createtestorder`. */
  var lineItemId: js.UndefOr[String] = js.undefined
  
  /** Required. Offer ID of a product. Only for `orders.createtestorder`. */
  var offerId: js.UndefOr[String] = js.undefined
  
  /** `orders.createtestorder`. */
  var productId: js.UndefOr[String] = js.undefined
  
  /** The quantity of the associated product. Do not provide for `orders.createtestorder`. */
  var quantity: js.UndefOr[Double] = js.undefined
}
object OrderPromotionItem {
  
  inline def apply(): OrderPromotionItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderPromotionItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrderPromotionItem] (val x: Self) extends AnyVal {
    
    inline def setLineItemId(value: String): Self = StObject.set(x, "lineItemId", value.asInstanceOf[js.Any])
    
    inline def setLineItemIdUndefined: Self = StObject.set(x, "lineItemId", js.undefined)
    
    inline def setOfferId(value: String): Self = StObject.set(x, "offerId", value.asInstanceOf[js.Any])
    
    inline def setOfferIdUndefined: Self = StObject.set(x, "offerId", js.undefined)
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
    
    inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
  }
}
