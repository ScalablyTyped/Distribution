package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarMessages extends js.Object {
  var weekColumnHeader: js.UndefOr[String] = js.undefined
}

object CalendarMessages {
  @scala.inline
  def apply(weekColumnHeader: String = null): CalendarMessages = {
    val __obj = js.Dynamic.literal()
    if (weekColumnHeader != null) __obj.updateDynamic("weekColumnHeader")(weekColumnHeader.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarMessages]
  }
}

