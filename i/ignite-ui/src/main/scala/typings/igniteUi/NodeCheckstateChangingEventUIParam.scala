package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeCheckstateChangingEventUIParam extends StObject {
  
  /**
    * Gets the collection of all checked nodes before the new state is applied.
    */
  var currentCheckedNodes: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  /**
    * Gets the current state of the checkbox.
    */
  var currentState: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the new state that is going to be applied to the checkbox.
    */
  var newState: js.UndefOr[String] = js.undefined
  
  /**
    * Gets a reference to the node object the checkbox of which is being interacted with.
    */
  var node: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets a reference to the tree.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}
object NodeCheckstateChangingEventUIParam {
  
  @scala.inline
  def apply(): NodeCheckstateChangingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeCheckstateChangingEventUIParam]
  }
  
  @scala.inline
  implicit class NodeCheckstateChangingEventUIParamMutableBuilder[Self <: NodeCheckstateChangingEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentCheckedNodes(value: js.Array[js.Any]): Self = StObject.set(x, "currentCheckedNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentCheckedNodesUndefined: Self = StObject.set(x, "currentCheckedNodes", js.undefined)
    
    @scala.inline
    def setCurrentCheckedNodesVarargs(value: js.Any*): Self = StObject.set(x, "currentCheckedNodes", js.Array(value :_*))
    
    @scala.inline
    def setCurrentState(value: String): Self = StObject.set(x, "currentState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentStateUndefined: Self = StObject.set(x, "currentState", js.undefined)
    
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
