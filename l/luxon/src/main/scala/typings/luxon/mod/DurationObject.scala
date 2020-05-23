package typings.luxon.mod

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
    day: js.UndefOr[Double] = js.undefined,
    days: js.UndefOr[Double] = js.undefined,
    hour: js.UndefOr[Double] = js.undefined,
    hours: js.UndefOr[Double] = js.undefined,
    locale: String = null,
    millisecond: js.UndefOr[Double] = js.undefined,
    milliseconds: js.UndefOr[Double] = js.undefined,
    minute: js.UndefOr[Double] = js.undefined,
    minutes: js.UndefOr[Double] = js.undefined,
    month: js.UndefOr[Double] = js.undefined,
    months: js.UndefOr[Double] = js.undefined,
    numberingSystem: NumberingSystem = null,
    quarter: js.UndefOr[Double] = js.undefined,
    quarters: js.UndefOr[Double] = js.undefined,
    second: js.UndefOr[Double] = js.undefined,
    seconds: js.UndefOr[Double] = js.undefined,
    week: js.UndefOr[Double] = js.undefined,
    weeks: js.UndefOr[Double] = js.undefined,
    year: js.UndefOr[Double] = js.undefined,
    years: js.UndefOr[Double] = js.undefined
  ): DurationObject = {
    val __obj = js.Dynamic.literal()
    if (conversionAccuracy != null) __obj.updateDynamic("conversionAccuracy")(conversionAccuracy.asInstanceOf[js.Any])
    if (!js.isUndefined(day)) __obj.updateDynamic("day")(day.get.asInstanceOf[js.Any])
    if (!js.isUndefined(days)) __obj.updateDynamic("days")(days.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hour)) __obj.updateDynamic("hour")(hour.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hours)) __obj.updateDynamic("hours")(hours.get.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (!js.isUndefined(millisecond)) __obj.updateDynamic("millisecond")(millisecond.get.asInstanceOf[js.Any])
    if (!js.isUndefined(milliseconds)) __obj.updateDynamic("milliseconds")(milliseconds.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minute)) __obj.updateDynamic("minute")(minute.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minutes)) __obj.updateDynamic("minutes")(minutes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(month)) __obj.updateDynamic("month")(month.get.asInstanceOf[js.Any])
    if (!js.isUndefined(months)) __obj.updateDynamic("months")(months.get.asInstanceOf[js.Any])
    if (numberingSystem != null) __obj.updateDynamic("numberingSystem")(numberingSystem.asInstanceOf[js.Any])
    if (!js.isUndefined(quarter)) __obj.updateDynamic("quarter")(quarter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(quarters)) __obj.updateDynamic("quarters")(quarters.get.asInstanceOf[js.Any])
    if (!js.isUndefined(second)) __obj.updateDynamic("second")(second.get.asInstanceOf[js.Any])
    if (!js.isUndefined(seconds)) __obj.updateDynamic("seconds")(seconds.get.asInstanceOf[js.Any])
    if (!js.isUndefined(week)) __obj.updateDynamic("week")(week.get.asInstanceOf[js.Any])
    if (!js.isUndefined(weeks)) __obj.updateDynamic("weeks")(weeks.get.asInstanceOf[js.Any])
    if (!js.isUndefined(year)) __obj.updateDynamic("year")(year.get.asInstanceOf[js.Any])
    if (!js.isUndefined(years)) __obj.updateDynamic("years")(years.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DurationObject]
  }
}

