package typings
package luxonLib.luxonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateObject
  extends DateObjectUnits
     with LocaleOptions {
  var zone: js.UndefOr[java.lang.String | Zone] = js.undefined
}

object DateObject {
  @scala.inline
  def apply(
    day: scala.Int | scala.Double = null,
    hour: scala.Int | scala.Double = null,
    locale: java.lang.String = null,
    millisecond: scala.Int | scala.Double = null,
    minute: scala.Int | scala.Double = null,
    month: scala.Int | scala.Double = null,
    numberingSystem: NumberingSystem = null,
    ordinal: scala.Int | scala.Double = null,
    outputCalendar: CalendarSystem = null,
    second: scala.Int | scala.Double = null,
    weekNumber: scala.Int | scala.Double = null,
    weekYear: scala.Int | scala.Double = null,
    weekday: scala.Int | scala.Double = null,
    year: scala.Int | scala.Double = null,
    zone: java.lang.String | Zone = null
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

