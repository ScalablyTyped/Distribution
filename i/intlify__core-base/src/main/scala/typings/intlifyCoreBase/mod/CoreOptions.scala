package typings.intlifyCoreBase.mod

import typings.intlifyCoreBase.anon.Datetime
import typings.intlifyCoreBase.anon.DatetimeFormats
import typings.intlifyMessageCompiler.mod.CompileOptions
import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoreOptions[Message, Schema /* <: Datetime */, Locales /* <: DatetimeFormats | String */, MessagesLocales, DateTimeFormatsLocales, NumberFormatsLocales, MessageSchema, DateTimeSchema, NumberSchema, _Messages /* <: LocaleMessages[MessageSchema, MessagesLocales, Message] */, _DateTimeFormats /* <: DateTimeFormats[DateTimeSchema, DateTimeFormatsLocales] */, _NumberFormats /* <: NumberFormats[NumberSchema, NumberFormatsLocales] */] extends StObject {
  
  var datetimeFormats: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof _DateTimeFormats ]: DateTimeSchema} */ js.Any
  ] = js.undefined
  
  var escapeParameter: js.UndefOr[Boolean] = js.undefined
  
  var fallbackContext: js.UndefOr[
    CoreContext[
      Message, 
      MessagesLocales, 
      DateTimeFormatsLocales, 
      NumberFormatsLocales, 
      PickupLocales[
        NonNullable[DateTimeFormatsLocales | MessagesLocales | NumberFormatsLocales], 
        /* keyof std.NonNullable<MessagesLocales> */ String
      ], 
      /* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<MessagesLocales>, keyof std.NonNullable<MessagesLocales>> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<DateTimeFormatsLocales>, keyof std.NonNullable<DateTimeFormatsLocales>> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<NumberFormatsLocales>, keyof std.NonNullable<NumberFormatsLocales>>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<MessagesLocales>, keyof std.NonNullable<MessagesLocales>> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<DateTimeFormatsLocales>, keyof std.NonNullable<DateTimeFormatsLocales>> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<NumberFormatsLocales>, keyof std.NonNullable<NumberFormatsLocales>> */ js.Any
    ]
  ] = js.undefined
  
  var fallbackFormat: js.UndefOr[Boolean] = js.undefined
  
  var fallbackLocale: js.UndefOr[FallbackLocale] = js.undefined
  
  var fallbackWarn: js.UndefOr[Boolean | js.RegExp] = js.undefined
  
  var locale: js.UndefOr[Locale] = js.undefined
  
  var localeFallbacker: js.UndefOr[LocaleFallbacker] = js.undefined
  
  var messageCompiler: js.UndefOr[MessageCompiler[Message]] = js.undefined
  
  var messageResolver: js.UndefOr[MessageResolver] = js.undefined
  
  var messages: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof _Messages ]: MessageSchema} */ js.Any
  ] = js.undefined
  
  var missing: js.UndefOr[CoreMissingHandler[Message]] = js.undefined
  
  var missingWarn: js.UndefOr[Boolean | js.RegExp] = js.undefined
  
  var modifiers: js.UndefOr[LinkedModifiers[Message]] = js.undefined
  
  var numberFormats: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof _NumberFormats ]: NumberSchema} */ js.Any
  ] = js.undefined
  
  var onWarn: js.UndefOr[js.Function2[/* msg */ String, /* err */ js.UndefOr[js.Error], Unit]] = js.undefined
  
  var pluralRules: js.UndefOr[PluralizationRules] = js.undefined
  
  var postTranslation: js.UndefOr[PostTranslationHandler[Message]] = js.undefined
  
  var processor: js.UndefOr[MessageProcessor[Message]] = js.undefined
  
  var unresolving: js.UndefOr[Boolean] = js.undefined
  
  var version: js.UndefOr[String] = js.undefined
  
  var warnHtmlMessage: js.UndefOr[Boolean] = js.undefined
}
object CoreOptions {
  
  inline def apply[Message, Schema /* <: Datetime */, Locales /* <: DatetimeFormats | String */, MessagesLocales, DateTimeFormatsLocales, NumberFormatsLocales, MessageSchema, DateTimeSchema, NumberSchema, _Messages /* <: LocaleMessages[MessageSchema, MessagesLocales, Message] */, _DateTimeFormats /* <: DateTimeFormats[DateTimeSchema, DateTimeFormatsLocales] */, _NumberFormats /* <: NumberFormats[NumberSchema, NumberFormatsLocales] */](): CoreOptions[
    Message, 
    Schema, 
    Locales, 
    MessagesLocales, 
    DateTimeFormatsLocales, 
    NumberFormatsLocales, 
    MessageSchema, 
    DateTimeSchema, 
    NumberSchema, 
    _Messages, 
    _DateTimeFormats, 
    _NumberFormats
  ] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoreOptions[
    Message, 
    Schema, 
    Locales, 
    MessagesLocales, 
    DateTimeFormatsLocales, 
    NumberFormatsLocales, 
    MessageSchema, 
    DateTimeSchema, 
    NumberSchema, 
    _Messages, 
    _DateTimeFormats, 
    _NumberFormats
  ]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CoreOptions[?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?], Message, Schema /* <: Datetime */, Locales /* <: DatetimeFormats | String */, MessagesLocales, DateTimeFormatsLocales, NumberFormatsLocales, MessageSchema, DateTimeSchema, NumberSchema, _Messages /* <: LocaleMessages[MessageSchema, MessagesLocales, Message] */, _DateTimeFormats /* <: DateTimeFormats[DateTimeSchema, DateTimeFormatsLocales] */, _NumberFormats /* <: NumberFormats[NumberSchema, NumberFormatsLocales] */] (val x: Self & (CoreOptions[
        Message, 
        Schema, 
        Locales, 
        MessagesLocales, 
        DateTimeFormatsLocales, 
        NumberFormatsLocales, 
        MessageSchema, 
        DateTimeSchema, 
        NumberSchema, 
        _Messages, 
        _DateTimeFormats, 
        _NumberFormats
      ])) extends AnyVal {
    
    inline def setDatetimeFormats(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof _DateTimeFormats ]: DateTimeSchema} */ js.Any
    ): Self = StObject.set(x, "datetimeFormats", value.asInstanceOf[js.Any])
    
    inline def setDatetimeFormatsUndefined: Self = StObject.set(x, "datetimeFormats", js.undefined)
    
    inline def setEscapeParameter(value: Boolean): Self = StObject.set(x, "escapeParameter", value.asInstanceOf[js.Any])
    
    inline def setEscapeParameterUndefined: Self = StObject.set(x, "escapeParameter", js.undefined)
    
    inline def setFallbackContext(
      value: CoreContext[
          Message, 
          MessagesLocales, 
          DateTimeFormatsLocales, 
          NumberFormatsLocales, 
          PickupLocales[
            NonNullable[DateTimeFormatsLocales | MessagesLocales | NumberFormatsLocales], 
            /* keyof std.NonNullable<MessagesLocales> */ String
          ], 
          /* import warning: importer.ImportType#apply Failed type conversion: [@intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<MessagesLocales>, keyof std.NonNullable<MessagesLocales>> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<DateTimeFormatsLocales>, keyof std.NonNullable<DateTimeFormatsLocales>> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<NumberFormatsLocales>, keyof std.NonNullable<NumberFormatsLocales>>] extends [never] ? @intlify/core-base.@intlify/core-base.Locale : @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<MessagesLocales>, keyof std.NonNullable<MessagesLocales>> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<DateTimeFormatsLocales>, keyof std.NonNullable<DateTimeFormatsLocales>> | @intlify/core-base.@intlify/core-base.PickupLocales<std.NonNullable<NumberFormatsLocales>, keyof std.NonNullable<NumberFormatsLocales>> */ js.Any
        ]
    ): Self = StObject.set(x, "fallbackContext", value.asInstanceOf[js.Any])
    
    inline def setFallbackContextUndefined: Self = StObject.set(x, "fallbackContext", js.undefined)
    
    inline def setFallbackFormat(value: Boolean): Self = StObject.set(x, "fallbackFormat", value.asInstanceOf[js.Any])
    
    inline def setFallbackFormatUndefined: Self = StObject.set(x, "fallbackFormat", js.undefined)
    
    inline def setFallbackLocale(value: FallbackLocale): Self = StObject.set(x, "fallbackLocale", value.asInstanceOf[js.Any])
    
    inline def setFallbackLocaleUndefined: Self = StObject.set(x, "fallbackLocale", js.undefined)
    
    inline def setFallbackLocaleVarargs(value: Locale*): Self = StObject.set(x, "fallbackLocale", js.Array(value*))
    
    inline def setFallbackWarn(value: Boolean | js.RegExp): Self = StObject.set(x, "fallbackWarn", value.asInstanceOf[js.Any])
    
    inline def setFallbackWarnUndefined: Self = StObject.set(x, "fallbackWarn", js.undefined)
    
    inline def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleFallbacker(
      value: (/* ctx */ CoreContext[
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
        ], /* fallback */ FallbackLocale, /* start */ Locale) => js.Array[Locale]
    ): Self = StObject.set(x, "localeFallbacker", js.Any.fromFunction3(value))
    
    inline def setLocaleFallbackerUndefined: Self = StObject.set(x, "localeFallbacker", js.undefined)
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setMessageCompiler(value: (/* source */ String, /* options */ js.UndefOr[CompileOptions]) => MessageFunction[Message]): Self = StObject.set(x, "messageCompiler", js.Any.fromFunction2(value))
    
    inline def setMessageCompilerUndefined: Self = StObject.set(x, "messageCompiler", js.undefined)
    
    inline def setMessageResolver(value: MessageResolver): Self = StObject.set(x, "messageResolver", value.asInstanceOf[js.Any])
    
    inline def setMessageResolverUndefined: Self = StObject.set(x, "messageResolver", js.undefined)
    
    inline def setMessages(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof _Messages ]: MessageSchema} */ js.Any
    ): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setMissing(value: CoreMissingHandler[Message]): Self = StObject.set(x, "missing", value.asInstanceOf[js.Any])
    
    inline def setMissingUndefined: Self = StObject.set(x, "missing", js.undefined)
    
    inline def setMissingWarn(value: Boolean | js.RegExp): Self = StObject.set(x, "missingWarn", value.asInstanceOf[js.Any])
    
    inline def setMissingWarnUndefined: Self = StObject.set(x, "missingWarn", js.undefined)
    
    inline def setModifiers(value: LinkedModifiers[Message]): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    
    inline def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
    
    inline def setNumberFormats(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof _NumberFormats ]: NumberSchema} */ js.Any
    ): Self = StObject.set(x, "numberFormats", value.asInstanceOf[js.Any])
    
    inline def setNumberFormatsUndefined: Self = StObject.set(x, "numberFormats", js.undefined)
    
    inline def setOnWarn(value: (/* msg */ String, /* err */ js.UndefOr[js.Error]) => Unit): Self = StObject.set(x, "onWarn", js.Any.fromFunction2(value))
    
    inline def setOnWarnUndefined: Self = StObject.set(x, "onWarn", js.undefined)
    
    inline def setPluralRules(value: PluralizationRules): Self = StObject.set(x, "pluralRules", value.asInstanceOf[js.Any])
    
    inline def setPluralRulesUndefined: Self = StObject.set(x, "pluralRules", js.undefined)
    
    inline def setPostTranslation(value: (/* translated */ MessageType[Message], /* key */ String) => MessageType[Message]): Self = StObject.set(x, "postTranslation", js.Any.fromFunction2(value))
    
    inline def setPostTranslationUndefined: Self = StObject.set(x, "postTranslation", js.undefined)
    
    inline def setProcessor(value: MessageProcessor[Message]): Self = StObject.set(x, "processor", value.asInstanceOf[js.Any])
    
    inline def setProcessorUndefined: Self = StObject.set(x, "processor", js.undefined)
    
    inline def setUnresolving(value: Boolean): Self = StObject.set(x, "unresolving", value.asInstanceOf[js.Any])
    
    inline def setUnresolvingUndefined: Self = StObject.set(x, "unresolving", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setWarnHtmlMessage(value: Boolean): Self = StObject.set(x, "warnHtmlMessage", value.asInstanceOf[js.Any])
    
    inline def setWarnHtmlMessageUndefined: Self = StObject.set(x, "warnHtmlMessage", js.undefined)
  }
}
