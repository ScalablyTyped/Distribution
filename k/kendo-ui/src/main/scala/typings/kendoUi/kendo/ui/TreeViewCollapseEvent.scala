package typings.kendoUi.kendo.ui

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeViewCollapseEvent
  extends StObject
     with TreeViewEvent {
  
  var node: js.UndefOr[Element] = js.undefined
}
object TreeViewCollapseEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: TreeView): TreeViewCollapseEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeViewCollapseEvent]
  }
  
  @scala.inline
  implicit class TreeViewCollapseEventMutableBuilder[Self <: TreeViewCollapseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNode(value: Element): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
  }
}
