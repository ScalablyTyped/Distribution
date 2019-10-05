package typings.luxon.luxonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DurationToFormatOptions
  extends typings.std.Intl.DateTimeFormatOptions {
  var floor: js.UndefOr[Boolean] = js.undefined
  var round: js.UndefOr[Boolean] = js.undefined
}

object DurationToFormatOptions {
  @scala.inline
  def apply(
    day: String = null,
    era: String = null,
    floor: js.UndefOr[Boolean] = js.undefined,
    formatMatcher: String = null,
    hour: String = null,
    hour12: js.UndefOr[Boolean] = js.undefined,
    localeMatcher: String = null,
    minute: String = null,
    month: String = null,
    round: js.UndefOr[Boolean] = js.undefined,
    second: String = null,
    timeZone: String = null,
    timeZoneName: String = null,
    weekday: String = null,
    year: String = null
  ): DurationToFormatOptions = {
    val __obj = js.Dynamic.literal()
    if (day != null) __obj.updateDynamic("day")(day)
    if (era != null) __obj.updateDynamic("era")(era)
    if (!js.isUndefined(floor)) __obj.updateDynamic("floor")(floor)
    if (formatMatcher != null) __obj.updateDynamic("formatMatcher")(formatMatcher)
    if (hour != null) __obj.updateDynamic("hour")(hour)
    if (!js.isUndefined(hour12)) __obj.updateDynamic("hour12")(hour12)
    if (localeMatcher != null) __obj.updateDynamic("localeMatcher")(localeMatcher)
    if (minute != null) __obj.updateDynamic("minute")(minute)
    if (month != null) __obj.updateDynamic("month")(month)
    if (!js.isUndefined(round)) __obj.updateDynamic("round")(round)
    if (second != null) __obj.updateDynamic("second")(second)
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone)
    if (timeZoneName != null) __obj.updateDynamic("timeZoneName")(timeZoneName)
    if (weekday != null) __obj.updateDynamic("weekday")(weekday)
    if (year != null) __obj.updateDynamic("year")(year)
    __obj.asInstanceOf[DurationToFormatOptions]
  }
}

