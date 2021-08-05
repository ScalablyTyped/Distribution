package typings.intlMessageformat

import typings.intlMessageformatParser.mod.ParseOptions
import typings.intlMessageformatParser.srcTypesMod.MessageFormatElement
import typings.std.Intl.DateTimeFormat
import typings.std.Intl.DateTimeFormatOptions
import typings.std.Intl.NumberFormat
import typings.std.Intl.NumberFormatOptions
import typings.std.Intl.PluralRules
import typings.std.Intl.PluralRulesOptions
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Currency extends StObject {
    
    var currency: Style
    
    var percent: Style
  }
  object Currency {
    
    inline def apply(currency: Style, percent: Style): Currency = {
      val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any])
      __obj.asInstanceOf[Currency]
    }
    
    extension [Self <: Currency](x: Self) {
      
      inline def setCurrency(value: Style): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      inline def setPercent(value: Style): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
    }
  }
  
  trait Date extends StObject {
    
    var date: Full
    
    var number: Currency
    
    var time: Long
  }
  object Date {
    
    inline def apply(date: Full, number: Currency, time: Long): Date = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
      __obj.asInstanceOf[Date]
    }
    
    extension [Self <: Date](x: Self) {
      
      inline def setDate(value: Full): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setNumber(value: Currency): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setTime(value: Long): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    }
  }
  
  trait Day extends StObject {
    
    var day: String
    
    var month: String
    
    var year: String
  }
  object Day {
    
    inline def apply(day: String, month: String, year: String): Day = {
      val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
      __obj.asInstanceOf[Day]
    }
    
    extension [Self <: Day](x: Self) {
      
      inline def setDay(value: String): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
      
      inline def setMonth(value: String): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      inline def setYear(value: String): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(input: String): js.Array[MessageFormatElement] = js.native
    def apply(input: String, opts: ParseOptions): js.Array[MessageFormatElement] = js.native
  }
  
  trait Full extends StObject {
    
    var full: Month
    
    var long: Day
    
    var medium: Day
    
    var short: Day
  }
  object Full {
    
    inline def apply(full: Month, long: Day, medium: Day, short: Day): Full = {
      val __obj = js.Dynamic.literal(full = full.asInstanceOf[js.Any], long = long.asInstanceOf[js.Any], medium = medium.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
      __obj.asInstanceOf[Full]
    }
    
    extension [Self <: Full](x: Self) {
      
      inline def setFull(value: Month): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
      
      inline def setLong(value: Day): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
      
      inline def setMedium(value: Day): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
      
      inline def setShort(value: Day): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
    }
  }
  
  trait Hour extends StObject {
    
    var hour: String
    
    var minute: String
  }
  object Hour {
    
    inline def apply(hour: String, minute: String): Hour = {
      val __obj = js.Dynamic.literal(hour = hour.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hour]
    }
    
    extension [Self <: Hour](x: Self) {
      
      inline def setHour(value: String): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
      
      inline def setMinute(value: String): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
    }
  }
  
  trait Locale extends StObject {
    
    var locale: String
  }
  object Locale {
    
    inline def apply(locale: String): Locale = {
      val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
      __obj.asInstanceOf[Locale]
    }
    
    extension [Self <: Locale](x: Self) {
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    }
  }
  
  trait Long extends StObject {
    
    var full: Second
    
    var long: Second
    
    var medium: Minute
    
    var short: Hour
  }
  object Long {
    
    inline def apply(full: Second, long: Second, medium: Minute, short: Hour): Long = {
      val __obj = js.Dynamic.literal(full = full.asInstanceOf[js.Any], long = long.asInstanceOf[js.Any], medium = medium.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
      __obj.asInstanceOf[Long]
    }
    
    extension [Self <: Long](x: Self) {
      
      inline def setFull(value: Second): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
      
      inline def setLong(value: Second): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
      
      inline def setMedium(value: Minute): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
      
      inline def setShort(value: Hour): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
    }
  }
  
  trait Minute extends StObject {
    
    var hour: String
    
    var minute: String
    
    var second: String
  }
  object Minute {
    
    inline def apply(hour: String, minute: String, second: String): Minute = {
      val __obj = js.Dynamic.literal(hour = hour.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any])
      __obj.asInstanceOf[Minute]
    }
    
    extension [Self <: Minute](x: Self) {
      
      inline def setHour(value: String): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
      
      inline def setMinute(value: String): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
      
      inline def setSecond(value: String): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
    }
  }
  
  trait Month extends StObject {
    
    var day: String
    
    var month: String
    
    var weekday: String
    
    var year: String
  }
  object Month {
    
    inline def apply(day: String, month: String, weekday: String, year: String): Month = {
      val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], weekday = weekday.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
      __obj.asInstanceOf[Month]
    }
    
    extension [Self <: Month](x: Self) {
      
      inline def setDay(value: String): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
      
      inline def setMonth(value: String): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      inline def setWeekday(value: String): Self = StObject.set(x, "weekday", value.asInstanceOf[js.Any])
      
      inline def setYear(value: String): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<intl-messageformat.intl-messageformat/src/formatters.Formats> */
  trait PartialFormats extends StObject {
    
    var date: js.UndefOr[Record[String, DateTimeFormatOptions]] = js.undefined
    
    var number: js.UndefOr[Record[String, NumberFormatOptions]] = js.undefined
    
    var time: js.UndefOr[Record[String, DateTimeFormatOptions]] = js.undefined
  }
  object PartialFormats {
    
    inline def apply(): PartialFormats = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialFormats]
    }
    
    extension [Self <: PartialFormats](x: Self) {
      
      inline def setDate(value: Record[String, DateTimeFormatOptions]): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      inline def setNumber(value: Record[String, NumberFormatOptions]): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
      
      inline def setTime(value: Record[String, DateTimeFormatOptions]): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    }
  }
  
  trait Second extends StObject {
    
    var hour: String
    
    var minute: String
    
    var second: String
    
    var timeZoneName: String
  }
  object Second {
    
    inline def apply(hour: String, minute: String, second: String, timeZoneName: String): Second = {
      val __obj = js.Dynamic.literal(hour = hour.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any], timeZoneName = timeZoneName.asInstanceOf[js.Any])
      __obj.asInstanceOf[Second]
    }
    
    extension [Self <: Second](x: Self) {
      
      inline def setHour(value: String): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
      
      inline def setMinute(value: String): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
      
      inline def setSecond(value: String): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
      
      inline def setTimeZoneName(value: String): Self = StObject.set(x, "timeZoneName", value.asInstanceOf[js.Any])
    }
  }
  
  trait Style extends StObject {
    
    var style: String
  }
  object Style {
    
    inline def apply(style: String): Style = {
      val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[Style]
    }
    
    extension [Self <: Style](x: Self) {
      
      inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofDateTimeFormat extends StObject {
    
    def apply(): DateTimeFormat = js.native
    def apply(locales: String): DateTimeFormat = js.native
    def apply(locales: String, options: DateTimeFormatOptions): DateTimeFormat = js.native
    def apply(locales: js.Array[String]): DateTimeFormat = js.native
    def apply(locales: js.Array[String], options: DateTimeFormatOptions): DateTimeFormat = js.native
    def apply(locales: Unit, options: DateTimeFormatOptions): DateTimeFormat = js.native
    
    def supportedLocalesOf(locales: String): js.Array[String] = js.native
    def supportedLocalesOf(locales: String, options: DateTimeFormatOptions): js.Array[String] = js.native
    def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = js.native
    def supportedLocalesOf(locales: js.Array[String], options: DateTimeFormatOptions): js.Array[String] = js.native
  }
  
  @js.native
  trait TypeofNumberFormat extends StObject {
    
    def apply(): NumberFormat = js.native
    def apply(locales: String): NumberFormat = js.native
    def apply(locales: String, options: NumberFormatOptions): NumberFormat = js.native
    def apply(locales: js.Array[String]): NumberFormat = js.native
    def apply(locales: js.Array[String], options: NumberFormatOptions): NumberFormat = js.native
    def apply(locales: Unit, options: NumberFormatOptions): NumberFormat = js.native
    
    def supportedLocalesOf(locales: String): js.Array[String] = js.native
    def supportedLocalesOf(locales: String, options: NumberFormatOptions): js.Array[String] = js.native
    def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = js.native
    def supportedLocalesOf(locales: js.Array[String], options: NumberFormatOptions): js.Array[String] = js.native
  }
  
  @js.native
  trait TypeofPluralRules extends StObject {
    
    def apply(): PluralRules = js.native
    def apply(locales: String): PluralRules = js.native
    def apply(locales: String, options: PluralRulesOptions): PluralRules = js.native
    def apply(locales: js.Array[String]): PluralRules = js.native
    def apply(locales: js.Array[String], options: PluralRulesOptions): PluralRules = js.native
    def apply(locales: Unit, options: PluralRulesOptions): PluralRules = js.native
    
    def supportedLocalesOf(locales: String): js.Array[String] = js.native
    def supportedLocalesOf(locales: String, options: PluralRulesOptions): js.Array[String] = js.native
    def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = js.native
    def supportedLocalesOf(locales: js.Array[String], options: PluralRulesOptions): js.Array[String] = js.native
  }
}
