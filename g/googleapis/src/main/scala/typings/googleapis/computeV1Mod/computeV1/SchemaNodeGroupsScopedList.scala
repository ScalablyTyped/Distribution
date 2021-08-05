package typings.googleapis.computeV1Mod.computeV1

import typings.googleapis.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNodeGroupsScopedList extends StObject {
  
  /**
    * [Output Only] A list of node groups contained in this scope.
    */
  var nodeGroups: js.UndefOr[js.Array[SchemaNodeGroup]] = js.undefined
  
  /**
    * [Output Only] An informational warning that appears when the nodeGroup
    * list is empty.
    */
  var warning: js.UndefOr[Code] = js.undefined
}
object SchemaNodeGroupsScopedList {
  
  inline def apply(): SchemaNodeGroupsScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNodeGroupsScopedList]
  }
  
  extension [Self <: SchemaNodeGroupsScopedList](x: Self) {
    
    inline def setNodeGroups(value: js.Array[SchemaNodeGroup]): Self = StObject.set(x, "nodeGroups", value.asInstanceOf[js.Any])
    
    inline def setNodeGroupsUndefined: Self = StObject.set(x, "nodeGroups", js.undefined)
    
    inline def setNodeGroupsVarargs(value: SchemaNodeGroup*): Self = StObject.set(x, "nodeGroups", js.Array(value :_*))
    
    inline def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
