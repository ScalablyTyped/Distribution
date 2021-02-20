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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Currency extends StObject {
    
    var currency: Style = js.native
    
    var percent: Style = js.native
  }
  object Currency {
    
    @scala.inline
    def apply(currency: Style, percent: Style): Currency = {
      val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any])
      __obj.asInstanceOf[Currency]
    }
    
    @scala.inline
    implicit class CurrencyMutableBuilder[Self <: Currency] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrency(value: Style): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPercent(value: Style): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Date extends StObject {
    
    var date: Full = js.native
    
    var number: Currency = js.native
    
    var time: Long = js.native
  }
  object Date {
    
    @scala.inline
    def apply(date: Full, number: Currency, time: Long): Date = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
      __obj.asInstanceOf[Date]
    }
    
    @scala.inline
    implicit class DateMutableBuilder[Self <: Date] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDate(value: Full): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumber(value: Currency): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTime(value: Long): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Day extends StObject {
    
    var day: String = js.native
    
    var month: String = js.native
    
    var year: String = js.native
  }
  object Day {
    
    @scala.inline
    def apply(day: String, month: String, year: String): Day = {
      val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
      __obj.asInstanceOf[Day]
    }
    
    @scala.inline
    implicit class DayMutableBuilder[Self <: Day] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDay(value: String): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonth(value: String): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYear(value: String): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(input: String): js.Array[MessageFormatElement] = js.native
    def apply(input: String, opts: ParseOptions): js.Array[MessageFormatElement] = js.native
  }
  
  @js.native
  trait Full extends StObject {
    
    var full: Month = js.native
    
    var long: Day = js.native
    
    var medium: Day = js.native
    
    var short: Day = js.native
  }
  object Full {
    
    @scala.inline
    def apply(full: Month, long: Day, medium: Day, short: Day): Full = {
      val __obj = js.Dynamic.literal(full = full.asInstanceOf[js.Any], long = long.asInstanceOf[js.Any], medium = medium.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
      __obj.asInstanceOf[Full]
    }
    
    @scala.inline
    implicit class FullMutableBuilder[Self <: Full] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFull(value: Month): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLong(value: Day): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMedium(value: Day): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShort(value: Day): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Hour extends StObject {
    
    var hour: String = js.native
    
    var minute: String = js.native
  }
  object Hour {
    
    @scala.inline
    def apply(hour: String, minute: String): Hour = {
      val __obj = js.Dynamic.literal(hour = hour.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hour]
    }
    
    @scala.inline
    implicit class HourMutableBuilder[Self <: Hour] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHour(value: String): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinute(value: String): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Locale extends StObject {
    
    var locale: String = js.native
  }
  object Locale {
    
    @scala.inline
    def apply(locale: String): Locale = {
      val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
      __obj.asInstanceOf[Locale]
    }
    
    @scala.inline
    implicit class LocaleMutableBuilder[Self <: Locale] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Long extends StObject {
    
    var full: Second = js.native
    
    var long: Second = js.native
    
    var medium: Minute = js.native
    
    var short: Hour = js.native
  }
  object Long {
    
    @scala.inline
    def apply(full: Second, long: Second, medium: Minute, short: Hour): Long = {
      val __obj = js.Dynamic.literal(full = full.asInstanceOf[js.Any], long = long.asInstanceOf[js.Any], medium = medium.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
      __obj.asInstanceOf[Long]
    }
    
    @scala.inline
    implicit class LongMutableBuilder[Self <: Long] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFull(value: Second): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLong(value: Second): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMedium(value: Minute): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShort(value: Hour): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Minute extends StObject {
    
    var hour: String = js.native
    
    var minute: String = js.native
    
    var second: String = js.native
  }
  object Minute {
    
    @scala.inline
    def apply(hour: String, minute: String, second: String): Minute = {
      val __obj = js.Dynamic.literal(hour = hour.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any])
      __obj.asInstanceOf[Minute]
    }
    
    @scala.inline
    implicit class MinuteMutableBuilder[Self <: Minute] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHour(value: String): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinute(value: String): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecond(value: String): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Month extends StObject {
    
    var day: String = js.native
    
    var month: String = js.native
    
    var weekday: String = js.native
    
    var year: String = js.native
  }
  object Month {
    
    @scala.inline
    def apply(day: String, month: String, weekday: String, year: String): Month = {
      val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], weekday = weekday.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
      __obj.asInstanceOf[Month]
    }
    
    @scala.inline
    implicit class MonthMutableBuilder[Self <: Month] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDay(value: String): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonth(value: String): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeekday(value: String): Self = StObject.set(x, "weekday", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYear(value: String): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<intl-messageformat.intl-messageformat/src/formatters.Formats> */
  @js.native
  trait PartialFormats extends StObject {
    
    var date: js.UndefOr[Record[String, DateTimeFormatOptions]] = js.native
    
    var number: js.UndefOr[Record[String, NumberFormatOptions]] = js.native
    
    var time: js.UndefOr[Record[String, DateTimeFormatOptions]] = js.native
  }
  object PartialFormats {
    
    @scala.inline
    def apply(): PartialFormats = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialFormats]
    }
    
    @scala.inline
    implicit class PartialFormatsMutableBuilder[Self <: PartialFormats] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDate(value: Record[String, DateTimeFormatOptions]): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      @scala.inline
      def setNumber(value: Record[String, NumberFormatOptions]): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
      
      @scala.inline
      def setTime(value: Record[String, DateTimeFormatOptions]): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    }
  }
  
  @js.native
  trait Second extends StObject {
    
    var hour: String = js.native
    
    var minute: String = js.native
    
    var second: String = js.native
    
    var timeZoneName: String = js.native
  }
  object Second {
    
    @scala.inline
    def apply(hour: String, minute: String, second: String, timeZoneName: String): Second = {
      val __obj = js.Dynamic.literal(hour = hour.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any], timeZoneName = timeZoneName.asInstanceOf[js.Any])
      __obj.asInstanceOf[Second]
    }
    
    @scala.inline
    implicit class SecondMutableBuilder[Self <: Second] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHour(value: String): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinute(value: String): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecond(value: String): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeZoneName(value: String): Self = StObject.set(x, "timeZoneName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Style extends StObject {
    
    var style: String = js.native
  }
  object Style {
    
    @scala.inline
    def apply(style: String): Style = {
      val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[Style]
    }
    
    @scala.inline
    implicit class StyleMutableBuilder[Self <: Style] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofDateTimeFormat extends StObject {
    
    def apply(): DateTimeFormat = js.native
    def apply(locales: js.UndefOr[scala.Nothing], options: DateTimeFormatOptions): DateTimeFormat = js.native
    def apply(locales: String): DateTimeFormat = js.native
    def apply(locales: String, options: DateTimeFormatOptions): DateTimeFormat = js.native
    def apply(locales: js.Array[String]): DateTimeFormat = js.native
    def apply(locales: js.Array[String], options: DateTimeFormatOptions): DateTimeFormat = js.native
    
    def supportedLocalesOf(locales: String): js.Array[String] = js.native
    def supportedLocalesOf(locales: String, options: DateTimeFormatOptions): js.Array[String] = js.native
    def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = js.native
    def supportedLocalesOf(locales: js.Array[String], options: DateTimeFormatOptions): js.Array[String] = js.native
  }
  
  @js.native
  trait TypeofNumberFormat extends StObject {
    
    def apply(): NumberFormat = js.native
    def apply(locales: js.UndefOr[scala.Nothing], options: NumberFormatOptions): NumberFormat = js.native
    def apply(locales: String): NumberFormat = js.native
    def apply(locales: String, options: NumberFormatOptions): NumberFormat = js.native
    def apply(locales: js.Array[String]): NumberFormat = js.native
    def apply(locales: js.Array[String], options: NumberFormatOptions): NumberFormat = js.native
    
    def supportedLocalesOf(locales: String): js.Array[String] = js.native
    def supportedLocalesOf(locales: String, options: NumberFormatOptions): js.Array[String] = js.native
    def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = js.native
    def supportedLocalesOf(locales: js.Array[String], options: NumberFormatOptions): js.Array[String] = js.native
  }
  
  @js.native
  trait TypeofPluralRules extends StObject {
    
    def apply(): PluralRules = js.native
    def apply(locales: js.UndefOr[scala.Nothing], options: PluralRulesOptions): PluralRules = js.native
    def apply(locales: String): PluralRules = js.native
    def apply(locales: String, options: PluralRulesOptions): PluralRules = js.native
    def apply(locales: js.Array[String]): PluralRules = js.native
    def apply(locales: js.Array[String], options: PluralRulesOptions): PluralRules = js.native
    
    def supportedLocalesOf(locales: String): js.Array[String] = js.native
    def supportedLocalesOf(locales: String, options: PluralRulesOptions): js.Array[String] = js.native
    def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = js.native
    def supportedLocalesOf(locales: js.Array[String], options: PluralRulesOptions): js.Array[String] = js.native
  }
}
