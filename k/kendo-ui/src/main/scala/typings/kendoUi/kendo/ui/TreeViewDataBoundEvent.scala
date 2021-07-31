package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeViewDataBoundEvent
  extends StObject
     with TreeViewEvent {
  
  var node: js.UndefOr[JQuery] = js.undefined
}
object TreeViewDataBoundEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: TreeView): TreeViewDataBoundEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeViewDataBoundEvent]
  }
  
  @scala.inline
  implicit class TreeViewDataBoundEventMutableBuilder[Self <: TreeViewDataBoundEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNode(value: JQuery): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
  }
}
