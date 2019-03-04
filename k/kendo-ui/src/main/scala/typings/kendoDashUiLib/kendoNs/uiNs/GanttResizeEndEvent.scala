package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GanttResizeEndEvent extends GanttEvent {
  var end: js.UndefOr[stdLib.Date] = js.undefined
  var start: js.UndefOr[stdLib.Date] = js.undefined
  var task: js.UndefOr[kendoDashUiLib.kendoNs.dataNs.GanttTask] = js.undefined
}

object GanttResizeEndEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: Gantt,
    end: stdLib.Date = null,
    start: stdLib.Date = null,
    task: kendoDashUiLib.kendoNs.dataNs.GanttTask = null
  ): GanttResizeEndEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
    if (end != null) __obj.updateDynamic("end")(end)
    if (start != null) __obj.updateDynamic("start")(start)
    if (task != null) __obj.updateDynamic("task")(task)
    __obj.asInstanceOf[GanttResizeEndEvent]
  }
}

