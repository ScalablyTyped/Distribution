package typings.intlMessageformat

import typings.formatjsEcma402Abstract.typesNumberMod.NumberFormatOptions
import typings.formatjsIcuMessageformatParser.parserMod.ParserOptions
import typings.formatjsIcuMessageformatParser.typesMod.MessageFormatElement
import typings.intlMessageformat.intlMessageformatStrings.date
import typings.intlMessageformat.intlMessageformatStrings.number
import typings.intlMessageformat.intlMessageformatStrings.time
import typings.intlMessageformat.srcFormattersMod.Format
import typings.std.Intl.DateTimeFormat
import typings.std.Intl.DateTimeFormatOptions
import typings.std.Intl.PluralRules
import typings.std.Intl.PluralRulesOptions
import typings.std.Record
import typings.std.anon.LocaleMatcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(message: String): js.Array[MessageFormatElement] = js.native
    def apply(message: String, opts: ParserOptions): js.Array[MessageFormatElement] = js.native
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
  
  /* Inlined std.Partial<intl-messageformat.intl-messageformat/src/formatters.Formats> */
  trait PartialFormats extends StObject {
    
    var date: js.UndefOr[
        Record[
          Format[typings.intlMessageformat.intlMessageformatStrings.date], 
          DateTimeFormatOptions
        ]
      ] = js.undefined
    
    var number: js.UndefOr[
        Record[
          Format[typings.intlMessageformat.intlMessageformatStrings.number], 
          NumberFormatOptions
        ]
      ] = js.undefined
    
    var time: js.UndefOr[
        Record[
          Format[typings.intlMessageformat.intlMessageformatStrings.time], 
          DateTimeFormatOptions
        ]
      ] = js.undefined
  }
  object PartialFormats {
    
    inline def apply(): PartialFormats = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialFormats]
    }
    
    extension [Self <: PartialFormats](x: Self) {
      
      inline def setDate(value: Record[Format[date], DateTimeFormatOptions]): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      inline def setNumber(value: Record[Format[number], NumberFormatOptions]): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
      
      inline def setTime(value: Record[Format[time], DateTimeFormatOptions]): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    }
  }
  
  /* Inlined std.Partial<intl-messageformat.intl-messageformat/lib/src/formatters.Formats> */
  trait PartialFormatsDate extends StObject {
    
    var date: js.UndefOr[
        Record[
          typings.intlMessageformat.libSrcFormattersMod.Format[typings.intlMessageformat.intlMessageformatStrings.date], 
          DateTimeFormatOptions
        ]
      ] = js.undefined
    
    var number: js.UndefOr[
        Record[
          typings.intlMessageformat.libSrcFormattersMod.Format[typings.intlMessageformat.intlMessageformatStrings.number], 
          NumberFormatOptions
        ]
      ] = js.undefined
    
    var time: js.UndefOr[
        Record[
          typings.intlMessageformat.libSrcFormattersMod.Format[typings.intlMessageformat.intlMessageformatStrings.time], 
          DateTimeFormatOptions
        ]
      ] = js.undefined
  }
  object PartialFormatsDate {
    
    inline def apply(): PartialFormatsDate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialFormatsDate]
    }
    
    extension [Self <: PartialFormatsDate](x: Self) {
      
      inline def setDate(value: Record[typings.intlMessageformat.libSrcFormattersMod.Format[date], DateTimeFormatOptions]): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      inline def setNumber(value: Record[typings.intlMessageformat.libSrcFormattersMod.Format[number], NumberFormatOptions]): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
      
      inline def setTime(value: Record[typings.intlMessageformat.libSrcFormattersMod.Format[time], DateTimeFormatOptions]): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    }
  }
  
  @js.native
  trait TypeofDateTimeFormat extends StObject {
    
    /* standard es5 */
    def apply(): DateTimeFormat = js.native
    def apply(locales: String): DateTimeFormat = js.native
    def apply(locales: String, options: DateTimeFormatOptions): DateTimeFormat = js.native
    def apply(locales: js.Array[String]): DateTimeFormat = js.native
    def apply(locales: js.Array[String], options: DateTimeFormatOptions): DateTimeFormat = js.native
    def apply(locales: Unit, options: DateTimeFormatOptions): DateTimeFormat = js.native
    
    /* standard es5 */
    def supportedLocalesOf(locales: String): js.Array[String] = js.native
    def supportedLocalesOf(locales: String, options: DateTimeFormatOptions): js.Array[String] = js.native
    def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = js.native
    def supportedLocalesOf(locales: js.Array[String], options: DateTimeFormatOptions): js.Array[String] = js.native
  }
  
  @js.native
  trait TypeofPluralRules extends StObject {
    
    /* standard es2018.intl */
    def apply(): PluralRules = js.native
    def apply(locales: String): PluralRules = js.native
    def apply(locales: String, options: PluralRulesOptions): PluralRules = js.native
    def apply(locales: js.Array[String]): PluralRules = js.native
    def apply(locales: js.Array[String], options: PluralRulesOptions): PluralRules = js.native
    def apply(locales: Unit, options: PluralRulesOptions): PluralRules = js.native
    
    /* standard es2018.intl */
    def supportedLocalesOf(locales: String): js.Array[String] = js.native
    def supportedLocalesOf(locales: String, options: LocaleMatcher): js.Array[String] = js.native
    def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = js.native
    def supportedLocalesOf(locales: js.Array[String], options: LocaleMatcher): js.Array[String] = js.native
  }
}
