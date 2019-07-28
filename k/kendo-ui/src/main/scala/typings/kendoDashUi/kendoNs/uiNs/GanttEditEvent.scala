package typings.kendoDashUi.kendoNs.uiNs

import typings.kendoDashUi.JQuery
import typings.kendoDashUi.kendoNs.dataNs.GanttTask
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GanttEditEvent extends GanttEvent {
  var container: js.UndefOr[JQuery] = js.undefined
  var task: js.UndefOr[GanttTask] = js.undefined
}

object GanttEditEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Gantt,
    container: JQuery = null,
    task: GanttTask = null
  ): GanttEditEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (container != null) __obj.updateDynamic("container")(container)
    if (task != null) __obj.updateDynamic("task")(task)
    __obj.asInstanceOf[GanttEditEvent]
  }
}

