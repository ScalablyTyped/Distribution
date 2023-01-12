package typings.i18n

import org.scalablytyped.runtime.StringDictionary
import typings.i18n.Express.Request
import typings.i18n.anon.Disable
import typings.i18n.anon.Partiali18nAPI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object i18n {
  
  trait ConfigurationOptions extends StObject {
    
    /**
      * Hash to specify different aliases for i18n's internal methods to apply on the request/response objects (method -> alias).
      * Note that this will *not* overwrite existing properties with the same name.
      * @default undefined
      */
    var api: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * Watch for changes in json files to reload locale on updates
      * @default false
      */
    var autoReload: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Sets a custom cookie name to parse locale settings from
      * @default null
      */
    var cookie: js.UndefOr[String] = js.undefined
    
    /**
      * Alter a site wide default locale
      * @default "en"
      */
    var defaultLocale: js.UndefOr[String] = js.undefined
    
    /**
      * Where to store json files, relative to modules directory
      * @default "./locales"
      */
    var directory: js.UndefOr[String] = js.undefined
    
    /**
      * Control mode on directory creation. Setting has no effect on win.
      * @default null
      */
    var directoryPermissions: js.UndefOr[String] = js.undefined
    
    /**
      * Setting extension of json files (you might want to set this to '.js' according to webtranslateit)
      * @default ".json"
      */
    var `extension`: js.UndefOr[String] = js.undefined
    
    /**
      * Language fallback map
      * @default {}
      */
    var fallbacks: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * Sets a custom header name to read the language preference from - accept-language header by default
      * @default 'accept-language'
      */
    var header: js.UndefOr[String] = js.undefined
    
    /**
      * What to use as the indentation unit
      * @default "\t"
      */
    var indent: js.UndefOr[String] = js.undefined
    
    /**
      * Setup some locales - other locales default to en silently
      * @default []
      */
    var locales: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Setting of log level DEBUG
      * @default require("debug")("i18n:debug")
      */
    var logDebugFn: js.UndefOr[js.Function1[/* msg */ String, Unit]] = js.undefined
    
    /**
      * Setting of log level ERROR
      * @default require("debug")("i18n:error")
      */
    var logErrorFn: js.UndefOr[js.Function1[/* msg */ String, Unit]] = js.undefined
    
    /**
      * Setting of log level WARN
      * @default require("debug")("i18n:warn")
      */
    var logWarnFn: js.UndefOr[js.Function1[/* msg */ String, Unit]] = js.undefined
    
    /**
      * Function to provide missing translations.
      * @since 0.10.0
      */
    var missingKeyFn: js.UndefOr[js.Function2[/* locale */ String, /* value */ String, String]] = js.undefined
    
    /**
      * Use mustache with customTags (https://www.npmjs.com/package/mustache#custom-delimiters) or disable mustache entirely
      */
    var mustacheConfig: js.UndefOr[Disable] = js.undefined
    
    /**
      * Enable object notation
      * @default false
      */
    var objectNotation: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Setting prefix of json files name (in case you use different locale files naming scheme (webapp-en.json), rather then just en.json)
      * @default ""
      */
    var prefix: js.UndefOr[String] = js.undefined
    
    /**
      * Downcase locale when passed on queryParam; e.g. lang=en-US becomes en-us.
      * When set to false, the queryParam value will be used as passed; e.g. lang=en-US remains en-US.
      * @default true
      */
    var preserveLegacyCase: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Query parameter to switch locale (ie. /home?lang=ch)
      * @default null
      */
    var queryParameter: js.UndefOr[String] = js.undefined
    
    /**
      * object or [obj1, obj2] to bind the i18n api and current locale to
      * @default null
      */
    var register: js.UndefOr[Any] = js.undefined
    
    /**
      * Will return translation from defaultLocale in case current locale doesn't provide it
      * @default false
      */
    var retryInDefaultLocale: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Static translation catalog. Setting this option overrides `locales`.
      *
      * **NOTE**: Enabling `staticCatalog` disables all other fs realated options such as `updateFiles`, `autoReload` and `syncFiles`.
      * @since 0.10.0
      */
    var staticCatalog: js.UndefOr[GlobalCatalog] = js.undefined
    
    /**
      * Sync locale information across all files
      * @default false
      */
    var syncFiles: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to write new locale information to disk
      * @default true
      */
    var updateFiles: js.UndefOr[Boolean] = js.undefined
  }
  object ConfigurationOptions {
    
    inline def apply(): ConfigurationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigurationOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigurationOptions] (val x: Self) extends AnyVal {
      
      inline def setApi(value: StringDictionary[String]): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
      
      inline def setApiUndefined: Self = StObject.set(x, "api", js.undefined)
      
      inline def setAutoReload(value: Boolean): Self = StObject.set(x, "autoReload", value.asInstanceOf[js.Any])
      
      inline def setAutoReloadUndefined: Self = StObject.set(x, "autoReload", js.undefined)
      
      inline def setCookie(value: String): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
      
      inline def setCookieUndefined: Self = StObject.set(x, "cookie", js.undefined)
      
      inline def setDefaultLocale(value: String): Self = StObject.set(x, "defaultLocale", value.asInstanceOf[js.Any])
      
      inline def setDefaultLocaleUndefined: Self = StObject.set(x, "defaultLocale", js.undefined)
      
      inline def setDirectory(value: String): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
      
      inline def setDirectoryPermissions(value: String): Self = StObject.set(x, "directoryPermissions", value.asInstanceOf[js.Any])
      
      inline def setDirectoryPermissionsUndefined: Self = StObject.set(x, "directoryPermissions", js.undefined)
      
      inline def setDirectoryUndefined: Self = StObject.set(x, "directory", js.undefined)
      
      inline def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
      
      inline def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
      
      inline def setFallbacks(value: StringDictionary[String]): Self = StObject.set(x, "fallbacks", value.asInstanceOf[js.Any])
      
      inline def setFallbacksUndefined: Self = StObject.set(x, "fallbacks", js.undefined)
      
      inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setIndent(value: String): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      inline def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      inline def setLocales(value: js.Array[String]): Self = StObject.set(x, "locales", value.asInstanceOf[js.Any])
      
      inline def setLocalesUndefined: Self = StObject.set(x, "locales", js.undefined)
      
      inline def setLocalesVarargs(value: String*): Self = StObject.set(x, "locales", js.Array(value*))
      
      inline def setLogDebugFn(value: /* msg */ String => Unit): Self = StObject.set(x, "logDebugFn", js.Any.fromFunction1(value))
      
      inline def setLogDebugFnUndefined: Self = StObject.set(x, "logDebugFn", js.undefined)
      
      inline def setLogErrorFn(value: /* msg */ String => Unit): Self = StObject.set(x, "logErrorFn", js.Any.fromFunction1(value))
      
      inline def setLogErrorFnUndefined: Self = StObject.set(x, "logErrorFn", js.undefined)
      
      inline def setLogWarnFn(value: /* msg */ String => Unit): Self = StObject.set(x, "logWarnFn", js.Any.fromFunction1(value))
      
      inline def setLogWarnFnUndefined: Self = StObject.set(x, "logWarnFn", js.undefined)
      
      inline def setMissingKeyFn(value: (/* locale */ String, /* value */ String) => String): Self = StObject.set(x, "missingKeyFn", js.Any.fromFunction2(value))
      
      inline def setMissingKeyFnUndefined: Self = StObject.set(x, "missingKeyFn", js.undefined)
      
      inline def setMustacheConfig(value: Disable): Self = StObject.set(x, "mustacheConfig", value.asInstanceOf[js.Any])
      
      inline def setMustacheConfigUndefined: Self = StObject.set(x, "mustacheConfig", js.undefined)
      
      inline def setObjectNotation(value: Boolean): Self = StObject.set(x, "objectNotation", value.asInstanceOf[js.Any])
      
      inline def setObjectNotationUndefined: Self = StObject.set(x, "objectNotation", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setPreserveLegacyCase(value: Boolean): Self = StObject.set(x, "preserveLegacyCase", value.asInstanceOf[js.Any])
      
      inline def setPreserveLegacyCaseUndefined: Self = StObject.set(x, "preserveLegacyCase", js.undefined)
      
      inline def setQueryParameter(value: String): Self = StObject.set(x, "queryParameter", value.asInstanceOf[js.Any])
      
      inline def setQueryParameterUndefined: Self = StObject.set(x, "queryParameter", js.undefined)
      
      inline def setRegister(value: Any): Self = StObject.set(x, "register", value.asInstanceOf[js.Any])
      
      inline def setRegisterUndefined: Self = StObject.set(x, "register", js.undefined)
      
      inline def setRetryInDefaultLocale(value: Boolean): Self = StObject.set(x, "retryInDefaultLocale", value.asInstanceOf[js.Any])
      
      inline def setRetryInDefaultLocaleUndefined: Self = StObject.set(x, "retryInDefaultLocale", js.undefined)
      
      inline def setStaticCatalog(value: GlobalCatalog): Self = StObject.set(x, "staticCatalog", value.asInstanceOf[js.Any])
      
      inline def setStaticCatalogUndefined: Self = StObject.set(x, "staticCatalog", js.undefined)
      
      inline def setSyncFiles(value: Boolean): Self = StObject.set(x, "syncFiles", value.asInstanceOf[js.Any])
      
      inline def setSyncFilesUndefined: Self = StObject.set(x, "syncFiles", js.undefined)
      
      inline def setUpdateFiles(value: Boolean): Self = StObject.set(x, "updateFiles", value.asInstanceOf[js.Any])
      
      inline def setUpdateFilesUndefined: Self = StObject.set(x, "updateFiles", js.undefined)
    }
  }
  
  type GlobalCatalog = StringDictionary[LocaleCatalog]
  
  type HashedList = StringDictionary[String]
  
  @js.native
  trait I18n extends StObject {
    
    def __(phraseOrOptions: String, replace: String*): String = js.native
    def __(phraseOrOptions: String, replacements: Replacements): String = js.native
    def __(phraseOrOptions: TranslateOptions, replace: String*): String = js.native
    def __(phraseOrOptions: TranslateOptions, replacements: Replacements): String = js.native
    
    def __h(phrase: String): js.Array[HashedList] = js.native
    
    def __l(phrase: String): js.Array[String] = js.native
    
    def __mf(phraseOrOptions: String, replace: Any*): String = js.native
    def __mf(phraseOrOptions: String, replacements: Replacements): String = js.native
    def __mf(phraseOrOptions: TranslateOptions, replace: Any*): String = js.native
    def __mf(phraseOrOptions: TranslateOptions, replacements: Replacements): String = js.native
    
    def __n(options: PluralOptions): String = js.native
    def __n(options: PluralOptions, count: Double): String = js.native
    def __n(phrase: String, count: Double): String = js.native
    def __n(singular: String, plural: String, count: String): String = js.native
    def __n(singular: String, plural: String, count: Double): String = js.native
    
    def addLocale(locale: String): Unit = js.native
    
    def configure(options: ConfigurationOptions): Unit = js.native
    
    def getCatalog(): GlobalCatalog = js.native
    def getCatalog(locale: String): LocaleCatalog = js.native
    def getCatalog(request: Request): LocaleCatalog = js.native
    def getCatalog(request: Request, locale: String): LocaleCatalog = js.native
    
    def getLocale(): String = js.native
    def getLocale(request: Request): String = js.native
    
    def getLocales(): js.Array[String] = js.native
    
    def init(request: Request, response: typings.i18n.Express.Response): Unit = js.native
    def init(request: Request, response: typings.i18n.Express.Response, next: js.Function0[Unit]): Unit = js.native
    
    def overrideLocaleFromQuery(): Unit = js.native
    def overrideLocaleFromQuery(request: Request): Unit = js.native
    
    def removeLocale(locale: String): Unit = js.native
    
    def setLocale(locale: String): Unit = js.native
    def setLocale(objects: js.Array[Any], locale: String): Unit = js.native
    def setLocale(objects: js.Array[Any], locale: String, inheritance: Boolean): Unit = js.native
    // tslint:disable-next-line:unified-signatures
    def setLocale(objects: Any, locale: String): Unit = js.native
    def setLocale(objects: Any, locale: String, inheritance: Boolean): Unit = js.native
    // tslint:disable-next-line:unified-signatures
    def setLocale(requestOrResponse: Request | typings.i18n.Express.Response, locale: String): Unit = js.native
    def setLocale(requestOrResponse: Request | typings.i18n.Express.Response, locale: String, inheritance: Boolean): Unit = js.native
    
    var version: String = js.native
  }
  
  type LocaleCatalog = StringDictionary[String | Plurals]
  
  trait PluralOptions extends StObject {
    
    var count: js.UndefOr[Double] = js.undefined
    
    var locale: js.UndefOr[String] = js.undefined
    
    var plural: String
    
    var singular: String
  }
  object PluralOptions {
    
    inline def apply(plural: String, singular: String): PluralOptions = {
      val __obj = js.Dynamic.literal(plural = plural.asInstanceOf[js.Any], singular = singular.asInstanceOf[js.Any])
      __obj.asInstanceOf[PluralOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PluralOptions] (val x: Self) extends AnyVal {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setPlural(value: String): Self = StObject.set(x, "plural", value.asInstanceOf[js.Any])
      
      inline def setSingular(value: String): Self = StObject.set(x, "singular", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * This interface represents a plural translation.
    * e.g. { one: "you have 1 friend", other: "you have many friends" }
    */
  type Plurals = StringDictionary[String]
  
  type Replacements = StringDictionary[String]
  
  @js.native
  trait Response
    extends StObject
       with i18nAPI {
    
    var locals: Partiali18nAPI = js.native
  }
  
  trait TranslateOptions extends StObject {
    
    var locale: js.UndefOr[String] = js.undefined
    
    var phrase: String
  }
  object TranslateOptions {
    
    inline def apply(phrase: String): TranslateOptions = {
      val __obj = js.Dynamic.literal(phrase = phrase.asInstanceOf[js.Any])
      __obj.asInstanceOf[TranslateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TranslateOptions] (val x: Self) extends AnyVal {
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setPhrase(value: String): Self = StObject.set(x, "phrase", value.asInstanceOf[js.Any])
    }
  }
}
