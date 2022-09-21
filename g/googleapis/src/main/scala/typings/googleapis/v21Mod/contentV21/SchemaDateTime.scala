package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDateTime extends StObject {
  
  /**
    * Optional. Day of month. Must be from 1 to 31 and valid for the year and month, or 0 if specifying a datetime without a day.
    */
  var day: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Optional. Hours of day in 24 hour format. Should be from 0 to 23, defaults to 0 (midnight). An API may choose to allow the value "24:00:00" for scenarios like business closing time.
    */
  var hours: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Optional. Minutes of hour of day. Must be from 0 to 59, defaults to 0.
    */
  var minutes: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Optional. Month of year. Must be from 1 to 12, or 0 if specifying a datetime without a month.
    */
  var month: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Optional. Fractions of seconds in nanoseconds. Must be from 0 to 999,999,999, defaults to 0.
    */
  var nanos: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Optional. Seconds of minutes of the time. Must normally be from 0 to 59, defaults to 0. An API may allow the value 60 if it allows leap-seconds.
    */
  var seconds: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Time zone.
    */
  var timeZone: js.UndefOr[SchemaTimeZone] = js.undefined
  
  /**
    * UTC offset. Must be whole seconds, between -18 hours and +18 hours. For example, a UTC offset of -4:00 would be represented as { seconds: -14400 \}.
    */
  var utcOffset: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Year of date. Must be from 1 to 9999, or 0 if specifying a datetime without a year.
    */
  var year: js.UndefOr[Double | Null] = js.undefined
}
object SchemaDateTime {
  
  inline def apply(): SchemaDateTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDateTime]
  }
  
  extension [Self <: SchemaDateTime](x: Self) {
    
    inline def setDay(value: Double): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    inline def setDayNull: Self = StObject.set(x, "day", null)
    
    inline def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
    
    inline def setHours(value: Double): Self = StObject.set(x, "hours", value.asInstanceOf[js.Any])
    
    inline def setHoursNull: Self = StObject.set(x, "hours", null)
    
    inline def setHoursUndefined: Self = StObject.set(x, "hours", js.undefined)
    
    inline def setMinutes(value: Double): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
    
    inline def setMinutesNull: Self = StObject.set(x, "minutes", null)
    
    inline def setMinutesUndefined: Self = StObject.set(x, "minutes", js.undefined)
    
    inline def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    inline def setMonthNull: Self = StObject.set(x, "month", null)
    
    inline def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
    
    inline def setNanos(value: Double): Self = StObject.set(x, "nanos", value.asInstanceOf[js.Any])
    
    inline def setNanosNull: Self = StObject.set(x, "nanos", null)
    
    inline def setNanosUndefined: Self = StObject.set(x, "nanos", js.undefined)
    
    inline def setSeconds(value: Double): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
    
    inline def setSecondsNull: Self = StObject.set(x, "seconds", null)
    
    inline def setSecondsUndefined: Self = StObject.set(x, "seconds", js.undefined)
    
    inline def setTimeZone(value: SchemaTimeZone): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
    
    inline def setUtcOffset(value: String): Self = StObject.set(x, "utcOffset", value.asInstanceOf[js.Any])
    
    inline def setUtcOffsetNull: Self = StObject.set(x, "utcOffset", null)
    
    inline def setUtcOffsetUndefined: Self = StObject.set(x, "utcOffset", js.undefined)
    
    inline def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    
    inline def setYearNull: Self = StObject.set(x, "year", null)
    
    inline def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
  }
}
