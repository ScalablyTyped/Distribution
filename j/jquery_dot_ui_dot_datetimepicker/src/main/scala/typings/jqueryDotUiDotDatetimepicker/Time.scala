package typings.jqueryDotUiDotDatetimepicker

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
    hour: Int | Double = null,
    millisecond: Int | Double = null,
    minute: Int | Double = null,
    second: Int | Double = null,
    timezone: String = null
  ): Time = {
    val __obj = js.Dynamic.literal()
    if (hour != null) __obj.updateDynamic("hour")(hour.asInstanceOf[js.Any])
    if (millisecond != null) __obj.updateDynamic("millisecond")(millisecond.asInstanceOf[js.Any])
    if (minute != null) __obj.updateDynamic("minute")(minute.asInstanceOf[js.Any])
    if (second != null) __obj.updateDynamic("second")(second.asInstanceOf[js.Any])
    if (timezone != null) __obj.updateDynamic("timezone")(timezone.asInstanceOf[js.Any])
    __obj.asInstanceOf[Time]
  }
}

