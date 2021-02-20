package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrdersCreateTestOrderResponse extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "content#ordersCreateTestOrderResponse". */
  var kind: js.UndefOr[String] = js.native
  
  /** The ID of the newly created test order. */
  var orderId: js.UndefOr[String] = js.native
}
object OrdersCreateTestOrderResponse {
  
  @scala.inline
  def apply(): OrdersCreateTestOrderResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrdersCreateTestOrderResponse]
  }
  
  @scala.inline
  implicit class OrdersCreateTestOrderResponseMutableBuilder[Self <: OrdersCreateTestOrderResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setOrderId(value: String): Self = StObject.set(x, "orderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderIdUndefined: Self = StObject.set(x, "orderId", js.undefined)
  }
}
