package typings.intlifyCoreBase.mod

import typings.intlifyCoreBase.intlifyCoreBaseStrings.long
import typings.intlifyCoreBase.intlifyCoreBaseStrings.short
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpecificDateTimeFormatOptions
  extends StObject
     with typings.std.Intl.DateTimeFormatOptions {
  
  @JSName("day")
  var day_SpecificDateTimeFormatOptions: js.UndefOr[DateTimeDigital] = js.undefined
  
  @JSName("era")
  var era_SpecificDateTimeFormatOptions: js.UndefOr[DateTimeHumanReadable] = js.undefined
  
  @JSName("formatMatcher")
  var formatMatcher_SpecificDateTimeFormatOptions: js.UndefOr[FormatMatcher] = js.undefined
  
  @JSName("hour")
  var hour_SpecificDateTimeFormatOptions: js.UndefOr[DateTimeDigital] = js.undefined
  
  @JSName("localeMatcher")
  var localeMatcher_SpecificDateTimeFormatOptions: js.UndefOr[LocaleMatcher] = js.undefined
  
  @JSName("minute")
  var minute_SpecificDateTimeFormatOptions: js.UndefOr[DateTimeDigital] = js.undefined
  
  @JSName("month")
  var month_SpecificDateTimeFormatOptions: js.UndefOr[DateTimeDigital | DateTimeHumanReadable] = js.undefined
  
  @JSName("second")
  var second_SpecificDateTimeFormatOptions: js.UndefOr[DateTimeDigital] = js.undefined
  
  @JSName("timeZoneName")
  var timeZoneName_SpecificDateTimeFormatOptions: js.UndefOr[long | short] = js.undefined
  
  @JSName("weekday")
  var weekday_SpecificDateTimeFormatOptions: js.UndefOr[DateTimeHumanReadable] = js.undefined
  
  @JSName("year")
  var year_SpecificDateTimeFormatOptions: js.UndefOr[DateTimeDigital] = js.undefined
}
object SpecificDateTimeFormatOptions {
  
  inline def apply(): SpecificDateTimeFormatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpecificDateTimeFormatOptions]
  }
  
  extension [Self <: SpecificDateTimeFormatOptions](x: Self) {
    
    inline def setDay(value: DateTimeDigital): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    inline def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
    
    inline def setEra(value: DateTimeHumanReadable): Self = StObject.set(x, "era", value.asInstanceOf[js.Any])
    
    inline def setEraUndefined: Self = StObject.set(x, "era", js.undefined)
    
    inline def setFormatMatcher(value: FormatMatcher): Self = StObject.set(x, "formatMatcher", value.asInstanceOf[js.Any])
    
    inline def setFormatMatcherUndefined: Self = StObject.set(x, "formatMatcher", js.undefined)
    
    inline def setHour(value: DateTimeDigital): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
    
    inline def setHourUndefined: Self = StObject.set(x, "hour", js.undefined)
    
    inline def setLocaleMatcher(value: LocaleMatcher): Self = StObject.set(x, "localeMatcher", value.asInstanceOf[js.Any])
    
    inline def setLocaleMatcherUndefined: Self = StObject.set(x, "localeMatcher", js.undefined)
    
    inline def setMinute(value: DateTimeDigital): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
    
    inline def setMinuteUndefined: Self = StObject.set(x, "minute", js.undefined)
    
    inline def setMonth(value: DateTimeDigital | DateTimeHumanReadable): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    inline def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
    
    inline def setSecond(value: DateTimeDigital): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
    
    inline def setSecondUndefined: Self = StObject.set(x, "second", js.undefined)
    
    inline def setTimeZoneName(value: long | short): Self = StObject.set(x, "timeZoneName", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneNameUndefined: Self = StObject.set(x, "timeZoneName", js.undefined)
    
    inline def setWeekday(value: DateTimeHumanReadable): Self = StObject.set(x, "weekday", value.asInstanceOf[js.Any])
    
    inline def setWeekdayUndefined: Self = StObject.set(x, "weekday", js.undefined)
    
    inline def setYear(value: DateTimeDigital): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    
    inline def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
  }
}
