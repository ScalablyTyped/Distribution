package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.maximMazurokGapiClientCompute.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OperationsScopedList extends StObject {
  
  /** [Output Only] A list of operations contained in this scope. */
  var operations: js.UndefOr[js.Array[Operation]] = js.native
  
  /** [Output Only] Informational warning which replaces the list of operations when the list is empty. */
  var warning: js.UndefOr[Code] = js.native
}
object OperationsScopedList {
  
  @scala.inline
  def apply(): OperationsScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperationsScopedList]
  }
  
  @scala.inline
  implicit class OperationsScopedListMutableBuilder[Self <: OperationsScopedList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperations(value: js.Array[Operation]): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationsUndefined: Self = StObject.set(x, "operations", js.undefined)
    
    @scala.inline
    def setOperationsVarargs(value: Operation*): Self = StObject.set(x, "operations", js.Array(value :_*))
    
    @scala.inline
    def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
