package typings.linguiCore

import typings.linguiCore.cjsEventEmitterMod.EventEmitter
import typings.std.Intl.DateTimeFormatOptions
import typings.std.Intl.NumberFormatOptions
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsI18nMod {
  
  @JSImport("@lingui/core/cjs/i18n", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@lingui/core/cjs/i18n", "I18n")
  @js.native
  open class I18n protected () extends EventEmitter[Events] {
    def this(params: setupI18nProps) = this()
    
    def _load(locale: Locale, messages: Messages): Unit = js.native
    
    def _loadLocaleData(locale: Locale, localeData: LocaleData): Unit = js.native
    
    var _locale: Locale = js.native
    
    var _localeData: AllLocaleData = js.native
    
    var _locales: Locales = js.native
    
    var _messages: AllMessages = js.native
    
    var _missing: String | (js.Function3[/* message */ Any, /* id */ Any, /* context */ Any, String]) = js.native
    
    @JSName("_")
    def _underscore(id: String): String = js.native
    @JSName("_")
    def _underscore(id: String, values: js.Object): String = js.native
    @JSName("_")
    def _underscore(id: String, values: js.Object, hasMessageFormatsContext: MessageOptions): String = js.native
    @JSName("_")
    def _underscore(id: String, values: Unit, hasMessageFormatsContext: MessageOptions): String = js.native
    @JSName("_")
    def _underscore(id: MessageDescriptor): String = js.native
    @JSName("_")
    def _underscore(id: MessageDescriptor, values: js.Object): String = js.native
    @JSName("_")
    def _underscore(id: MessageDescriptor, values: js.Object, hasMessageFormatsContext: MessageOptions): String = js.native
    @JSName("_")
    def _underscore(id: MessageDescriptor, values: Unit, hasMessageFormatsContext: MessageOptions): String = js.native
    
    def activate(locale: Locale): Unit = js.native
    def activate(locale: Locale, locales: Locales): Unit = js.native
    
    def date(value: String): String = js.native
    def date(value: String, format: DateTimeFormatOptions): String = js.native
    def date(value: js.Date): String = js.native
    def date(value: js.Date, format: DateTimeFormatOptions): String = js.native
    
    def load(allMessages: AllMessages): Unit = js.native
    def load(locale: Locale, messages: Messages): Unit = js.native
    
    def loadLocaleData(allLocaleData: AllLocaleData): Unit = js.native
    def loadLocaleData(locale: Locale, localeData: LocaleData): Unit = js.native
    
    def locale: String = js.native
    
    def localeData: LocaleData = js.native
    
    def locales: Locales = js.native
    
    def messages: Messages = js.native
    
    def number(value: Double): String = js.native
    def number(value: Double, format: NumberFormatOptions): String = js.native
  }
  
  inline def setupI18n(): I18n = ^.asInstanceOf[js.Dynamic].applyDynamic("setupI18n")().asInstanceOf[I18n]
  inline def setupI18n(params: setupI18nProps): I18n = ^.asInstanceOf[js.Dynamic].applyDynamic("setupI18n")(params.asInstanceOf[js.Any]).asInstanceOf[I18n]
  
  type AllLocaleData = Record[Locale, LocaleData]
  
  type AllMessages = Record[Locale, Messages]
  
  type CompiledMessage = String | (js.Array[String | (js.Array[js.UndefOr[String | (Record[String, Any])]])])
  
  trait Events extends StObject {
    
    def change(): Unit
    
    def missing(event: MissingMessageEvent): Unit
  }
  object Events {
    
    inline def apply(change: () => Unit, missing: MissingMessageEvent => Unit): Events = {
      val __obj = js.Dynamic.literal(change = js.Any.fromFunction0(change), missing = js.Any.fromFunction1(missing))
      __obj.asInstanceOf[Events]
    }
    
    extension [Self <: Events](x: Self) {
      
      inline def setChange(value: () => Unit): Self = StObject.set(x, "change", js.Any.fromFunction0(value))
      
      inline def setMissing(value: MissingMessageEvent => Unit): Self = StObject.set(x, "missing", js.Any.fromFunction1(value))
    }
  }
  
  type Locale = String
  
  trait LocaleData extends StObject {
    
    var plurals: js.UndefOr[js.Function] = js.undefined
  }
  object LocaleData {
    
    inline def apply(): LocaleData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LocaleData]
    }
    
    extension [Self <: LocaleData](x: Self) {
      
      inline def setPlurals(value: js.Function): Self = StObject.set(x, "plurals", value.asInstanceOf[js.Any])
      
      inline def setPluralsUndefined: Self = StObject.set(x, "plurals", js.undefined)
    }
  }
  
  type Locales = Locale | js.Array[Locale]
  
  trait MessageDescriptor extends StObject {
    
    var comment: js.UndefOr[String] = js.undefined
    
    var context: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var message: js.UndefOr[String] = js.undefined
    
    var values: js.UndefOr[Record[String, Any]] = js.undefined
  }
  object MessageDescriptor {
    
    inline def apply(): MessageDescriptor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageDescriptor]
    }
    
    extension [Self <: MessageDescriptor](x: Self) {
      
      inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setValues(value: Record[String, Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    }
  }
  
  trait MessageOptions extends StObject {
    
    var context: js.UndefOr[String] = js.undefined
    
    var formats: js.UndefOr[js.Object] = js.undefined
    
    var message: js.UndefOr[String] = js.undefined
  }
  object MessageOptions {
    
    inline def apply(): MessageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageOptions]
    }
    
    extension [Self <: MessageOptions](x: Self) {
      
      inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setFormats(value: js.Object): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
      
      inline def setFormatsUndefined: Self = StObject.set(x, "formats", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
  
  type Messages = Record[String, CompiledMessage]
  
  trait MissingMessageEvent extends StObject {
    
    var context: js.UndefOr[String] = js.undefined
    
    var id: String
    
    var locale: Locale
  }
  object MissingMessageEvent {
    
    inline def apply(id: String, locale: Locale): MissingMessageEvent = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any])
      __obj.asInstanceOf[MissingMessageEvent]
    }
    
    extension [Self <: MissingMessageEvent](x: Self) {
      
      inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    }
  }
  
  trait setupI18nProps extends StObject {
    
    var locale: js.UndefOr[Locale] = js.undefined
    
    var localeData: js.UndefOr[AllLocaleData] = js.undefined
    
    var locales: js.UndefOr[Locales] = js.undefined
    
    var messages: js.UndefOr[AllMessages] = js.undefined
    
    var missing: js.UndefOr[
        String | (js.Function3[/* message */ Any, /* id */ Any, /* context */ Any, String])
      ] = js.undefined
  }
  object setupI18nProps {
    
    inline def apply(): setupI18nProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[setupI18nProps]
    }
    
    extension [Self <: setupI18nProps](x: Self) {
      
      inline def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleData(value: AllLocaleData): Self = StObject.set(x, "localeData", value.asInstanceOf[js.Any])
      
      inline def setLocaleDataUndefined: Self = StObject.set(x, "localeData", js.undefined)
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setLocales(value: Locales): Self = StObject.set(x, "locales", value.asInstanceOf[js.Any])
      
      inline def setLocalesUndefined: Self = StObject.set(x, "locales", js.undefined)
      
      inline def setLocalesVarargs(value: Locale*): Self = StObject.set(x, "locales", js.Array(value*))
      
      inline def setMessages(value: AllMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
      
      inline def setMissing(value: String | (js.Function3[/* message */ Any, /* id */ Any, /* context */ Any, String])): Self = StObject.set(x, "missing", value.asInstanceOf[js.Any])
      
      inline def setMissingFunction3(value: (/* message */ Any, /* id */ Any, /* context */ Any) => String): Self = StObject.set(x, "missing", js.Any.fromFunction3(value))
      
      inline def setMissingUndefined: Self = StObject.set(x, "missing", js.undefined)
    }
  }
}
