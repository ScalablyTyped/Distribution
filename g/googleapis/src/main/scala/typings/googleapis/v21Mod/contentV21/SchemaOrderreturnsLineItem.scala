package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrderreturnsLineItem extends StObject {
  
  /**
    * The ID of the line item. This value is assigned by Google when an order is created. Either lineItemId or productId is required.
    */
  var lineItemId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID of the product to cancel. This is the REST ID used in the products service. Either lineItemId or productId is required.
    */
  var productId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The quantity of this line item.
    */
  var quantity: js.UndefOr[Double | Null] = js.undefined
}
object SchemaOrderreturnsLineItem {
  
  inline def apply(): SchemaOrderreturnsLineItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderreturnsLineItem]
  }
  
  extension [Self <: SchemaOrderreturnsLineItem](x: Self) {
    
    inline def setLineItemId(value: String): Self = StObject.set(x, "lineItemId", value.asInstanceOf[js.Any])
    
    inline def setLineItemIdNull: Self = StObject.set(x, "lineItemId", null)
    
    inline def setLineItemIdUndefined: Self = StObject.set(x, "lineItemId", js.undefined)
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdNull: Self = StObject.set(x, "productId", null)
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
    
    inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityNull: Self = StObject.set(x, "quantity", null)
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
  }
}
