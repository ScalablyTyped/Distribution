package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiagramChangeEvent extends DiagramEvent {
  var added: js.UndefOr[js.Any] = js.native
  var removed: js.UndefOr[js.Any] = js.native
}

object DiagramChangeEvent {
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Diagram): DiagramChangeEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramChangeEvent]
  }
  @scala.inline
  implicit class DiagramChangeEventOps[Self <: DiagramChangeEvent] (val x: Self) extends AnyVal {
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
    def setAdded(value: js.Any): Self = this.set("added", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdded: Self = this.set("added", js.undefined)
    @scala.inline
    def setRemoved(value: js.Any): Self = this.set("removed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoved: Self = this.set("removed", js.undefined)
  }
  
}

