package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeDroppingEventUIParam extends StObject {
  
  /**
    * Gets a reference to the binding object for the level at which the target node is located.
    */
  var binding: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets a reference to the target node data.
    */
  var data: js.UndefOr[js.Any] = js.undefined
  
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
  var offset: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets a reference to the tree.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets the target node data-path attribute.
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * Gets a reference to the current position of the draggable element.
    */
  var position: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets a reference to the source node object about to be dropped.
    */
  var sourceNode: js.UndefOr[js.Any] = js.undefined
}
object NodeDroppingEventUIParam {
  
  @scala.inline
  def apply(): NodeDroppingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeDroppingEventUIParam]
  }
  
  @scala.inline
  implicit class NodeDroppingEventUIParamMutableBuilder[Self <: NodeDroppingEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBinding(value: js.Any): Self = StObject.set(x, "binding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindingUndefined: Self = StObject.set(x, "binding", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDraggable(value: String): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    @scala.inline
    def setElement(value: String): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    @scala.inline
    def setHelper(value: String): Self = StObject.set(x, "helper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelperUndefined: Self = StObject.set(x, "helper", js.undefined)
    
    @scala.inline
    def setOffset(value: js.Any): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setPosition(value: js.Any): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setSourceNode(value: js.Any): Self = StObject.set(x, "sourceNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceNodeUndefined: Self = StObject.set(x, "sourceNode", js.undefined)
  }
}
