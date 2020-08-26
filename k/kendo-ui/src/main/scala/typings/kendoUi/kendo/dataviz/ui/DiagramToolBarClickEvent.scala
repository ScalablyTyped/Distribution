package typings.kendoUi.kendo.dataviz.ui

import typings.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiagramToolBarClickEvent extends DiagramEvent {
  var action: js.UndefOr[String] = js.native
  var connections: js.UndefOr[js.Any] = js.native
  var shapes: js.UndefOr[js.Any] = js.native
  var target: js.UndefOr[JQuery] = js.native
}

object DiagramToolBarClickEvent {
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Diagram): DiagramToolBarClickEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramToolBarClickEvent]
  }
  @scala.inline
  implicit class DiagramToolBarClickEventOps[Self <: DiagramToolBarClickEvent] (val x: Self) extends AnyVal {
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
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    @scala.inline
    def setConnections(value: js.Any): Self = this.set("connections", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnections: Self = this.set("connections", js.undefined)
    @scala.inline
    def setShapes(value: js.Any): Self = this.set("shapes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShapes: Self = this.set("shapes", js.undefined)
    @scala.inline
    def setTarget(value: JQuery): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
  
}

