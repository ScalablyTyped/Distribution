package typings.kendoUi.kendo.ui

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeViewDragstartEvent
  extends StObject
     with TreeViewEvent {
  
  var sourceNode: js.UndefOr[Element] = js.undefined
}
object TreeViewDragstartEvent {
  
  inline def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: TreeView): TreeViewDragstartEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeViewDragstartEvent]
  }
  
  extension [Self <: TreeViewDragstartEvent](x: Self) {
    
    inline def setSourceNode(value: Element): Self = StObject.set(x, "sourceNode", value.asInstanceOf[js.Any])
    
    inline def setSourceNodeUndefined: Self = StObject.set(x, "sourceNode", js.undefined)
  }
}
