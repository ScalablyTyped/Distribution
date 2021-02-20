package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrderPromotionItem extends StObject {
  
  /** The line item ID of a product. Do not provide for `orders.createtestorder`. */
  var lineItemId: js.UndefOr[String] = js.native
  
  /** Required. Offer ID of a product. Only for `orders.createtestorder`. */
  var offerId: js.UndefOr[String] = js.native
  
  /** `orders.createtestorder`. */
  var productId: js.UndefOr[String] = js.native
  
  /** The quantity of the associated product. Do not provide for `orders.createtestorder`. */
  var quantity: js.UndefOr[Double] = js.native
}
object OrderPromotionItem {
  
  @scala.inline
  def apply(): OrderPromotionItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderPromotionItem]
  }
  
  @scala.inline
  implicit class OrderPromotionItemMutableBuilder[Self <: OrderPromotionItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLineItemId(value: String): Self = StObject.set(x, "lineItemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineItemIdUndefined: Self = StObject.set(x, "lineItemId", js.undefined)
    
    @scala.inline
    def setOfferId(value: String): Self = StObject.set(x, "offerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfferIdUndefined: Self = StObject.set(x, "offerId", js.undefined)
    
    @scala.inline
    def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
    
    @scala.inline
    def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
  }
}
