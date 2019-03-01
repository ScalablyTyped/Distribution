package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatePickerMonth extends js.Object {
  var content: js.UndefOr[java.lang.String] = js.undefined
  var empty: js.UndefOr[java.lang.String] = js.undefined
  var weekNumber: js.UndefOr[java.lang.String] = js.undefined
}

object DatePickerMonth {
  @scala.inline
  def apply(
    content: java.lang.String = null,
    empty: java.lang.String = null,
    weekNumber: java.lang.String = null
  ): DatePickerMonth = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content)
    if (empty != null) __obj.updateDynamic("empty")(empty)
    if (weekNumber != null) __obj.updateDynamic("weekNumber")(weekNumber)
    __obj.asInstanceOf[DatePickerMonth]
  }
}

