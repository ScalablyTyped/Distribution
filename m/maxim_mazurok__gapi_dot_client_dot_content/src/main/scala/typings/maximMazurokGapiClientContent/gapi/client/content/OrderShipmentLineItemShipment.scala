package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrderShipmentLineItemShipment extends StObject {
  
  /** The ID of the line item that is shipped. This value is assigned by Google when an order is created. Either lineItemId or productId is required. */
  var lineItemId: js.UndefOr[String] = js.native
  
  /** The ID of the product to ship. This is the REST ID used in the products service. Either lineItemId or productId is required. */
  var productId: js.UndefOr[String] = js.native
  
  /** The quantity that is shipped. */
  var quantity: js.UndefOr[Double] = js.native
}
object OrderShipmentLineItemShipment {
  
  @scala.inline
  def apply(): OrderShipmentLineItemShipment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderShipmentLineItemShipment]
  }
  
  @scala.inline
  implicit class OrderShipmentLineItemShipmentMutableBuilder[Self <: OrderShipmentLineItemShipment] (val x: Self) extends AnyVal {
    
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
