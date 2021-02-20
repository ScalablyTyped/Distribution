package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgTreeSelectionChangedEventUIParam extends StObject {
  
  /**
    * Gets a reference to the newly added nodes to the selection.
    */
  var newNodes: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * Gets a reference to the tree.
    */
  var owner: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets a reference to currently selected nodes.
    */
  var selectedNodes: js.UndefOr[js.Array[_]] = js.native
}
object IgTreeSelectionChangedEventUIParam {
  
  @scala.inline
  def apply(): IgTreeSelectionChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgTreeSelectionChangedEventUIParam]
  }
  
  @scala.inline
  implicit class IgTreeSelectionChangedEventUIParamMutableBuilder[Self <: IgTreeSelectionChangedEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewNodes(value: js.Array[_]): Self = StObject.set(x, "newNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewNodesUndefined: Self = StObject.set(x, "newNodes", js.undefined)
    
    @scala.inline
    def setNewNodesVarargs(value: js.Any*): Self = StObject.set(x, "newNodes", js.Array(value :_*))
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setSelectedNodes(value: js.Array[_]): Self = StObject.set(x, "selectedNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedNodesUndefined: Self = StObject.set(x, "selectedNodes", js.undefined)
    
    @scala.inline
    def setSelectedNodesVarargs(value: js.Any*): Self = StObject.set(x, "selectedNodes", js.Array(value :_*))
  }
}
