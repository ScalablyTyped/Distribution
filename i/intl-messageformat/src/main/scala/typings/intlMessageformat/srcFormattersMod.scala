package typings.intlMessageformat

import typings.intlMessageformat.anon.TypeofDateTimeFormat
import typings.intlMessageformat.anon.TypeofNumberFormat
import typings.intlMessageformat.anon.TypeofPluralRules
import typings.intlMessageformat.intlMessageformatNumbers.`0`
import typings.intlMessageformat.intlMessageformatNumbers.`1`
import typings.intlMessageformatParser.srcTypesMod.MessageFormatElement
import typings.std.ConstructorParameters
import typings.std.Date
import typings.std.Intl.DateTimeFormat
import typings.std.Intl.DateTimeFormatOptions
import typings.std.Intl.NumberFormat
import typings.std.Intl.NumberFormatOptions
import typings.std.Intl.PluralRules
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcFormattersMod {
  
  @JSImport("intl-messageformat/src/formatters", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatToParts[T](els: js.Array[MessageFormatElement], locales: String, formatters: Formatters, formats: Formats): js.Array[MessageFormatPart[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatToParts")(els.asInstanceOf[js.Any], locales.asInstanceOf[js.Any], formatters.asInstanceOf[js.Any], formats.asInstanceOf[js.Any])).asInstanceOf[js.Array[MessageFormatPart[T]]]
  inline def formatToParts[T](
    els: js.Array[MessageFormatElement],
    locales: String,
    formatters: Formatters,
    formats: Formats,
    values: Unit,
    currentPluralValue: Double
  ): js.Array[MessageFormatPart[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatToParts")(els.asInstanceOf[js.Any], locales.asInstanceOf[js.Any], formatters.asInstanceOf[js.Any], formats.asInstanceOf[js.Any], values.asInstanceOf[js.Any], currentPluralValue.asInstanceOf[js.Any])).asInstanceOf[js.Array[MessageFormatPart[T]]]
  inline def formatToParts[T](
    els: js.Array[MessageFormatElement],
    locales: String,
    formatters: Formatters,
    formats: Formats,
    values: Unit,
    currentPluralValue: Double,
    originalMessage: String
  ): js.Array[MessageFormatPart[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatToParts")(els.asInstanceOf[js.Any], locales.asInstanceOf[js.Any], formatters.asInstanceOf[js.Any], formats.asInstanceOf[js.Any], values.asInstanceOf[js.Any], currentPluralValue.asInstanceOf[js.Any], originalMessage.asInstanceOf[js.Any])).asInstanceOf[js.Array[MessageFormatPart[T]]]
  inline def formatToParts[T](
    els: js.Array[MessageFormatElement],
    locales: String,
    formatters: Formatters,
    formats: Formats,
    values: Unit,
    currentPluralValue: Unit,
    originalMessage: String
  ): js.Array[MessageFormatPart[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatToParts")(els.asInstanceOf[js.Any], locales.asInstanceOf[js.Any], formatters.asInstanceOf[js.Any], formats.asInstanceOf[js.Any], values.asInstanceOf[js.Any], currentPluralValue.asInstanceOf[js.Any], originalMessage.asInstanceOf[js.Any])).asInstanceOf[js.Array[MessageFormatPart[T]]]
  inline def formatToParts[T](
    els: js.Array[MessageFormatElement],
    locales: String,
    formatters: Formatters,
    formats: Formats,
    values: Record[
      String, 
      PrimitiveType | T | (FormatXMLElementFn[T, String | T | (js.Array[String | T])])
    ]
  ): js.Array[MessageFormatPart[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatToParts")(els.asInstanceOf[js.Any], locales.asInstanceOf[js.Any], formatters.asInstanceOf[js.Any], formats.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Array[MessageFormatPart[T]]]
  inline def formatToParts[T](
    els: js.Array[MessageFormatElement],
    locales: String,
    formatters: Formatters,
    formats: Formats,
    values: Record[
      String, 
      PrimitiveType | T | (FormatXMLElementFn[T, String | T | (js.Array[String | T])])
    ],
    currentPluralValue: Double
  ): js.Array[MessageFormatPart[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatToParts")(els.asInstanceOf[js.Any], locales.asInstanceOf[js.Any], formatters.asInstanceOf[js.Any], formats.asInstanceOf[js.Any], values.asInstanceOf[js.Any], currentPluralValue.asInstanceOf[js.Any])).asInstanceOf[js.Array[MessageFormatPart[T]]]
  inline def formatToParts[T](
    els: js.Array[MessageFormatElement],
    locales: String,
    formatters: Formatters,
    formats: Formats,
    values: Record[
      String, 
      PrimitiveType | T | (FormatXMLElementFn[T, String | T | (js.Array[String | T])])
    ],
    currentPluralValue: Double,
    originalMessage: String
  ): js.Array[MessageFormatPart[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatToParts")(els.asInstanceOf[js.Any], locales.asInstanceOf[js.Any], formatters.asInstanceOf[js.Any], formats.asInstanceOf[js.Any], values.asInstanceOf[js.Any], currentPluralValue.asInstanceOf[js.Any], originalMessage.asInstanceOf[js.Any])).asInstanceOf[js.Array[MessageFormatPart[T]]]
  inline def formatToParts[T](
    els: js.Array[MessageFormatElement],
    locales: String,
    formatters: Formatters,
    formats: Formats,
    values: Record[
      String, 
      PrimitiveType | T | (FormatXMLElementFn[T, String | T | (js.Array[String | T])])
    ],
    currentPluralValue: Unit,
    originalMessage: String
  ): js.Array[MessageFormatPart[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatToParts")(els.asInstanceOf[js.Any], locales.asInstanceOf[js.Any], formatters.asInstanceOf[js.Any], formats.asInstanceOf[js.Any], values.asInstanceOf[js.Any], currentPluralValue.asInstanceOf[js.Any], originalMessage.asInstanceOf[js.Any])).asInstanceOf[js.Array[MessageFormatPart[T]]]
  inline def formatToParts[T](
    els: js.Array[MessageFormatElement],
    locales: js.Array[String],
    formatters: Formatters,
    formats: Formats
  ): js.Array[MessageFormatPart[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatToParts")(els.asInstanceOf[js.Any], locales.asInstanceOf[js.Any], formatters.asInstanceOf[js.Any], formats.asInstanceOf[js.Any])).asInstanceOf[js.Array[MessageFormatPart[T]]]
  inline def formatToParts[T](
    els: js.Array[MessageFormatElement],
    locales: js.Array[String],
    formatters: Formatters,
    formats: Formats,
    values: Unit,
    currentPluralValue: Double
  ): js.Array[MessageFormatPart[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatToParts")(els.asInstanceOf[js.Any], locales.asInstanceOf[js.Any], formatters.asInstanceOf[js.Any], formats.asInstanceOf[js.Any], values.asInstanceOf[js.Any], currentPluralValue.asInstanceOf[js.Any])).asInstanceOf[js.Array[MessageFormatPart[T]]]
  inline def formatToParts[T](
    els: js.Array[MessageFormatElement],
    locales: js.Array[String],
    formatters: Formatters,
    formats: Formats,
    values: Unit,
    currentPluralValue: Double,
    originalMessage: String
  ): js.Array[MessageFormatPart[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatToParts")(els.asInstanceOf[js.Any], locales.asInstanceOf[js.Any], formatters.asInstanceOf[js.Any], formats.asInstanceOf[js.Any], values.asInstanceOf[js.Any], currentPluralValue.asInstanceOf[js.Any], originalMessage.asInstanceOf[js.Any])).asInstanceOf[js.Array[MessageFormatPart[T]]]
  inline def formatToParts[T](
    els: js.Array[MessageFormatElement],
    locales: js.Array[String],
    formatters: Formatters,
    formats: Formats,
    values: Unit,
    currentPluralValue: Unit,
    originalMessage: String
  ): js.Array[MessageFormatPart[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatToParts")(els.asInstanceOf[js.Any], locales.asInstanceOf[js.Any], formatters.asInstanceOf[js.Any], formats.asInstanceOf[js.Any], values.asInstanceOf[js.Any], currentPluralValue.asInstanceOf[js.Any], originalMessage.asInstanceOf[js.Any])).asInstanceOf[js.Array[MessageFormatPart[T]]]
  inline def formatToParts[T](
    els: js.Array[MessageFormatElement],
    locales: js.Array[String],
    formatters: Formatters,
    formats: Formats,
    values: Record[
      String, 
      PrimitiveType | T | (FormatXMLElementFn[T, String | T | (js.Array[String | T])])
    ]
  ): js.Array[MessageFormatPart[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatToParts")(els.asInstanceOf[js.Any], locales.asInstanceOf[js.Any], formatters.asInstanceOf[js.Any], formats.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Array[MessageFormatPart[T]]]
  inline def formatToParts[T](
    els: js.Array[MessageFormatElement],
    locales: js.Array[String],
    formatters: Formatters,
    formats: Formats,
    values: Record[
      String, 
      PrimitiveType | T | (FormatXMLElementFn[T, String | T | (js.Array[String | T])])
    ],
    currentPluralValue: Double
  ): js.Array[MessageFormatPart[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatToParts")(els.asInstanceOf[js.Any], locales.asInstanceOf[js.Any], formatters.asInstanceOf[js.Any], formats.asInstanceOf[js.Any], values.asInstanceOf[js.Any], currentPluralValue.asInstanceOf[js.Any])).asInstanceOf[js.Array[MessageFormatPart[T]]]
  inline def formatToParts[T](
    els: js.Array[MessageFormatElement],
    locales: js.Array[String],
    formatters: Formatters,
    formats: Formats,
    values: Record[
      String, 
      PrimitiveType | T | (FormatXMLElementFn[T, String | T | (js.Array[String | T])])
    ],
    currentPluralValue: Double,
    originalMessage: String
  ): js.Array[MessageFormatPart[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatToParts")(els.asInstanceOf[js.Any], locales.asInstanceOf[js.Any], formatters.asInstanceOf[js.Any], formats.asInstanceOf[js.Any], values.asInstanceOf[js.Any], currentPluralValue.asInstanceOf[js.Any], originalMessage.asInstanceOf[js.Any])).asInstanceOf[js.Array[MessageFormatPart[T]]]
  inline def formatToParts[T](
    els: js.Array[MessageFormatElement],
    locales: js.Array[String],
    formatters: Formatters,
    formats: Formats,
    values: Record[
      String, 
      PrimitiveType | T | (FormatXMLElementFn[T, String | T | (js.Array[String | T])])
    ],
    currentPluralValue: Unit,
    originalMessage: String
  ): js.Array[MessageFormatPart[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatToParts")(els.asInstanceOf[js.Any], locales.asInstanceOf[js.Any], formatters.asInstanceOf[js.Any], formats.asInstanceOf[js.Any], values.asInstanceOf[js.Any], currentPluralValue.asInstanceOf[js.Any], originalMessage.asInstanceOf[js.Any])).asInstanceOf[js.Array[MessageFormatPart[T]]]
  
  inline def isFormatXMLElementFn[T](el: PrimitiveType | T): /* is intl-messageformat.intl-messageformat/src/formatters.FormatXMLElementFn<T, string | T | std.Array<string | T>> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFormatXMLElementFn")(el.asInstanceOf[js.Any]).asInstanceOf[/* is intl-messageformat.intl-messageformat/src/formatters.FormatXMLElementFn<T, string | T | std.Array<string | T>> */ Boolean]
  inline def isFormatXMLElementFn[T](el: FormatXMLElementFn[T, String | T | (js.Array[String | T])]): /* is intl-messageformat.intl-messageformat/src/formatters.FormatXMLElementFn<T, string | T | std.Array<string | T>> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFormatXMLElementFn")(el.asInstanceOf[js.Any]).asInstanceOf[/* is intl-messageformat.intl-messageformat/src/formatters.FormatXMLElementFn<T, string | T | std.Array<string | T>> */ Boolean]
  
  type FormatXMLElementFn[T, R] = js.Function1[/* parts */ js.Array[String | T], R]
  
  trait Formats extends StObject {
    
    var date: Record[String, DateTimeFormatOptions]
    
    var number: Record[String, NumberFormatOptions]
    
    var time: Record[String, DateTimeFormatOptions]
  }
  object Formats {
    
    inline def apply(
      date: Record[String, DateTimeFormatOptions],
      number: Record[String, NumberFormatOptions],
      time: Record[String, DateTimeFormatOptions]
    ): Formats = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
      __obj.asInstanceOf[Formats]
    }
    
    extension [Self <: Formats](x: Self) {
      
      inline def setDate(value: Record[String, DateTimeFormatOptions]): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setNumber(value: Record[String, NumberFormatOptions]): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setTime(value: Record[String, DateTimeFormatOptions]): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    }
  }
  
  trait FormatterCache extends StObject {
    
    var dateTime: Record[String, DateTimeFormat]
    
    var number: Record[String, NumberFormat]
    
    var pluralRules: Record[String, PluralRules]
  }
  object FormatterCache {
    
    inline def apply(
      dateTime: Record[String, DateTimeFormat],
      number: Record[String, NumberFormat],
      pluralRules: Record[String, PluralRules]
    ): FormatterCache = {
      val __obj = js.Dynamic.literal(dateTime = dateTime.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], pluralRules = pluralRules.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormatterCache]
    }
    
    extension [Self <: FormatterCache](x: Self) {
      
      inline def setDateTime(value: Record[String, DateTimeFormat]): Self = StObject.set(x, "dateTime", value.asInstanceOf[js.Any])
      
      inline def setNumber(value: Record[String, NumberFormat]): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setPluralRules(value: Record[String, PluralRules]): Self = StObject.set(x, "pluralRules", value.asInstanceOf[js.Any])
    }
  }
  
  trait Formatters extends StObject {
    
    def getDateTimeFormat(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof Intl.DateTimeFormat> is not an array type */ args: ConstructorParameters[TypeofDateTimeFormat]
    ): DateTimeFormat
    
    def getNumberFormat(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof Intl.NumberFormat> is not an array type */ args: ConstructorParameters[TypeofNumberFormat]
    ): NumberFormat
    
    def getPluralRules(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ConstructorParameters<typeof Intl.PluralRules> is not an array type */ args: ConstructorParameters[TypeofPluralRules]
    ): PluralRules
  }
  object Formatters {
    
    inline def apply(
      getDateTimeFormat: ConstructorParameters[TypeofDateTimeFormat] => DateTimeFormat,
      getNumberFormat: ConstructorParameters[TypeofNumberFormat] => NumberFormat,
      getPluralRules: ConstructorParameters[TypeofPluralRules] => PluralRules
    ): Formatters = {
      val __obj = js.Dynamic.literal(getDateTimeFormat = js.Any.fromFunction1(getDateTimeFormat), getNumberFormat = js.Any.fromFunction1(getNumberFormat), getPluralRules = js.Any.fromFunction1(getPluralRules))
      __obj.asInstanceOf[Formatters]
    }
    
    extension [Self <: Formatters](x: Self) {
      
      inline def setGetDateTimeFormat(value: ConstructorParameters[TypeofDateTimeFormat] => DateTimeFormat): Self = StObject.set(x, "getDateTimeFormat", js.Any.fromFunction1(value))
      
      inline def setGetNumberFormat(value: ConstructorParameters[TypeofNumberFormat] => NumberFormat): Self = StObject.set(x, "getNumberFormat", js.Any.fromFunction1(value))
      
      inline def setGetPluralRules(value: ConstructorParameters[TypeofPluralRules] => PluralRules): Self = StObject.set(x, "getPluralRules", js.Any.fromFunction1(value))
    }
  }
  
  trait LiteralPart
    extends StObject
       with MessageFormatPart[js.Any] {
    
    var `type`: `0`
    
    var value: String
  }
  object LiteralPart {
    
    inline def apply(value: String): LiteralPart = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(0)
      __obj.asInstanceOf[LiteralPart]
    }
    
    extension [Self <: LiteralPart](x: Self) {
      
      inline def setType(value: `0`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.intlMessageformat.srcFormattersMod.LiteralPart
    - typings.intlMessageformat.srcFormattersMod.ObjectPart[T]
  */
  trait MessageFormatPart[T] extends StObject
  object MessageFormatPart {
    
    inline def LiteralPart(value: String): typings.intlMessageformat.srcFormattersMod.LiteralPart = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(0)
      __obj.asInstanceOf[typings.intlMessageformat.srcFormattersMod.LiteralPart]
    }
    
    inline def ObjectPart[T](value: T): typings.intlMessageformat.srcFormattersMod.ObjectPart[T] = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(1)
      __obj.asInstanceOf[typings.intlMessageformat.srcFormattersMod.ObjectPart[T]]
    }
  }
  
  trait ObjectPart[T]
    extends StObject
       with MessageFormatPart[T] {
    
    var `type`: `1`
    
    var value: T
  }
  object ObjectPart {
    
    inline def apply[T](value: T): ObjectPart[T] = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(1)
      __obj.asInstanceOf[ObjectPart[T]]
    }
    
    extension [Self <: ObjectPart[?], T](x: Self & ObjectPart[T]) {
      
      inline def setType(value: `1`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.intlMessageformat.intlMessageformatNumbers.`0`
    - typings.intlMessageformat.intlMessageformatNumbers.`1`
  */
  trait PART_TYPE extends StObject
  object PART_TYPE {
    
    inline def literal: `0` = 0.asInstanceOf[`0`]
    
    inline def `object`: `1` = 1.asInstanceOf[`1`]
  }
  
  type PrimitiveType = js.UndefOr[String | Double | Boolean | Null | Date]
}
