package typings.kendoDashUi.kendo.ui

import typings.kendoDashUi.kendo.data.GanttTask
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GanttResizeStartEvent extends GanttEvent {
  var task: js.UndefOr[GanttTask] = js.undefined
}

object GanttResizeStartEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Gantt,
    task: GanttTask = null
  ): GanttResizeStartEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (task != null) __obj.updateDynamic("task")(task)
    __obj.asInstanceOf[GanttResizeStartEvent]
  }
}

