package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeCheckstateChangedEventUIParam extends StObject {
  
  /**
    * Gets the collection of all checked nodes.
    */
  var newCheckedNodes: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * Gets the collection of all partially checked nodes.
    */
  var newPartiallyCheckedNodes: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * Gets the new state that is already applied to the checkbox.
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
object NodeCheckstateChangedEventUIParam {
  
  inline def apply(): NodeCheckstateChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeCheckstateChangedEventUIParam]
  }
  
  extension [Self <: NodeCheckstateChangedEventUIParam](x: Self) {
    
    inline def setNewCheckedNodes(value: js.Array[Any]): Self = StObject.set(x, "newCheckedNodes", value.asInstanceOf[js.Any])
    
    inline def setNewCheckedNodesUndefined: Self = StObject.set(x, "newCheckedNodes", js.undefined)
    
    inline def setNewCheckedNodesVarargs(value: Any*): Self = StObject.set(x, "newCheckedNodes", js.Array(value*))
    
    inline def setNewPartiallyCheckedNodes(value: js.Array[Any]): Self = StObject.set(x, "newPartiallyCheckedNodes", value.asInstanceOf[js.Any])
    
    inline def setNewPartiallyCheckedNodesUndefined: Self = StObject.set(x, "newPartiallyCheckedNodes", js.undefined)
    
    inline def setNewPartiallyCheckedNodesVarargs(value: Any*): Self = StObject.set(x, "newPartiallyCheckedNodes", js.Array(value*))
    
    inline def setNewState(value: String): Self = StObject.set(x, "newState", value.asInstanceOf[js.Any])
    
    inline def setNewStateUndefined: Self = StObject.set(x, "newState", js.undefined)
    
    inline def setNode(value: Any): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
