package typings.kendoDashUi.kendoNs.uiNs

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GanttViewRange extends js.Object {
  var end: js.UndefOr[Date] = js.undefined
  var start: js.UndefOr[Date] = js.undefined
}

object GanttViewRange {
  @scala.inline
  def apply(end: Date = null, start: Date = null): GanttViewRange = {
    val __obj = js.Dynamic.literal()
    if (end != null) __obj.updateDynamic("end")(end)
    if (start != null) __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[GanttViewRange]
  }
}

