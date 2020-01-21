package typings.jqueryTimepicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimePickerHour extends js.Object {
  /** last displayed hour */
  var ends: js.UndefOr[Double] = js.undefined
  /** first displayed hour */
  var starts: js.UndefOr[Double] = js.undefined
}

object TimePickerHour {
  @scala.inline
  def apply(ends: Int | Double = null, starts: Int | Double = null): TimePickerHour = {
    val __obj = js.Dynamic.literal()
    if (ends != null) __obj.updateDynamic("ends")(ends.asInstanceOf[js.Any])
    if (starts != null) __obj.updateDynamic("starts")(starts.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimePickerHour]
  }
}

