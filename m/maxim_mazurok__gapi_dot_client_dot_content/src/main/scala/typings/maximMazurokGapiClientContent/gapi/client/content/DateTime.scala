package typings.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateTime extends js.Object {
  
  /** Required. Day of month. Must be from 1 to 31 and valid for the year and month. */
  var day: js.UndefOr[Double] = js.native
  
  /** Required. Hours of day in 24 hour format. Should be from 0 to 23. An API may choose to allow the value "24:00:00" for scenarios like business closing time. */
  var hours: js.UndefOr[Double] = js.native
  
  /** Required. Minutes of hour of day. Must be from 0 to 59. */
  var minutes: js.UndefOr[Double] = js.native
  
  /** Required. Month of year. Must be from 1 to 12. */
  var month: js.UndefOr[Double] = js.native
  
  /** Required. Fractions of seconds in nanoseconds. Must be from 0 to 999,999,999. */
  var nanos: js.UndefOr[Double] = js.native
  
  /** Required. Seconds of minutes of the time. Must normally be from 0 to 59. An API may allow the value 60 if it allows leap-seconds. */
  var seconds: js.UndefOr[Double] = js.native
  
  /** Time zone. */
  var timeZone: js.UndefOr[TimeZone] = js.native
  
  /** UTC offset. Must be whole seconds, between -18 hours and +18 hours. For example, a UTC offset of -4:00 would be represented as { seconds: -14400 }. */
  var utcOffset: js.UndefOr[String] = js.native
  
  /** Optional. Year of date. Must be from 1 to 9999, or 0 if specifying a datetime without a year. */
  var year: js.UndefOr[Double] = js.native
}
object DateTime {
  
  @scala.inline
  def apply(): DateTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateTime]
  }
  
  @scala.inline
  implicit class DateTimeOps[Self <: DateTime] (val x: Self) extends AnyVal {
    
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
    def deleteDay: Self = this.set("day", js.undefined)
    
    @scala.inline
    def setHours(value: Double): Self = this.set("hours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHours: Self = this.set("hours", js.undefined)
    
    @scala.inline
    def setMinutes(value: Double): Self = this.set("minutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinutes: Self = this.set("minutes", js.undefined)
    
    @scala.inline
    def setMonth(value: Double): Self = this.set("month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonth: Self = this.set("month", js.undefined)
    
    @scala.inline
    def setNanos(value: Double): Self = this.set("nanos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNanos: Self = this.set("nanos", js.undefined)
    
    @scala.inline
    def setSeconds(value: Double): Self = this.set("seconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeconds: Self = this.set("seconds", js.undefined)
    
    @scala.inline
    def setTimeZone(value: TimeZone): Self = this.set("timeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeZone: Self = this.set("timeZone", js.undefined)
    
    @scala.inline
    def setUtcOffset(value: String): Self = this.set("utcOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUtcOffset: Self = this.set("utcOffset", js.undefined)
    
    @scala.inline
    def setYear(value: Double): Self = this.set("year", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYear: Self = this.set("year", js.undefined)
  }
}
