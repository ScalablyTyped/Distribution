package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListOperationsResponse extends StObject {
  
  /** If any zones are listed here, the list of operations returned may be missing the operations from those zones. */
  var missingZones: js.UndefOr[js.Array[String]] = js.undefined
  
  /** A list of operations in the project in the specified zone. */
  var operations: js.UndefOr[js.Array[Operation]] = js.undefined
}
object ListOperationsResponse {
  
  inline def apply(): ListOperationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOperationsResponse]
  }
  
  extension [Self <: ListOperationsResponse](x: Self) {
    
    inline def setMissingZones(value: js.Array[String]): Self = StObject.set(x, "missingZones", value.asInstanceOf[js.Any])
    
    inline def setMissingZonesUndefined: Self = StObject.set(x, "missingZones", js.undefined)
    
    inline def setMissingZonesVarargs(value: String*): Self = StObject.set(x, "missingZones", js.Array(value :_*))
    
    inline def setOperations(value: js.Array[Operation]): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    inline def setOperationsUndefined: Self = StObject.set(x, "operations", js.undefined)
    
    inline def setOperationsVarargs(value: Operation*): Self = StObject.set(x, "operations", js.Array(value :_*))
  }
}
