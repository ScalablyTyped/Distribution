package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GanttAddEvent extends GanttEvent {
  var dependency: js.UndefOr[kendoDashUiLib.kendoNs.dataNs.GanttDependency] = js.undefined
  var task: js.UndefOr[kendoDashUiLib.kendoNs.dataNs.GanttTask] = js.undefined
}

object GanttAddEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: Gantt,
    dependency: kendoDashUiLib.kendoNs.dataNs.GanttDependency = null,
    task: kendoDashUiLib.kendoNs.dataNs.GanttTask = null
  ): GanttAddEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("sender")(sender)
    if (dependency != null) __obj.updateDynamic("dependency")(dependency)
    if (task != null) __obj.updateDynamic("task")(task)
    __obj.asInstanceOf[GanttAddEvent]
  }
}

