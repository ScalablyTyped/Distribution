package typings.intlRelativeformat

import typings.intlRelativeformat.typesMod.STYLE
import typings.intlRelativeformat.typesMod.SUPPORTED_FIELD
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait DisplayName extends StObject {
    
    var displayName: String
    
    var relative: Record[String, String]
    
    var relativePeriod: js.UndefOr[String] = js.undefined
    
    var relativeTime: Future
  }
  object DisplayName {
    
    inline def apply(displayName: String, relative: Record[String, String], relativeTime: Future): DisplayName = {
      val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], relative = relative.asInstanceOf[js.Any], relativeTime = relativeTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[DisplayName]
    }
    
    extension [Self <: DisplayName](x: Self) {
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setRelative(value: Record[String, String]): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
      
      inline def setRelativePeriod(value: String): Self = StObject.set(x, "relativePeriod", value.asInstanceOf[js.Any])
      
      inline def setRelativePeriodUndefined: Self = StObject.set(x, "relativePeriod", js.undefined)
      
      inline def setRelativeTime(value: Future): Self = StObject.set(x, "relativeTime", value.asInstanceOf[js.Any])
    }
  }
  
  trait Future extends StObject {
    
    var future: Record[String, String]
    
    var past: Record[String, String]
  }
  object Future {
    
    inline def apply(future: Record[String, String], past: Record[String, String]): Future = {
      val __obj = js.Dynamic.literal(future = future.asInstanceOf[js.Any], past = past.asInstanceOf[js.Any])
      __obj.asInstanceOf[Future]
    }
    
    extension [Self <: Future](x: Self) {
      
      inline def setFuture(value: Record[String, String]): Self = StObject.set(x, "future", value.asInstanceOf[js.Any])
      
      inline def setPast(value: Record[String, String]): Self = StObject.set(x, "past", value.asInstanceOf[js.Any])
    }
  }
  
  trait Locale extends StObject {
    
    var locale: String
    
    var style: STYLE
    
    var units: js.UndefOr[SUPPORTED_FIELD] = js.undefined
  }
  object Locale {
    
    inline def apply(locale: String, style: STYLE): Locale = {
      val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[Locale]
    }
    
    extension [Self <: Locale](x: Self) {
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: STYLE): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setUnits(value: SUPPORTED_FIELD): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
      
      inline def setUnitsUndefined: Self = StObject.set(x, "units", js.undefined)
    }
  }
  
  trait Now extends StObject {
    
    var now: js.UndefOr[js.Date | Double | Null] = js.undefined
  }
  object Now {
    
    inline def apply(): Now = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Now]
    }
    
    extension [Self <: Now](x: Self) {
      
      inline def setNow(value: js.Date | Double): Self = StObject.set(x, "now", value.asInstanceOf[js.Any])
      
      inline def setNowNull: Self = StObject.set(x, "now", null)
      
      inline def setNowUndefined: Self = StObject.set(x, "now", js.undefined)
    }
  }
  
  /* Inlined std.Record<intl-relativeformat.intl-relativeformat/lib/types.SUPPORTED_FIELD, number> */
  trait RecordSUPPORTEDFIELDnumbe extends StObject {
    
    var day: Double
    
    var `day-narrow`: Double
    
    var `day-short`: Double
    
    var hour: Double
    
    var `hour-narrow`: Double
    
    var `hour-short`: Double
    
    var minute: Double
    
    var `minute-narrow`: Double
    
    var `minute-short`: Double
    
    var month: Double
    
    var `month-narrow`: Double
    
    var `month-short`: Double
    
    var second: Double
    
    var `second-narrow`: Double
    
    var `second-short`: Double
    
    var week: Double
    
    var `week-narrow`: Double
    
    var `week-short`: Double
    
    var year: Double
    
    var `year-narrow`: Double
    
    var `year-short`: Double
  }
  object RecordSUPPORTEDFIELDnumbe {
    
    inline def apply(
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
    
    extension [Self <: RecordSUPPORTEDFIELDnumbe](x: Self) {
      
      inline def setDay(value: Double): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
      
      inline def `setDay-narrow`(value: Double): Self = StObject.set(x, "day-narrow", value.asInstanceOf[js.Any])
      
      inline def `setDay-short`(value: Double): Self = StObject.set(x, "day-short", value.asInstanceOf[js.Any])
      
      inline def setHour(value: Double): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
      
      inline def `setHour-narrow`(value: Double): Self = StObject.set(x, "hour-narrow", value.asInstanceOf[js.Any])
      
      inline def `setHour-short`(value: Double): Self = StObject.set(x, "hour-short", value.asInstanceOf[js.Any])
      
      inline def setMinute(value: Double): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
      
      inline def `setMinute-narrow`(value: Double): Self = StObject.set(x, "minute-narrow", value.asInstanceOf[js.Any])
      
      inline def `setMinute-short`(value: Double): Self = StObject.set(x, "minute-short", value.asInstanceOf[js.Any])
      
      inline def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      inline def `setMonth-narrow`(value: Double): Self = StObject.set(x, "month-narrow", value.asInstanceOf[js.Any])
      
      inline def `setMonth-short`(value: Double): Self = StObject.set(x, "month-short", value.asInstanceOf[js.Any])
      
      inline def setSecond(value: Double): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
      
      inline def `setSecond-narrow`(value: Double): Self = StObject.set(x, "second-narrow", value.asInstanceOf[js.Any])
      
      inline def `setSecond-short`(value: Double): Self = StObject.set(x, "second-short", value.asInstanceOf[js.Any])
      
      inline def setWeek(value: Double): Self = StObject.set(x, "week", value.asInstanceOf[js.Any])
      
      inline def `setWeek-narrow`(value: Double): Self = StObject.set(x, "week-narrow", value.asInstanceOf[js.Any])
      
      inline def `setWeek-short`(value: Double): Self = StObject.set(x, "week-short", value.asInstanceOf[js.Any])
      
      inline def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
      
      inline def `setYear-narrow`(value: Double): Self = StObject.set(x, "year-narrow", value.asInstanceOf[js.Any])
      
      inline def `setYear-short`(value: Double): Self = StObject.set(x, "year-short", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {[ f in intl-relativeformat.intl-relativeformat/lib/types.DATA_FIELD ]: {  displayName :string,   relative :std.Record<string, string>,   relativePeriod :string | undefined,   relativeTime :{  future :std.Record<string, string>,   past :std.Record<string, string>}}} */
  trait finDATAFIELDdisplayNamest extends StObject {
    
    var day: DisplayName
    
    var `day-narrow`: DisplayName
    
    var `day-short`: DisplayName
    
    var hour: DisplayName
    
    var `hour-narrow`: DisplayName
    
    var `hour-short`: DisplayName
    
    var minute: DisplayName
    
    var `minute-narrow`: DisplayName
    
    var `minute-short`: DisplayName
    
    var month: DisplayName
    
    var `month-narrow`: DisplayName
    
    var `month-short`: DisplayName
    
    var quarter: DisplayName
    
    var `quarter-narrow`: DisplayName
    
    var `quarter-short`: DisplayName
    
    var second: DisplayName
    
    var `second-narrow`: DisplayName
    
    var `second-short`: DisplayName
    
    var week: DisplayName
    
    var `week-narrow`: DisplayName
    
    var `week-short`: DisplayName
    
    var year: DisplayName
    
    var `year-narrow`: DisplayName
    
    var `year-short`: DisplayName
  }
  object finDATAFIELDdisplayNamest {
    
    inline def apply(
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
    
    extension [Self <: finDATAFIELDdisplayNamest](x: Self) {
      
      inline def setDay(value: DisplayName): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
      
      inline def `setDay-narrow`(value: DisplayName): Self = StObject.set(x, "day-narrow", value.asInstanceOf[js.Any])
      
      inline def `setDay-short`(value: DisplayName): Self = StObject.set(x, "day-short", value.asInstanceOf[js.Any])
      
      inline def setHour(value: DisplayName): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
      
      inline def `setHour-narrow`(value: DisplayName): Self = StObject.set(x, "hour-narrow", value.asInstanceOf[js.Any])
      
      inline def `setHour-short`(value: DisplayName): Self = StObject.set(x, "hour-short", value.asInstanceOf[js.Any])
      
      inline def setMinute(value: DisplayName): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
      
      inline def `setMinute-narrow`(value: DisplayName): Self = StObject.set(x, "minute-narrow", value.asInstanceOf[js.Any])
      
      inline def `setMinute-short`(value: DisplayName): Self = StObject.set(x, "minute-short", value.asInstanceOf[js.Any])
      
      inline def setMonth(value: DisplayName): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      inline def `setMonth-narrow`(value: DisplayName): Self = StObject.set(x, "month-narrow", value.asInstanceOf[js.Any])
      
      inline def `setMonth-short`(value: DisplayName): Self = StObject.set(x, "month-short", value.asInstanceOf[js.Any])
      
      inline def setQuarter(value: DisplayName): Self = StObject.set(x, "quarter", value.asInstanceOf[js.Any])
      
      inline def `setQuarter-narrow`(value: DisplayName): Self = StObject.set(x, "quarter-narrow", value.asInstanceOf[js.Any])
      
      inline def `setQuarter-short`(value: DisplayName): Self = StObject.set(x, "quarter-short", value.asInstanceOf[js.Any])
      
      inline def setSecond(value: DisplayName): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
      
      inline def `setSecond-narrow`(value: DisplayName): Self = StObject.set(x, "second-narrow", value.asInstanceOf[js.Any])
      
      inline def `setSecond-short`(value: DisplayName): Self = StObject.set(x, "second-short", value.asInstanceOf[js.Any])
      
      inline def setWeek(value: DisplayName): Self = StObject.set(x, "week", value.asInstanceOf[js.Any])
      
      inline def `setWeek-narrow`(value: DisplayName): Self = StObject.set(x, "week-narrow", value.asInstanceOf[js.Any])
      
      inline def `setWeek-short`(value: DisplayName): Self = StObject.set(x, "week-short", value.asInstanceOf[js.Any])
      
      inline def setYear(value: DisplayName): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
      
      inline def `setYear-narrow`(value: DisplayName): Self = StObject.set(x, "year-narrow", value.asInstanceOf[js.Any])
      
      inline def `setYear-short`(value: DisplayName): Self = StObject.set(x, "year-short", value.asInstanceOf[js.Any])
    }
  }
}
