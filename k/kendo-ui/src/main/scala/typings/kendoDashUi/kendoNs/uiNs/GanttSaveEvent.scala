package typings.kendoDashUi.kendoNs.uiNs

import typings.kendoDashUi.kendoNs.dataNs.GanttTask
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GanttSaveEvent extends GanttEvent {
  var task: js.UndefOr[GanttTask] = js.undefined
  var values: js.UndefOr[js.Any] = js.undefined
}

object GanttSaveEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Gantt,
    task: GanttTask = null,
    values: js.Any = null
  ): GanttSaveEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (task != null) __obj.updateDynamic("task")(task)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[GanttSaveEvent]
  }
}

