package typings.kendoUi.kendo.ui

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeViewDragendEvent extends TreeViewEvent {
  
  var destinationNode: js.UndefOr[Element] = js.native
  
  var dropPosition: js.UndefOr[String] = js.native
  
  var sourceNode: js.UndefOr[Element] = js.native
}
object TreeViewDragendEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: TreeView): TreeViewDragendEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeViewDragendEvent]
  }
  
  @scala.inline
  implicit class TreeViewDragendEventMutableBuilder[Self <: TreeViewDragendEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestinationNode(value: Element): Self = StObject.set(x, "destinationNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationNodeUndefined: Self = StObject.set(x, "destinationNode", js.undefined)
    
    @scala.inline
    def setDropPosition(value: String): Self = StObject.set(x, "dropPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropPositionUndefined: Self = StObject.set(x, "dropPosition", js.undefined)
    
    @scala.inline
    def setSourceNode(value: Element): Self = StObject.set(x, "sourceNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceNodeUndefined: Self = StObject.set(x, "sourceNode", js.undefined)
  }
}
