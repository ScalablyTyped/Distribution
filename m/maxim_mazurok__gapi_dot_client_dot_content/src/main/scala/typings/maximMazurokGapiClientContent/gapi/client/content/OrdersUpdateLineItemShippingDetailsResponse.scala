package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrdersUpdateLineItemShippingDetailsResponse extends StObject {
  
  /** The status of the execution. Acceptable values are: - "`duplicate`" - "`executed`" */
  var executionStatus: js.UndefOr[String] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "`content#ordersUpdateLineItemShippingDetailsResponse`". */
  var kind: js.UndefOr[String] = js.undefined
}
object OrdersUpdateLineItemShippingDetailsResponse {
  
  inline def apply(): OrdersUpdateLineItemShippingDetailsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrdersUpdateLineItemShippingDetailsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrdersUpdateLineItemShippingDetailsResponse] (val x: Self) extends AnyVal {
    
    inline def setExecutionStatus(value: String): Self = StObject.set(x, "executionStatus", value.asInstanceOf[js.Any])
    
    inline def setExecutionStatusUndefined: Self = StObject.set(x, "executionStatus", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
