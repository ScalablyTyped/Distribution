package typings.intlRelativeformat.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ f in intl-relativeformat.intl-relativeformat/lib/types.DATA_FIELD ]: {  displayName :string,   relative :std.Record<string, string>,   relativePeriod :string | undefined,   relativeTime :{  future :std.Record<string, string>,   past :std.Record<string, string>}}} */
@js.native
trait finDATAFIELDdisplayNamest extends js.Object {
  var day: DisplayName = js.native
  var `day-narrow`: DisplayName = js.native
  var `day-short`: DisplayName = js.native
  var hour: DisplayName = js.native
  var `hour-narrow`: DisplayName = js.native
  var `hour-short`: DisplayName = js.native
  var minute: DisplayName = js.native
  var `minute-narrow`: DisplayName = js.native
  var `minute-short`: DisplayName = js.native
  var month: DisplayName = js.native
  var `month-narrow`: DisplayName = js.native
  var `month-short`: DisplayName = js.native
  var quarter: DisplayName = js.native
  var `quarter-narrow`: DisplayName = js.native
  var `quarter-short`: DisplayName = js.native
  var second: DisplayName = js.native
  var `second-narrow`: DisplayName = js.native
  var `second-short`: DisplayName = js.native
  var week: DisplayName = js.native
  var `week-narrow`: DisplayName = js.native
  var `week-short`: DisplayName = js.native
  var year: DisplayName = js.native
  var `year-narrow`: DisplayName = js.native
  var `year-short`: DisplayName = js.native
}

object finDATAFIELDdisplayNamest {
  @scala.inline
  def apply(
    day: DisplayName,
    `day-narrow`: DisplayName,
    `day-short`: DisplayName,
    hour: DisplayName,
    `hour-narrow`: DisplayName,
    `hour-short`: DisplayName,
    minute: DisplayName,
    `minute-narrow`: DisplayName,
    `minute-short`: DisplayName,
    month: DisplayName,
    `month-narrow`: DisplayName,
    `month-short`: DisplayName,
    quarter: DisplayName,
    `quarter-narrow`: DisplayName,
    `quarter-short`: DisplayName,
    second: DisplayName,
    `second-narrow`: DisplayName,
    `second-short`: DisplayName,
    week: DisplayName,
    `week-narrow`: DisplayName,
    `week-short`: DisplayName,
    year: DisplayName,
    `year-narrow`: DisplayName,
    `year-short`: DisplayName
  ): finDATAFIELDdisplayNamest = {
    val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], hour = hour.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], quarter = quarter.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any], week = week.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    __obj.updateDynamic("day-narrow")(`day-narrow`.asInstanceOf[js.Any])
    __obj.updateDynamic("day-short")(`day-short`.asInstanceOf[js.Any])
    __obj.updateDynamic("hour-narrow")(`hour-narrow`.asInstanceOf[js.Any])
    __obj.updateDynamic("hour-short")(`hour-short`.asInstanceOf[js.Any])
    __obj.updateDynamic("minute-narrow")(`minute-narrow`.asInstanceOf[js.Any])
    __obj.updateDynamic("minute-short")(`minute-short`.asInstanceOf[js.Any])
    __obj.updateDynamic("month-narrow")(`month-narrow`.asInstanceOf[js.Any])
    __obj.updateDynamic("month-short")(`month-short`.asInstanceOf[js.Any])
    __obj.updateDynamic("quarter-narrow")(`quarter-narrow`.asInstanceOf[js.Any])
    __obj.updateDynamic("quarter-short")(`quarter-short`.asInstanceOf[js.Any])
    __obj.updateDynamic("second-narrow")(`second-narrow`.asInstanceOf[js.Any])
    __obj.updateDynamic("second-short")(`second-short`.asInstanceOf[js.Any])
    __obj.updateDynamic("week-narrow")(`week-narrow`.asInstanceOf[js.Any])
    __obj.updateDynamic("week-short")(`week-short`.asInstanceOf[js.Any])
    __obj.updateDynamic("year-narrow")(`year-narrow`.asInstanceOf[js.Any])
    __obj.updateDynamic("year-short")(`year-short`.asInstanceOf[js.Any])
    __obj.asInstanceOf[finDATAFIELDdisplayNamest]
  }
  @scala.inline
  implicit class finDATAFIELDdisplayNamestOps[Self <: finDATAFIELDdisplayNamest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDay(value: DisplayName): Self = this.set("day", value.asInstanceOf[js.Any])
    @scala.inline
    def `setDay-narrow`(value: DisplayName): Self = this.set("day-narrow", value.asInstanceOf[js.Any])
    @scala.inline
    def `setDay-short`(value: DisplayName): Self = this.set("day-short", value.asInstanceOf[js.Any])
    @scala.inline
    def setHour(value: DisplayName): Self = this.set("hour", value.asInstanceOf[js.Any])
    @scala.inline
    def `setHour-narrow`(value: DisplayName): Self = this.set("hour-narrow", value.asInstanceOf[js.Any])
    @scala.inline
    def `setHour-short`(value: DisplayName): Self = this.set("hour-short", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinute(value: DisplayName): Self = this.set("minute", value.asInstanceOf[js.Any])
    @scala.inline
    def `setMinute-narrow`(value: DisplayName): Self = this.set("minute-narrow", value.asInstanceOf[js.Any])
    @scala.inline
    def `setMinute-short`(value: DisplayName): Self = this.set("minute-short", value.asInstanceOf[js.Any])
    @scala.inline
    def setMonth(value: DisplayName): Self = this.set("month", value.asInstanceOf[js.Any])
    @scala.inline
    def `setMonth-narrow`(value: DisplayName): Self = this.set("month-narrow", value.asInstanceOf[js.Any])
    @scala.inline
    def `setMonth-short`(value: DisplayName): Self = this.set("month-short", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuarter(value: DisplayName): Self = this.set("quarter", value.asInstanceOf[js.Any])
    @scala.inline
    def `setQuarter-narrow`(value: DisplayName): Self = this.set("quarter-narrow", value.asInstanceOf[js.Any])
    @scala.inline
    def `setQuarter-short`(value: DisplayName): Self = this.set("quarter-short", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecond(value: DisplayName): Self = this.set("second", value.asInstanceOf[js.Any])
    @scala.inline
    def `setSecond-narrow`(value: DisplayName): Self = this.set("second-narrow", value.asInstanceOf[js.Any])
    @scala.inline
    def `setSecond-short`(value: DisplayName): Self = this.set("second-short", value.asInstanceOf[js.Any])
    @scala.inline
    def setWeek(value: DisplayName): Self = this.set("week", value.asInstanceOf[js.Any])
    @scala.inline
    def `setWeek-narrow`(value: DisplayName): Self = this.set("week-narrow", value.asInstanceOf[js.Any])
    @scala.inline
    def `setWeek-short`(value: DisplayName): Self = this.set("week-short", value.asInstanceOf[js.Any])
    @scala.inline
    def setYear(value: DisplayName): Self = this.set("year", value.asInstanceOf[js.Any])
    @scala.inline
    def `setYear-narrow`(value: DisplayName): Self = this.set("year-narrow", value.asInstanceOf[js.Any])
    @scala.inline
    def `setYear-short`(value: DisplayName): Self = this.set("year-short", value.asInstanceOf[js.Any])
  }
  
}

