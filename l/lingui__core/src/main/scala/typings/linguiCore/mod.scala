package typings.linguiCore

import org.scalablytyped.runtime.StringDictionary
import typings.linguiCore.anon.FnCall
import typings.linguiCore.linguiCoreStrings.change
import typings.linguiCore.linguiCoreStrings.missing
import typings.linguiMessageUtils.distCompileMessageMod.CompiledMessage
import typings.std.Intl.DateTimeFormatOptions
import typings.std.Intl.LDMLPluralRule
import typings.std.Intl.NumberFormatOptions
import typings.std.Parameters
import typings.std.Record
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@lingui/core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@lingui/core", "I18n")
  @js.native
  open class I18n_ protected ()
    extends StObject
       with EventEmitter[Events] {
    def this(params: setupI18nProps) = this()
    
    /* private */ /* CompleteClass */
    override val _events: Any = js.native
    
    /* private */ /* CompleteClass */
    var _hasEvent: Any = js.native
    
    /* private */ var _load: Any = js.native
    
    /* private */ var _loadLocaleData: Any = js.native
    
    /* private */ var _locale: Any = js.native
    
    /* private */ var _localeData: Any = js.native
    
    /* private */ var _locales: Any = js.native
    
    /* private */ var _messages: Any = js.native
    
    /* private */ var _missing: Any = js.native
    
    @JSName("_")
    def _underscore(descriptor: MessageDescriptor): String = js.native
    @JSName("_")
    def _underscore(id: String): String = js.native
    @JSName("_")
    def _underscore(id: String, values: Unit, options: MessageOptions): String = js.native
    @JSName("_")
    def _underscore(id: String, values: Values): String = js.native
    @JSName("_")
    def _underscore(id: String, values: Values, options: MessageOptions): String = js.native
    
    def activate(locale: Locale): Unit = js.native
    def activate(locale: Locale, locales: Locales): Unit = js.native
    
    def date(value: String): String = js.native
    def date(value: String, format: DateTimeFormatOptions): String = js.native
    def date(value: js.Date): String = js.native
    def date(value: js.Date, format: DateTimeFormatOptions): String = js.native
    
    /* CompleteClass */
    override def emit(
      event: /* keyof Events */ change | missing,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Events[typeof event]> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: Events[std.Event | undefined] */ js.Any
        ]
    ): Unit = js.native
    
    def load(allMessages: AllMessages): Unit = js.native
    def load(locale: Locale, messages: Messages): Unit = js.native
    
    /**
      * @param options {@link LoadAndActivateOptions}
      */
    def loadAndActivate(param0: LoadAndActivateOptions): Unit = js.native
    
    /**
      * @deprecated Plurals automatically used from Intl.PluralRules you can safely remove this call. Deprecated in v4
      */
    def loadLocaleData(allLocaleData: AllLocaleData): Unit = js.native
    /**
      * @deprecated Plurals automatically used from Intl.PluralRules you can safely remove this call. Deprecated in v4
      */
    def loadLocaleData(locale: Locale, localeData: LocaleData): Unit = js.native
    
    def locale: String = js.native
    
    /**
      * @deprecated this has no effect. Please remove this from the code. Deprecated in v4
      */
    def localeData: LocaleData = js.native
    
    def locales: Locales = js.native
    
    def messages: Messages = js.native
    
    def number(value: Double): String = js.native
    def number(value: Double, format: NumberFormatOptions): String = js.native
    
    /* CompleteClass */
    override def on(
      event: /* keyof Events */ change | missing,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: Events[std.Event | undefined] */ js.Any
    ): js.Function0[Unit] = js.native
    
    /* CompleteClass */
    override def removeListener(
      event: /* keyof Events */ change | missing,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: Events[std.Event | undefined] */ js.Any
    ): Unit = js.native
    
    /**
      * Alias for {@see I18n._}
      */
    def t(descriptor: MessageDescriptor): String = js.native
    /**
      * Alias for {@see I18n._}
      */
    def t(id: String): String = js.native
    def t(id: String, values: Unit, options: MessageOptions): String = js.native
    def t(id: String, values: Values): String = js.native
    def t(id: String, values: Values, options: MessageOptions): String = js.native
    /**
      * Alias for {@see I18n._}
      */
    @JSName("t")
    var t_Original: FnCall = js.native
  }
  
  @JSImport("@lingui/core", "i18n")
  @js.native
  val i18n: I18n_ = js.native
  
  inline def setupI18n(): I18n_ = ^.asInstanceOf[js.Dynamic].applyDynamic("setupI18n")().asInstanceOf[I18n_]
  inline def setupI18n(params: setupI18nProps): I18n_ = ^.asInstanceOf[js.Dynamic].applyDynamic("setupI18n")(params.asInstanceOf[js.Any]).asInstanceOf[I18n_]
  
  /**
    * @deprecated Plurals automatically used from Intl.PluralRules you can safely remove this call. Deprecated in v4
    */
  type AllLocaleData = Record[Locale, LocaleData]
  
  type AllMessages = Record[Locale, Messages]
  
  trait EventEmitter[Events /* <: StringDictionary[js.Function1[/* repeated */ Any, Any]] */] extends StObject {
    
    /* private */ val _events: Any
    
    /* private */ var _hasEvent: Any
    
    def emit(
      event: /* keyof Events */ change | missing,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Events[typeof event]> is not an array type */ args: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: Events[std.Event | undefined] */ js.Any
        ]
    ): Unit
    
    def on(
      event: /* keyof Events */ change | missing,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: Events[std.Event | undefined] */ js.Any
    ): js.Function0[Unit]
    
    def removeListener(
      event: /* keyof Events */ change | missing,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: Events[std.Event | undefined] */ js.Any
    ): Unit
  }
  object EventEmitter {
    
    inline def apply[Events /* <: StringDictionary[js.Function1[/* repeated */ Any, Any]] */](
      _events: Any,
      _hasEvent: Any,
      emit: (/* keyof Events */ change | missing, Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: Events[std.Event | undefined] */ js.Any
        ]) => Unit,
      on: (/* keyof Events */ change | missing, /* import warning: importer.ImportType#apply Failed type conversion: Events[std.Event | undefined] */ js.Any) => js.Function0[Unit],
      removeListener: (/* keyof Events */ change | missing, /* import warning: importer.ImportType#apply Failed type conversion: Events[std.Event | undefined] */ js.Any) => Unit
    ): EventEmitter[Events] = {
      val __obj = js.Dynamic.literal(_events = _events.asInstanceOf[js.Any], _hasEvent = _hasEvent.asInstanceOf[js.Any], emit = js.Any.fromFunction2(emit), on = js.Any.fromFunction2(on), removeListener = js.Any.fromFunction2(removeListener))
      __obj.asInstanceOf[EventEmitter[Events]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventEmitter[?], Events /* <: StringDictionary[js.Function1[/* repeated */ Any, Any]] */] (val x: Self & EventEmitter[Events]) extends AnyVal {
      
      inline def setEmit(
        value: (/* keyof Events */ change | missing, Parameters[
              /* import warning: importer.ImportType#apply Failed type conversion: Events[std.Event | undefined] */ js.Any
            ]) => Unit
      ): Self = StObject.set(x, "emit", js.Any.fromFunction2(value))
      
      inline def setOn(
        value: (/* keyof Events */ change | missing, /* import warning: importer.ImportType#apply Failed type conversion: Events[std.Event | undefined] */ js.Any) => js.Function0[Unit]
      ): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
      
      inline def setRemoveListener(
        value: (/* keyof Events */ change | missing, /* import warning: importer.ImportType#apply Failed type conversion: Events[std.Event | undefined] */ js.Any) => Unit
      ): Self = StObject.set(x, "removeListener", js.Any.fromFunction2(value))
      
      inline def set_events(value: Any): Self = StObject.set(x, "_events", value.asInstanceOf[js.Any])
      
      inline def set_hasEvent(value: Any): Self = StObject.set(x, "_hasEvent", value.asInstanceOf[js.Any])
    }
  }
  
  trait Events extends StObject {
    
    def change(): Unit
    
    def missing(event: MissingMessageEvent): Unit
  }
  object Events {
    
    inline def apply(change: () => Unit, missing: MissingMessageEvent => Unit): Events = {
      val __obj = js.Dynamic.literal(change = js.Any.fromFunction0(change), missing = js.Any.fromFunction1(missing))
      __obj.asInstanceOf[Events]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Events] (val x: Self) extends AnyVal {
      
      inline def setChange(value: () => Unit): Self = StObject.set(x, "change", js.Any.fromFunction0(value))
      
      inline def setMissing(value: MissingMessageEvent => Unit): Self = StObject.set(x, "missing", js.Any.fromFunction1(value))
    }
  }
  
  type Formats_ = Record[String, DateTimeFormatOptions | NumberFormatOptions]
  
  trait LoadAndActivateOptions extends StObject {
    
    /** initial active locale */
    var locale: Locale
    
    /** list of alternative locales (BCP 47 language tags) which are used for number and date formatting */
    var locales: js.UndefOr[Locales] = js.undefined
    
    /** compiled message catalog */
    var messages: Messages
  }
  object LoadAndActivateOptions {
    
    inline def apply(locale: Locale, messages: Messages): LoadAndActivateOptions = {
      val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoadAndActivateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LoadAndActivateOptions] (val x: Self) extends AnyVal {
      
      inline def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocales(value: Locales): Self = StObject.set(x, "locales", value.asInstanceOf[js.Any])
      
      inline def setLocalesUndefined: Self = StObject.set(x, "locales", js.undefined)
      
      inline def setLocalesVarargs(value: Locale*): Self = StObject.set(x, "locales", js.Array(value*))
      
      inline def setMessages(value: Messages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    }
  }
  
  type Locale = String
  
  /**
    * @deprecated Plurals automatically used from Intl.PluralRules you can safely remove this call. Deprecated in v4
    */
  trait LocaleData extends StObject {
    
    var plurals: js.UndefOr[
        js.Function2[
          /* n */ Double, 
          /* ordinal */ js.UndefOr[Boolean], 
          ReturnType[js.Function1[/* n */ Double, LDMLPluralRule]]
        ]
      ] = js.undefined
  }
  object LocaleData {
    
    inline def apply(): LocaleData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LocaleData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LocaleData] (val x: Self) extends AnyVal {
      
      inline def setPlurals(
        value: (/* n */ Double, /* ordinal */ js.UndefOr[Boolean]) => ReturnType[js.Function1[/* n */ Double, LDMLPluralRule]]
      ): Self = StObject.set(x, "plurals", js.Any.fromFunction2(value))
      
      inline def setPluralsUndefined: Self = StObject.set(x, "plurals", js.undefined)
    }
  }
  
  type Locales = Locale | js.Array[Locale]
  
  trait MessageDescriptor extends StObject {
    
    var comment: js.UndefOr[String] = js.undefined
    
    var id: String
    
    var message: js.UndefOr[String] = js.undefined
    
    var values: js.UndefOr[Record[String, Any]] = js.undefined
  }
  object MessageDescriptor {
    
    inline def apply(id: String): MessageDescriptor = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageDescriptor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MessageDescriptor] (val x: Self) extends AnyVal {
      
      inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setValues(value: Record[String, Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    }
  }
  
  trait MessageOptions extends StObject {
    
    var comment: js.UndefOr[String] = js.undefined
    
    var formats: js.UndefOr[Formats_] = js.undefined
    
    var message: js.UndefOr[String] = js.undefined
  }
  object MessageOptions {
    
    inline def apply(): MessageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MessageOptions] (val x: Self) extends AnyVal {
      
      inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      inline def setFormats(value: Formats_): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
      
      inline def setFormatsUndefined: Self = StObject.set(x, "formats", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
  
  type Messages = Record[String, CompiledMessage]
  
  type MissingHandler = String | (js.Function2[/* locale */ String, /* id */ String, String])
  
  trait MissingMessageEvent extends StObject {
    
    var id: String
    
    var locale: Locale
  }
  object MissingMessageEvent {
    
    inline def apply(id: String, locale: Locale): MissingMessageEvent = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any])
      __obj.asInstanceOf[MissingMessageEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MissingMessageEvent] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    }
  }
  
  type Values = Record[String, Any]
  
  trait setupI18nProps extends StObject {
    
    var locale: js.UndefOr[Locale] = js.undefined
    
    /**
      * @deprecated Plurals automatically used from Intl.PluralRules you can safely remove this call. Deprecated in v4
      */
    var localeData: js.UndefOr[AllLocaleData] = js.undefined
    
    var locales: js.UndefOr[Locales] = js.undefined
    
    var messages: js.UndefOr[AllMessages] = js.undefined
    
    var missing: js.UndefOr[MissingHandler] = js.undefined
  }
  object setupI18nProps {
    
    inline def apply(): setupI18nProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[setupI18nProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: setupI18nProps] (val x: Self) extends AnyVal {
      
      inline def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleData(value: AllLocaleData): Self = StObject.set(x, "localeData", value.asInstanceOf[js.Any])
      
      inline def setLocaleDataUndefined: Self = StObject.set(x, "localeData", js.undefined)
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setLocales(value: Locales): Self = StObject.set(x, "locales", value.asInstanceOf[js.Any])
      
      inline def setLocalesUndefined: Self = StObject.set(x, "locales", js.undefined)
      
      inline def setLocalesVarargs(value: Locale*): Self = StObject.set(x, "locales", js.Array(value*))
      
      inline def setMessages(value: AllMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
      
      inline def setMissing(value: MissingHandler): Self = StObject.set(x, "missing", value.asInstanceOf[js.Any])
      
      inline def setMissingFunction2(value: (/* locale */ String, /* id */ String) => String): Self = StObject.set(x, "missing", js.Any.fromFunction2(value))
      
      inline def setMissingUndefined: Self = StObject.set(x, "missing", js.undefined)
    }
  }
}
