package typings.intlifyCoreBase.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.intlifyCoreBase.anon.Number
import typings.intlifyCoreBase.intlifyCoreBaseBooleans.`false`
import typings.intlifyCoreBase.intlifyCoreBaseBooleans.`true`
import typings.intlifyCoreBase.intlifyCoreBaseInts.`15`
import typings.intlifyCoreBase.intlifyCoreBaseStrings.`en-US`
import typings.intlifyCoreBase.intlifyCoreBaseStrings.toString
import typings.intlifyCoreBase.mod.^
import typings.intlifyDevtoolsIf.mod.IntlifyDevToolsEmitter
import typings.intlifyMessageCompiler.mod.CompileError
import typings.intlifyMessageCompiler.mod.CompileOptions
import typings.intlifyMessageCompiler.mod.CreateCompileErrorOptions
import typings.intlifyMessageCompiler.mod.SourceLocation
import typings.std.Extract
import typings.std.Intl.DateTimeFormatPart
import typings.std.Intl.NumberFormatPart
import typings.std.NonNullable
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type CoreErrorCodes = `15` | Double

inline def DEFAULT_LOCALE: /* "en-US" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("DEFAULT_LOCALE").asInstanceOf[/* "en-US" */ String]

inline def DEFAULT_MESSAGE_DATA_TYPE: /* "text" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("DEFAULT_MESSAGE_DATA_TYPE").asInstanceOf[/* "text" */ String]

inline def MISSING_RESOLVE_VALUE: /* "" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("MISSING_RESOLVE_VALUE").asInstanceOf[/* "" */ String]

inline def NOT_REOSLVED: /* -1 */ Double = ^.asInstanceOf[js.Dynamic].selectDynamic("NOT_REOSLVED").asInstanceOf[/* -1 */ Double]

inline def clearCompileCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearCompileCache")().asInstanceOf[Unit]

inline def compileToFunction[T](source: String): MessageFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("compileToFunction")(source.asInstanceOf[js.Any]).asInstanceOf[MessageFunction[T]]
inline def compileToFunction[T](source: String, options: CompileOptions): MessageFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("compileToFunction")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[MessageFunction[T]]

inline def createCompileError[T /* <: Double */](code: T): CompileError = ^.asInstanceOf[js.Dynamic].applyDynamic("createCompileError")(code.asInstanceOf[js.Any]).asInstanceOf[CompileError]
inline def createCompileError[T /* <: Double */](code: T, loc: Null, options: CreateCompileErrorOptions): CompileError = (^.asInstanceOf[js.Dynamic].applyDynamic("createCompileError")(code.asInstanceOf[js.Any], loc.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CompileError]
inline def createCompileError[T /* <: Double */](code: T, loc: SourceLocation): CompileError = (^.asInstanceOf[js.Dynamic].applyDynamic("createCompileError")(code.asInstanceOf[js.Any], loc.asInstanceOf[js.Any])).asInstanceOf[CompileError]
inline def createCompileError[T /* <: Double */](code: T, loc: SourceLocation, options: CreateCompileErrorOptions): CompileError = (^.asInstanceOf[js.Dynamic].applyDynamic("createCompileError")(code.asInstanceOf[js.Any], loc.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CompileError]

inline def createCoreContext[Message, Options /* <: CoreOptions[
Message, 
Number[Message], 
Locale, 
/* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.Locale extends {  messages :infer M} ? M : @intlify/core-base.@intlify/core-base.Locale extends string ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
/* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.Locale extends {  datetimeFormats :infer D} ? D : @intlify/core-base.@intlify/core-base.Locale extends string ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
/* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.Locale extends {  numberFormats :infer N} ? N : @intlify/core-base.@intlify/core-base.Locale extends string ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
/* import warning: importer.ImportType#apply Failed type conversion: {  message :@intlify/core-base.@intlify/core-base.LocaleMessage<Message>,   datetime :@intlify/core-base.@intlify/core-base.DateTimeFormat,   number :@intlify/core-base.@intlify/core-base.NumberFormat} extends {  message :infer M} ? M : @intlify/core-base.@intlify/core-base.LocaleMessage<Message> */ js.Any, 
/* import warning: importer.ImportType#apply Failed type conversion: {  message :@intlify/core-base.@intlify/core-base.LocaleMessage<Message>,   datetime :@intlify/core-base.@intlify/core-base.DateTimeFormat,   number :@intlify/core-base.@intlify/core-base.NumberFormat} extends {  datetime :infer D} ? D : @intlify/core-base.@intlify/core-base.DateTimeFormat */ js.Any, 
/* import warning: importer.ImportType#apply Failed type conversion: {  message :@intlify/core-base.@intlify/core-base.LocaleMessage<Message>,   datetime :@intlify/core-base.@intlify/core-base.DateTimeFormat,   number :@intlify/core-base.@intlify/core-base.NumberFormat} extends {  number :infer N} ? N : @intlify/core-base.@intlify/core-base.NumberFormat */ js.Any, 
LocaleMessages[
  /* import warning: importer.ImportType#apply Failed type conversion: {  message :@intlify/core-base.@intlify/core-base.LocaleMessage<Message>,   datetime :@intlify/core-base.@intlify/core-base.DateTimeFormat,   number :@intlify/core-base.@intlify/core-base.NumberFormat} extends {  message :infer M} ? M : @intlify/core-base.@intlify/core-base.LocaleMessage<Message> */ js.Any, 
  /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.Locale extends {  messages :infer M} ? M : @intlify/core-base.@intlify/core-base.Locale extends string ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
  Message
], 
typings.intlifyCoreBase.mod.DateTimeFormats[
  /* import warning: importer.ImportType#apply Failed type conversion: {  message :@intlify/core-base.@intlify/core-base.LocaleMessage<Message>,   datetime :@intlify/core-base.@intlify/core-base.DateTimeFormat,   number :@intlify/core-base.@intlify/core-base.NumberFormat} extends {  datetime :infer D} ? D : @intlify/core-base.@intlify/core-base.DateTimeFormat */ js.Any, 
  /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.Locale extends {  datetimeFormats :infer D} ? D : @intlify/core-base.@intlify/core-base.Locale extends string ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.Locale */ js.Any
], 
typings.intlifyCoreBase.mod.NumberFormats[
  /* import warning: importer.ImportType#apply Failed type conversion: {  message :@intlify/core-base.@intlify/core-base.LocaleMessage<Message>,   datetime :@intlify/core-base.@intlify/core-base.DateTimeFormat,   number :@intlify/core-base.@intlify/core-base.NumberFormat} extends {  number :infer N} ? N : @intlify/core-base.@intlify/core-base.NumberFormat */ js.Any, 
  /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.Locale extends {  numberFormats :infer N} ? N : @intlify/core-base.@intlify/core-base.Locale extends string ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.Locale */ js.Any
]] */, Messages, DateTimeFormats, NumberFormats](options: Options): CoreContext[
Message, 
Messages, 
DateTimeFormats, 
NumberFormats, 
PickupLocales[
  NonNullable[DateTimeFormats | Messages | NumberFormats], 
  /* keyof std.NonNullable<Messages> */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Messages>, keyof std.NonNullable<Messages>> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<DateTimeFormats>, keyof std.NonNullable<DateTimeFormats>> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<NumberFormats>, keyof std.NonNullable<NumberFormats>>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Messages>, keyof std.NonNullable<Messages>> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<DateTimeFormats>, keyof std.NonNullable<DateTimeFormats>> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<NumberFormats>, keyof std.NonNullable<NumberFormats>> */ js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("createCoreContext")(options.asInstanceOf[js.Any]).asInstanceOf[CoreContext[
Message, 
Messages, 
DateTimeFormats, 
NumberFormats, 
PickupLocales[
  NonNullable[DateTimeFormats | Messages | NumberFormats], 
  /* keyof std.NonNullable<Messages> */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Messages>, keyof std.NonNullable<Messages>> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<DateTimeFormats>, keyof std.NonNullable<DateTimeFormats>> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<NumberFormats>, keyof std.NonNullable<NumberFormats>>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Messages>, keyof std.NonNullable<Messages>> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<DateTimeFormats>, keyof std.NonNullable<DateTimeFormats>> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<NumberFormats>, keyof std.NonNullable<NumberFormats>> */ js.Any]]

inline def createCoreContext_SchemaLocalesMessageOptionsMessagesDateTimeFormatsNumberFormats[Schema, Locales, Message, Options /* <: CoreOptions[
Message, 
SchemaParams[Schema, Message], 
LocaleParams[Locales, `en-US`], 
/* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> extends {  messages :infer M} ? M : @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> extends string ? @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
/* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> extends {  datetimeFormats :infer D} ? D : @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> extends string ? @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
/* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> extends {  numberFormats :infer N} ? N : @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> extends string ? @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
/* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.SchemaParams<Schema, Message> extends {  message :infer M} ? M : @intlify/core-base.@intlify/core-base.LocaleMessage<Message> */ js.Any, 
/* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.SchemaParams<Schema, Message> extends {  datetime :infer D} ? D : @intlify/core-base.@intlify/core-base.DateTimeFormat */ js.Any, 
/* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.SchemaParams<Schema, Message> extends {  number :infer N} ? N : @intlify/core-base.@intlify/core-base.NumberFormat */ js.Any, 
LocaleMessages[
  /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.SchemaParams<Schema, Message> extends {  message :infer M} ? M : @intlify/core-base.@intlify/core-base.LocaleMessage<Message> */ js.Any, 
  /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> extends {  messages :infer M} ? M : @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> extends string ? @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> : @intlify/core-base.@intlify/core-base.Locale */ js.Any, 
  Message
], 
typings.intlifyCoreBase.mod.DateTimeFormats[
  /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.SchemaParams<Schema, Message> extends {  datetime :infer D} ? D : @intlify/core-base.@intlify/core-base.DateTimeFormat */ js.Any, 
  /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> extends {  datetimeFormats :infer D} ? D : @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> extends string ? @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> : @intlify/core-base.@intlify/core-base.Locale */ js.Any
], 
typings.intlifyCoreBase.mod.NumberFormats[
  /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.SchemaParams<Schema, Message> extends {  number :infer N} ? N : @intlify/core-base.@intlify/core-base.NumberFormat */ js.Any, 
  /* import warning: importer.ImportType#apply Failed type conversion: @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> extends {  numberFormats :infer N} ? N : @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> extends string ? @intlify/core-base.@intlify/core-base.LocaleParams<Locales, 'en-US'> : @intlify/core-base.@intlify/core-base.Locale */ js.Any
]] */, Messages, DateTimeFormats, NumberFormats](options: Options): CoreContext[
Message, 
Messages, 
DateTimeFormats, 
NumberFormats, 
PickupLocales[
  NonNullable[DateTimeFormats | Messages | NumberFormats], 
  /* keyof std.NonNullable<Messages> */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Messages>, keyof std.NonNullable<Messages>> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<DateTimeFormats>, keyof std.NonNullable<DateTimeFormats>> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<NumberFormats>, keyof std.NonNullable<NumberFormats>>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Messages>, keyof std.NonNullable<Messages>> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<DateTimeFormats>, keyof std.NonNullable<DateTimeFormats>> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<NumberFormats>, keyof std.NonNullable<NumberFormats>> */ js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("createCoreContext")(options.asInstanceOf[js.Any]).asInstanceOf[CoreContext[
Message, 
Messages, 
DateTimeFormats, 
NumberFormats, 
PickupLocales[
  NonNullable[DateTimeFormats | Messages | NumberFormats], 
  /* keyof std.NonNullable<Messages> */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Messages>, keyof std.NonNullable<Messages>> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<DateTimeFormats>, keyof std.NonNullable<DateTimeFormats>> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<NumberFormats>, keyof std.NonNullable<NumberFormats>>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Messages>, keyof std.NonNullable<Messages>> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<DateTimeFormats>, keyof std.NonNullable<DateTimeFormats>> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<NumberFormats>, keyof std.NonNullable<NumberFormats>> */ js.Any]]

inline def createCoreError(code: CoreErrorCodes): CoreError = ^.asInstanceOf[js.Dynamic].applyDynamic("createCoreError")(code.asInstanceOf[js.Any]).asInstanceOf[CoreError]

inline def createMessageContext[T, N](): MessageContext[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createMessageContext")().asInstanceOf[MessageContext[T]]
inline def createMessageContext[T, N](options: MessageContextOptions[T, N]): MessageContext[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createMessageContext")(options.asInstanceOf[js.Any]).asInstanceOf[MessageContext[T]]

inline def datetime[Context /* <: CoreContext[
Message, 
js.Object, 
/* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any, 
js.Object, 
PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any
  ]) | js.Object, 
  /* keyof / * Inlined std.NonNullable<{}> * /
{} */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['datetimeFormats']>, keyof std.NonNullable<Context['datetimeFormats']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['datetimeFormats']>, keyof std.NonNullable<Context['datetimeFormats']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> */ js.Any] */, Message](context: Context, value: String): String | Double | js.Array[DateTimeFormatPart] = (^.asInstanceOf[js.Dynamic].applyDynamic("datetime")(context.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String | Double | js.Array[DateTimeFormatPart]]
inline def datetime[Context /* <: CoreContext[
Message, 
js.Object, 
/* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any, 
js.Object, 
PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any
  ]) | js.Object, 
  /* keyof / * Inlined std.NonNullable<{}> * /
{} */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['datetimeFormats']>, keyof std.NonNullable<Context['datetimeFormats']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['datetimeFormats']>, keyof std.NonNullable<Context['datetimeFormats']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> */ js.Any] */, Message](context: Context, value: js.Date): String | Double | js.Array[DateTimeFormatPart] = (^.asInstanceOf[js.Dynamic].applyDynamic("datetime")(context.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String | Double | js.Array[DateTimeFormatPart]]
inline def datetime[Context /* <: CoreContext[
Message, 
js.Object, 
/* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any, 
js.Object, 
PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any
  ]) | js.Object, 
  /* keyof / * Inlined std.NonNullable<{}> * /
{} */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['datetimeFormats']>, keyof std.NonNullable<Context['datetimeFormats']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['datetimeFormats']>, keyof std.NonNullable<Context['datetimeFormats']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> */ js.Any] */, Message](context: Context, value: Double): String | Double | js.Array[DateTimeFormatPart] = (^.asInstanceOf[js.Dynamic].applyDynamic("datetime")(context.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String | Double | js.Array[DateTimeFormatPart]]
inline def datetime[Context /* <: CoreContext[
Message, 
js.Object, 
/* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any, 
js.Object, 
PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any
  ]) | js.Object, 
  /* keyof / * Inlined std.NonNullable<{}> * /
{} */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['datetimeFormats']>, keyof std.NonNullable<Context['datetimeFormats']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['datetimeFormats']>, keyof std.NonNullable<Context['datetimeFormats']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> */ js.Any] */, Key /* <: String */, ResourceKeys /* <: PickupFormatKeys[
/* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any, 
/* keyof Context['datetimeFormats'] */ String] */, Message](context: Context, value: String, keyOrOptions: Key | ResourceKeys): String | Double | js.Array[DateTimeFormatPart] = (^.asInstanceOf[js.Dynamic].applyDynamic("datetime")(context.asInstanceOf[js.Any], value.asInstanceOf[js.Any], keyOrOptions.asInstanceOf[js.Any])).asInstanceOf[String | Double | js.Array[DateTimeFormatPart]]
inline def datetime[Context /* <: CoreContext[
Message, 
js.Object, 
/* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any, 
js.Object, 
PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any
  ]) | js.Object, 
  /* keyof / * Inlined std.NonNullable<{}> * /
{} */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['datetimeFormats']>, keyof std.NonNullable<Context['datetimeFormats']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['datetimeFormats']>, keyof std.NonNullable<Context['datetimeFormats']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> */ js.Any] */, Key /* <: String */, ResourceKeys /* <: PickupFormatKeys[
/* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any, 
/* keyof Context['datetimeFormats'] */ String] */, Message](
  context: Context,
  value: String,
  keyOrOptions: Key | ResourceKeys,
  `override`: typings.std.Intl.DateTimeFormatOptions
): String | Double | js.Array[DateTimeFormatPart] = (^.asInstanceOf[js.Dynamic].applyDynamic("datetime")(context.asInstanceOf[js.Any], value.asInstanceOf[js.Any], keyOrOptions.asInstanceOf[js.Any], `override`.asInstanceOf[js.Any])).asInstanceOf[String | Double | js.Array[DateTimeFormatPart]]
inline def datetime[Context /* <: CoreContext[
Message, 
js.Object, 
/* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any, 
js.Object, 
PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any
  ]) | js.Object, 
  /* keyof / * Inlined std.NonNullable<{}> * /
{} */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['datetimeFormats']>, keyof std.NonNullable<Context['datetimeFormats']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['datetimeFormats']>, keyof std.NonNullable<Context['datetimeFormats']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> */ js.Any] */, Key /* <: String */, ResourceKeys /* <: PickupFormatKeys[
/* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any, 
/* keyof Context['datetimeFormats'] */ String] */, Message](context: Context, value: js.Date, keyOrOptions: Key | ResourceKeys): String | Double | js.Array[DateTimeFormatPart] = (^.asInstanceOf[js.Dynamic].applyDynamic("datetime")(context.asInstanceOf[js.Any], value.asInstanceOf[js.Any], keyOrOptions.asInstanceOf[js.Any])).asInstanceOf[String | Double | js.Array[DateTimeFormatPart]]
inline def datetime[Context /* <: CoreContext[
Message, 
js.Object, 
/* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any, 
js.Object, 
PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any
  ]) | js.Object, 
  /* keyof / * Inlined std.NonNullable<{}> * /
{} */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['datetimeFormats']>, keyof std.NonNullable<Context['datetimeFormats']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['datetimeFormats']>, keyof std.NonNullable<Context['datetimeFormats']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> */ js.Any] */, Key /* <: String */, ResourceKeys /* <: PickupFormatKeys[
/* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any, 
/* keyof Context['datetimeFormats'] */ String] */, Message](
  context: Context,
  value: js.Date,
  keyOrOptions: Key | ResourceKeys,
  `override`: typings.std.Intl.DateTimeFormatOptions
): String | Double | js.Array[DateTimeFormatPart] = (^.asInstanceOf[js.Dynamic].applyDynamic("datetime")(context.asInstanceOf[js.Any], value.asInstanceOf[js.Any], keyOrOptions.asInstanceOf[js.Any], `override`.asInstanceOf[js.Any])).asInstanceOf[String | Double | js.Array[DateTimeFormatPart]]
inline def datetime[Context /* <: CoreContext[
Message, 
js.Object, 
/* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any, 
js.Object, 
PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any
  ]) | js.Object, 
  /* keyof / * Inlined std.NonNullable<{}> * /
{} */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['datetimeFormats']>, keyof std.NonNullable<Context['datetimeFormats']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['datetimeFormats']>, keyof std.NonNullable<Context['datetimeFormats']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> */ js.Any] */, Key /* <: String */, ResourceKeys /* <: PickupFormatKeys[
/* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any, 
/* keyof Context['datetimeFormats'] */ String] */, Message](context: Context, value: Double, keyOrOptions: Key | ResourceKeys): String | Double | js.Array[DateTimeFormatPart] = (^.asInstanceOf[js.Dynamic].applyDynamic("datetime")(context.asInstanceOf[js.Any], value.asInstanceOf[js.Any], keyOrOptions.asInstanceOf[js.Any])).asInstanceOf[String | Double | js.Array[DateTimeFormatPart]]
inline def datetime[Context /* <: CoreContext[
Message, 
js.Object, 
/* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any, 
js.Object, 
PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any
  ]) | js.Object, 
  /* keyof / * Inlined std.NonNullable<{}> * /
{} */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['datetimeFormats']>, keyof std.NonNullable<Context['datetimeFormats']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['datetimeFormats']>, keyof std.NonNullable<Context['datetimeFormats']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> */ js.Any] */, Key /* <: String */, ResourceKeys /* <: PickupFormatKeys[
/* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any, 
/* keyof Context['datetimeFormats'] */ String] */, Message](
  context: Context,
  value: Double,
  keyOrOptions: Key | ResourceKeys,
  `override`: typings.std.Intl.DateTimeFormatOptions
): String | Double | js.Array[DateTimeFormatPart] = (^.asInstanceOf[js.Dynamic].applyDynamic("datetime")(context.asInstanceOf[js.Any], value.asInstanceOf[js.Any], keyOrOptions.asInstanceOf[js.Any], `override`.asInstanceOf[js.Any])).asInstanceOf[String | Double | js.Array[DateTimeFormatPart]]

inline def datetime_locale[Context /* <: CoreContext[
Message, 
js.Object, 
/* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any, 
js.Object, 
PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any
  ]) | js.Object, 
  /* keyof / * Inlined std.NonNullable<{}> * /
{} */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['datetimeFormats']>, keyof std.NonNullable<Context['datetimeFormats']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['datetimeFormats']>, keyof std.NonNullable<Context['datetimeFormats']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> */ js.Any] */, Key /* <: String */, ResourceKeys /* <: PickupFormatKeys[
/* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any, 
/* keyof Context['datetimeFormats'] */ String] */, Message](
  context: Context,
  value: String,
  keyOrOptions: Key | ResourceKeys,
  locale: /* import warning: importer.ImportType#apply Failed type conversion: Context['locale'] */ js.Any
): String | Double | js.Array[DateTimeFormatPart] = (^.asInstanceOf[js.Dynamic].applyDynamic("datetime")(context.asInstanceOf[js.Any], value.asInstanceOf[js.Any], keyOrOptions.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[String | Double | js.Array[DateTimeFormatPart]]
inline def datetime_locale[Context /* <: CoreContext[
Message, 
js.Object, 
/* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any, 
js.Object, 
PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any
  ]) | js.Object, 
  /* keyof / * Inlined std.NonNullable<{}> * /
{} */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['datetimeFormats']>, keyof std.NonNullable<Context['datetimeFormats']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['datetimeFormats']>, keyof std.NonNullable<Context['datetimeFormats']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> */ js.Any] */, Key /* <: String */, ResourceKeys /* <: PickupFormatKeys[
/* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any, 
/* keyof Context['datetimeFormats'] */ String] */, Message](
  context: Context,
  value: String,
  keyOrOptions: Key | ResourceKeys,
  locale: /* import warning: importer.ImportType#apply Failed type conversion: Context['locale'] */ js.Any,
  `override`: typings.std.Intl.DateTimeFormatOptions
): String | Double | js.Array[DateTimeFormatPart] = (^.asInstanceOf[js.Dynamic].applyDynamic("datetime")(context.asInstanceOf[js.Any], value.asInstanceOf[js.Any], keyOrOptions.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], `override`.asInstanceOf[js.Any])).asInstanceOf[String | Double | js.Array[DateTimeFormatPart]]
inline def datetime_locale[Context /* <: CoreContext[
Message, 
js.Object, 
/* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any, 
js.Object, 
PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any
  ]) | js.Object, 
  /* keyof / * Inlined std.NonNullable<{}> * /
{} */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['datetimeFormats']>, keyof std.NonNullable<Context['datetimeFormats']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['datetimeFormats']>, keyof std.NonNullable<Context['datetimeFormats']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> */ js.Any] */, Key /* <: String */, ResourceKeys /* <: PickupFormatKeys[
/* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any, 
/* keyof Context['datetimeFormats'] */ String] */, Message](
  context: Context,
  value: String,
  keyOrOptions: DateTimeOptions[
  Key | ResourceKeys, 
  /* import warning: importer.ImportType#apply Failed type conversion: Context['locale'] */ js.Any
]
): String | Double | js.Array[DateTimeFormatPart] = (^.asInstanceOf[js.Dynamic].applyDynamic("datetime")(context.asInstanceOf[js.Any], value.asInstanceOf[js.Any], keyOrOptions.asInstanceOf[js.Any])).asInstanceOf[String | Double | js.Array[DateTimeFormatPart]]
inline def datetime_locale[Context /* <: CoreContext[
Message, 
js.Object, 
/* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any, 
js.Object, 
PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any
  ]) | js.Object, 
  /* keyof / * Inlined std.NonNullable<{}> * /
{} */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['datetimeFormats']>, keyof std.NonNullable<Context['datetimeFormats']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['datetimeFormats']>, keyof std.NonNullable<Context['datetimeFormats']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> */ js.Any] */, Key /* <: String */, ResourceKeys /* <: PickupFormatKeys[
/* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any, 
/* keyof Context['datetimeFormats'] */ String] */, Message](
  context: Context,
  value: String,
  keyOrOptions: DateTimeOptions[
  Key | ResourceKeys, 
  /* import warning: importer.ImportType#apply Failed type conversion: Context['locale'] */ js.Any
],
  locale: /* import warning: importer.ImportType#apply Failed type conversion: Context['locale'] */ js.Any
): String | Double | js.Array[DateTimeFormatPart] = (^.asInstanceOf[js.Dynamic].applyDynamic("datetime")(context.asInstanceOf[js.Any], value.asInstanceOf[js.Any], keyOrOptions.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[String | Double | js.Array[DateTimeFormatPart]]
inline def datetime_locale[Context /* <: CoreContext[
Message, 
js.Object, 
/* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any, 
js.Object, 
PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any
  ]) | js.Object, 
  /* keyof / * Inlined std.NonNullable<{}> * /
{} */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['datetimeFormats']>, keyof std.NonNullable<Context['datetimeFormats']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['datetimeFormats']>, keyof std.NonNullable<Context['datetimeFormats']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> */ js.Any] */, Key /* <: String */, ResourceKeys /* <: PickupFormatKeys[
/* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any, 
/* keyof Context['datetimeFormats'] */ String] */, Message](
  context: Context,
  value: String,
  keyOrOptions: DateTimeOptions[
  Key | ResourceKeys, 
  /* import warning: importer.ImportType#apply Failed type conversion: Context['locale'] */ js.Any
],
  locale: /* import warning: importer.ImportType#apply Failed type conversion: Context['locale'] */ js.Any,
  `override`: typings.std.Intl.DateTimeFormatOptions
): String | Double | js.Array[DateTimeFormatPart] = (^.asInstanceOf[js.Dynamic].applyDynamic("datetime")(context.asInstanceOf[js.Any], value.asInstanceOf[js.Any], keyOrOptions.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], `override`.asInstanceOf[js.Any])).asInstanceOf[String | Double | js.Array[DateTimeFormatPart]]
inline def datetime_locale[Context /* <: CoreContext[
Message, 
js.Object, 
/* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any, 
js.Object, 
PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any
  ]) | js.Object, 
  /* keyof / * Inlined std.NonNullable<{}> * /
{} */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['datetimeFormats']>, keyof std.NonNullable<Context['datetimeFormats']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['datetimeFormats']>, keyof std.NonNullable<Context['datetimeFormats']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> */ js.Any] */, Key /* <: String */, ResourceKeys /* <: PickupFormatKeys[
/* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any, 
/* keyof Context['datetimeFormats'] */ String] */, Message](
  context: Context,
  value: String,
  keyOrOptions: DateTimeOptions[
  Key | ResourceKeys, 
  /* import warning: importer.ImportType#apply Failed type conversion: Context['locale'] */ js.Any
],
  `override`: typings.std.Intl.DateTimeFormatOptions
): String | Double | js.Array[DateTimeFormatPart] = (^.asInstanceOf[js.Dynamic].applyDynamic("datetime")(context.asInstanceOf[js.Any], value.asInstanceOf[js.Any], keyOrOptions.asInstanceOf[js.Any], `override`.asInstanceOf[js.Any])).asInstanceOf[String | Double | js.Array[DateTimeFormatPart]]
inline def datetime_locale[Context /* <: CoreContext[
Message, 
js.Object, 
/* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any, 
js.Object, 
PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any
  ]) | js.Object, 
  /* keyof / * Inlined std.NonNullable<{}> * /
{} */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['datetimeFormats']>, keyof std.NonNullable<Context['datetimeFormats']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['datetimeFormats']>, keyof std.NonNullable<Context['datetimeFormats']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> */ js.Any] */, Key /* <: String */, ResourceKeys /* <: PickupFormatKeys[
/* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any, 
/* keyof Context['datetimeFormats'] */ String] */, Message](
  context: Context,
  value: js.Date,
  keyOrOptions: Key | ResourceKeys,
  locale: /* import warning: importer.ImportType#apply Failed type conversion: Context['locale'] */ js.Any
): String | Double | js.Array[DateTimeFormatPart] = (^.asInstanceOf[js.Dynamic].applyDynamic("datetime")(context.asInstanceOf[js.Any], value.asInstanceOf[js.Any], keyOrOptions.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[String | Double | js.Array[DateTimeFormatPart]]
inline def datetime_locale[Context /* <: CoreContext[
Message, 
js.Object, 
/* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any, 
js.Object, 
PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any
  ]) | js.Object, 
  /* keyof / * Inlined std.NonNullable<{}> * /
{} */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['datetimeFormats']>, keyof std.NonNullable<Context['datetimeFormats']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['datetimeFormats']>, keyof std.NonNullable<Context['datetimeFormats']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> */ js.Any] */, Key /* <: String */, ResourceKeys /* <: PickupFormatKeys[
/* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any, 
/* keyof Context['datetimeFormats'] */ String] */, Message](
  context: Context,
  value: js.Date,
  keyOrOptions: Key | ResourceKeys,
  locale: /* import warning: importer.ImportType#apply Failed type conversion: Context['locale'] */ js.Any,
  `override`: typings.std.Intl.DateTimeFormatOptions
): String | Double | js.Array[DateTimeFormatPart] = (^.asInstanceOf[js.Dynamic].applyDynamic("datetime")(context.asInstanceOf[js.Any], value.asInstanceOf[js.Any], keyOrOptions.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], `override`.asInstanceOf[js.Any])).asInstanceOf[String | Double | js.Array[DateTimeFormatPart]]
inline def datetime_locale[Context /* <: CoreContext[
Message, 
js.Object, 
/* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any, 
js.Object, 
PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any
  ]) | js.Object, 
  /* keyof / * Inlined std.NonNullable<{}> * /
{} */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['datetimeFormats']>, keyof std.NonNullable<Context['datetimeFormats']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['datetimeFormats']>, keyof std.NonNullable<Context['datetimeFormats']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> */ js.Any] */, Key /* <: String */, ResourceKeys /* <: PickupFormatKeys[
/* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any, 
/* keyof Context['datetimeFormats'] */ String] */, Message](
  context: Context,
  value: js.Date,
  keyOrOptions: DateTimeOptions[
  Key | ResourceKeys, 
  /* import warning: importer.ImportType#apply Failed type conversion: Context['locale'] */ js.Any
]
): String | Double | js.Array[DateTimeFormatPart] = (^.asInstanceOf[js.Dynamic].applyDynamic("datetime")(context.asInstanceOf[js.Any], value.asInstanceOf[js.Any], keyOrOptions.asInstanceOf[js.Any])).asInstanceOf[String | Double | js.Array[DateTimeFormatPart]]
inline def datetime_locale[Context /* <: CoreContext[
Message, 
js.Object, 
/* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any, 
js.Object, 
PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any
  ]) | js.Object, 
  /* keyof / * Inlined std.NonNullable<{}> * /
{} */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['datetimeFormats']>, keyof std.NonNullable<Context['datetimeFormats']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['datetimeFormats']>, keyof std.NonNullable<Context['datetimeFormats']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> */ js.Any] */, Key /* <: String */, ResourceKeys /* <: PickupFormatKeys[
/* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any, 
/* keyof Context['datetimeFormats'] */ String] */, Message](
  context: Context,
  value: js.Date,
  keyOrOptions: DateTimeOptions[
  Key | ResourceKeys, 
  /* import warning: importer.ImportType#apply Failed type conversion: Context['locale'] */ js.Any
],
  locale: /* import warning: importer.ImportType#apply Failed type conversion: Context['locale'] */ js.Any
): String | Double | js.Array[DateTimeFormatPart] = (^.asInstanceOf[js.Dynamic].applyDynamic("datetime")(context.asInstanceOf[js.Any], value.asInstanceOf[js.Any], keyOrOptions.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[String | Double | js.Array[DateTimeFormatPart]]
inline def datetime_locale[Context /* <: CoreContext[
Message, 
js.Object, 
/* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any, 
js.Object, 
PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any
  ]) | js.Object, 
  /* keyof / * Inlined std.NonNullable<{}> * /
{} */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['datetimeFormats']>, keyof std.NonNullable<Context['datetimeFormats']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['datetimeFormats']>, keyof std.NonNullable<Context['datetimeFormats']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> */ js.Any] */, Key /* <: String */, ResourceKeys /* <: PickupFormatKeys[
/* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any, 
/* keyof Context['datetimeFormats'] */ String] */, Message](
  context: Context,
  value: js.Date,
  keyOrOptions: DateTimeOptions[
  Key | ResourceKeys, 
  /* import warning: importer.ImportType#apply Failed type conversion: Context['locale'] */ js.Any
],
  locale: /* import warning: importer.ImportType#apply Failed type conversion: Context['locale'] */ js.Any,
  `override`: typings.std.Intl.DateTimeFormatOptions
): String | Double | js.Array[DateTimeFormatPart] = (^.asInstanceOf[js.Dynamic].applyDynamic("datetime")(context.asInstanceOf[js.Any], value.asInstanceOf[js.Any], keyOrOptions.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], `override`.asInstanceOf[js.Any])).asInstanceOf[String | Double | js.Array[DateTimeFormatPart]]
inline def datetime_locale[Context /* <: CoreContext[
Message, 
js.Object, 
/* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any, 
js.Object, 
PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any
  ]) | js.Object, 
  /* keyof / * Inlined std.NonNullable<{}> * /
{} */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['datetimeFormats']>, keyof std.NonNullable<Context['datetimeFormats']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['datetimeFormats']>, keyof std.NonNullable<Context['datetimeFormats']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> */ js.Any] */, Key /* <: String */, ResourceKeys /* <: PickupFormatKeys[
/* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any, 
/* keyof Context['datetimeFormats'] */ String] */, Message](
  context: Context,
  value: js.Date,
  keyOrOptions: DateTimeOptions[
  Key | ResourceKeys, 
  /* import warning: importer.ImportType#apply Failed type conversion: Context['locale'] */ js.Any
],
  `override`: typings.std.Intl.DateTimeFormatOptions
): String | Double | js.Array[DateTimeFormatPart] = (^.asInstanceOf[js.Dynamic].applyDynamic("datetime")(context.asInstanceOf[js.Any], value.asInstanceOf[js.Any], keyOrOptions.asInstanceOf[js.Any], `override`.asInstanceOf[js.Any])).asInstanceOf[String | Double | js.Array[DateTimeFormatPart]]
inline def datetime_locale[Context /* <: CoreContext[
Message, 
js.Object, 
/* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any, 
js.Object, 
PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any
  ]) | js.Object, 
  /* keyof / * Inlined std.NonNullable<{}> * /
{} */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['datetimeFormats']>, keyof std.NonNullable<Context['datetimeFormats']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['datetimeFormats']>, keyof std.NonNullable<Context['datetimeFormats']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> */ js.Any] */, Key /* <: String */, ResourceKeys /* <: PickupFormatKeys[
/* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any, 
/* keyof Context['datetimeFormats'] */ String] */, Message](
  context: Context,
  value: Double,
  keyOrOptions: Key | ResourceKeys,
  locale: /* import warning: importer.ImportType#apply Failed type conversion: Context['locale'] */ js.Any
): String | Double | js.Array[DateTimeFormatPart] = (^.asInstanceOf[js.Dynamic].applyDynamic("datetime")(context.asInstanceOf[js.Any], value.asInstanceOf[js.Any], keyOrOptions.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[String | Double | js.Array[DateTimeFormatPart]]
inline def datetime_locale[Context /* <: CoreContext[
Message, 
js.Object, 
/* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any, 
js.Object, 
PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any
  ]) | js.Object, 
  /* keyof / * Inlined std.NonNullable<{}> * /
{} */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['datetimeFormats']>, keyof std.NonNullable<Context['datetimeFormats']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['datetimeFormats']>, keyof std.NonNullable<Context['datetimeFormats']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> */ js.Any] */, Key /* <: String */, ResourceKeys /* <: PickupFormatKeys[
/* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any, 
/* keyof Context['datetimeFormats'] */ String] */, Message](
  context: Context,
  value: Double,
  keyOrOptions: Key | ResourceKeys,
  locale: /* import warning: importer.ImportType#apply Failed type conversion: Context['locale'] */ js.Any,
  `override`: typings.std.Intl.DateTimeFormatOptions
): String | Double | js.Array[DateTimeFormatPart] = (^.asInstanceOf[js.Dynamic].applyDynamic("datetime")(context.asInstanceOf[js.Any], value.asInstanceOf[js.Any], keyOrOptions.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], `override`.asInstanceOf[js.Any])).asInstanceOf[String | Double | js.Array[DateTimeFormatPart]]
inline def datetime_locale[Context /* <: CoreContext[
Message, 
js.Object, 
/* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any, 
js.Object, 
PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any
  ]) | js.Object, 
  /* keyof / * Inlined std.NonNullable<{}> * /
{} */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['datetimeFormats']>, keyof std.NonNullable<Context['datetimeFormats']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['datetimeFormats']>, keyof std.NonNullable<Context['datetimeFormats']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> */ js.Any] */, Key /* <: String */, ResourceKeys /* <: PickupFormatKeys[
/* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any, 
/* keyof Context['datetimeFormats'] */ String] */, Message](
  context: Context,
  value: Double,
  keyOrOptions: DateTimeOptions[
  Key | ResourceKeys, 
  /* import warning: importer.ImportType#apply Failed type conversion: Context['locale'] */ js.Any
]
): String | Double | js.Array[DateTimeFormatPart] = (^.asInstanceOf[js.Dynamic].applyDynamic("datetime")(context.asInstanceOf[js.Any], value.asInstanceOf[js.Any], keyOrOptions.asInstanceOf[js.Any])).asInstanceOf[String | Double | js.Array[DateTimeFormatPart]]
inline def datetime_locale[Context /* <: CoreContext[
Message, 
js.Object, 
/* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any, 
js.Object, 
PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any
  ]) | js.Object, 
  /* keyof / * Inlined std.NonNullable<{}> * /
{} */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['datetimeFormats']>, keyof std.NonNullable<Context['datetimeFormats']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['datetimeFormats']>, keyof std.NonNullable<Context['datetimeFormats']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> */ js.Any] */, Key /* <: String */, ResourceKeys /* <: PickupFormatKeys[
/* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any, 
/* keyof Context['datetimeFormats'] */ String] */, Message](
  context: Context,
  value: Double,
  keyOrOptions: DateTimeOptions[
  Key | ResourceKeys, 
  /* import warning: importer.ImportType#apply Failed type conversion: Context['locale'] */ js.Any
],
  locale: /* import warning: importer.ImportType#apply Failed type conversion: Context['locale'] */ js.Any
): String | Double | js.Array[DateTimeFormatPart] = (^.asInstanceOf[js.Dynamic].applyDynamic("datetime")(context.asInstanceOf[js.Any], value.asInstanceOf[js.Any], keyOrOptions.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[String | Double | js.Array[DateTimeFormatPart]]
inline def datetime_locale[Context /* <: CoreContext[
Message, 
js.Object, 
/* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any, 
js.Object, 
PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any
  ]) | js.Object, 
  /* keyof / * Inlined std.NonNullable<{}> * /
{} */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['datetimeFormats']>, keyof std.NonNullable<Context['datetimeFormats']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['datetimeFormats']>, keyof std.NonNullable<Context['datetimeFormats']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> */ js.Any] */, Key /* <: String */, ResourceKeys /* <: PickupFormatKeys[
/* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any, 
/* keyof Context['datetimeFormats'] */ String] */, Message](
  context: Context,
  value: Double,
  keyOrOptions: DateTimeOptions[
  Key | ResourceKeys, 
  /* import warning: importer.ImportType#apply Failed type conversion: Context['locale'] */ js.Any
],
  locale: /* import warning: importer.ImportType#apply Failed type conversion: Context['locale'] */ js.Any,
  `override`: typings.std.Intl.DateTimeFormatOptions
): String | Double | js.Array[DateTimeFormatPart] = (^.asInstanceOf[js.Dynamic].applyDynamic("datetime")(context.asInstanceOf[js.Any], value.asInstanceOf[js.Any], keyOrOptions.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], `override`.asInstanceOf[js.Any])).asInstanceOf[String | Double | js.Array[DateTimeFormatPart]]
inline def datetime_locale[Context /* <: CoreContext[
Message, 
js.Object, 
/* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any, 
js.Object, 
PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any
  ]) | js.Object, 
  /* keyof / * Inlined std.NonNullable<{}> * /
{} */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['datetimeFormats']>, keyof std.NonNullable<Context['datetimeFormats']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['datetimeFormats']>, keyof std.NonNullable<Context['datetimeFormats']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> */ js.Any] */, Key /* <: String */, ResourceKeys /* <: PickupFormatKeys[
/* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any, 
/* keyof Context['datetimeFormats'] */ String] */, Message](
  context: Context,
  value: Double,
  keyOrOptions: DateTimeOptions[
  Key | ResourceKeys, 
  /* import warning: importer.ImportType#apply Failed type conversion: Context['locale'] */ js.Any
],
  `override`: typings.std.Intl.DateTimeFormatOptions
): String | Double | js.Array[DateTimeFormatPart] = (^.asInstanceOf[js.Dynamic].applyDynamic("datetime")(context.asInstanceOf[js.Any], value.asInstanceOf[js.Any], keyOrOptions.asInstanceOf[js.Any], `override`.asInstanceOf[js.Any])).asInstanceOf[String | Double | js.Array[DateTimeFormatPart]]

inline def fallbackWithLocaleChain[Message](
  ctx: CoreContext[
  Message, 
  js.Object, 
  js.Object, 
  js.Object, 
  PickupLocales[js.Object, /* keyof / * Inlined std.NonNullable<{}> * /
{} */ String], 
  /* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> */ js.Any
],
  fallback: FallbackLocale,
  start: Locale
): js.Array[Locale] = (^.asInstanceOf[js.Dynamic].applyDynamic("fallbackWithLocaleChain")(ctx.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[js.Array[Locale]]

inline def fallbackWithSimple[Message](
  ctx: CoreContext[
  Message, 
  js.Object, 
  js.Object, 
  js.Object, 
  PickupLocales[js.Object, /* keyof / * Inlined std.NonNullable<{}> * /
{} */ String], 
  /* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> */ js.Any
],
  fallback: FallbackLocale,
  start: Locale
): js.Array[Locale] = (^.asInstanceOf[js.Dynamic].applyDynamic("fallbackWithSimple")(ctx.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[js.Array[Locale]]

inline def getAdditionalMeta(): MetaInfo | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getAdditionalMeta")().asInstanceOf[MetaInfo | Null]

inline def getDevToolsHook(): IntlifyDevToolsEmitter | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getDevToolsHook")().asInstanceOf[IntlifyDevToolsEmitter | Null]

inline def getFallbackContext(): (CoreContext[
String, 
js.Object, 
js.Object, 
js.Object, 
PickupLocales[js.Object, /* keyof / * Inlined std.NonNullable<{}> * /
{} */ String], 
/* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> */ js.Any]) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getFallbackContext")().asInstanceOf[(CoreContext[
String, 
js.Object, 
js.Object, 
js.Object, 
PickupLocales[js.Object, /* keyof / * Inlined std.NonNullable<{}> * /
{} */ String], 
/* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> */ js.Any]) | Null]

inline def getWarnMessage(code: CoreWarnCodes, args: Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getWarnMessage")(scala.List(code.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]

inline def initI18nDevTools(i18n: Any, version: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initI18nDevTools")(i18n.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def initI18nDevTools(i18n: Any, version: String, meta: Record[String, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initI18nDevTools")(i18n.asInstanceOf[js.Any], version.asInstanceOf[js.Any], meta.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def isMessageFunction[T](`val`: Any): /* is @intlify/core-base.@intlify/core-base.MessageFunction<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMessageFunction")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is @intlify/core-base.@intlify/core-base.MessageFunction<T> */ Boolean]

inline def number[Context /* <: CoreContext[
Message, 
js.Object, 
js.Object, 
/* import warning: importer.ImportType#apply Failed type conversion: Context['numberFormats'] */ js.Any, 
PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['numberFormats'] */ js.Any
  ]) | js.Object, 
  /* keyof / * Inlined std.NonNullable<{}> * /
{} */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['numberFormats']>, keyof std.NonNullable<Context['numberFormats']>>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['numberFormats']>, keyof std.NonNullable<Context['numberFormats']>> */ js.Any] */, Message](context: Context, value: Double): String | Double | js.Array[NumberFormatPart] = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(context.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String | Double | js.Array[NumberFormatPart]]
inline def number[Context /* <: CoreContext[
Message, 
js.Object, 
js.Object, 
/* import warning: importer.ImportType#apply Failed type conversion: Context['numberFormats'] */ js.Any, 
PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['numberFormats'] */ js.Any
  ]) | js.Object, 
  /* keyof / * Inlined std.NonNullable<{}> * /
{} */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['numberFormats']>, keyof std.NonNullable<Context['numberFormats']>>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['numberFormats']>, keyof std.NonNullable<Context['numberFormats']>> */ js.Any] */, Value /* <: Double */, Key /* <: String */, ResourceKeys /* <: PickupFormatKeys[
/* import warning: importer.ImportType#apply Failed type conversion: Context['numberFormats'] */ js.Any, 
/* keyof Context['numberFormats'] */ String] */, Message](context: Context, value: Value, keyOrOptions: Key | ResourceKeys): String | Double | js.Array[NumberFormatPart] = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(context.asInstanceOf[js.Any], value.asInstanceOf[js.Any], keyOrOptions.asInstanceOf[js.Any])).asInstanceOf[String | Double | js.Array[NumberFormatPart]]
inline def number[Context /* <: CoreContext[
Message, 
js.Object, 
js.Object, 
/* import warning: importer.ImportType#apply Failed type conversion: Context['numberFormats'] */ js.Any, 
PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['numberFormats'] */ js.Any
  ]) | js.Object, 
  /* keyof / * Inlined std.NonNullable<{}> * /
{} */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['numberFormats']>, keyof std.NonNullable<Context['numberFormats']>>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['numberFormats']>, keyof std.NonNullable<Context['numberFormats']>> */ js.Any] */, Value /* <: Double */, Key /* <: String */, ResourceKeys /* <: PickupFormatKeys[
/* import warning: importer.ImportType#apply Failed type conversion: Context['numberFormats'] */ js.Any, 
/* keyof Context['numberFormats'] */ String] */, Message](
  context: Context,
  value: Value,
  keyOrOptions: Key | ResourceKeys,
  `override`: typings.std.Intl.NumberFormatOptions
): String | Double | js.Array[NumberFormatPart] = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(context.asInstanceOf[js.Any], value.asInstanceOf[js.Any], keyOrOptions.asInstanceOf[js.Any], `override`.asInstanceOf[js.Any])).asInstanceOf[String | Double | js.Array[NumberFormatPart]]

inline def number_locale[Context /* <: CoreContext[
Message, 
js.Object, 
js.Object, 
/* import warning: importer.ImportType#apply Failed type conversion: Context['numberFormats'] */ js.Any, 
PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['numberFormats'] */ js.Any
  ]) | js.Object, 
  /* keyof / * Inlined std.NonNullable<{}> * /
{} */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['numberFormats']>, keyof std.NonNullable<Context['numberFormats']>>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['numberFormats']>, keyof std.NonNullable<Context['numberFormats']>> */ js.Any] */, Value /* <: Double */, Key /* <: String */, ResourceKeys /* <: PickupFormatKeys[
/* import warning: importer.ImportType#apply Failed type conversion: Context['numberFormats'] */ js.Any, 
/* keyof Context['numberFormats'] */ String] */, Message](
  context: Context,
  value: Value,
  keyOrOptions: Key | ResourceKeys,
  locale: /* import warning: importer.ImportType#apply Failed type conversion: Context['locale'] */ js.Any
): String | Double | js.Array[NumberFormatPart] = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(context.asInstanceOf[js.Any], value.asInstanceOf[js.Any], keyOrOptions.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[String | Double | js.Array[NumberFormatPart]]
inline def number_locale[Context /* <: CoreContext[
Message, 
js.Object, 
js.Object, 
/* import warning: importer.ImportType#apply Failed type conversion: Context['numberFormats'] */ js.Any, 
PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['numberFormats'] */ js.Any
  ]) | js.Object, 
  /* keyof / * Inlined std.NonNullable<{}> * /
{} */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['numberFormats']>, keyof std.NonNullable<Context['numberFormats']>>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['numberFormats']>, keyof std.NonNullable<Context['numberFormats']>> */ js.Any] */, Value /* <: Double */, Key /* <: String */, ResourceKeys /* <: PickupFormatKeys[
/* import warning: importer.ImportType#apply Failed type conversion: Context['numberFormats'] */ js.Any, 
/* keyof Context['numberFormats'] */ String] */, Message](
  context: Context,
  value: Value,
  keyOrOptions: Key | ResourceKeys,
  locale: /* import warning: importer.ImportType#apply Failed type conversion: Context['locale'] */ js.Any,
  `override`: typings.std.Intl.NumberFormatOptions
): String | Double | js.Array[NumberFormatPart] = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(context.asInstanceOf[js.Any], value.asInstanceOf[js.Any], keyOrOptions.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], `override`.asInstanceOf[js.Any])).asInstanceOf[String | Double | js.Array[NumberFormatPart]]
inline def number_locale[Context /* <: CoreContext[
Message, 
js.Object, 
js.Object, 
/* import warning: importer.ImportType#apply Failed type conversion: Context['numberFormats'] */ js.Any, 
PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['numberFormats'] */ js.Any
  ]) | js.Object, 
  /* keyof / * Inlined std.NonNullable<{}> * /
{} */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['numberFormats']>, keyof std.NonNullable<Context['numberFormats']>>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['numberFormats']>, keyof std.NonNullable<Context['numberFormats']>> */ js.Any] */, Value /* <: Double */, Key /* <: String */, ResourceKeys /* <: PickupFormatKeys[
/* import warning: importer.ImportType#apply Failed type conversion: Context['numberFormats'] */ js.Any, 
/* keyof Context['numberFormats'] */ String] */, Message](
  context: Context,
  value: Value,
  keyOrOptions: NumberOptions[
  Key | ResourceKeys, 
  /* import warning: importer.ImportType#apply Failed type conversion: Context['locale'] */ js.Any
]
): String | Double | js.Array[NumberFormatPart] = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(context.asInstanceOf[js.Any], value.asInstanceOf[js.Any], keyOrOptions.asInstanceOf[js.Any])).asInstanceOf[String | Double | js.Array[NumberFormatPart]]
inline def number_locale[Context /* <: CoreContext[
Message, 
js.Object, 
js.Object, 
/* import warning: importer.ImportType#apply Failed type conversion: Context['numberFormats'] */ js.Any, 
PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['numberFormats'] */ js.Any
  ]) | js.Object, 
  /* keyof / * Inlined std.NonNullable<{}> * /
{} */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['numberFormats']>, keyof std.NonNullable<Context['numberFormats']>>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['numberFormats']>, keyof std.NonNullable<Context['numberFormats']>> */ js.Any] */, Value /* <: Double */, Key /* <: String */, ResourceKeys /* <: PickupFormatKeys[
/* import warning: importer.ImportType#apply Failed type conversion: Context['numberFormats'] */ js.Any, 
/* keyof Context['numberFormats'] */ String] */, Message](
  context: Context,
  value: Value,
  keyOrOptions: NumberOptions[
  Key | ResourceKeys, 
  /* import warning: importer.ImportType#apply Failed type conversion: Context['locale'] */ js.Any
],
  locale: /* import warning: importer.ImportType#apply Failed type conversion: Context['locale'] */ js.Any
): String | Double | js.Array[NumberFormatPart] = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(context.asInstanceOf[js.Any], value.asInstanceOf[js.Any], keyOrOptions.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[String | Double | js.Array[NumberFormatPart]]
inline def number_locale[Context /* <: CoreContext[
Message, 
js.Object, 
js.Object, 
/* import warning: importer.ImportType#apply Failed type conversion: Context['numberFormats'] */ js.Any, 
PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['numberFormats'] */ js.Any
  ]) | js.Object, 
  /* keyof / * Inlined std.NonNullable<{}> * /
{} */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['numberFormats']>, keyof std.NonNullable<Context['numberFormats']>>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['numberFormats']>, keyof std.NonNullable<Context['numberFormats']>> */ js.Any] */, Value /* <: Double */, Key /* <: String */, ResourceKeys /* <: PickupFormatKeys[
/* import warning: importer.ImportType#apply Failed type conversion: Context['numberFormats'] */ js.Any, 
/* keyof Context['numberFormats'] */ String] */, Message](
  context: Context,
  value: Value,
  keyOrOptions: NumberOptions[
  Key | ResourceKeys, 
  /* import warning: importer.ImportType#apply Failed type conversion: Context['locale'] */ js.Any
],
  locale: /* import warning: importer.ImportType#apply Failed type conversion: Context['locale'] */ js.Any,
  `override`: typings.std.Intl.NumberFormatOptions
): String | Double | js.Array[NumberFormatPart] = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(context.asInstanceOf[js.Any], value.asInstanceOf[js.Any], keyOrOptions.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], `override`.asInstanceOf[js.Any])).asInstanceOf[String | Double | js.Array[NumberFormatPart]]
inline def number_locale[Context /* <: CoreContext[
Message, 
js.Object, 
js.Object, 
/* import warning: importer.ImportType#apply Failed type conversion: Context['numberFormats'] */ js.Any, 
PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['numberFormats'] */ js.Any
  ]) | js.Object, 
  /* keyof / * Inlined std.NonNullable<{}> * /
{} */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['numberFormats']>, keyof std.NonNullable<Context['numberFormats']>>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['numberFormats']>, keyof std.NonNullable<Context['numberFormats']>> */ js.Any] */, Value /* <: Double */, Key /* <: String */, ResourceKeys /* <: PickupFormatKeys[
/* import warning: importer.ImportType#apply Failed type conversion: Context['numberFormats'] */ js.Any, 
/* keyof Context['numberFormats'] */ String] */, Message](
  context: Context,
  value: Value,
  keyOrOptions: NumberOptions[
  Key | ResourceKeys, 
  /* import warning: importer.ImportType#apply Failed type conversion: Context['locale'] */ js.Any
],
  `override`: typings.std.Intl.NumberFormatOptions
): String | Double | js.Array[NumberFormatPart] = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(context.asInstanceOf[js.Any], value.asInstanceOf[js.Any], keyOrOptions.asInstanceOf[js.Any], `override`.asInstanceOf[js.Any])).asInstanceOf[String | Double | js.Array[NumberFormatPart]]

inline def parse(path: Path): js.UndefOr[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(path.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Array[String]]]

inline def registerLocaleFallbacker(fallbacker: LocaleFallbacker): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerLocaleFallbacker")(fallbacker.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def registerMessageCompiler[Message](compiler: MessageCompiler[Message]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerMessageCompiler")(compiler.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def registerMessageResolver(resolver: MessageResolver): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerMessageResolver")(resolver.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def resolveValue(obj: Any, path: Path): PathValue = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveValue")(obj.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[PathValue]

inline def resolveWithKeyValue(obj: Any, path: Path): PathValue = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveWithKeyValue")(obj.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[PathValue]

inline def setAdditionalMeta(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAdditionalMeta")().asInstanceOf[Unit]
inline def setAdditionalMeta(meta: MetaInfo): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAdditionalMeta")(meta.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def setDevToolsHook(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDevToolsHook")().asInstanceOf[Unit]
inline def setDevToolsHook(hook: IntlifyDevToolsEmitter): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDevToolsHook")(hook.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def setFallbackContext(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setFallbackContext")().asInstanceOf[Unit]
inline def setFallbackContext(
  context: CoreContext[
  String, 
  js.Object, 
  js.Object, 
  js.Object, 
  PickupLocales[js.Object, /* keyof / * Inlined std.NonNullable<{}> * /
{} */ String], 
  /* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> */ js.Any
]
): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setFallbackContext")(context.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def translate[Context /* <: CoreContext[
Message, 
/* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any, 
js.Object, 
js.Object, 
PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any
  ]) | js.Object, 
  /* keyof std.NonNullable<Context['messages']> */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['messages']>, keyof std.NonNullable<Context['messages']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['messages']>, keyof std.NonNullable<Context['messages']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> */ js.Any] */, Key /* <: String */, ResourceKeys /* <: PickupKeys[
/* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any, 
/* keyof Context['messages'] */ String] */, Message](context: Context, key: Key | ResourceKeys): MessageType[Message] | Double = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(context.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[MessageType[Message] | Double]
inline def translate[Context /* <: CoreContext[
Message, 
/* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any, 
js.Object, 
js.Object, 
PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any
  ]) | js.Object, 
  /* keyof std.NonNullable<Context['messages']> */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['messages']>, keyof std.NonNullable<Context['messages']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['messages']>, keyof std.NonNullable<Context['messages']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> */ js.Any] */, Key /* <: String */, ResourceKeys /* <: PickupKeys[
/* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any, 
/* keyof Context['messages'] */ String] */, Message](context: Context, key: Key | ResourceKeys, defaultMsg: String): MessageType[Message] | Double = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(context.asInstanceOf[js.Any], key.asInstanceOf[js.Any], defaultMsg.asInstanceOf[js.Any])).asInstanceOf[MessageType[Message] | Double]
inline def translate[Context /* <: CoreContext[
Message, 
/* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any, 
js.Object, 
js.Object, 
PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any
  ]) | js.Object, 
  /* keyof std.NonNullable<Context['messages']> */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['messages']>, keyof std.NonNullable<Context['messages']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['messages']>, keyof std.NonNullable<Context['messages']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> */ js.Any] */, Key /* <: String */, ResourceKeys /* <: PickupKeys[
/* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any, 
/* keyof Context['messages'] */ String] */, Message](context: Context, key: Key | ResourceKeys, list: js.Array[Any]): MessageType[Message] | Double = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(context.asInstanceOf[js.Any], key.asInstanceOf[js.Any], list.asInstanceOf[js.Any])).asInstanceOf[MessageType[Message] | Double]
inline def translate[Context /* <: CoreContext[
Message, 
/* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any, 
js.Object, 
js.Object, 
PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any
  ]) | js.Object, 
  /* keyof std.NonNullable<Context['messages']> */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['messages']>, keyof std.NonNullable<Context['messages']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['messages']>, keyof std.NonNullable<Context['messages']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> */ js.Any] */, Key /* <: String */, ResourceKeys /* <: PickupKeys[
/* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any, 
/* keyof Context['messages'] */ String] */, Message](context: Context, key: Key | ResourceKeys, list: js.Array[Any], defaultMsg: String): MessageType[Message] | Double = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(context.asInstanceOf[js.Any], key.asInstanceOf[js.Any], list.asInstanceOf[js.Any], defaultMsg.asInstanceOf[js.Any])).asInstanceOf[MessageType[Message] | Double]
inline def translate[Context /* <: CoreContext[
Message, 
/* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any, 
js.Object, 
js.Object, 
PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any
  ]) | js.Object, 
  /* keyof std.NonNullable<Context['messages']> */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['messages']>, keyof std.NonNullable<Context['messages']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['messages']>, keyof std.NonNullable<Context['messages']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> */ js.Any] */, Key /* <: String */, ResourceKeys /* <: PickupKeys[
/* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any, 
/* keyof Context['messages'] */ String] */, Message](context: Context, key: Key | ResourceKeys, list: js.Array[Any], plural: Double): MessageType[Message] | Double = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(context.asInstanceOf[js.Any], key.asInstanceOf[js.Any], list.asInstanceOf[js.Any], plural.asInstanceOf[js.Any])).asInstanceOf[MessageType[Message] | Double]
inline def translate[Context /* <: CoreContext[
Message, 
/* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any, 
js.Object, 
js.Object, 
PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any
  ]) | js.Object, 
  /* keyof std.NonNullable<Context['messages']> */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['messages']>, keyof std.NonNullable<Context['messages']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['messages']>, keyof std.NonNullable<Context['messages']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> */ js.Any] */, Key /* <: String */, ResourceKeys /* <: PickupKeys[
/* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any, 
/* keyof Context['messages'] */ String] */, Message](context: Context, key: Key | ResourceKeys, named: NamedValue[js.Object]): MessageType[Message] | Double = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(context.asInstanceOf[js.Any], key.asInstanceOf[js.Any], named.asInstanceOf[js.Any])).asInstanceOf[MessageType[Message] | Double]
inline def translate[Context /* <: CoreContext[
Message, 
/* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any, 
js.Object, 
js.Object, 
PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any
  ]) | js.Object, 
  /* keyof std.NonNullable<Context['messages']> */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['messages']>, keyof std.NonNullable<Context['messages']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['messages']>, keyof std.NonNullable<Context['messages']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> */ js.Any] */, Key /* <: String */, ResourceKeys /* <: PickupKeys[
/* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any, 
/* keyof Context['messages'] */ String] */, Message](context: Context, key: Key | ResourceKeys, named: NamedValue[js.Object], defaultMsg: String): MessageType[Message] | Double = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(context.asInstanceOf[js.Any], key.asInstanceOf[js.Any], named.asInstanceOf[js.Any], defaultMsg.asInstanceOf[js.Any])).asInstanceOf[MessageType[Message] | Double]
inline def translate[Context /* <: CoreContext[
Message, 
/* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any, 
js.Object, 
js.Object, 
PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any
  ]) | js.Object, 
  /* keyof std.NonNullable<Context['messages']> */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['messages']>, keyof std.NonNullable<Context['messages']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['messages']>, keyof std.NonNullable<Context['messages']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> */ js.Any] */, Key /* <: String */, ResourceKeys /* <: PickupKeys[
/* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any, 
/* keyof Context['messages'] */ String] */, Message](context: Context, key: Key | ResourceKeys, named: NamedValue[js.Object], plural: Double): MessageType[Message] | Double = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(context.asInstanceOf[js.Any], key.asInstanceOf[js.Any], named.asInstanceOf[js.Any], plural.asInstanceOf[js.Any])).asInstanceOf[MessageType[Message] | Double]
inline def translate[Context /* <: CoreContext[
Message, 
/* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any, 
js.Object, 
js.Object, 
PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any
  ]) | js.Object, 
  /* keyof std.NonNullable<Context['messages']> */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['messages']>, keyof std.NonNullable<Context['messages']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['messages']>, keyof std.NonNullable<Context['messages']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> */ js.Any] */, Key /* <: String */, ResourceKeys /* <: PickupKeys[
/* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any, 
/* keyof Context['messages'] */ String] */, Message](context: Context, key: Key | ResourceKeys, plural: Double): MessageType[Message] | Double = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(context.asInstanceOf[js.Any], key.asInstanceOf[js.Any], plural.asInstanceOf[js.Any])).asInstanceOf[MessageType[Message] | Double]
inline def translate[Context /* <: CoreContext[
Message, 
/* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any, 
js.Object, 
js.Object, 
PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any
  ]) | js.Object, 
  /* keyof std.NonNullable<Context['messages']> */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['messages']>, keyof std.NonNullable<Context['messages']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['messages']>, keyof std.NonNullable<Context['messages']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> */ js.Any] */, Key /* <: String */, ResourceKeys /* <: PickupKeys[
/* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any, 
/* keyof Context['messages'] */ String] */, Message](context: Context, key: Double): MessageType[Message] | Double = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(context.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[MessageType[Message] | Double]
inline def translate[Context /* <: CoreContext[
Message, 
/* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any, 
js.Object, 
js.Object, 
PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any
  ]) | js.Object, 
  /* keyof std.NonNullable<Context['messages']> */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['messages']>, keyof std.NonNullable<Context['messages']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['messages']>, keyof std.NonNullable<Context['messages']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> */ js.Any] */, Key /* <: String */, ResourceKeys /* <: PickupKeys[
/* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any, 
/* keyof Context['messages'] */ String] */, Message](context: Context, key: Double, defaultMsg: String): MessageType[Message] | Double = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(context.asInstanceOf[js.Any], key.asInstanceOf[js.Any], defaultMsg.asInstanceOf[js.Any])).asInstanceOf[MessageType[Message] | Double]
inline def translate[Context /* <: CoreContext[
Message, 
/* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any, 
js.Object, 
js.Object, 
PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any
  ]) | js.Object, 
  /* keyof std.NonNullable<Context['messages']> */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['messages']>, keyof std.NonNullable<Context['messages']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['messages']>, keyof std.NonNullable<Context['messages']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> */ js.Any] */, Key /* <: String */, ResourceKeys /* <: PickupKeys[
/* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any, 
/* keyof Context['messages'] */ String] */, Message](context: Context, key: Double, list: js.Array[Any]): MessageType[Message] | Double = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(context.asInstanceOf[js.Any], key.asInstanceOf[js.Any], list.asInstanceOf[js.Any])).asInstanceOf[MessageType[Message] | Double]
inline def translate[Context /* <: CoreContext[
Message, 
/* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any, 
js.Object, 
js.Object, 
PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any
  ]) | js.Object, 
  /* keyof std.NonNullable<Context['messages']> */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['messages']>, keyof std.NonNullable<Context['messages']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['messages']>, keyof std.NonNullable<Context['messages']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> */ js.Any] */, Key /* <: String */, ResourceKeys /* <: PickupKeys[
/* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any, 
/* keyof Context['messages'] */ String] */, Message](context: Context, key: Double, list: js.Array[Any], defaultMsg: String): MessageType[Message] | Double = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(context.asInstanceOf[js.Any], key.asInstanceOf[js.Any], list.asInstanceOf[js.Any], defaultMsg.asInstanceOf[js.Any])).asInstanceOf[MessageType[Message] | Double]
inline def translate[Context /* <: CoreContext[
Message, 
/* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any, 
js.Object, 
js.Object, 
PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any
  ]) | js.Object, 
  /* keyof std.NonNullable<Context['messages']> */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['messages']>, keyof std.NonNullable<Context['messages']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['messages']>, keyof std.NonNullable<Context['messages']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> */ js.Any] */, Key /* <: String */, ResourceKeys /* <: PickupKeys[
/* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any, 
/* keyof Context['messages'] */ String] */, Message](context: Context, key: Double, list: js.Array[Any], plural: Double): MessageType[Message] | Double = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(context.asInstanceOf[js.Any], key.asInstanceOf[js.Any], list.asInstanceOf[js.Any], plural.asInstanceOf[js.Any])).asInstanceOf[MessageType[Message] | Double]
inline def translate[Context /* <: CoreContext[
Message, 
/* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any, 
js.Object, 
js.Object, 
PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any
  ]) | js.Object, 
  /* keyof std.NonNullable<Context['messages']> */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['messages']>, keyof std.NonNullable<Context['messages']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['messages']>, keyof std.NonNullable<Context['messages']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> */ js.Any] */, Key /* <: String */, ResourceKeys /* <: PickupKeys[
/* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any, 
/* keyof Context['messages'] */ String] */, Message](context: Context, key: Double, named: NamedValue[js.Object]): MessageType[Message] | Double = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(context.asInstanceOf[js.Any], key.asInstanceOf[js.Any], named.asInstanceOf[js.Any])).asInstanceOf[MessageType[Message] | Double]
inline def translate[Context /* <: CoreContext[
Message, 
/* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any, 
js.Object, 
js.Object, 
PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any
  ]) | js.Object, 
  /* keyof std.NonNullable<Context['messages']> */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['messages']>, keyof std.NonNullable<Context['messages']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['messages']>, keyof std.NonNullable<Context['messages']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> */ js.Any] */, Key /* <: String */, ResourceKeys /* <: PickupKeys[
/* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any, 
/* keyof Context['messages'] */ String] */, Message](context: Context, key: Double, named: NamedValue[js.Object], defaultMsg: String): MessageType[Message] | Double = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(context.asInstanceOf[js.Any], key.asInstanceOf[js.Any], named.asInstanceOf[js.Any], defaultMsg.asInstanceOf[js.Any])).asInstanceOf[MessageType[Message] | Double]
inline def translate[Context /* <: CoreContext[
Message, 
/* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any, 
js.Object, 
js.Object, 
PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any
  ]) | js.Object, 
  /* keyof std.NonNullable<Context['messages']> */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['messages']>, keyof std.NonNullable<Context['messages']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['messages']>, keyof std.NonNullable<Context['messages']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> */ js.Any] */, Key /* <: String */, ResourceKeys /* <: PickupKeys[
/* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any, 
/* keyof Context['messages'] */ String] */, Message](context: Context, key: Double, named: NamedValue[js.Object], plural: Double): MessageType[Message] | Double = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(context.asInstanceOf[js.Any], key.asInstanceOf[js.Any], named.asInstanceOf[js.Any], plural.asInstanceOf[js.Any])).asInstanceOf[MessageType[Message] | Double]
inline def translate[Context /* <: CoreContext[
Message, 
/* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any, 
js.Object, 
js.Object, 
PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any
  ]) | js.Object, 
  /* keyof std.NonNullable<Context['messages']> */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['messages']>, keyof std.NonNullable<Context['messages']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['messages']>, keyof std.NonNullable<Context['messages']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> */ js.Any] */, Key /* <: String */, ResourceKeys /* <: PickupKeys[
/* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any, 
/* keyof Context['messages'] */ String] */, Message](context: Context, key: Double, plural: Double): MessageType[Message] | Double = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(context.asInstanceOf[js.Any], key.asInstanceOf[js.Any], plural.asInstanceOf[js.Any])).asInstanceOf[MessageType[Message] | Double]
inline def translate[Context /* <: CoreContext[
Message, 
/* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any, 
js.Object, 
js.Object, 
PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any
  ]) | js.Object, 
  /* keyof std.NonNullable<Context['messages']> */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['messages']>, keyof std.NonNullable<Context['messages']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['messages']>, keyof std.NonNullable<Context['messages']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> */ js.Any] */, Key /* <: String */, ResourceKeys /* <: PickupKeys[
/* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any, 
/* keyof Context['messages'] */ String] */, Message](context: Context, key: MessageFunction[Message]): MessageType[Message] | Double = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(context.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[MessageType[Message] | Double]
inline def translate[Context /* <: CoreContext[
Message, 
/* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any, 
js.Object, 
js.Object, 
PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any
  ]) | js.Object, 
  /* keyof std.NonNullable<Context['messages']> */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['messages']>, keyof std.NonNullable<Context['messages']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['messages']>, keyof std.NonNullable<Context['messages']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> */ js.Any] */, Key /* <: String */, ResourceKeys /* <: PickupKeys[
/* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any, 
/* keyof Context['messages'] */ String] */, Message](context: Context, key: MessageFunction[Message], defaultMsg: String): MessageType[Message] | Double = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(context.asInstanceOf[js.Any], key.asInstanceOf[js.Any], defaultMsg.asInstanceOf[js.Any])).asInstanceOf[MessageType[Message] | Double]
inline def translate[Context /* <: CoreContext[
Message, 
/* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any, 
js.Object, 
js.Object, 
PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any
  ]) | js.Object, 
  /* keyof std.NonNullable<Context['messages']> */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['messages']>, keyof std.NonNullable<Context['messages']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['messages']>, keyof std.NonNullable<Context['messages']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> */ js.Any] */, Key /* <: String */, ResourceKeys /* <: PickupKeys[
/* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any, 
/* keyof Context['messages'] */ String] */, Message](context: Context, key: MessageFunction[Message], list: js.Array[Any]): MessageType[Message] | Double = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(context.asInstanceOf[js.Any], key.asInstanceOf[js.Any], list.asInstanceOf[js.Any])).asInstanceOf[MessageType[Message] | Double]
inline def translate[Context /* <: CoreContext[
Message, 
/* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any, 
js.Object, 
js.Object, 
PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any
  ]) | js.Object, 
  /* keyof std.NonNullable<Context['messages']> */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['messages']>, keyof std.NonNullable<Context['messages']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['messages']>, keyof std.NonNullable<Context['messages']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> */ js.Any] */, Key /* <: String */, ResourceKeys /* <: PickupKeys[
/* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any, 
/* keyof Context['messages'] */ String] */, Message](context: Context, key: MessageFunction[Message], list: js.Array[Any], defaultMsg: String): MessageType[Message] | Double = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(context.asInstanceOf[js.Any], key.asInstanceOf[js.Any], list.asInstanceOf[js.Any], defaultMsg.asInstanceOf[js.Any])).asInstanceOf[MessageType[Message] | Double]
inline def translate[Context /* <: CoreContext[
Message, 
/* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any, 
js.Object, 
js.Object, 
PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any
  ]) | js.Object, 
  /* keyof std.NonNullable<Context['messages']> */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['messages']>, keyof std.NonNullable<Context['messages']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['messages']>, keyof std.NonNullable<Context['messages']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> */ js.Any] */, Key /* <: String */, ResourceKeys /* <: PickupKeys[
/* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any, 
/* keyof Context['messages'] */ String] */, Message](context: Context, key: MessageFunction[Message], list: js.Array[Any], plural: Double): MessageType[Message] | Double = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(context.asInstanceOf[js.Any], key.asInstanceOf[js.Any], list.asInstanceOf[js.Any], plural.asInstanceOf[js.Any])).asInstanceOf[MessageType[Message] | Double]
inline def translate[Context /* <: CoreContext[
Message, 
/* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any, 
js.Object, 
js.Object, 
PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any
  ]) | js.Object, 
  /* keyof std.NonNullable<Context['messages']> */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['messages']>, keyof std.NonNullable<Context['messages']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['messages']>, keyof std.NonNullable<Context['messages']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> */ js.Any] */, Key /* <: String */, ResourceKeys /* <: PickupKeys[
/* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any, 
/* keyof Context['messages'] */ String] */, Message](context: Context, key: MessageFunction[Message], named: NamedValue[js.Object]): MessageType[Message] | Double = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(context.asInstanceOf[js.Any], key.asInstanceOf[js.Any], named.asInstanceOf[js.Any])).asInstanceOf[MessageType[Message] | Double]
inline def translate[Context /* <: CoreContext[
Message, 
/* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any, 
js.Object, 
js.Object, 
PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any
  ]) | js.Object, 
  /* keyof std.NonNullable<Context['messages']> */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['messages']>, keyof std.NonNullable<Context['messages']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['messages']>, keyof std.NonNullable<Context['messages']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> */ js.Any] */, Key /* <: String */, ResourceKeys /* <: PickupKeys[
/* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any, 
/* keyof Context['messages'] */ String] */, Message](context: Context, key: MessageFunction[Message], named: NamedValue[js.Object], defaultMsg: String): MessageType[Message] | Double = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(context.asInstanceOf[js.Any], key.asInstanceOf[js.Any], named.asInstanceOf[js.Any], defaultMsg.asInstanceOf[js.Any])).asInstanceOf[MessageType[Message] | Double]
inline def translate[Context /* <: CoreContext[
Message, 
/* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any, 
js.Object, 
js.Object, 
PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any
  ]) | js.Object, 
  /* keyof std.NonNullable<Context['messages']> */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['messages']>, keyof std.NonNullable<Context['messages']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['messages']>, keyof std.NonNullable<Context['messages']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> */ js.Any] */, Key /* <: String */, ResourceKeys /* <: PickupKeys[
/* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any, 
/* keyof Context['messages'] */ String] */, Message](context: Context, key: MessageFunction[Message], named: NamedValue[js.Object], plural: Double): MessageType[Message] | Double = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(context.asInstanceOf[js.Any], key.asInstanceOf[js.Any], named.asInstanceOf[js.Any], plural.asInstanceOf[js.Any])).asInstanceOf[MessageType[Message] | Double]
inline def translate[Context /* <: CoreContext[
Message, 
/* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any, 
js.Object, 
js.Object, 
PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any
  ]) | js.Object, 
  /* keyof std.NonNullable<Context['messages']> */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['messages']>, keyof std.NonNullable<Context['messages']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['messages']>, keyof std.NonNullable<Context['messages']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> */ js.Any] */, Key /* <: String */, ResourceKeys /* <: PickupKeys[
/* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any, 
/* keyof Context['messages'] */ String] */, Message](context: Context, key: MessageFunction[Message], plural: Double): MessageType[Message] | Double = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(context.asInstanceOf[js.Any], key.asInstanceOf[js.Any], plural.asInstanceOf[js.Any])).asInstanceOf[MessageType[Message] | Double]

inline def translateDevTools(
  payloads: /* import warning: importer.ImportType#apply Failed type conversion: @intlify/devtools-if.@intlify/devtools-if.IntlifyDevToolsHookPayloads[@intlify/devtools-if.@intlify/devtools-if.IntlifyDevToolsHooks] */ js.Any
): Unit | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("translateDevTools")(payloads.asInstanceOf[js.Any]).asInstanceOf[Unit | Null]

inline def translate_locale[Context /* <: CoreContext[
Message, 
/* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any, 
js.Object, 
js.Object, 
PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any
  ]) | js.Object, 
  /* keyof std.NonNullable<Context['messages']> */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['messages']>, keyof std.NonNullable<Context['messages']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['messages']>, keyof std.NonNullable<Context['messages']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> */ js.Any] */, Key /* <: String */, ResourceKeys /* <: PickupKeys[
/* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any, 
/* keyof Context['messages'] */ String] */, Message](
  context: Context,
  key: Key | ResourceKeys,
  defaultMsg: String,
  options: TranslateOptions[
  /* import warning: importer.ImportType#apply Failed type conversion: Context['locale'] */ js.Any
]
): MessageType[Message] | Double = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(context.asInstanceOf[js.Any], key.asInstanceOf[js.Any], defaultMsg.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[MessageType[Message] | Double]
inline def translate_locale[Context /* <: CoreContext[
Message, 
/* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any, 
js.Object, 
js.Object, 
PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any
  ]) | js.Object, 
  /* keyof std.NonNullable<Context['messages']> */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['messages']>, keyof std.NonNullable<Context['messages']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['messages']>, keyof std.NonNullable<Context['messages']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> */ js.Any] */, Key /* <: String */, ResourceKeys /* <: PickupKeys[
/* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any, 
/* keyof Context['messages'] */ String] */, Message](
  context: Context,
  key: Key | ResourceKeys,
  list: js.Array[Any],
  options: TranslateOptions[
  /* import warning: importer.ImportType#apply Failed type conversion: Context['locale'] */ js.Any
]
): MessageType[Message] | Double = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(context.asInstanceOf[js.Any], key.asInstanceOf[js.Any], list.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[MessageType[Message] | Double]
inline def translate_locale[Context /* <: CoreContext[
Message, 
/* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any, 
js.Object, 
js.Object, 
PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any
  ]) | js.Object, 
  /* keyof std.NonNullable<Context['messages']> */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['messages']>, keyof std.NonNullable<Context['messages']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['messages']>, keyof std.NonNullable<Context['messages']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> */ js.Any] */, Key /* <: String */, ResourceKeys /* <: PickupKeys[
/* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any, 
/* keyof Context['messages'] */ String] */, Message](
  context: Context,
  key: Key | ResourceKeys,
  named: NamedValue[js.Object],
  options: TranslateOptions[
  /* import warning: importer.ImportType#apply Failed type conversion: Context['locale'] */ js.Any
]
): MessageType[Message] | Double = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(context.asInstanceOf[js.Any], key.asInstanceOf[js.Any], named.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[MessageType[Message] | Double]
inline def translate_locale[Context /* <: CoreContext[
Message, 
/* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any, 
js.Object, 
js.Object, 
PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any
  ]) | js.Object, 
  /* keyof std.NonNullable<Context['messages']> */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['messages']>, keyof std.NonNullable<Context['messages']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['messages']>, keyof std.NonNullable<Context['messages']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> */ js.Any] */, Key /* <: String */, ResourceKeys /* <: PickupKeys[
/* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any, 
/* keyof Context['messages'] */ String] */, Message](
  context: Context,
  key: Key | ResourceKeys,
  plural: Double,
  options: TranslateOptions[
  /* import warning: importer.ImportType#apply Failed type conversion: Context['locale'] */ js.Any
]
): MessageType[Message] | Double = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(context.asInstanceOf[js.Any], key.asInstanceOf[js.Any], plural.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[MessageType[Message] | Double]
inline def translate_locale[Context /* <: CoreContext[
Message, 
/* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any, 
js.Object, 
js.Object, 
PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any
  ]) | js.Object, 
  /* keyof std.NonNullable<Context['messages']> */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['messages']>, keyof std.NonNullable<Context['messages']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['messages']>, keyof std.NonNullable<Context['messages']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> */ js.Any] */, Key /* <: String */, ResourceKeys /* <: PickupKeys[
/* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any, 
/* keyof Context['messages'] */ String] */, Message](
  context: Context,
  key: Double,
  defaultMsg: String,
  options: TranslateOptions[
  /* import warning: importer.ImportType#apply Failed type conversion: Context['locale'] */ js.Any
]
): MessageType[Message] | Double = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(context.asInstanceOf[js.Any], key.asInstanceOf[js.Any], defaultMsg.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[MessageType[Message] | Double]
inline def translate_locale[Context /* <: CoreContext[
Message, 
/* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any, 
js.Object, 
js.Object, 
PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any
  ]) | js.Object, 
  /* keyof std.NonNullable<Context['messages']> */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['messages']>, keyof std.NonNullable<Context['messages']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['messages']>, keyof std.NonNullable<Context['messages']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> */ js.Any] */, Key /* <: String */, ResourceKeys /* <: PickupKeys[
/* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any, 
/* keyof Context['messages'] */ String] */, Message](
  context: Context,
  key: Double,
  list: js.Array[Any],
  options: TranslateOptions[
  /* import warning: importer.ImportType#apply Failed type conversion: Context['locale'] */ js.Any
]
): MessageType[Message] | Double = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(context.asInstanceOf[js.Any], key.asInstanceOf[js.Any], list.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[MessageType[Message] | Double]
inline def translate_locale[Context /* <: CoreContext[
Message, 
/* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any, 
js.Object, 
js.Object, 
PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any
  ]) | js.Object, 
  /* keyof std.NonNullable<Context['messages']> */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['messages']>, keyof std.NonNullable<Context['messages']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['messages']>, keyof std.NonNullable<Context['messages']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> */ js.Any] */, Key /* <: String */, ResourceKeys /* <: PickupKeys[
/* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any, 
/* keyof Context['messages'] */ String] */, Message](
  context: Context,
  key: Double,
  named: NamedValue[js.Object],
  options: TranslateOptions[
  /* import warning: importer.ImportType#apply Failed type conversion: Context['locale'] */ js.Any
]
): MessageType[Message] | Double = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(context.asInstanceOf[js.Any], key.asInstanceOf[js.Any], named.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[MessageType[Message] | Double]
inline def translate_locale[Context /* <: CoreContext[
Message, 
/* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any, 
js.Object, 
js.Object, 
PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any
  ]) | js.Object, 
  /* keyof std.NonNullable<Context['messages']> */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['messages']>, keyof std.NonNullable<Context['messages']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['messages']>, keyof std.NonNullable<Context['messages']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> */ js.Any] */, Key /* <: String */, ResourceKeys /* <: PickupKeys[
/* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any, 
/* keyof Context['messages'] */ String] */, Message](
  context: Context,
  key: Double,
  plural: Double,
  options: TranslateOptions[
  /* import warning: importer.ImportType#apply Failed type conversion: Context['locale'] */ js.Any
]
): MessageType[Message] | Double = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(context.asInstanceOf[js.Any], key.asInstanceOf[js.Any], plural.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[MessageType[Message] | Double]
inline def translate_locale[Context /* <: CoreContext[
Message, 
/* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any, 
js.Object, 
js.Object, 
PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any
  ]) | js.Object, 
  /* keyof std.NonNullable<Context['messages']> */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['messages']>, keyof std.NonNullable<Context['messages']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['messages']>, keyof std.NonNullable<Context['messages']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> */ js.Any] */, Key /* <: String */, ResourceKeys /* <: PickupKeys[
/* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any, 
/* keyof Context['messages'] */ String] */, Message](
  context: Context,
  key: MessageFunction[Message],
  defaultMsg: String,
  options: TranslateOptions[
  /* import warning: importer.ImportType#apply Failed type conversion: Context['locale'] */ js.Any
]
): MessageType[Message] | Double = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(context.asInstanceOf[js.Any], key.asInstanceOf[js.Any], defaultMsg.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[MessageType[Message] | Double]
inline def translate_locale[Context /* <: CoreContext[
Message, 
/* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any, 
js.Object, 
js.Object, 
PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any
  ]) | js.Object, 
  /* keyof std.NonNullable<Context['messages']> */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['messages']>, keyof std.NonNullable<Context['messages']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['messages']>, keyof std.NonNullable<Context['messages']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> */ js.Any] */, Key /* <: String */, ResourceKeys /* <: PickupKeys[
/* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any, 
/* keyof Context['messages'] */ String] */, Message](
  context: Context,
  key: MessageFunction[Message],
  list: js.Array[Any],
  options: TranslateOptions[
  /* import warning: importer.ImportType#apply Failed type conversion: Context['locale'] */ js.Any
]
): MessageType[Message] | Double = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(context.asInstanceOf[js.Any], key.asInstanceOf[js.Any], list.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[MessageType[Message] | Double]
inline def translate_locale[Context /* <: CoreContext[
Message, 
/* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any, 
js.Object, 
js.Object, 
PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any
  ]) | js.Object, 
  /* keyof std.NonNullable<Context['messages']> */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['messages']>, keyof std.NonNullable<Context['messages']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['messages']>, keyof std.NonNullable<Context['messages']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> */ js.Any] */, Key /* <: String */, ResourceKeys /* <: PickupKeys[
/* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any, 
/* keyof Context['messages'] */ String] */, Message](
  context: Context,
  key: MessageFunction[Message],
  named: NamedValue[js.Object],
  options: TranslateOptions[
  /* import warning: importer.ImportType#apply Failed type conversion: Context['locale'] */ js.Any
]
): MessageType[Message] | Double = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(context.asInstanceOf[js.Any], key.asInstanceOf[js.Any], named.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[MessageType[Message] | Double]
inline def translate_locale[Context /* <: CoreContext[
Message, 
/* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any, 
js.Object, 
js.Object, 
PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any
  ]) | js.Object, 
  /* keyof std.NonNullable<Context['messages']> */ String
], 
/* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['messages']>, keyof std.NonNullable<Context['messages']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<Context['messages']>, keyof std.NonNullable<Context['messages']>> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> */ js.Any] */, Key /* <: String */, ResourceKeys /* <: PickupKeys[
/* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any, 
/* keyof Context['messages'] */ String] */, Message](
  context: Context,
  key: MessageFunction[Message],
  plural: Double,
  options: TranslateOptions[
  /* import warning: importer.ImportType#apply Failed type conversion: Context['locale'] */ js.Any
]
): MessageType[Message] | Double = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(context.asInstanceOf[js.Any], key.asInstanceOf[js.Any], plural.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[MessageType[Message] | Double]

type DateTimeFormat = StringDictionary[DateTimeFormatOptions]

type DateTimeFormatOptions = typings.std.Intl.DateTimeFormatOptions | SpecificDateTimeFormatOptions

type DateTimeFormats[Schema, Locales] = LocaleRecord[UnionToTuple[Locales, LastInUnion[Locales]], Schema]

type ExtractToStringFunction[T] = /* import warning: importer.ImportType#apply Failed type conversion: T[@intlify/core-base.@intlify/core-base.ExtractToStringKey<T>] */ js.Any

type ExtractToStringKey[T] = Extract[/* keyof T */ String, toString]

type FallbackLocale = Locale | js.Array[Locale] | (/* import warning: importer.ImportType#apply Failed type conversion: {[ locale in string ]: std.Array<@intlify/core-base.@intlify/core-base.Locale>} */ js.Any) | `false`

type FallbackLocales[Locales] = Locales | js.Array[Locales] | (/* import warning: importer.ImportType#apply Failed type conversion: {[ locale in string ]: std.Array<@intlify/core-base.@intlify/core-base.PickupFallbackLocales<@intlify/core-base.@intlify/core-base.UnionToTuple<Locales, @intlify/core-base.@intlify/core-base.LastInUnion<Locales>>>>} */ js.Any) | `false`

type First[T /* <: js.Array[Any] */] = /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  [keyof T] extends [never] ? true : false
  }}}
  */
type IsEmptyObject[T] = `true`

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  [T] extends [never] ? true : false
  }}}
  */
type IsNever[T] = `true`

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends B ? [B] extends [T] ? false : true : never
  }}}
  */
type IsUnion[T, B] = `false`

type LinkedModifiers[T] = StringDictionary[LinkedModify[T]]

type LinkedModify[T] = js.Function2[/* value */ T, /* type */ String, MessageType[T]]

type Locale = String

type LocaleFallbacker = js.Function3[
/* ctx */ CoreContext[
  String, 
  js.Object, 
  js.Object, 
  js.Object, 
  PickupLocales[js.Object, /* keyof / * Inlined std.NonNullable<{}> * /
{} */ String], 
  /* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> | @intlify/core-base.@intlify/core-base.PickupLocales</ * Inlined std.NonNullable<{}> * /
{}, keyof / * Inlined std.NonNullable<{}> * /
{}> */ js.Any
], 
/* fallback */ FallbackLocale, 
/* start */ Locale, 
js.Array[Locale]]

type LocaleMessage[Message] = Record[String, LocaleMessageValue[Message]]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends string ? string : T extends (): std.Promise<infer P> ? @intlify/core-base.@intlify/core-base.LocaleMessageDictionary<P, Message> : T extends (args : infer Arguments): any ? (args : Arguments): std.ReturnType<T> : T extends std.Record<string, any> ? @intlify/core-base.@intlify/core-base.LocaleMessageDictionary<T, Message> : T extends std.Array<T> ? {[ K in keyof T ]: T[K]} : T
  }}}
  */
type LocaleMessageType[T, Message] = String

type LocaleMessageValue[Message] = (LocaleMessageDictionary[Any, Message]) | String

type LocaleMessages[Schema, Locales, Message] = LocaleRecord[UnionToTuple[Locales, LastInUnion[Locales]], Schema]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends @intlify/core-base.@intlify/core-base.IsUnion<T, T> ? T : T extends string ? T : R
  }}}
  */
type LocaleParamsType[T, R] = T

type MessageCompiler[Message] = js.Function2[
/* source */ String, 
/* options */ js.UndefOr[CompileOptions], 
MessageFunction[Message]]

type MessageFunction[T] = MessageFunctionCallable | MessageFunctionInternal[T]

type MessageFunctionCallable = js.Function1[/* ctx */ MessageContext[String], MessageType[String]]

type MessageFunctions[T] = Record[String, MessageFunction[T]]

type MessageInterpolate[T] = js.Function1[/* val */ Any, MessageType[T]]

type MessageNormalize[T] = js.Function1[/* values */ js.Array[MessageType[String | T]], MessageType[T | js.Array[T]]]

type MessageResolveFunction[T] = js.Function1[/* key */ String, MessageFunction[T]]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends string ? string : @intlify/core-base.@intlify/core-base.StringConvertable<T>
  }}}
  */
type MessageType[T] = T

type MetaInfo = StringDictionary[Any]

type NamedValue[T] = T & (Record[String, Any])

type NumberFormat = StringDictionary[NumberFormatOptions]

/* Rewritten from type alias, can be one of: 
  - typings.std.Intl.NumberFormatOptions
  - typings.intlifyCoreBase.mod.SpecificNumberFormatOptions
  - typings.intlifyCoreBase.mod.CurrencyNumberFormatOptions
*/
type NumberFormatOptions = _NumberFormatOptions | typings.std.Intl.NumberFormatOptions

type NumberFormatToPartsResult = NumberDictionary[FormattedNumberPart]

type NumberFormats[Schema, Locales] = LocaleRecord[UnionToTuple[Locales, LastInUnion[Locales]], Schema]

type Path = String

/** 
NOTE: Rewritten from type alias:
{{{
type PathValue = string | number | boolean | std.Function | null | {[key: string] : @intlify/core-base.@intlify/core-base.PathValue} | std.Array<@intlify/core-base.@intlify/core-base.PathValue>
}}}
to avoid circular code involving: 
- @intlify/core-base.@intlify/core-base.PathValue
*/
type PathValue = String | Double | Boolean | js.Function | Null | StringDictionary[Any] | js.Array[Any]

type PickupFallbackLocales[T /* <: js.Array[Any] */] = (/* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any) | (/* template literal string: ${T[number]}! */ String)

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  K extends string ? @intlify/core-base.@intlify/core-base.ResourceFormatPath<T[K]> : never
  }}}
  */
type PickupFormatKeys[T /* <: Record[String, Any] */, K] = _ResourceFormatPath[
/* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any]

type PickupFormatPathKeys[T /* <: js.Object */] = ResourceFormatPath[T]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  K extends string ? @intlify/core-base.@intlify/core-base.ResourcePath<T[K]> : never
  }}}
  */
type PickupKeys[T /* <: Record[String, Any] */, K] = _ResourcePath[
/* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  K extends string ? K : never
  }}}
  */
type PickupLocales[T /* <: Record[String, Any] */, K] = K

type PickupPaths[T /* <: js.Object */] = ResourcePath[T]

type PluralizationRules = StringDictionary[PluralizationRule]

type PostTranslationHandler[Message] = js.Function2[/* translated */ MessageType[Message], /* key */ String, MessageType[Message]]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  @intlify/core-base.@intlify/core-base._ResourceFormatPath<T> extends string | keyof T ? @intlify/core-base.@intlify/core-base._ResourceFormatPath<T> : keyof T
  }}}
  */
type ResourceFormatPath[T] = _ResourceFormatPath[T]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  @intlify/core-base.@intlify/core-base._ResourcePath<T> extends string | keyof T ? @intlify/core-base.@intlify/core-base._ResourcePath<T> : keyof T
  }}}
  */
type ResourcePath[T] = _ResourcePath[T]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  @intlify/core-base.@intlify/core-base.ExtractToStringKey<T> extends never ? unknown : @intlify/core-base.@intlify/core-base.ExtractToStringFunction<T> extends (args : any): string ? T : unknown
  }}}
  */
type StringConvertable[T] = T

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  [U] extends [never] ? [] : [...@intlify/core-base.@intlify/core-base.UnionToTuple<std.Exclude<U, Last>, @intlify/core-base.@intlify/core-base.LastInUnion<std.Exclude<U, Last>>>, Last]
  }}}
  */
type UnionToTuple[U, Last] = js.Array[Any]

type _ResourceFormatPath[T] = (__ResourceFormatPath[T, /* keyof T */ String]) | (/* keyof T */ String)

type _ResourcePath[T] = (__ResourcePath[T, /* keyof T */ String]) | (/* keyof T */ String)

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  Key extends string ? T[Key] extends std.Record<string, any> ? / * template literal string: ${Key} * / string : never : never
  }}}
  */
type __ResourceFormatPath[T, Key /* <: /* keyof T */ String */] = /* template literal string: ${Key} */ String

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  Key extends string ? T[Key] extends std.Record<string, any> ? / * template literal string: ${Key}.${__ResourcePath<T[Key],Exclude<keyofT[Key],keyofany[]>>&string} * / string : never : never
  }}}
  */
type __ResourcePath[T, Key /* <: /* keyof T */ String */] = /* template literal string: ${Key}.${__ResourcePath<T[Key],Exclude<keyofT[Key],keyofany[]>>&string} */ String
