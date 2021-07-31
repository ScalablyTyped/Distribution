package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderreturnsLineItem extends StObject {
  
  /** The ID of the line item. This value is assigned by Google when an order is created. */
  var lineItemId: js.UndefOr[String] = js.undefined
  
  /** The quantity of this line item. */
  var quantity: js.UndefOr[Double] = js.undefined
}
object OrderreturnsLineItem {
  
  @scala.inline
  def apply(): OrderreturnsLineItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderreturnsLineItem]
  }
  
  @scala.inline
  implicit class OrderreturnsLineItemMutableBuilder[Self <: OrderreturnsLineItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLineItemId(value: String): Self = StObject.set(x, "lineItemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineItemIdUndefined: Self = StObject.set(x, "lineItemId", js.undefined)
    
    @scala.inline
    def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
  }
}
