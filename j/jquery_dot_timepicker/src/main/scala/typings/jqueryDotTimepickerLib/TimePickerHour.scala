package typings
package jqueryDotTimepickerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimePickerHour extends js.Object {
  /** last displayed hour */
  var ends: js.UndefOr[scala.Double] = js.undefined
  /** first displayed hour */
  var starts: js.UndefOr[scala.Double] = js.undefined
}

object TimePickerHour {
  @scala.inline
  def apply(ends: scala.Int | scala.Double = null, starts: scala.Int | scala.Double = null): TimePickerHour = {
    val __obj = js.Dynamic.literal()
    if (ends != null) __obj.updateDynamic("ends")(ends.asInstanceOf[js.Any])
    if (starts != null) __obj.updateDynamic("starts")(starts.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimePickerHour]
  }
}

