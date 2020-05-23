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
  def apply(
    ends: js.UndefOr[Double] = js.undefined,
    interval: js.UndefOr[Double] = js.undefined,
    starts: js.UndefOr[Double] = js.undefined
  ): TimePickerMinutes = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ends)) __obj.updateDynamic("ends")(ends.get.asInstanceOf[js.Any])
    if (!js.isUndefined(interval)) __obj.updateDynamic("interval")(interval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(starts)) __obj.updateDynamic("starts")(starts.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimePickerMinutes]
  }
}

