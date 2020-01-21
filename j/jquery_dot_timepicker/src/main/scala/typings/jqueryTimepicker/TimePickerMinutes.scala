package typings.jqueryTimepicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimePickerMinutes extends js.Object {
  /** last displayed minute */
  var ends: js.UndefOr[Double] = js.undefined
  /** interval of displayed minutes */
  var interval: js.UndefOr[Double] = js.undefined
  /** first displayed minute */
  var starts: js.UndefOr[Double] = js.undefined
}

object TimePickerMinutes {
  @scala.inline
  def apply(ends: Int | Double = null, interval: Int | Double = null, starts: Int | Double = null): TimePickerMinutes = {
    val __obj = js.Dynamic.literal()
    if (ends != null) __obj.updateDynamic("ends")(ends.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (starts != null) __obj.updateDynamic("starts")(starts.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimePickerMinutes]
  }
}

