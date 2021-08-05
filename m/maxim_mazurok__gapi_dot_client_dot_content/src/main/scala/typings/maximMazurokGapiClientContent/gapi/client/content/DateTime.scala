package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateTime extends StObject {
  
  /** Required. Day of month. Must be from 1 to 31 and valid for the year and month. */
  var day: js.UndefOr[Double] = js.undefined
  
  /** Required. Hours of day in 24 hour format. Should be from 0 to 23. An API may choose to allow the value "24:00:00" for scenarios like business closing time. */
  var hours: js.UndefOr[Double] = js.undefined
  
  /** Required. Minutes of hour of day. Must be from 0 to 59. */
  var minutes: js.UndefOr[Double] = js.undefined
  
  /** Required. Month of year. Must be from 1 to 12. */
  var month: js.UndefOr[Double] = js.undefined
  
  /** Required. Fractions of seconds in nanoseconds. Must be from 0 to 999,999,999. */
  var nanos: js.UndefOr[Double] = js.undefined
  
  /** Required. Seconds of minutes of the time. Must normally be from 0 to 59. An API may allow the value 60 if it allows leap-seconds. */
  var seconds: js.UndefOr[Double] = js.undefined
  
  /** Time zone. */
  var timeZone: js.UndefOr[TimeZone] = js.undefined
  
  /** UTC offset. Must be whole seconds, between -18 hours and +18 hours. For example, a UTC offset of -4:00 would be represented as { seconds: -14400 }. */
  var utcOffset: js.UndefOr[String] = js.undefined
  
  /** Optional. Year of date. Must be from 1 to 9999, or 0 if specifying a datetime without a year. */
  var year: js.UndefOr[Double] = js.undefined
}
object DateTime {
  
  inline def apply(): DateTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateTime]
  }
  
  extension [Self <: DateTime](x: Self) {
    
    inline def setDay(value: Double): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    inline def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
    
    inline def setHours(value: Double): Self = StObject.set(x, "hours", value.asInstanceOf[js.Any])
    
    inline def setHoursUndefined: Self = StObject.set(x, "hours", js.undefined)
    
    inline def setMinutes(value: Double): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
    
    inline def setMinutesUndefined: Self = StObject.set(x, "minutes", js.undefined)
    
    inline def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    inline def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
    
    inline def setNanos(value: Double): Self = StObject.set(x, "nanos", value.asInstanceOf[js.Any])
    
    inline def setNanosUndefined: Self = StObject.set(x, "nanos", js.undefined)
    
    inline def setSeconds(value: Double): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
    
    inline def setSecondsUndefined: Self = StObject.set(x, "seconds", js.undefined)
    
    inline def setTimeZone(value: TimeZone): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
    
    inline def setUtcOffset(value: String): Self = StObject.set(x, "utcOffset", value.asInstanceOf[js.Any])
    
    inline def setUtcOffsetUndefined: Self = StObject.set(x, "utcOffset", js.undefined)
    
    inline def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    
    inline def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
  }
}
