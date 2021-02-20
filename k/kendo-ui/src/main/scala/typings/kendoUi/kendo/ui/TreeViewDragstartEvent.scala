package typings.kendoUi.kendo.ui

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeViewDragstartEvent extends TreeViewEvent {
  
  var sourceNode: js.UndefOr[Element] = js.native
}
object TreeViewDragstartEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: TreeView): TreeViewDragstartEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeViewDragstartEvent]
  }
  
  @scala.inline
  implicit class TreeViewDragstartEventMutableBuilder[Self <: TreeViewDragstartEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSourceNode(value: Element): Self = StObject.set(x, "sourceNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceNodeUndefined: Self = StObject.set(x, "sourceNode", js.undefined)
  }
}
