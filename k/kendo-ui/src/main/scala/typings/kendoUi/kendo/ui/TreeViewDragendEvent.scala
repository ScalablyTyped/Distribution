package typings.kendoUi.kendo.ui

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeViewDragendEvent
  extends StObject
     with TreeViewEvent {
  
  var destinationNode: js.UndefOr[Element] = js.undefined
  
  var dropPosition: js.UndefOr[String] = js.undefined
  
  var sourceNode: js.UndefOr[Element] = js.undefined
}
object TreeViewDragendEvent {
  
  inline def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: TreeView): TreeViewDragendEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeViewDragendEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TreeViewDragendEvent] (val x: Self) extends AnyVal {
    
    inline def setDestinationNode(value: Element): Self = StObject.set(x, "destinationNode", value.asInstanceOf[js.Any])
    
    inline def setDestinationNodeUndefined: Self = StObject.set(x, "destinationNode", js.undefined)
    
    inline def setDropPosition(value: String): Self = StObject.set(x, "dropPosition", value.asInstanceOf[js.Any])
    
    inline def setDropPositionUndefined: Self = StObject.set(x, "dropPosition", js.undefined)
    
    inline def setSourceNode(value: Element): Self = StObject.set(x, "sourceNode", value.asInstanceOf[js.Any])
    
    inline def setSourceNodeUndefined: Self = StObject.set(x, "sourceNode", js.undefined)
  }
}
