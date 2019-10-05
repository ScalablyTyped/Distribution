package typings.kendoDashUi.kendo.ui

import typings.kendoDashUi.kendo.data.GanttTask
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GanttRemoveEvent extends GanttEvent {
  var dependencies: js.UndefOr[js.Any] = js.undefined
  var task: js.UndefOr[GanttTask] = js.undefined
}

object GanttRemoveEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Gantt,
    dependencies: js.Any = null,
    task: GanttTask = null
  ): GanttRemoveEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies)
    if (task != null) __obj.updateDynamic("task")(task)
    __obj.asInstanceOf[GanttRemoveEvent]
  }
}

