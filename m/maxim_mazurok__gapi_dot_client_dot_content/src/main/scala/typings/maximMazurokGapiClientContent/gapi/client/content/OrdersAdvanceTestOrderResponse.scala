package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrdersAdvanceTestOrderResponse extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "content#ordersAdvanceTestOrderResponse". */
  var kind: js.UndefOr[String] = js.native
}
object OrdersAdvanceTestOrderResponse {
  
  @scala.inline
  def apply(): OrdersAdvanceTestOrderResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrdersAdvanceTestOrderResponse]
  }
  
  @scala.inline
  implicit class OrdersAdvanceTestOrderResponseMutableBuilder[Self <: OrdersAdvanceTestOrderResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
