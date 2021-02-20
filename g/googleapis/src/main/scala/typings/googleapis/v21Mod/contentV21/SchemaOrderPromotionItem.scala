package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaOrderPromotionItem extends StObject {
  
  var lineItemId: js.UndefOr[String] = js.native
  
  var productId: js.UndefOr[String] = js.native
  
  /**
    * The quantity of the associated product.
    */
  var quantity: js.UndefOr[Double] = js.native
}
object SchemaOrderPromotionItem {
  
  @scala.inline
  def apply(): SchemaOrderPromotionItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderPromotionItem]
  }
  
  @scala.inline
  implicit class SchemaOrderPromotionItemMutableBuilder[Self <: SchemaOrderPromotionItem] (val x: Self) extends AnyVal {
    
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
  }
}
