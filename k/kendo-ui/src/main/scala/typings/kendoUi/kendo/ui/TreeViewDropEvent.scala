package typings.kendoUi.kendo.ui

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeViewDropEvent
  extends StObject
     with TreeViewEvent {
  
  var destinationNode: js.UndefOr[Element] = js.undefined
  
  var dropPosition: js.UndefOr[String] = js.undefined
  
  var dropTarget: js.UndefOr[Element] = js.undefined
  
  var setValid: js.UndefOr[js.Function] = js.undefined
  
  var sourceNode: js.UndefOr[Element] = js.undefined
  
  var valid: js.UndefOr[Boolean] = js.undefined
}
object TreeViewDropEvent {
  
  inline def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: TreeView): TreeViewDropEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeViewDropEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TreeViewDropEvent] (val x: Self) extends AnyVal {
    
    inline def setDestinationNode(value: Element): Self = StObject.set(x, "destinationNode", value.asInstanceOf[js.Any])
    
    inline def setDestinationNodeUndefined: Self = StObject.set(x, "destinationNode", js.undefined)
    
    inline def setDropPosition(value: String): Self = StObject.set(x, "dropPosition", value.asInstanceOf[js.Any])
    
    inline def setDropPositionUndefined: Self = StObject.set(x, "dropPosition", js.undefined)
    
    inline def setDropTarget(value: Element): Self = StObject.set(x, "dropTarget", value.asInstanceOf[js.Any])
    
    inline def setDropTargetUndefined: Self = StObject.set(x, "dropTarget", js.undefined)
    
    inline def setSetValid(value: js.Function): Self = StObject.set(x, "setValid", value.asInstanceOf[js.Any])
    
    inline def setSetValidUndefined: Self = StObject.set(x, "setValid", js.undefined)
    
    inline def setSourceNode(value: Element): Self = StObject.set(x, "sourceNode", value.asInstanceOf[js.Any])
    
    inline def setSourceNodeUndefined: Self = StObject.set(x, "sourceNode", js.undefined)
    
    inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    
    inline def setValidUndefined: Self = StObject.set(x, "valid", js.undefined)
  }
}
