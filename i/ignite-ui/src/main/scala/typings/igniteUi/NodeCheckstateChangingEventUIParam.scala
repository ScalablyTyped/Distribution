package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeCheckstateChangingEventUIParam extends StObject {
  
  /**
    * Gets the collection of all checked nodes before the new state is applied.
    */
  var currentCheckedNodes: js.UndefOr[js.Array[Any]] = js.undefined
  
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
  var node: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets a reference to the tree.
    */
  var owner: js.UndefOr[Any] = js.undefined
}
object NodeCheckstateChangingEventUIParam {
  
  inline def apply(): NodeCheckstateChangingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeCheckstateChangingEventUIParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodeCheckstateChangingEventUIParam] (val x: Self) extends AnyVal {
    
    inline def setCurrentCheckedNodes(value: js.Array[Any]): Self = StObject.set(x, "currentCheckedNodes", value.asInstanceOf[js.Any])
    
    inline def setCurrentCheckedNodesUndefined: Self = StObject.set(x, "currentCheckedNodes", js.undefined)
    
    inline def setCurrentCheckedNodesVarargs(value: Any*): Self = StObject.set(x, "currentCheckedNodes", js.Array(value*))
    
    inline def setCurrentState(value: String): Self = StObject.set(x, "currentState", value.asInstanceOf[js.Any])
    
    inline def setCurrentStateUndefined: Self = StObject.set(x, "currentState", js.undefined)
    
    inline def setNewState(value: String): Self = StObject.set(x, "newState", value.asInstanceOf[js.Any])
    
    inline def setNewStateUndefined: Self = StObject.set(x, "newState", js.undefined)
    
    inline def setNode(value: Any): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
