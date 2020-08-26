package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiagramDragEndEvent extends DiagramEvent {
  var connectionHandle: js.UndefOr[String] = js.native
  var connections: js.UndefOr[js.Any] = js.native
  var shapes: js.UndefOr[js.Any] = js.native
}

object DiagramDragEndEvent {
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Diagram): DiagramDragEndEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramDragEndEvent]
  }
  @scala.inline
  implicit class DiagramDragEndEventOps[Self <: DiagramDragEndEvent] (val x: Self) extends AnyVal {
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
    def setConnectionHandle(value: String): Self = this.set("connectionHandle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectionHandle: Self = this.set("connectionHandle", js.undefined)
    @scala.inline
    def setConnections(value: js.Any): Self = this.set("connections", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnections: Self = this.set("connections", js.undefined)
    @scala.inline
    def setShapes(value: js.Any): Self = this.set("shapes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShapes: Self = this.set("shapes", js.undefined)
  }
  
}

