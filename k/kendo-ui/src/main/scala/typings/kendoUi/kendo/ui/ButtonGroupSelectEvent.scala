package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ButtonGroupSelectEvent extends ButtonGroupEvent {
  var indices: js.UndefOr[js.Any] = js.native
}

object ButtonGroupSelectEvent {
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: ButtonGroup): ButtonGroupSelectEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonGroupSelectEvent]
  }
  @scala.inline
  implicit class ButtonGroupSelectEventOps[Self <: ButtonGroupSelectEvent] (val x: Self) extends AnyVal {
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
    def setIndices(value: js.Any): Self = this.set("indices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndices: Self = this.set("indices", js.undefined)
  }
  
}

