package typings.kendoDashUi.kendo.ui

import typings.kendoDashUi.kendo.data.GanttTask
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GanttMoveEndEvent extends GanttEvent {
  var end: js.UndefOr[Date] = js.undefined
  var start: js.UndefOr[Date] = js.undefined
  var task: js.UndefOr[GanttTask] = js.undefined
}

object GanttMoveEndEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Gantt,
    end: Date = null,
    start: Date = null,
    task: GanttTask = null
  ): GanttMoveEndEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (task != null) __obj.updateDynamic("task")(task.asInstanceOf[js.Any])
    __obj.asInstanceOf[GanttMoveEndEvent]
  }
}

