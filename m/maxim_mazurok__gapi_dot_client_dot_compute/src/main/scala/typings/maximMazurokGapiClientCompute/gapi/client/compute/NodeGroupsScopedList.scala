package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.maximMazurokGapiClientCompute.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeGroupsScopedList extends StObject {
  
  /** [Output Only] A list of node groups contained in this scope. */
  var nodeGroups: js.UndefOr[js.Array[NodeGroup]] = js.undefined
  
  /** [Output Only] An informational warning that appears when the nodeGroup list is empty. */
  var warning: js.UndefOr[Code] = js.undefined
}
object NodeGroupsScopedList {
  
  inline def apply(): NodeGroupsScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeGroupsScopedList]
  }
  
  extension [Self <: NodeGroupsScopedList](x: Self) {
    
    inline def setNodeGroups(value: js.Array[NodeGroup]): Self = StObject.set(x, "nodeGroups", value.asInstanceOf[js.Any])
    
    inline def setNodeGroupsUndefined: Self = StObject.set(x, "nodeGroups", js.undefined)
    
    inline def setNodeGroupsVarargs(value: NodeGroup*): Self = StObject.set(x, "nodeGroups", js.Array(value*))
    
    inline def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
