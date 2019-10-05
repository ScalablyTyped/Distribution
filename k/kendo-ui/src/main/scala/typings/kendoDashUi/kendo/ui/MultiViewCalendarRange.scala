package typings.kendoDashUi.kendo.ui

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiViewCalendarRange extends js.Object {
  var end: js.UndefOr[Date] = js.undefined
  var start: js.UndefOr[Date] = js.undefined
}

object MultiViewCalendarRange {
  @scala.inline
  def apply(end: Date = null, start: Date = null): MultiViewCalendarRange = {
    val __obj = js.Dynamic.literal()
    if (end != null) __obj.updateDynamic("end")(end)
    if (start != null) __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[MultiViewCalendarRange]
  }
}

