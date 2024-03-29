package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrdersAdvanceTestOrderResponse extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "`content#ordersAdvanceTestOrderResponse`". */
  var kind: js.UndefOr[String] = js.undefined
}
object OrdersAdvanceTestOrderResponse {
  
  inline def apply(): OrdersAdvanceTestOrderResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrdersAdvanceTestOrderResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrdersAdvanceTestOrderResponse] (val x: Self) extends AnyVal {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
