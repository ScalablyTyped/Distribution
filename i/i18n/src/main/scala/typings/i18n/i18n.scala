package typings.i18n

import org.scalablytyped.runtime.StringDictionary
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
    var register: js.UndefOr[js.Any] = js.undefined
    
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
    
    @scala.inline
    def apply(): ConfigurationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigurationOptions]
    }
    
    @scala.inline
    implicit class ConfigurationOptionsMutableBuilder[Self <: ConfigurationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApi(value: StringDictionary[String]): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiUndefined: Self = StObject.set(x, "api", js.undefined)
      
      @scala.inline
      def setAutoReload(value: Boolean): Self = StObject.set(x, "autoReload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoReloadUndefined: Self = StObject.set(x, "autoReload", js.undefined)
      
      @scala.inline
      def setCookie(value: String): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookieUndefined: Self = StObject.set(x, "cookie", js.undefined)
      
      @scala.inline
      def setDefaultLocale(value: String): Self = StObject.set(x, "defaultLocale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultLocaleUndefined: Self = StObject.set(x, "defaultLocale", js.undefined)
      
      @scala.inline
      def setDirectory(value: String): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectoryPermissions(value: String): Self = StObject.set(x, "directoryPermissions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectoryPermissionsUndefined: Self = StObject.set(x, "directoryPermissions", js.undefined)
      
      @scala.inline
      def setDirectoryUndefined: Self = StObject.set(x, "directory", js.undefined)
      
      @scala.inline
      def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
      
      @scala.inline
      def setFallbacks(value: StringDictionary[String]): Self = StObject.set(x, "fallbacks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFallbacksUndefined: Self = StObject.set(x, "fallbacks", js.undefined)
      
      @scala.inline
      def setIndent(value: String): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      @scala.inline
      def setLocales(value: js.Array[String]): Self = StObject.set(x, "locales", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalesUndefined: Self = StObject.set(x, "locales", js.undefined)
      
      @scala.inline
      def setLocalesVarargs(value: String*): Self = StObject.set(x, "locales", js.Array(value :_*))
      
      @scala.inline
      def setLogDebugFn(value: /* msg */ String => Unit): Self = StObject.set(x, "logDebugFn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLogDebugFnUndefined: Self = StObject.set(x, "logDebugFn", js.undefined)
      
      @scala.inline
      def setLogErrorFn(value: /* msg */ String => Unit): Self = StObject.set(x, "logErrorFn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLogErrorFnUndefined: Self = StObject.set(x, "logErrorFn", js.undefined)
      
      @scala.inline
      def setLogWarnFn(value: /* msg */ String => Unit): Self = StObject.set(x, "logWarnFn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLogWarnFnUndefined: Self = StObject.set(x, "logWarnFn", js.undefined)
      
      @scala.inline
      def setObjectNotation(value: Boolean): Self = StObject.set(x, "objectNotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectNotationUndefined: Self = StObject.set(x, "objectNotation", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setPreserveLegacyCase(value: Boolean): Self = StObject.set(x, "preserveLegacyCase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveLegacyCaseUndefined: Self = StObject.set(x, "preserveLegacyCase", js.undefined)
      
      @scala.inline
      def setQueryParameter(value: String): Self = StObject.set(x, "queryParameter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryParameterUndefined: Self = StObject.set(x, "queryParameter", js.undefined)
      
      @scala.inline
      def setRegister(value: js.Any): Self = StObject.set(x, "register", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegisterUndefined: Self = StObject.set(x, "register", js.undefined)
      
      @scala.inline
      def setSyncFiles(value: Boolean): Self = StObject.set(x, "syncFiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSyncFilesUndefined: Self = StObject.set(x, "syncFiles", js.undefined)
      
      @scala.inline
      def setUpdateFiles(value: Boolean): Self = StObject.set(x, "updateFiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateFilesUndefined: Self = StObject.set(x, "updateFiles", js.undefined)
    }
  }
  
  type GlobalCatalog = StringDictionary[LocaleCatalog]
  
  type HashedList = StringDictionary[String]
  
  type LocaleCatalog = StringDictionary[String]
  
  trait PluralOptions extends StObject {
    
    var count: js.UndefOr[Double] = js.undefined
    
    var locale: js.UndefOr[String] = js.undefined
    
    var plural: String
    
    var singular: String
  }
  object PluralOptions {
    
    @scala.inline
    def apply(plural: String, singular: String): PluralOptions = {
      val __obj = js.Dynamic.literal(plural = plural.asInstanceOf[js.Any], singular = singular.asInstanceOf[js.Any])
      __obj.asInstanceOf[PluralOptions]
    }
    
    @scala.inline
    implicit class PluralOptionsMutableBuilder[Self <: PluralOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setPlural(value: String): Self = StObject.set(x, "plural", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSingular(value: String): Self = StObject.set(x, "singular", value.asInstanceOf[js.Any])
    }
  }
  
  type Replacements = StringDictionary[String]
  
  trait TranslateOptions extends StObject {
    
    var locale: js.UndefOr[String] = js.undefined
    
    var phrase: String
  }
  object TranslateOptions {
    
    @scala.inline
    def apply(phrase: String): TranslateOptions = {
      val __obj = js.Dynamic.literal(phrase = phrase.asInstanceOf[js.Any])
      __obj.asInstanceOf[TranslateOptions]
    }
    
    @scala.inline
    implicit class TranslateOptionsMutableBuilder[Self <: TranslateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setPhrase(value: String): Self = StObject.set(x, "phrase", value.asInstanceOf[js.Any])
    }
  }
}
