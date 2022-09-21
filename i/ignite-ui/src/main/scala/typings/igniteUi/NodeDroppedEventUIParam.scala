package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeDroppedEventUIParam extends StObject {
  
  /**
    * Gets a reference to the binding object for the level at which the target node is located.
    */
  var binding: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets a reference to the target node data.
    */
  var data: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets a reference to the draggable element (the node).
    */
  var draggable: js.UndefOr[String] = js.undefined
  
  /**
    * Gets a reference to the jQuery element of the node.
    */
  var element: js.UndefOr[String] = js.undefined
  
  /**
    * Gets a reference to the helper.
    */
  var helper: js.UndefOr[String] = js.undefined
  
  /**
    * Gets a reference to the offset.
    */
  var offset: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets a reference to the tree.
    */
  var owner: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets the target node data-path attribute.
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * Gets a reference to the current position of the draggable element.
    */
  var position: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets a reference to the dropped source node object.
    */
  var sourceNode: js.UndefOr[Any] = js.undefined
}
object NodeDroppedEventUIParam {
  
  inline def apply(): NodeDroppedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeDroppedEventUIParam]
  }
  
  extension [Self <: NodeDroppedEventUIParam](x: Self) {
    
    inline def setBinding(value: Any): Self = StObject.set(x, "binding", value.asInstanceOf[js.Any])
    
    inline def setBindingUndefined: Self = StObject.set(x, "binding", js.undefined)
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDraggable(value: String): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    inline def setElement(value: String): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setHelper(value: String): Self = StObject.set(x, "helper", value.asInstanceOf[js.Any])
    
    inline def setHelperUndefined: Self = StObject.set(x, "helper", js.undefined)
    
    inline def setOffset(value: Any): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setPosition(value: Any): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setSourceNode(value: Any): Self = StObject.set(x, "sourceNode", value.asInstanceOf[js.Any])
    
    inline def setSourceNodeUndefined: Self = StObject.set(x, "sourceNode", js.undefined)
  }
}
