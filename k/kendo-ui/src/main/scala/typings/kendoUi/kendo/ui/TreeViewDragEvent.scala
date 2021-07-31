package typings.kendoUi.kendo.ui

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeViewDragEvent
  extends StObject
     with TreeViewEvent {
  
  var dropTarget: js.UndefOr[Element] = js.undefined
  
  var pageX: js.UndefOr[Double] = js.undefined
  
  var pageY: js.UndefOr[Double] = js.undefined
  
  var setStatusClass: js.UndefOr[js.Function] = js.undefined
  
  var sourceNode: js.UndefOr[Element] = js.undefined
  
  var statusClass: js.UndefOr[String] = js.undefined
}
object TreeViewDragEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: TreeView): TreeViewDragEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeViewDragEvent]
  }
  
  @scala.inline
  implicit class TreeViewDragEventMutableBuilder[Self <: TreeViewDragEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDropTarget(value: Element): Self = StObject.set(x, "dropTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropTargetUndefined: Self = StObject.set(x, "dropTarget", js.undefined)
    
    @scala.inline
    def setPageX(value: Double): Self = StObject.set(x, "pageX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageXUndefined: Self = StObject.set(x, "pageX", js.undefined)
    
    @scala.inline
    def setPageY(value: Double): Self = StObject.set(x, "pageY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageYUndefined: Self = StObject.set(x, "pageY", js.undefined)
    
    @scala.inline
    def setSetStatusClass(value: js.Function): Self = StObject.set(x, "setStatusClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetStatusClassUndefined: Self = StObject.set(x, "setStatusClass", js.undefined)
    
    @scala.inline
    def setSourceNode(value: Element): Self = StObject.set(x, "sourceNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceNodeUndefined: Self = StObject.set(x, "sourceNode", js.undefined)
    
    @scala.inline
    def setStatusClass(value: String): Self = StObject.set(x, "statusClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusClassUndefined: Self = StObject.set(x, "statusClass", js.undefined)
  }
}
