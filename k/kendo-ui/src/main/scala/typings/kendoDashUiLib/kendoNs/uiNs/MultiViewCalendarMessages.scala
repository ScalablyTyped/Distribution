package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiViewCalendarMessages extends js.Object {
  var weekColumnHeader: js.UndefOr[java.lang.String] = js.undefined
}

object MultiViewCalendarMessages {
  @scala.inline
  def apply(weekColumnHeader: java.lang.String = null): MultiViewCalendarMessages = {
    val __obj = js.Dynamic.literal()
    if (weekColumnHeader != null) __obj.updateDynamic("weekColumnHeader")(weekColumnHeader)
    __obj.asInstanceOf[MultiViewCalendarMessages]
  }
}

