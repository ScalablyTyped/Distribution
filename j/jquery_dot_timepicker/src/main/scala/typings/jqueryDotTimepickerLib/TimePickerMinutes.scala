package typings
package jqueryDotTimepickerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimePickerMinutes extends js.Object {
  /** last displayed minute */
  var ends: js.UndefOr[scala.Double] = js.undefined
  /** interval of displayed minutes */
  var interval: js.UndefOr[scala.Double] = js.undefined
  /** first displayed minute */
  var starts: js.UndefOr[scala.Double] = js.undefined
}

object TimePickerMinutes {
  @scala.inline
  def apply(
    ends: scala.Int | scala.Double = null,
    interval: scala.Int | scala.Double = null,
    starts: scala.Int | scala.Double = null
  ): TimePickerMinutes = {
    val __obj = js.Dynamic.literal()
    if (ends != null) __obj.updateDynamic("ends")(ends.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (starts != null) __obj.updateDynamic("starts")(starts.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimePickerMinutes]
  }
}

