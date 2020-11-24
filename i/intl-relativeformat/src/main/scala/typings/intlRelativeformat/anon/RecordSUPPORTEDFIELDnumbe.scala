package typings.intlRelativeformat.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<intl-relativeformat.intl-relativeformat/lib/types.SUPPORTED_FIELD, number> */
@js.native
trait RecordSUPPORTEDFIELDnumbe extends js.Object {
  
  var day: Double = js.native
  
  var `day-narrow`: Double = js.native
  
  var `day-short`: Double = js.native
  
  var hour: Double = js.native
  
  var `hour-narrow`: Double = js.native
  
  var `hour-short`: Double = js.native
  
  var minute: Double = js.native
  
  var `minute-narrow`: Double = js.native
  
  var `minute-short`: Double = js.native
  
  var month: Double = js.native
  
  var `month-narrow`: Double = js.native
  
  var `month-short`: Double = js.native
  
  var second: Double = js.native
  
  var `second-narrow`: Double = js.native
  
  var `second-short`: Double = js.native
  
  var week: Double = js.native
  
  var `week-narrow`: Double = js.native
  
  var `week-short`: Double = js.native
  
  var year: Double = js.native
  
  var `year-narrow`: Double = js.native
  
  var `year-short`: Double = js.native
}
object RecordSUPPORTEDFIELDnumbe {
  
  @scala.inline
  def apply(
    day: Double,
    `day-narrow`: Double,
    `day-short`: Double,
    hour: Double,
    `hour-narrow`: Double,
    `hour-short`: Double,
    minute: Double,
    `minute-narrow`: Double,
    `minute-short`: Double,
    month: Double,
    `month-narrow`: Double,
    `month-short`: Double,
    second: Double,
    `second-narrow`: Double,
    `second-short`: Double,
    week: Double,
    `week-narrow`: Double,
    `week-short`: Double,
    year: Double,
    `year-narrow`: Double,
    `year-short`: Double
  ): RecordSUPPORTEDFIELDnumbe = {
    val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], hour = hour.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any], week = week.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    __obj.updateDynamic("day-narrow")(`day-narrow`.asInstanceOf[js.Any])
    __obj.updateDynamic("day-short")(`day-short`.asInstanceOf[js.Any])
    __obj.updateDynamic("hour-narrow")(`hour-narrow`.asInstanceOf[js.Any])
    __obj.updateDynamic("hour-short")(`hour-short`.asInstanceOf[js.Any])
    __obj.updateDynamic("minute-narrow")(`minute-narrow`.asInstanceOf[js.Any])
    __obj.updateDynamic("minute-short")(`minute-short`.asInstanceOf[js.Any])
    __obj.updateDynamic("month-narrow")(`month-narrow`.asInstanceOf[js.Any])
    __obj.updateDynamic("month-short")(`month-short`.asInstanceOf[js.Any])
    __obj.updateDynamic("second-narrow")(`second-narrow`.asInstanceOf[js.Any])
    __obj.updateDynamic("second-short")(`second-short`.asInstanceOf[js.Any])
    __obj.updateDynamic("week-narrow")(`week-narrow`.asInstanceOf[js.Any])
    __obj.updateDynamic("week-short")(`week-short`.asInstanceOf[js.Any])
    __obj.updateDynamic("year-narrow")(`year-narrow`.asInstanceOf[js.Any])
    __obj.updateDynamic("year-short")(`year-short`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordSUPPORTEDFIELDnumbe]
  }
  
  @scala.inline
  implicit class RecordSUPPORTEDFIELDnumbeOps[Self <: RecordSUPPORTEDFIELDnumbe] (val x: Self) extends AnyVal {
    
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
    def setDay(value: Double): Self = this.set("day", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setDay-narrow`(value: Double): Self = this.set("day-narrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setDay-short`(value: Double): Self = this.set("day-short", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHour(value: Double): Self = this.set("hour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setHour-narrow`(value: Double): Self = this.set("hour-narrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setHour-short`(value: Double): Self = this.set("hour-short", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinute(value: Double): Self = this.set("minute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMinute-narrow`(value: Double): Self = this.set("minute-narrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMinute-short`(value: Double): Self = this.set("minute-short", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonth(value: Double): Self = this.set("month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMonth-narrow`(value: Double): Self = this.set("month-narrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMonth-short`(value: Double): Self = this.set("month-short", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecond(value: Double): Self = this.set("second", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setSecond-narrow`(value: Double): Self = this.set("second-narrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setSecond-short`(value: Double): Self = this.set("second-short", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeek(value: Double): Self = this.set("week", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWeek-narrow`(value: Double): Self = this.set("week-narrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWeek-short`(value: Double): Self = this.set("week-short", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYear(value: Double): Self = this.set("year", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setYear-narrow`(value: Double): Self = this.set("year-narrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setYear-short`(value: Double): Self = this.set("year-short", value.asInstanceOf[js.Any])
  }
}
