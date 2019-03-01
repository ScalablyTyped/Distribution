package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GanttSaveEvent extends GanttEvent {
  var task: js.UndefOr[kendoDashUiLib.kendoNs.dataNs.GanttTask] = js.undefined
  var values: js.UndefOr[js.Any] = js.undefined
}

object GanttSaveEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: Gantt,
    task: kendoDashUiLib.kendoNs.dataNs.GanttTask = null,
    values: js.Any = null
  ): GanttSaveEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("sender")(sender)
    if (task != null) __obj.updateDynamic("task")(task)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[GanttSaveEvent]
  }
}

