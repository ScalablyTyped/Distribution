package typings.ionicCore

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datetimeUtilMod {
  
  @JSImport("@ionic/core/dist/types/components/datetime/datetime-util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convertDataToISO(data: DatetimeData): String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertDataToISO")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def convertFormatToKey(format: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertFormatToKey")(format.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  inline def convertToArrayOfNumbers(input: String, `type`: String): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertToArrayOfNumbers")(input.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def convertToArrayOfNumbers(input: js.Array[js.Any], `type`: String): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertToArrayOfNumbers")(input.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def convertToArrayOfNumbers(input: Double, `type`: String): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertToArrayOfNumbers")(input.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def convertToArrayOfStrings(input: String, `type`: String): js.UndefOr[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertToArrayOfStrings")(input.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[String]]]
  inline def convertToArrayOfStrings(input: js.Array[String], `type`: String): js.UndefOr[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertToArrayOfStrings")(input.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[String]]]
  inline def convertToArrayOfStrings(input: Null, `type`: String): js.UndefOr[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertToArrayOfStrings")(input.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[String]]]
  inline def convertToArrayOfStrings(input: Unit, `type`: String): js.UndefOr[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertToArrayOfStrings")(input.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[String]]]
  
  inline def dateDataSortValue(data: DatetimeData): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("dateDataSortValue")(data.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def dateSortValue(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("dateSortValue")().asInstanceOf[Double]
  inline def dateSortValue(year: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("dateSortValue")(year.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def dateSortValue(year: Double, month: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dateSortValue")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def dateSortValue(year: Double, month: Double, day: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dateSortValue")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def dateSortValue(year: Double, month: Double, day: Double, hour: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dateSortValue")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any], hour.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def dateSortValue(year: Double, month: Double, day: Double, hour: Double, minute: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dateSortValue")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def dateSortValue(year: Double, month: Double, day: Double, hour: Unit, minute: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dateSortValue")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def dateSortValue(year: Double, month: Double, day: Unit, hour: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dateSortValue")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any], hour.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def dateSortValue(year: Double, month: Double, day: Unit, hour: Double, minute: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dateSortValue")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def dateSortValue(year: Double, month: Double, day: Unit, hour: Unit, minute: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dateSortValue")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def dateSortValue(year: Double, month: Unit, day: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dateSortValue")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def dateSortValue(year: Double, month: Unit, day: Double, hour: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dateSortValue")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any], hour.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def dateSortValue(year: Double, month: Unit, day: Double, hour: Double, minute: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dateSortValue")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def dateSortValue(year: Double, month: Unit, day: Double, hour: Unit, minute: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dateSortValue")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def dateSortValue(year: Double, month: Unit, day: Unit, hour: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dateSortValue")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any], hour.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def dateSortValue(year: Double, month: Unit, day: Unit, hour: Double, minute: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dateSortValue")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def dateSortValue(year: Double, month: Unit, day: Unit, hour: Unit, minute: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dateSortValue")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def dateSortValue(year: Unit, month: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dateSortValue")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def dateSortValue(year: Unit, month: Double, day: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dateSortValue")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def dateSortValue(year: Unit, month: Double, day: Double, hour: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dateSortValue")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any], hour.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def dateSortValue(year: Unit, month: Double, day: Double, hour: Double, minute: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dateSortValue")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def dateSortValue(year: Unit, month: Double, day: Double, hour: Unit, minute: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dateSortValue")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def dateSortValue(year: Unit, month: Double, day: Unit, hour: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dateSortValue")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any], hour.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def dateSortValue(year: Unit, month: Double, day: Unit, hour: Double, minute: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dateSortValue")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def dateSortValue(year: Unit, month: Double, day: Unit, hour: Unit, minute: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dateSortValue")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def dateSortValue(year: Unit, month: Unit, day: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dateSortValue")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def dateSortValue(year: Unit, month: Unit, day: Double, hour: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dateSortValue")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any], hour.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def dateSortValue(year: Unit, month: Unit, day: Double, hour: Double, minute: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dateSortValue")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def dateSortValue(year: Unit, month: Unit, day: Double, hour: Unit, minute: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dateSortValue")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def dateSortValue(year: Unit, month: Unit, day: Unit, hour: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dateSortValue")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any], hour.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def dateSortValue(year: Unit, month: Unit, day: Unit, hour: Double, minute: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dateSortValue")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def dateSortValue(year: Unit, month: Unit, day: Unit, hour: Unit, minute: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dateSortValue")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def dateValueRange(format: String, min: DatetimeData, max: DatetimeData): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("dateValueRange")(format.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  
  inline def daysInMonth(month: Double, year: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("daysInMonth")(month.asInstanceOf[js.Any], year.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getDateTime(): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getDateTime")().asInstanceOf[Date]
  inline def getDateTime(dateString: js.Any): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("getDateTime")(dateString.asInstanceOf[js.Any]).asInstanceOf[Date]
  inline def getDateTime(dateString: js.Any, timeZone: js.Any): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("getDateTime")(dateString.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any])).asInstanceOf[Date]
  inline def getDateTime(dateString: Unit, timeZone: js.Any): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("getDateTime")(dateString.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  inline def getDateValue(date: DatetimeData, format: String): Double | String = (^.asInstanceOf[js.Dynamic].applyDynamic("getDateValue")(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Double | String]
  
  inline def getTimezoneOffset(localDate: Date, timeZone: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getTimezoneOffset")(localDate.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getValueFromFormat(date: DatetimeData, format: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getValueFromFormat")(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def isLeapYear(year: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLeapYear")(year.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def parseDate(): js.UndefOr[DatetimeData] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseDate")().asInstanceOf[js.UndefOr[DatetimeData]]
  inline def parseDate(`val`: String): js.UndefOr[DatetimeData] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseDate")(`val`.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[DatetimeData]]
  
  inline def parseTemplate(template: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseTemplate")(template.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def renderDatetime(template: String, value: Unit, locale: LocaleData): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderDatetime")(template.asInstanceOf[js.Any], value.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  inline def renderDatetime(template: String, value: DatetimeData, locale: LocaleData): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderDatetime")(template.asInstanceOf[js.Any], value.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  inline def renderTextFormat(format: String, value: js.Any, date: Unit, locale: LocaleData): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderTextFormat")(format.asInstanceOf[js.Any], value.asInstanceOf[js.Any], date.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  inline def renderTextFormat(format: String, value: js.Any, date: DatetimeData, locale: LocaleData): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderTextFormat")(format.asInstanceOf[js.Any], value.asInstanceOf[js.Any], date.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  inline def updateDate(existingData: DatetimeData, newData: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("updateDate")(existingData.asInstanceOf[js.Any], newData.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def updateDate(existingData: DatetimeData, newData: js.Any, displayTimezone: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("updateDate")(existingData.asInstanceOf[js.Any], newData.asInstanceOf[js.Any], displayTimezone.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait DatetimeData extends StObject {
    
    var ampm: js.UndefOr[String] = js.undefined
    
    var day: js.UndefOr[Double] = js.undefined
    
    var hour: js.UndefOr[Double] = js.undefined
    
    var millisecond: js.UndefOr[Double] = js.undefined
    
    var minute: js.UndefOr[Double] = js.undefined
    
    var month: js.UndefOr[Double] = js.undefined
    
    var second: js.UndefOr[Double] = js.undefined
    
    var tzOffset: js.UndefOr[Double] = js.undefined
    
    var year: js.UndefOr[Double] = js.undefined
  }
  object DatetimeData {
    
    inline def apply(): DatetimeData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DatetimeData]
    }
    
    extension [Self <: DatetimeData](x: Self) {
      
      inline def setAmpm(value: String): Self = StObject.set(x, "ampm", value.asInstanceOf[js.Any])
      
      inline def setAmpmUndefined: Self = StObject.set(x, "ampm", js.undefined)
      
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
      
      inline def setSecond(value: Double): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
      
      inline def setSecondUndefined: Self = StObject.set(x, "second", js.undefined)
      
      inline def setTzOffset(value: Double): Self = StObject.set(x, "tzOffset", value.asInstanceOf[js.Any])
      
      inline def setTzOffsetUndefined: Self = StObject.set(x, "tzOffset", js.undefined)
      
      inline def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
      
      inline def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
    }
  }
  
  trait LocaleData extends StObject {
    
    var dayNames: js.UndefOr[js.Array[String]] = js.undefined
    
    var dayShortNames: js.UndefOr[js.Array[String]] = js.undefined
    
    var monthNames: js.UndefOr[js.Array[String]] = js.undefined
    
    var monthShortNames: js.UndefOr[js.Array[String]] = js.undefined
  }
  object LocaleData {
    
    inline def apply(): LocaleData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LocaleData]
    }
    
    extension [Self <: LocaleData](x: Self) {
      
      inline def setDayNames(value: js.Array[String]): Self = StObject.set(x, "dayNames", value.asInstanceOf[js.Any])
      
      inline def setDayNamesUndefined: Self = StObject.set(x, "dayNames", js.undefined)
      
      inline def setDayNamesVarargs(value: String*): Self = StObject.set(x, "dayNames", js.Array(value :_*))
      
      inline def setDayShortNames(value: js.Array[String]): Self = StObject.set(x, "dayShortNames", value.asInstanceOf[js.Any])
      
      inline def setDayShortNamesUndefined: Self = StObject.set(x, "dayShortNames", js.undefined)
      
      inline def setDayShortNamesVarargs(value: String*): Self = StObject.set(x, "dayShortNames", js.Array(value :_*))
      
      inline def setMonthNames(value: js.Array[String]): Self = StObject.set(x, "monthNames", value.asInstanceOf[js.Any])
      
      inline def setMonthNamesUndefined: Self = StObject.set(x, "monthNames", js.undefined)
      
      inline def setMonthNamesVarargs(value: String*): Self = StObject.set(x, "monthNames", js.Array(value :_*))
      
      inline def setMonthShortNames(value: js.Array[String]): Self = StObject.set(x, "monthShortNames", value.asInstanceOf[js.Any])
      
      inline def setMonthShortNamesUndefined: Self = StObject.set(x, "monthShortNames", js.undefined)
      
      inline def setMonthShortNamesVarargs(value: String*): Self = StObject.set(x, "monthShortNames", js.Array(value :_*))
    }
  }
}
