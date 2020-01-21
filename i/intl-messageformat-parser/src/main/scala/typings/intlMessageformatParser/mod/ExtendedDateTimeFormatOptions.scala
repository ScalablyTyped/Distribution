package typings.intlMessageformatParser.mod

import typings.intlMessageformatParser.intlMessageformatParserStrings.h11
import typings.intlMessageformatParser.intlMessageformatParserStrings.h12
import typings.intlMessageformatParser.intlMessageformatParserStrings.h23
import typings.intlMessageformatParser.intlMessageformatParserStrings.h24
import typings.std.Intl.DateTimeFormatOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtendedDateTimeFormatOptions extends DateTimeFormatOptions {
  var hourCycle: js.UndefOr[h11 | h12 | h23 | h24] = js.undefined
}

object ExtendedDateTimeFormatOptions {
  @scala.inline
  def apply(
    day: String = null,
    era: String = null,
    formatMatcher: String = null,
    hour: String = null,
    hour12: js.UndefOr[Boolean] = js.undefined,
    hourCycle: h11 | h12 | h23 | h24 = null,
    localeMatcher: String = null,
    minute: String = null,
    month: String = null,
    second: String = null,
    timeZone: String = null,
    timeZoneName: String = null,
    weekday: String = null,
    year: String = null
  ): ExtendedDateTimeFormatOptions = {
    val __obj = js.Dynamic.literal()
    if (day != null) __obj.updateDynamic("day")(day.asInstanceOf[js.Any])
    if (era != null) __obj.updateDynamic("era")(era.asInstanceOf[js.Any])
    if (formatMatcher != null) __obj.updateDynamic("formatMatcher")(formatMatcher.asInstanceOf[js.Any])
    if (hour != null) __obj.updateDynamic("hour")(hour.asInstanceOf[js.Any])
    if (!js.isUndefined(hour12)) __obj.updateDynamic("hour12")(hour12.asInstanceOf[js.Any])
    if (hourCycle != null) __obj.updateDynamic("hourCycle")(hourCycle.asInstanceOf[js.Any])
    if (localeMatcher != null) __obj.updateDynamic("localeMatcher")(localeMatcher.asInstanceOf[js.Any])
    if (minute != null) __obj.updateDynamic("minute")(minute.asInstanceOf[js.Any])
    if (month != null) __obj.updateDynamic("month")(month.asInstanceOf[js.Any])
    if (second != null) __obj.updateDynamic("second")(second.asInstanceOf[js.Any])
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone.asInstanceOf[js.Any])
    if (timeZoneName != null) __obj.updateDynamic("timeZoneName")(timeZoneName.asInstanceOf[js.Any])
    if (weekday != null) __obj.updateDynamic("weekday")(weekday.asInstanceOf[js.Any])
    if (year != null) __obj.updateDynamic("year")(year.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedDateTimeFormatOptions]
  }
}

