package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderreturnsProcessResponse extends StObject {
  
  /** The status of the execution. Acceptable values are: - "`duplicate`" - "`executed`" */
  var executionStatus: js.UndefOr[String] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "`content#orderreturnsProcessResponse`". */
  var kind: js.UndefOr[String] = js.undefined
}
object OrderreturnsProcessResponse {
  
  inline def apply(): OrderreturnsProcessResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderreturnsProcessResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrderreturnsProcessResponse] (val x: Self) extends AnyVal {
    
    inline def setExecutionStatus(value: String): Self = StObject.set(x, "executionStatus", value.asInstanceOf[js.Any])
    
    inline def setExecutionStatusUndefined: Self = StObject.set(x, "executionStatus", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
