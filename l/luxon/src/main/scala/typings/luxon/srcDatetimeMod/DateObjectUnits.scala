package typings.luxon.srcDatetimeMod

import typings.luxon.srcIntervalMod._DateInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateObjectUnits
  extends StObject
     with _DateInput {
  
  // a day of the month, 1-31, depending on the month
  var day: js.UndefOr[Double] = js.undefined
  
  // hour of the day, 0-23
  var hour: js.UndefOr[Double] = js.undefined
  
  // millisecond of the second, 0-999
  var millisecond: js.UndefOr[Double] = js.undefined
  
  // minute of the hour, 0-59
  var minute: js.UndefOr[Double] = js.undefined
  
  // a month, 1-12
  var month: js.UndefOr[Double] = js.undefined
  
  // day of the year, 1-365 or 366
  var ordinal: js.UndefOr[Double] = js.undefined
  
  // second of the minute, 0-59
  var second: js.UndefOr[Double] = js.undefined
  
  // an ISO week number, between 1 and 52 or 53, depending on the year
  var weekNumber: js.UndefOr[Double] = js.undefined
  
  // an ISO week year
  var weekYear: js.UndefOr[Double] = js.undefined
  
  // an ISO weekday, 1-7, where 1 is Monday and 7 is Sunday
  var weekday: js.UndefOr[Double] = js.undefined
  
  // a year, such as 1987
  var year: js.UndefOr[Double] = js.undefined
}
object DateObjectUnits {
  
  inline def apply(): DateObjectUnits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateObjectUnits]
  }
  
  extension [Self <: DateObjectUnits](x: Self) {
    
    inline def setDay(value: Double): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    inline def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
    
    inline def setHour(value: Double): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
    
    inline def setHourUndefined: Self = StObject.set(x, "hour", js.undefined)
    
    inline def setMillisecond(value: Double): Self = StObject.set(x, "millisecond", value.asInstanceOf[js.Any])
    
    inline def setMillisecondUndefined: Self = StObject.set(x, "millisecond", js.undefined)
    
    inline def setMinute(value: Double): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
    
    inline def setMinuteUndefined: Self = StObject.set(x, "minute", js.undefined)
    
    inline def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    inline def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
    
    inline def setOrdinal(value: Double): Self = StObject.set(x, "ordinal", value.asInstanceOf[js.Any])
    
    inline def setOrdinalUndefined: Self = StObject.set(x, "ordinal", js.undefined)
    
    inline def setSecond(value: Double): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
    
    inline def setSecondUndefined: Self = StObject.set(x, "second", js.undefined)
    
    inline def setWeekNumber(value: Double): Self = StObject.set(x, "weekNumber", value.asInstanceOf[js.Any])
    
    inline def setWeekNumberUndefined: Self = StObject.set(x, "weekNumber", js.undefined)
    
    inline def setWeekYear(value: Double): Self = StObject.set(x, "weekYear", value.asInstanceOf[js.Any])
    
    inline def setWeekYearUndefined: Self = StObject.set(x, "weekYear", js.undefined)
    
    inline def setWeekday(value: Double): Self = StObject.set(x, "weekday", value.asInstanceOf[js.Any])
    
    inline def setWeekdayUndefined: Self = StObject.set(x, "weekday", js.undefined)
    
    inline def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    
    inline def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
  }
}
