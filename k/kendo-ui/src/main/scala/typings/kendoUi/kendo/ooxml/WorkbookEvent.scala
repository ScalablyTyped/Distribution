package typings.kendoUi.kendo.ooxml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkbookEvent extends js.Object {
  var preventDefault: js.Function = js.native
  var sender: Workbook = js.native
  def isDefaultPrevented(): Boolean = js.native
}

object WorkbookEvent {
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Workbook): WorkbookEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkbookEvent]
  }
  @scala.inline
  implicit class WorkbookEventOps[Self <: WorkbookEvent] (val x: Self) extends AnyVal {
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
    def setIsDefaultPrevented(value: () => Boolean): Self = this.set("isDefaultPrevented", js.Any.fromFunction0(value))
    @scala.inline
    def setPreventDefault(value: js.Function): Self = this.set("preventDefault", value.asInstanceOf[js.Any])
    @scala.inline
    def setSender(value: Workbook): Self = this.set("sender", value.asInstanceOf[js.Any])
  }
  
}

