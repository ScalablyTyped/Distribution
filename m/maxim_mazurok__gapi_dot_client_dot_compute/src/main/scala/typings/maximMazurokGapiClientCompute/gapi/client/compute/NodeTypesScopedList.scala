package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.maximMazurokGapiClientCompute.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeTypesScopedList extends StObject {
  
  /** [Output Only] A list of node types contained in this scope. */
  var nodeTypes: js.UndefOr[js.Array[NodeType]] = js.undefined
  
  /** [Output Only] An informational warning that appears when the node types list is empty. */
  var warning: js.UndefOr[Code] = js.undefined
}
object NodeTypesScopedList {
  
  inline def apply(): NodeTypesScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeTypesScopedList]
  }
  
  extension [Self <: NodeTypesScopedList](x: Self) {
    
    inline def setNodeTypes(value: js.Array[NodeType]): Self = StObject.set(x, "nodeTypes", value.asInstanceOf[js.Any])
    
    inline def setNodeTypesUndefined: Self = StObject.set(x, "nodeTypes", js.undefined)
    
    inline def setNodeTypesVarargs(value: NodeType*): Self = StObject.set(x, "nodeTypes", js.Array(value*))
    
    inline def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
