package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrdersRejectReturnLineItemResponse extends StObject {
  
  /** The status of the execution. Acceptable values are: - "`duplicate`" - "`executed`" */
  var executionStatus: js.UndefOr[String] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "`content#ordersRejectReturnLineItemResponse`". */
  var kind: js.UndefOr[String] = js.undefined
}
object OrdersRejectReturnLineItemResponse {
  
  inline def apply(): OrdersRejectReturnLineItemResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrdersRejectReturnLineItemResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrdersRejectReturnLineItemResponse] (val x: Self) extends AnyVal {
    
    inline def setExecutionStatus(value: String): Self = StObject.set(x, "executionStatus", value.asInstanceOf[js.Any])
    
    inline def setExecutionStatusUndefined: Self = StObject.set(x, "executionStatus", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
