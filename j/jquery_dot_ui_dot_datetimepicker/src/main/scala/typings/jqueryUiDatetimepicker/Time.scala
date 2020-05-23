package typings.jqueryUiDatetimepicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Time extends js.Object {
  var hour: js.UndefOr[Double] = js.undefined
  var millisecond: js.UndefOr[Double] = js.undefined
  var minute: js.UndefOr[Double] = js.undefined
  var second: js.UndefOr[Double] = js.undefined
  var timezone: js.UndefOr[String] = js.undefined
}

object Time {
  @scala.inline
  def apply(
    hour: js.UndefOr[Double] = js.undefined,
    millisecond: js.UndefOr[Double] = js.undefined,
    minute: js.UndefOr[Double] = js.undefined,
    second: js.UndefOr[Double] = js.undefined,
    timezone: String = null
  ): Time = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hour)) __obj.updateDynamic("hour")(hour.get.asInstanceOf[js.Any])
    if (!js.isUndefined(millisecond)) __obj.updateDynamic("millisecond")(millisecond.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minute)) __obj.updateDynamic("minute")(minute.get.asInstanceOf[js.Any])
    if (!js.isUndefined(second)) __obj.updateDynamic("second")(second.get.asInstanceOf[js.Any])
    if (timezone != null) __obj.updateDynamic("timezone")(timezone.asInstanceOf[js.Any])
    __obj.asInstanceOf[Time]
  }
}

