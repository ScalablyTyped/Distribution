package typings.googleapis.computeV1Mod.computeV1

import typings.googleapis.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaNodeTypesScopedList extends StObject {
  
  /**
    * [Output Only] A list of node types contained in this scope.
    */
  var nodeTypes: js.UndefOr[js.Array[SchemaNodeType]] = js.native
  
  /**
    * [Output Only] An informational warning that appears when the node types
    * list is empty.
    */
  var warning: js.UndefOr[Code] = js.native
}
object SchemaNodeTypesScopedList {
  
  @scala.inline
  def apply(): SchemaNodeTypesScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNodeTypesScopedList]
  }
  
  @scala.inline
  implicit class SchemaNodeTypesScopedListMutableBuilder[Self <: SchemaNodeTypesScopedList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNodeTypes(value: js.Array[SchemaNodeType]): Self = StObject.set(x, "nodeTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeTypesUndefined: Self = StObject.set(x, "nodeTypes", js.undefined)
    
    @scala.inline
    def setNodeTypesVarargs(value: SchemaNodeType*): Self = StObject.set(x, "nodeTypes", js.Array(value :_*))
    
    @scala.inline
    def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
