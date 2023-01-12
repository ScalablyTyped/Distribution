package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderreturnsCreateOrderReturnResponse extends StObject {
  
  /** The status of the execution. Acceptable values are: - "`duplicate`" - "`executed`" */
  var executionStatus: js.UndefOr[String] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "`content#orderreturnsCreateOrderReturnResponse`". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Created order return. */
  var orderReturn: js.UndefOr[MerchantOrderReturn] = js.undefined
}
object OrderreturnsCreateOrderReturnResponse {
  
  inline def apply(): OrderreturnsCreateOrderReturnResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderreturnsCreateOrderReturnResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrderreturnsCreateOrderReturnResponse] (val x: Self) extends AnyVal {
    
    inline def setExecutionStatus(value: String): Self = StObject.set(x, "executionStatus", value.asInstanceOf[js.Any])
    
    inline def setExecutionStatusUndefined: Self = StObject.set(x, "executionStatus", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setOrderReturn(value: MerchantOrderReturn): Self = StObject.set(x, "orderReturn", value.asInstanceOf[js.Any])
    
    inline def setOrderReturnUndefined: Self = StObject.set(x, "orderReturn", js.undefined)
  }
}
