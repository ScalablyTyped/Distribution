package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrderPromotionItem extends StObject {
  
  /**
    * The line item ID of a product. Do not provide for `orders.createtestorder`.
    */
  var lineItemId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Offer ID of a product. Only for `orders.createtestorder`.
    */
  var offerId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * `orders.createtestorder`.
    */
  var productId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The quantity of the associated product. Do not provide for `orders.createtestorder`.
    */
  var quantity: js.UndefOr[Double | Null] = js.undefined
}
object SchemaOrderPromotionItem {
  
  inline def apply(): SchemaOrderPromotionItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderPromotionItem]
  }
  
  extension [Self <: SchemaOrderPromotionItem](x: Self) {
    
    inline def setLineItemId(value: String): Self = StObject.set(x, "lineItemId", value.asInstanceOf[js.Any])
    
    inline def setLineItemIdNull: Self = StObject.set(x, "lineItemId", null)
    
    inline def setLineItemIdUndefined: Self = StObject.set(x, "lineItemId", js.undefined)
    
    inline def setOfferId(value: String): Self = StObject.set(x, "offerId", value.asInstanceOf[js.Any])
    
    inline def setOfferIdNull: Self = StObject.set(x, "offerId", null)
    
    inline def setOfferIdUndefined: Self = StObject.set(x, "offerId", js.undefined)
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdNull: Self = StObject.set(x, "productId", null)
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
    
    inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityNull: Self = StObject.set(x, "quantity", null)
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
  }
}
