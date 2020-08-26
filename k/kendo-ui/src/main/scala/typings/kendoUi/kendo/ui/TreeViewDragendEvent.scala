package typings.kendoUi.kendo.ui

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class TreeViewDragendEventOps[Self <: TreeViewDragendEvent] (val x: Self) extends AnyVal {
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
    def setDestinationNode(value: Element): Self = this.set("destinationNode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinationNode: Self = this.set("destinationNode", js.undefined)
    @scala.inline
    def setDropPosition(value: String): Self = this.set("dropPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropPosition: Self = this.set("dropPosition", js.undefined)
    @scala.inline
    def setSourceNode(value: Element): Self = this.set("sourceNode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceNode: Self = this.set("sourceNode", js.undefined)
  }
  
}

