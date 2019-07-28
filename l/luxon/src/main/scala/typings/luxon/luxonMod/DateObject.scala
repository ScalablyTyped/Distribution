package typings.luxon.luxonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateObject
  extends DateObjectUnits
     with LocaleOptions {
  var zone: js.UndefOr[String | Zone] = js.undefined
}

object DateObject {
  @scala.inline
  def apply(
    day: Int | Double = null,
    hour: Int | Double = null,
    locale: String = null,
    millisecond: Int | Double = null,
    minute: Int | Double = null,
    month: Int | Double = null,
    numberingSystem: NumberingSystem = null,
    ordinal: Int | Double = null,
    outputCalendar: CalendarSystem = null,
    second: Int | Double = null,
    weekNumber: Int | Double = null,
    weekYear: Int | Double = null,
    weekday: Int | Double = null,
    year: Int | Double = null,
    zone: String | Zone = null
  ): DateObject = {
    val __obj = js.Dynamic.literal()
    if (day != null) __obj.updateDynamic("day")(day.asInstanceOf[js.Any])
    if (hour != null) __obj.updateDynamic("hour")(hour.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (millisecond != null) __obj.updateDynamic("millisecond")(millisecond.asInstanceOf[js.Any])
    if (minute != null) __obj.updateDynamic("minute")(minute.asInstanceOf[js.Any])
    if (month != null) __obj.updateDynamic("month")(month.asInstanceOf[js.Any])
    if (numberingSystem != null) __obj.updateDynamic("numberingSystem")(numberingSystem)
    if (ordinal != null) __obj.updateDynamic("ordinal")(ordinal.asInstanceOf[js.Any])
    if (outputCalendar != null) __obj.updateDynamic("outputCalendar")(outputCalendar)
    if (second != null) __obj.updateDynamic("second")(second.asInstanceOf[js.Any])
    if (weekNumber != null) __obj.updateDynamic("weekNumber")(weekNumber.asInstanceOf[js.Any])
    if (weekYear != null) __obj.updateDynamic("weekYear")(weekYear.asInstanceOf[js.Any])
    if (weekday != null) __obj.updateDynamic("weekday")(weekday.asInstanceOf[js.Any])
    if (year != null) __obj.updateDynamic("year")(year.asInstanceOf[js.Any])
    if (zone != null) __obj.updateDynamic("zone")(zone.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateObject]
  }
}

