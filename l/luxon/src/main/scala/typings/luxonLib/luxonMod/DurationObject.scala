package typings
package luxonLib.luxonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DurationObject
  extends DurationObjectUnits
     with DurationOptions

object DurationObject {
  @scala.inline
  def apply(
    conversionAccuracy: ConversionAccuracy = null,
    day: scala.Int | scala.Double = null,
    days: scala.Int | scala.Double = null,
    hour: scala.Int | scala.Double = null,
    hours: scala.Int | scala.Double = null,
    locale: java.lang.String = null,
    millisecond: scala.Int | scala.Double = null,
    milliseconds: scala.Int | scala.Double = null,
    minute: scala.Int | scala.Double = null,
    minutes: scala.Int | scala.Double = null,
    month: scala.Int | scala.Double = null,
    months: scala.Int | scala.Double = null,
    numberingSystem: NumberingSystem = null,
    quarter: scala.Int | scala.Double = null,
    quarters: scala.Int | scala.Double = null,
    second: scala.Int | scala.Double = null,
    seconds: scala.Int | scala.Double = null,
    week: scala.Int | scala.Double = null,
    weeks: scala.Int | scala.Double = null,
    year: scala.Int | scala.Double = null,
    years: scala.Int | scala.Double = null
  ): DurationObject = {
    val __obj = js.Dynamic.literal()
    if (conversionAccuracy != null) __obj.updateDynamic("conversionAccuracy")(conversionAccuracy)
    if (day != null) __obj.updateDynamic("day")(day.asInstanceOf[js.Any])
    if (days != null) __obj.updateDynamic("days")(days.asInstanceOf[js.Any])
    if (hour != null) __obj.updateDynamic("hour")(hour.asInstanceOf[js.Any])
    if (hours != null) __obj.updateDynamic("hours")(hours.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (millisecond != null) __obj.updateDynamic("millisecond")(millisecond.asInstanceOf[js.Any])
    if (milliseconds != null) __obj.updateDynamic("milliseconds")(milliseconds.asInstanceOf[js.Any])
    if (minute != null) __obj.updateDynamic("minute")(minute.asInstanceOf[js.Any])
    if (minutes != null) __obj.updateDynamic("minutes")(minutes.asInstanceOf[js.Any])
    if (month != null) __obj.updateDynamic("month")(month.asInstanceOf[js.Any])
    if (months != null) __obj.updateDynamic("months")(months.asInstanceOf[js.Any])
    if (numberingSystem != null) __obj.updateDynamic("numberingSystem")(numberingSystem)
    if (quarter != null) __obj.updateDynamic("quarter")(quarter.asInstanceOf[js.Any])
    if (quarters != null) __obj.updateDynamic("quarters")(quarters.asInstanceOf[js.Any])
    if (second != null) __obj.updateDynamic("second")(second.asInstanceOf[js.Any])
    if (seconds != null) __obj.updateDynamic("seconds")(seconds.asInstanceOf[js.Any])
    if (week != null) __obj.updateDynamic("week")(week.asInstanceOf[js.Any])
    if (weeks != null) __obj.updateDynamic("weeks")(weeks.asInstanceOf[js.Any])
    if (year != null) __obj.updateDynamic("year")(year.asInstanceOf[js.Any])
    if (years != null) __obj.updateDynamic("years")(years.asInstanceOf[js.Any])
    __obj.asInstanceOf[DurationObject]
  }
}

