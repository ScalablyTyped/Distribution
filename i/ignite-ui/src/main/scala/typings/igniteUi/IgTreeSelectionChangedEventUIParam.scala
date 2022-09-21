package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgTreeSelectionChangedEventUIParam extends StObject {
  
  /**
    * Gets a reference to the newly added nodes to the selection.
    */
  var newNodes: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * Gets a reference to the tree.
    */
  var owner: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets a reference to currently selected nodes.
    */
  var selectedNodes: js.UndefOr[js.Array[Any]] = js.undefined
}
object IgTreeSelectionChangedEventUIParam {
  
  inline def apply(): IgTreeSelectionChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgTreeSelectionChangedEventUIParam]
  }
  
  extension [Self <: IgTreeSelectionChangedEventUIParam](x: Self) {
    
    inline def setNewNodes(value: js.Array[Any]): Self = StObject.set(x, "newNodes", value.asInstanceOf[js.Any])
    
    inline def setNewNodesUndefined: Self = StObject.set(x, "newNodes", js.undefined)
    
    inline def setNewNodesVarargs(value: Any*): Self = StObject.set(x, "newNodes", js.Array(value*))
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setSelectedNodes(value: js.Array[Any]): Self = StObject.set(x, "selectedNodes", value.asInstanceOf[js.Any])
    
    inline def setSelectedNodesUndefined: Self = StObject.set(x, "selectedNodes", js.undefined)
    
    inline def setSelectedNodesVarargs(value: Any*): Self = StObject.set(x, "selectedNodes", js.Array(value*))
  }
}
