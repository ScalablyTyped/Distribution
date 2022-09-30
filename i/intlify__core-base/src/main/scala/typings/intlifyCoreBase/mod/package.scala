package typings.intlifyCoreBase.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.intlifyCoreBase.anon.Number
import typings.intlifyCoreBase.intlifyCoreBaseBooleans.`false`
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
import typings.std.ReturnType
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
Locale, 
Locale, 
Locale, 
LocaleMessage[Message], 
DateTimeFormat, 
NumberFormat, 
LocaleMessages[LocaleMessage[Message], Locale, Message], 
typings.intlifyCoreBase.mod.DateTimeFormats[DateTimeFormat, Locale], 
typings.intlifyCoreBase.mod.NumberFormats[NumberFormat, Locale]] */, Messages, DateTimeFormats, NumberFormats](options: Options): CoreContext[
Message, 
Messages, 
DateTimeFormats, 
NumberFormats, 
PickupLocales[
  NonNullable[DateTimeFormats | Messages | NumberFormats], 
  /* keyof std.NonNullable<Messages> */ String
], 
(PickupLocales[
  NonNullable[DateTimeFormats | Messages | NumberFormats], 
  /* keyof std.NonNullable<Messages> */ String
]) | Locale] = ^.asInstanceOf[js.Dynamic].applyDynamic("createCoreContext")(options.asInstanceOf[js.Any]).asInstanceOf[CoreContext[
Message, 
Messages, 
DateTimeFormats, 
NumberFormats, 
PickupLocales[
  NonNullable[DateTimeFormats | Messages | NumberFormats], 
  /* keyof std.NonNullable<Messages> */ String
], 
(PickupLocales[
  NonNullable[DateTimeFormats | Messages | NumberFormats], 
  /* keyof std.NonNullable<Messages> */ String
]) | Locale]]

inline def createCoreContext_SchemaLocalesMessageOptionsMessagesDateTimeFormatsNumberFormats[Schema, Locales, Message, Options /* <: CoreOptions[
Message, 
SchemaParams[Schema, Message], 
LocaleParams[Locales, `en-US`], 
Locale | (LocaleParams[Locales, `en-US`]), 
Locale | (LocaleParams[Locales, `en-US`]), 
Locale | (LocaleParams[Locales, `en-US`]), 
LocaleMessage[Message], 
DateTimeFormat, 
NumberFormat, 
LocaleMessages[LocaleMessage[Message], Locale | (LocaleParams[Locales, `en-US`]), Message], 
typings.intlifyCoreBase.mod.DateTimeFormats[DateTimeFormat, Locale | (LocaleParams[Locales, `en-US`])], 
typings.intlifyCoreBase.mod.NumberFormats[NumberFormat, Locale | (LocaleParams[Locales, `en-US`])]] */, Messages, DateTimeFormats, NumberFormats](options: Options): CoreContext[
Message, 
Messages, 
DateTimeFormats, 
NumberFormats, 
PickupLocales[
  NonNullable[DateTimeFormats | Messages | NumberFormats], 
  /* keyof std.NonNullable<Messages> */ String
], 
(PickupLocales[
  NonNullable[DateTimeFormats | Messages | NumberFormats], 
  /* keyof std.NonNullable<Messages> */ String
]) | Locale] = ^.asInstanceOf[js.Dynamic].applyDynamic("createCoreContext")(options.asInstanceOf[js.Any]).asInstanceOf[CoreContext[
Message, 
Messages, 
DateTimeFormats, 
NumberFormats, 
PickupLocales[
  NonNullable[DateTimeFormats | Messages | NumberFormats], 
  /* keyof std.NonNullable<Messages> */ String
], 
(PickupLocales[
  NonNullable[DateTimeFormats | Messages | NumberFormats], 
  /* keyof std.NonNullable<Messages> */ String
]) | Locale]]

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
(PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any
  ]) | js.Object, 
  /* keyof / * Inlined std.NonNullable<{}> * /
{} */ String
]) | Locale] */, Message](context: Context, value: String): String | Double | js.Array[DateTimeFormatPart] = (^.asInstanceOf[js.Dynamic].applyDynamic("datetime")(context.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String | Double | js.Array[DateTimeFormatPart]]
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
(PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any
  ]) | js.Object, 
  /* keyof / * Inlined std.NonNullable<{}> * /
{} */ String
]) | Locale] */, Message](context: Context, value: js.Date): String | Double | js.Array[DateTimeFormatPart] = (^.asInstanceOf[js.Dynamic].applyDynamic("datetime")(context.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String | Double | js.Array[DateTimeFormatPart]]
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
(PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any
  ]) | js.Object, 
  /* keyof / * Inlined std.NonNullable<{}> * /
{} */ String
]) | Locale] */, Message](context: Context, value: Double): String | Double | js.Array[DateTimeFormatPart] = (^.asInstanceOf[js.Dynamic].applyDynamic("datetime")(context.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String | Double | js.Array[DateTimeFormatPart]]
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
(PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any
  ]) | js.Object, 
  /* keyof / * Inlined std.NonNullable<{}> * /
{} */ String
]) | Locale] */, Key /* <: String */, ResourceKeys /* <: PickupFormatKeys[
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
(PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any
  ]) | js.Object, 
  /* keyof / * Inlined std.NonNullable<{}> * /
{} */ String
]) | Locale] */, Key /* <: String */, ResourceKeys /* <: PickupFormatKeys[
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
(PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any
  ]) | js.Object, 
  /* keyof / * Inlined std.NonNullable<{}> * /
{} */ String
]) | Locale] */, Key /* <: String */, ResourceKeys /* <: PickupFormatKeys[
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
(PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any
  ]) | js.Object, 
  /* keyof / * Inlined std.NonNullable<{}> * /
{} */ String
]) | Locale] */, Key /* <: String */, ResourceKeys /* <: PickupFormatKeys[
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
(PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any
  ]) | js.Object, 
  /* keyof / * Inlined std.NonNullable<{}> * /
{} */ String
]) | Locale] */, Key /* <: String */, ResourceKeys /* <: PickupFormatKeys[
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
(PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any
  ]) | js.Object, 
  /* keyof / * Inlined std.NonNullable<{}> * /
{} */ String
]) | Locale] */, Key /* <: String */, ResourceKeys /* <: PickupFormatKeys[
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
(PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any
  ]) | js.Object, 
  /* keyof / * Inlined std.NonNullable<{}> * /
{} */ String
]) | Locale] */, Key /* <: String */, ResourceKeys /* <: PickupFormatKeys[
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
(PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any
  ]) | js.Object, 
  /* keyof / * Inlined std.NonNullable<{}> * /
{} */ String
]) | Locale] */, Key /* <: String */, ResourceKeys /* <: PickupFormatKeys[
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
(PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any
  ]) | js.Object, 
  /* keyof / * Inlined std.NonNullable<{}> * /
{} */ String
]) | Locale] */, Key /* <: String */, ResourceKeys /* <: PickupFormatKeys[
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
(PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any
  ]) | js.Object, 
  /* keyof / * Inlined std.NonNullable<{}> * /
{} */ String
]) | Locale] */, Key /* <: String */, ResourceKeys /* <: PickupFormatKeys[
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
(PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any
  ]) | js.Object, 
  /* keyof / * Inlined std.NonNullable<{}> * /
{} */ String
]) | Locale] */, Key /* <: String */, ResourceKeys /* <: PickupFormatKeys[
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
(PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any
  ]) | js.Object, 
  /* keyof / * Inlined std.NonNullable<{}> * /
{} */ String
]) | Locale] */, Key /* <: String */, ResourceKeys /* <: PickupFormatKeys[
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
(PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any
  ]) | js.Object, 
  /* keyof / * Inlined std.NonNullable<{}> * /
{} */ String
]) | Locale] */, Key /* <: String */, ResourceKeys /* <: PickupFormatKeys[
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
(PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any
  ]) | js.Object, 
  /* keyof / * Inlined std.NonNullable<{}> * /
{} */ String
]) | Locale] */, Key /* <: String */, ResourceKeys /* <: PickupFormatKeys[
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
(PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any
  ]) | js.Object, 
  /* keyof / * Inlined std.NonNullable<{}> * /
{} */ String
]) | Locale] */, Key /* <: String */, ResourceKeys /* <: PickupFormatKeys[
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
(PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any
  ]) | js.Object, 
  /* keyof / * Inlined std.NonNullable<{}> * /
{} */ String
]) | Locale] */, Key /* <: String */, ResourceKeys /* <: PickupFormatKeys[
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
(PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any
  ]) | js.Object, 
  /* keyof / * Inlined std.NonNullable<{}> * /
{} */ String
]) | Locale] */, Key /* <: String */, ResourceKeys /* <: PickupFormatKeys[
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
(PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any
  ]) | js.Object, 
  /* keyof / * Inlined std.NonNullable<{}> * /
{} */ String
]) | Locale] */, Key /* <: String */, ResourceKeys /* <: PickupFormatKeys[
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
(PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any
  ]) | js.Object, 
  /* keyof / * Inlined std.NonNullable<{}> * /
{} */ String
]) | Locale] */, Key /* <: String */, ResourceKeys /* <: PickupFormatKeys[
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
(PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any
  ]) | js.Object, 
  /* keyof / * Inlined std.NonNullable<{}> * /
{} */ String
]) | Locale] */, Key /* <: String */, ResourceKeys /* <: PickupFormatKeys[
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
(PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any
  ]) | js.Object, 
  /* keyof / * Inlined std.NonNullable<{}> * /
{} */ String
]) | Locale] */, Key /* <: String */, ResourceKeys /* <: PickupFormatKeys[
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
(PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any
  ]) | js.Object, 
  /* keyof / * Inlined std.NonNullable<{}> * /
{} */ String
]) | Locale] */, Key /* <: String */, ResourceKeys /* <: PickupFormatKeys[
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
(PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any
  ]) | js.Object, 
  /* keyof / * Inlined std.NonNullable<{}> * /
{} */ String
]) | Locale] */, Key /* <: String */, ResourceKeys /* <: PickupFormatKeys[
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
(PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['datetimeFormats'] */ js.Any
  ]) | js.Object, 
  /* keyof / * Inlined std.NonNullable<{}> * /
{} */ String
]) | Locale] */, Key /* <: String */, ResourceKeys /* <: PickupFormatKeys[
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
  (PickupLocales[js.Object, /* keyof / * Inlined std.NonNullable<{}> * /
{} */ String]) | Locale
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
  (PickupLocales[js.Object, /* keyof / * Inlined std.NonNullable<{}> * /
{} */ String]) | Locale
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
(PickupLocales[js.Object, /* keyof / * Inlined std.NonNullable<{}> * /
{} */ String]) | Locale]) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getFallbackContext")().asInstanceOf[(CoreContext[
String, 
js.Object, 
js.Object, 
js.Object, 
PickupLocales[js.Object, /* keyof / * Inlined std.NonNullable<{}> * /
{} */ String], 
(PickupLocales[js.Object, /* keyof / * Inlined std.NonNullable<{}> * /
{} */ String]) | Locale]) | Null]

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
(PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['numberFormats'] */ js.Any
  ]) | js.Object, 
  /* keyof / * Inlined std.NonNullable<{}> * /
{} */ String
]) | Locale] */, Message](context: Context, value: Double): String | Double | js.Array[NumberFormatPart] = (^.asInstanceOf[js.Dynamic].applyDynamic("number")(context.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String | Double | js.Array[NumberFormatPart]]
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
(PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['numberFormats'] */ js.Any
  ]) | js.Object, 
  /* keyof / * Inlined std.NonNullable<{}> * /
{} */ String
]) | Locale] */, Value /* <: Double */, Key /* <: String */, ResourceKeys /* <: PickupFormatKeys[
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
(PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['numberFormats'] */ js.Any
  ]) | js.Object, 
  /* keyof / * Inlined std.NonNullable<{}> * /
{} */ String
]) | Locale] */, Value /* <: Double */, Key /* <: String */, ResourceKeys /* <: PickupFormatKeys[
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
(PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['numberFormats'] */ js.Any
  ]) | js.Object, 
  /* keyof / * Inlined std.NonNullable<{}> * /
{} */ String
]) | Locale] */, Value /* <: Double */, Key /* <: String */, ResourceKeys /* <: PickupFormatKeys[
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
(PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['numberFormats'] */ js.Any
  ]) | js.Object, 
  /* keyof / * Inlined std.NonNullable<{}> * /
{} */ String
]) | Locale] */, Value /* <: Double */, Key /* <: String */, ResourceKeys /* <: PickupFormatKeys[
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
(PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['numberFormats'] */ js.Any
  ]) | js.Object, 
  /* keyof / * Inlined std.NonNullable<{}> * /
{} */ String
]) | Locale] */, Value /* <: Double */, Key /* <: String */, ResourceKeys /* <: PickupFormatKeys[
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
(PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['numberFormats'] */ js.Any
  ]) | js.Object, 
  /* keyof / * Inlined std.NonNullable<{}> * /
{} */ String
]) | Locale] */, Value /* <: Double */, Key /* <: String */, ResourceKeys /* <: PickupFormatKeys[
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
(PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['numberFormats'] */ js.Any
  ]) | js.Object, 
  /* keyof / * Inlined std.NonNullable<{}> * /
{} */ String
]) | Locale] */, Value /* <: Double */, Key /* <: String */, ResourceKeys /* <: PickupFormatKeys[
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
(PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['numberFormats'] */ js.Any
  ]) | js.Object, 
  /* keyof / * Inlined std.NonNullable<{}> * /
{} */ String
]) | Locale] */, Value /* <: Double */, Key /* <: String */, ResourceKeys /* <: PickupFormatKeys[
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
  (PickupLocales[js.Object, /* keyof / * Inlined std.NonNullable<{}> * /
{} */ String]) | Locale
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
(PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any
  ]) | js.Object, 
  /* keyof std.NonNullable<Context['messages']> */ String
]) | Locale] */, Key /* <: String */, ResourceKeys /* <: PickupKeys[
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
(PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any
  ]) | js.Object, 
  /* keyof std.NonNullable<Context['messages']> */ String
]) | Locale] */, Key /* <: String */, ResourceKeys /* <: PickupKeys[
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
(PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any
  ]) | js.Object, 
  /* keyof std.NonNullable<Context['messages']> */ String
]) | Locale] */, Key /* <: String */, ResourceKeys /* <: PickupKeys[
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
(PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any
  ]) | js.Object, 
  /* keyof std.NonNullable<Context['messages']> */ String
]) | Locale] */, Key /* <: String */, ResourceKeys /* <: PickupKeys[
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
(PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any
  ]) | js.Object, 
  /* keyof std.NonNullable<Context['messages']> */ String
]) | Locale] */, Key /* <: String */, ResourceKeys /* <: PickupKeys[
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
(PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any
  ]) | js.Object, 
  /* keyof std.NonNullable<Context['messages']> */ String
]) | Locale] */, Key /* <: String */, ResourceKeys /* <: PickupKeys[
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
(PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any
  ]) | js.Object, 
  /* keyof std.NonNullable<Context['messages']> */ String
]) | Locale] */, Key /* <: String */, ResourceKeys /* <: PickupKeys[
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
(PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any
  ]) | js.Object, 
  /* keyof std.NonNullable<Context['messages']> */ String
]) | Locale] */, Key /* <: String */, ResourceKeys /* <: PickupKeys[
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
(PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any
  ]) | js.Object, 
  /* keyof std.NonNullable<Context['messages']> */ String
]) | Locale] */, Key /* <: String */, ResourceKeys /* <: PickupKeys[
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
(PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any
  ]) | js.Object, 
  /* keyof std.NonNullable<Context['messages']> */ String
]) | Locale] */, Key /* <: String */, ResourceKeys /* <: PickupKeys[
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
(PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any
  ]) | js.Object, 
  /* keyof std.NonNullable<Context['messages']> */ String
]) | Locale] */, Key /* <: String */, ResourceKeys /* <: PickupKeys[
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
(PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any
  ]) | js.Object, 
  /* keyof std.NonNullable<Context['messages']> */ String
]) | Locale] */, Key /* <: String */, ResourceKeys /* <: PickupKeys[
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
(PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any
  ]) | js.Object, 
  /* keyof std.NonNullable<Context['messages']> */ String
]) | Locale] */, Key /* <: String */, ResourceKeys /* <: PickupKeys[
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
(PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any
  ]) | js.Object, 
  /* keyof std.NonNullable<Context['messages']> */ String
]) | Locale] */, Key /* <: String */, ResourceKeys /* <: PickupKeys[
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
(PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any
  ]) | js.Object, 
  /* keyof std.NonNullable<Context['messages']> */ String
]) | Locale] */, Key /* <: String */, ResourceKeys /* <: PickupKeys[
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
(PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any
  ]) | js.Object, 
  /* keyof std.NonNullable<Context['messages']> */ String
]) | Locale] */, Key /* <: String */, ResourceKeys /* <: PickupKeys[
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
(PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any
  ]) | js.Object, 
  /* keyof std.NonNullable<Context['messages']> */ String
]) | Locale] */, Key /* <: String */, ResourceKeys /* <: PickupKeys[
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
(PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any
  ]) | js.Object, 
  /* keyof std.NonNullable<Context['messages']> */ String
]) | Locale] */, Key /* <: String */, ResourceKeys /* <: PickupKeys[
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
(PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any
  ]) | js.Object, 
  /* keyof std.NonNullable<Context['messages']> */ String
]) | Locale] */, Key /* <: String */, ResourceKeys /* <: PickupKeys[
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
(PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any
  ]) | js.Object, 
  /* keyof std.NonNullable<Context['messages']> */ String
]) | Locale] */, Key /* <: String */, ResourceKeys /* <: PickupKeys[
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
(PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any
  ]) | js.Object, 
  /* keyof std.NonNullable<Context['messages']> */ String
]) | Locale] */, Key /* <: String */, ResourceKeys /* <: PickupKeys[
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
(PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any
  ]) | js.Object, 
  /* keyof std.NonNullable<Context['messages']> */ String
]) | Locale] */, Key /* <: String */, ResourceKeys /* <: PickupKeys[
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
(PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any
  ]) | js.Object, 
  /* keyof std.NonNullable<Context['messages']> */ String
]) | Locale] */, Key /* <: String */, ResourceKeys /* <: PickupKeys[
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
(PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any
  ]) | js.Object, 
  /* keyof std.NonNullable<Context['messages']> */ String
]) | Locale] */, Key /* <: String */, ResourceKeys /* <: PickupKeys[
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
(PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any
  ]) | js.Object, 
  /* keyof std.NonNullable<Context['messages']> */ String
]) | Locale] */, Key /* <: String */, ResourceKeys /* <: PickupKeys[
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
(PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any
  ]) | js.Object, 
  /* keyof std.NonNullable<Context['messages']> */ String
]) | Locale] */, Key /* <: String */, ResourceKeys /* <: PickupKeys[
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
(PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any
  ]) | js.Object, 
  /* keyof std.NonNullable<Context['messages']> */ String
]) | Locale] */, Key /* <: String */, ResourceKeys /* <: PickupKeys[
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
(PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any
  ]) | js.Object, 
  /* keyof std.NonNullable<Context['messages']> */ String
]) | Locale] */, Key /* <: String */, ResourceKeys /* <: PickupKeys[
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
(PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any
  ]) | js.Object, 
  /* keyof std.NonNullable<Context['messages']> */ String
]) | Locale] */, Key /* <: String */, ResourceKeys /* <: PickupKeys[
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
(PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any
  ]) | js.Object, 
  /* keyof std.NonNullable<Context['messages']> */ String
]) | Locale] */, Key /* <: String */, ResourceKeys /* <: PickupKeys[
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
(PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any
  ]) | js.Object, 
  /* keyof std.NonNullable<Context['messages']> */ String
]) | Locale] */, Key /* <: String */, ResourceKeys /* <: PickupKeys[
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
(PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any
  ]) | js.Object, 
  /* keyof std.NonNullable<Context['messages']> */ String
]) | Locale] */, Key /* <: String */, ResourceKeys /* <: PickupKeys[
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
(PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any
  ]) | js.Object, 
  /* keyof std.NonNullable<Context['messages']> */ String
]) | Locale] */, Key /* <: String */, ResourceKeys /* <: PickupKeys[
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
(PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any
  ]) | js.Object, 
  /* keyof std.NonNullable<Context['messages']> */ String
]) | Locale] */, Key /* <: String */, ResourceKeys /* <: PickupKeys[
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
(PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any
  ]) | js.Object, 
  /* keyof std.NonNullable<Context['messages']> */ String
]) | Locale] */, Key /* <: String */, ResourceKeys /* <: PickupKeys[
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
(PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any
  ]) | js.Object, 
  /* keyof std.NonNullable<Context['messages']> */ String
]) | Locale] */, Key /* <: String */, ResourceKeys /* <: PickupKeys[
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
(PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any
  ]) | js.Object, 
  /* keyof std.NonNullable<Context['messages']> */ String
]) | Locale] */, Key /* <: String */, ResourceKeys /* <: PickupKeys[
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
(PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any
  ]) | js.Object, 
  /* keyof std.NonNullable<Context['messages']> */ String
]) | Locale] */, Key /* <: String */, ResourceKeys /* <: PickupKeys[
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
(PickupLocales[
  (NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: Context['messages'] */ js.Any
  ]) | js.Object, 
  /* keyof std.NonNullable<Context['messages']> */ String
]) | Locale] */, Key /* <: String */, ResourceKeys /* <: PickupKeys[
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

type FallbackLocale = Locale | js.Array[Locale] | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ locale in string ]: std.Array<@intlify/core-base.@intlify/core-base.Locale>}
  */ typings.intlifyCoreBase.intlifyCoreBaseStrings.FallbackLocale & TopLevel[Any]) | `false`

type FallbackLocales[Locales] = Locales | js.Array[Locales] | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ locale in string ]: std.Array<@intlify/core-base.@intlify/core-base.PickupFallbackLocales<@intlify/core-base.@intlify/core-base.UnionToTuple<Locales, @intlify/core-base.@intlify/core-base.LastInUnion<Locales>>>>}
  */ typings.intlifyCoreBase.intlifyCoreBaseStrings.FallbackLocales & TopLevel[Any]) | `false`

type First[T /* <: js.Array[Any] */] = /* import warning: importer.ImportType#apply Failed type conversion: T[0] */ js.Any

type LastInUnion[U] = Any

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
  (PickupLocales[js.Object, /* keyof / * Inlined std.NonNullable<{}> * /
{} */ String]) | Locale
], 
/* fallback */ FallbackLocale, 
/* start */ Locale, 
js.Array[Locale]]

type LocaleMessage[Message] = Record[String, LocaleMessageValue[Message]]

type LocaleMessageDictionary[T, Message] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof T ]: @intlify/core-base.@intlify/core-base.LocaleMessageType<T[K], Message>}
  */ typings.intlifyCoreBase.intlifyCoreBaseStrings.LocaleMessageDictionary & TopLevel[T]

type LocaleMessageType[T, Message] = T | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof T ]: T[K]}
  */ typings.intlifyCoreBase.intlifyCoreBaseStrings.LocaleMessageType & TopLevel[T]) | (LocaleMessageDictionary[Any | T, Message]) | (js.Function1[/* args */ Any, ReturnType[T]]) | String

type LocaleMessageValue[Message] = (LocaleMessageDictionary[Any, Message]) | String

type LocaleMessages[Schema, Locales, Message] = LocaleRecord[UnionToTuple[Locales, LastInUnion[Locales]], Schema]

type LocaleParamsType[T, R] = R | T

type LocaleRecord[T /* <: js.Array[Any] */, R] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in T[number] ]: R}
  */ typings.intlifyCoreBase.intlifyCoreBaseStrings.LocaleRecord & TopLevel[Any]

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

type MessageType[T] = StringConvertable[T] | String

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

type PathValue = String | Double | Boolean | js.Function | Null | StringDictionary[Any] | js.Array[Any]

type PickupFallbackLocales[T /* <: js.Array[Any] */] = (/* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any) | (/* template literal string: ${T[number]}! */ String)

type PickupFormatKeys[T /* <: Record[String, Any] */, K] = ResourceFormatPath[
/* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any]

type PickupFormatPathKeys[T /* <: js.Object */] = ResourceFormatPath[T]

type PickupKeys[T /* <: Record[String, Any] */, K] = ResourcePath[
/* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any]

type PickupLocales[T /* <: Record[String, Any] */, K] = K

type PickupPaths[T /* <: js.Object */] = ResourcePath[T]

type PluralizationRules = StringDictionary[PluralizationRule]

type PostTranslationHandler[Message] = js.Function2[/* translated */ MessageType[Message], /* key */ String, MessageType[Message]]

type RemoveIndexSignature[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof T as string extends K? never : number extends K? never : K ]: T[K]}
  */ typings.intlifyCoreBase.intlifyCoreBaseStrings.RemoveIndexSignature & TopLevel[T]

type ResourceFormatPath[T] = (/* keyof T */ String) | _ResourceFormatPath[T]

type ResourcePath[T] = (/* keyof T */ String) | _ResourcePath[T]

type ResourceValue[T, P /* <: ResourcePath[T] */] = (/* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any) | Any

type StringConvertable[T] = Any | T

type UnionToIntersection[U] = Any

type UnionToTuple[U, Last] = /* import warning: importer.ImportType#apply c repeated non-array type: any */ js.Array[Any]

type _ResourceFormatPath[T] = (__ResourceFormatPath[T, /* keyof T */ String]) | (/* keyof T */ String)

type _ResourcePath[T] = (__ResourcePath[T, /* keyof T */ String]) | (/* keyof T */ String)

type __ResourceFormatPath[T, Key /* <: /* keyof T */ String */] = /* template literal string: ${Key} */ String

type __ResourcePath[T, Key /* <: /* keyof T */ String */] = /* template literal string: ${Key}.${__ResourcePath<T[Key],Exclude<keyofT[Key],keyofany[]>>&string} */ String
