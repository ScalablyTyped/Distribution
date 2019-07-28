package typings.jqrangeslider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQRangeSliderDateSteps extends js.Object {
  var days: js.UndefOr[Double] = js.undefined
  var hours: js.UndefOr[Double] = js.undefined
  var minutes: js.UndefOr[Double] = js.undefined
  var months: js.UndefOr[Double] = js.undefined
  var seconds: js.UndefOr[Double] = js.undefined
  var weeks: js.UndefOr[Double] = js.undefined
  var years: js.UndefOr[Double] = js.undefined
}

object JQRangeSliderDateSteps {
  @scala.inline
  def apply(
    days: Int | Double = null,
    hours: Int | Double = null,
    minutes: Int | Double = null,
    months: Int | Double = null,
    seconds: Int | Double = null,
    weeks: Int | Double = null,
    years: Int | Double = null
  ): JQRangeSliderDateSteps = {
    val __obj = js.Dynamic.literal()
    if (days != null) __obj.updateDynamic("days")(days.asInstanceOf[js.Any])
    if (hours != null) __obj.updateDynamic("hours")(hours.asInstanceOf[js.Any])
    if (minutes != null) __obj.updateDynamic("minutes")(minutes.asInstanceOf[js.Any])
    if (months != null) __obj.updateDynamic("months")(months.asInstanceOf[js.Any])
    if (seconds != null) __obj.updateDynamic("seconds")(seconds.asInstanceOf[js.Any])
    if (weeks != null) __obj.updateDynamic("weeks")(weeks.asInstanceOf[js.Any])
    if (years != null) __obj.updateDynamic("years")(years.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQRangeSliderDateSteps]
  }
}

