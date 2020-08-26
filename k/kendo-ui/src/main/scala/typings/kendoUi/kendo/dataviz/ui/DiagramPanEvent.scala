package typings.kendoUi.kendo.dataviz.ui

import typings.kendoUi.kendo.dataviz.diagram.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiagramPanEvent extends DiagramEvent {
  var pan: js.UndefOr[Point] = js.native
}

object DiagramPanEvent {
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Diagram): DiagramPanEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramPanEvent]
  }
  @scala.inline
  implicit class DiagramPanEventOps[Self <: DiagramPanEvent] (val x: Self) extends AnyVal {
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
    def setPan(value: Point): Self = this.set("pan", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePan: Self = this.set("pan", js.undefined)
  }
  
}

