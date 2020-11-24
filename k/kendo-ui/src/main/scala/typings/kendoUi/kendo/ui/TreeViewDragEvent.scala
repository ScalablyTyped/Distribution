package typings.kendoUi.kendo.ui

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeViewDragEvent extends TreeViewEvent {
  
  var dropTarget: js.UndefOr[Element] = js.native
  
  var pageX: js.UndefOr[Double] = js.native
  
  var pageY: js.UndefOr[Double] = js.native
  
  var setStatusClass: js.UndefOr[js.Function] = js.native
  
  var sourceNode: js.UndefOr[Element] = js.native
  
  var statusClass: js.UndefOr[String] = js.native
}
object TreeViewDragEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: TreeView): TreeViewDragEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeViewDragEvent]
  }
  
  @scala.inline
  implicit class TreeViewDragEventOps[Self <: TreeViewDragEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDropTarget(value: Element): Self = this.set("dropTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropTarget: Self = this.set("dropTarget", js.undefined)
    
    @scala.inline
    def setPageX(value: Double): Self = this.set("pageX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageX: Self = this.set("pageX", js.undefined)
    
    @scala.inline
    def setPageY(value: Double): Self = this.set("pageY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageY: Self = this.set("pageY", js.undefined)
    
    @scala.inline
    def setSetStatusClass(value: js.Function): Self = this.set("setStatusClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetStatusClass: Self = this.set("setStatusClass", js.undefined)
    
    @scala.inline
    def setSourceNode(value: Element): Self = this.set("sourceNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceNode: Self = this.set("sourceNode", js.undefined)
    
    @scala.inline
    def setStatusClass(value: String): Self = this.set("statusClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusClass: Self = this.set("statusClass", js.undefined)
  }
}
