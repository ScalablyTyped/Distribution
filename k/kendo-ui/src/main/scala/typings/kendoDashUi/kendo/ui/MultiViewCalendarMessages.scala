package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiViewCalendarMessages extends js.Object {
  var weekColumnHeader: js.UndefOr[String] = js.undefined
}

object MultiViewCalendarMessages {
  @scala.inline
  def apply(weekColumnHeader: String = null): MultiViewCalendarMessages = {
    val __obj = js.Dynamic.literal()
    if (weekColumnHeader != null) __obj.updateDynamic("weekColumnHeader")(weekColumnHeader)
    __obj.asInstanceOf[MultiViewCalendarMessages]
  }
}

