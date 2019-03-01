package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GanttRemoveEvent extends GanttEvent {
  var dependencies: js.UndefOr[js.Any] = js.undefined
  var task: js.UndefOr[kendoDashUiLib.kendoNs.dataNs.GanttTask] = js.undefined
}

object GanttRemoveEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: Gantt,
    dependencies: js.Any = null,
    task: kendoDashUiLib.kendoNs.dataNs.GanttTask = null
  ): GanttRemoveEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("sender")(sender)
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies)
    if (task != null) __obj.updateDynamic("task")(task)
    __obj.asInstanceOf[GanttRemoveEvent]
  }
}

