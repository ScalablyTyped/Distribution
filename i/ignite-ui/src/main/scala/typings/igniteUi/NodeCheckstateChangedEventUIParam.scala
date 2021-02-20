package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeCheckstateChangedEventUIParam extends StObject {
  
  /**
    * Gets the collection of all checked nodes.
    */
  var newCheckedNodes: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * Gets the collection of all partially checked nodes.
    */
  var newPartiallyCheckedNodes: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * Gets the new state that is already applied to the checkbox.
    */
  var newState: js.UndefOr[String] = js.native
  
  /**
    * Gets a reference to the node object the checkbox of which is being interacted with.
    */
  var node: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets a reference to the tree.
    */
  var owner: js.UndefOr[js.Any] = js.native
}
object NodeCheckstateChangedEventUIParam {
  
  @scala.inline
  def apply(): NodeCheckstateChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeCheckstateChangedEventUIParam]
  }
  
  @scala.inline
  implicit class NodeCheckstateChangedEventUIParamMutableBuilder[Self <: NodeCheckstateChangedEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewCheckedNodes(value: js.Array[_]): Self = StObject.set(x, "newCheckedNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewCheckedNodesUndefined: Self = StObject.set(x, "newCheckedNodes", js.undefined)
    
    @scala.inline
    def setNewCheckedNodesVarargs(value: js.Any*): Self = StObject.set(x, "newCheckedNodes", js.Array(value :_*))
    
    @scala.inline
    def setNewPartiallyCheckedNodes(value: js.Array[_]): Self = StObject.set(x, "newPartiallyCheckedNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewPartiallyCheckedNodesUndefined: Self = StObject.set(x, "newPartiallyCheckedNodes", js.undefined)
    
    @scala.inline
    def setNewPartiallyCheckedNodesVarargs(value: js.Any*): Self = StObject.set(x, "newPartiallyCheckedNodes", js.Array(value :_*))
    
    @scala.inline
    def setNewState(value: String): Self = StObject.set(x, "newState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewStateUndefined: Self = StObject.set(x, "newState", js.undefined)
    
    @scala.inline
    def setNode(value: js.Any): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
