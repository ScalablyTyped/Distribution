package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.maximMazurokGapiClientCompute.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OperationsScopedList extends StObject {
  
  /** [Output Only] A list of operations contained in this scope. */
  var operations: js.UndefOr[js.Array[Operation]] = js.undefined
  
  /** [Output Only] Informational warning which replaces the list of operations when the list is empty. */
  var warning: js.UndefOr[Code] = js.undefined
}
object OperationsScopedList {
  
  inline def apply(): OperationsScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperationsScopedList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OperationsScopedList] (val x: Self) extends AnyVal {
    
    inline def setOperations(value: js.Array[Operation]): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    inline def setOperationsUndefined: Self = StObject.set(x, "operations", js.undefined)
    
    inline def setOperationsVarargs(value: Operation*): Self = StObject.set(x, "operations", js.Array(value*))
    
    inline def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
