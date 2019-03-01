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
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: Gantt,
    container: kendoDashUiLib.JQuery = null,
    task: kendoDashUiLib.kendoNs.dataNs.GanttTask = null
  ): GanttCancelEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("sender")(sender)
    if (container != null) __obj.updateDynamic("container")(container)
    if (task != null) __obj.updateDynamic("task")(task)
    __obj.asInstanceOf[GanttCancelEvent]
  }
}

