package typings.kendoUi.kendo.ui

import typings.kendoUi.kendo.data.GanttTask
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GanttMoveEndEvent extends GanttEvent {
  var end: js.UndefOr[Date] = js.native
  var start: js.UndefOr[Date] = js.native
  var task: js.UndefOr[GanttTask] = js.native
}

object GanttMoveEndEvent {
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Gantt): GanttMoveEndEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[GanttMoveEndEvent]
  }
  @scala.inline
  implicit class GanttMoveEndEventOps[Self <: GanttMoveEndEvent] (val x: Self) extends AnyVal {
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
    def setEnd(value: Date): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    @scala.inline
    def setStart(value: Date): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    @scala.inline
    def setTask(value: GanttTask): Self = this.set("task", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTask: Self = this.set("task", js.undefined)
  }
  
}

