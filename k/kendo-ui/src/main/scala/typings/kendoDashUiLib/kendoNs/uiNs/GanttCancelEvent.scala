package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GanttCancelEvent extends GanttEvent {
  var container: js.UndefOr[kendoDashUiLib.JQuery] = js.undefined
  var task: js.UndefOr[kendoDashUiLib.kendoNs.dataNs.GanttTask] = js.undefined
}

object GanttCancelEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => scala.Boolean,
    preventDefault: js.Function,
    sender: Gantt,
    container: kendoDashUiLib.JQuery = null,
    task: kendoDashUiLib.kendoNs.dataNs.GanttTask = null
  ): GanttCancelEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (container != null) __obj.updateDynamic("container")(container)
    if (task != null) __obj.updateDynamic("task")(task)
    __obj.asInstanceOf[GanttCancelEvent]
  }
}

