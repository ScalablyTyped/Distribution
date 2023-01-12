package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrdersCreateTestReturnResponse extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "`content#ordersCreateTestReturnResponse`". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The ID of the newly created test order return. */
  var returnId: js.UndefOr[String] = js.undefined
}
object OrdersCreateTestReturnResponse {
  
  inline def apply(): OrdersCreateTestReturnResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrdersCreateTestReturnResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrdersCreateTestReturnResponse] (val x: Self) extends AnyVal {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setReturnId(value: String): Self = StObject.set(x, "returnId", value.asInstanceOf[js.Any])
    
    inline def setReturnIdUndefined: Self = StObject.set(x, "returnId", js.undefined)
  }
}
