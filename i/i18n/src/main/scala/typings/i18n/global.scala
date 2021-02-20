package typings.i18n

import typings.i18n.Express.Request
import typings.i18n.Express.Response
import typings.i18n.i18n.ConfigurationOptions
import typings.i18n.i18n.GlobalCatalog
import typings.i18n.i18n.HashedList
import typings.i18n.i18n.LocaleCatalog
import typings.i18n.i18n.PluralOptions
import typings.i18n.i18n.Replacements
import typings.i18n.i18n.TranslateOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object i18n {
    
    //#region __()
    /**
      * Translate the given phrase using locale configuration
      * @param phraseOrOptions - The phrase to translate or options for translation
      * @returns The translated phrase
      */
    @JSGlobal("i18n.__")
    @js.native
    def __(phraseOrOptions: String, replace: String*): String = js.native
    /**
      * Translate the given phrase using locale configuration
      * @param phraseOrOptions - The phrase to translate or options for translation
      * @param replacements - An object containing replacements
      * @returns The translated phrase
      */
    @JSGlobal("i18n.__")
    @js.native
    def __(phraseOrOptions: String, replacements: Replacements): String = js.native
    @JSGlobal("i18n.__")
    @js.native
    def __(phraseOrOptions: TranslateOptions, replace: String*): String = js.native
    @JSGlobal("i18n.__")
    @js.native
    def __(phraseOrOptions: TranslateOptions, replacements: Replacements): String = js.native
    
    /**
      * Configure current i18n instance
      * @param options - configuration options for i18n
      */
    @JSGlobal("i18n.configure")
    @js.native
    def configure(options: ConfigurationOptions): Unit = js.native
    
    //#endregion
    //#region Catalog
    /**
      * Get the current global catalog
      * @returns The current global catalog
      */
    @JSGlobal("i18n.getCatalog")
    @js.native
    def getCatalog(): GlobalCatalog = js.native
    /**
      * Get the catalog for the given locale
      * @param locale - The locale to get catalog for
      * @returns The specified locale catalog
      */
    @JSGlobal("i18n.getCatalog")
    @js.native
    def getCatalog(locale: String): LocaleCatalog = js.native
    /**
      * Get the current active locale catalog for specified request
      * @param request - The request to get locale catalog for
      * @param [locale] - The locale to get catalog for
      * @returns The current locale catalog for the specified request
      */
    @JSGlobal("i18n.getCatalog")
    @js.native
    def getCatalog(request: Request): LocaleCatalog = js.native
    @JSGlobal("i18n.getCatalog")
    @js.native
    def getCatalog(request: Request, locale: String): LocaleCatalog = js.native
    
    /**
      * Get the current active locale for specified request
      * @param [request] - The request to get locale for
      * @returns The current locale in request
      */
    @JSGlobal("i18n.getLocale")
    @js.native
    def getLocale(): String = js.native
    @JSGlobal("i18n.getLocale")
    @js.native
    def getLocale(request: Request): String = js.native
    
    /**
      * Get a list with all configured locales
      */
    @JSGlobal("i18n.getLocales")
    @js.native
    def getLocales(): js.Array[String] = js.native
    
    //#endregion
    //#region __h()
    /**
      * Returns a hashed list of translations for a given phrase in each language.
      * @param phrase - The phrase to get translations in each language
      * @returns The phrase in each language
      */
    @JSGlobal("i18n.__h")
    @js.native
    def h(phrase: String): js.Array[HashedList] = js.native
    
    /**
      * Initialize i18n middleware for express
      * @param request - Current express request
      * @param response - Current express response
      * @param next - Callback to continue process
      */
    @JSGlobal("i18n.init")
    @js.native
    def init(request: Request, response: Response): Unit = js.native
    @JSGlobal("i18n.init")
    @js.native
    def init(request: Request, response: Response, next: js.Function0[Unit]): Unit = js.native
    
    //#endregion
    //#region __l()
    /**
      * Returns a list of translations for a given phrase in each language.
      * @param phrase - The phrase to get translations in each language
      * @returns The phrase in each language
      */
    @JSGlobal("i18n.__l")
    @js.native
    def l(phrase: String): js.Array[String] = js.native
    
    //#endregion
    //#region __mf()
    /**
      * Translate the given phrase using locale configuration and MessageFormat
      * @param phraseOrOptions - The phrase to translate or options for translation
      * @returns The translated phrase
      */
    @JSGlobal("i18n.__mf")
    @js.native
    def mf(phraseOrOptions: String, replace: js.Any*): String = js.native
    /**
      * Translate the given phrase using locale configuration and MessageFormat
      * @param phraseOrOptions - The phrase to translate or options for translation
      * @param replacements - An object containing replacements
      * @returns The translated phrase
      */
    @JSGlobal("i18n.__mf")
    @js.native
    def mf(phraseOrOptions: String, replacements: Replacements): String = js.native
    @JSGlobal("i18n.__mf")
    @js.native
    def mf(phraseOrOptions: TranslateOptions, replace: js.Any*): String = js.native
    @JSGlobal("i18n.__mf")
    @js.native
    def mf(phraseOrOptions: TranslateOptions, replacements: Replacements): String = js.native
    
    /**
      * Translate with plural condition the given phrase and count using locale configuration
      * @param options - Options for plural translate
      * @param [count] - The number which allow to select from plural to singular
      * @returns The translated phrase
      */
    @JSGlobal("i18n.__n")
    @js.native
    def n(options: PluralOptions): String = js.native
    @JSGlobal("i18n.__n")
    @js.native
    def n(options: PluralOptions, count: Double): String = js.native
    //#endregion
    //#region __n()
    /**
      * Translate with plural condition the given phrase and count using locale configuration
      * @param phrase - Short phrase to be translated. All plural options ("one", "few", other", ...) have to be provided by your translation file
      * @param count - The number which allow to select from plural to singular
      * @returns The translated phrase
      */
    @JSGlobal("i18n.__n")
    @js.native
    def n(phrase: String, count: Double): String = js.native
    @JSGlobal("i18n.__n")
    @js.native
    def n(singular: String, plural: String, count: String): String = js.native
    /**
      * Translate with plural condition the given phrase and count using locale configuration
      * @param singular - The singular phrase to translate if count is <= 1
      * @param plural - The plural phrase to translate if count is > 1
      * @param count - The number which allow to select from plural to singular
      * @returns The translated phrase
      */
    @JSGlobal("i18n.__n")
    @js.native
    def n(singular: String, plural: String, count: Double): String = js.native
    
    //#endregion
    /**
      * Override the current request locale by using the query param (?locale=en)
      * @param [request] - The request to override locale for
      */
    @JSGlobal("i18n.overrideLocaleFromQuery")
    @js.native
    def overrideLocaleFromQuery(): Unit = js.native
    @JSGlobal("i18n.overrideLocaleFromQuery")
    @js.native
    def overrideLocaleFromQuery(request: Request): Unit = js.native
    
    //#endregion
    //#region Locale
    /**
      * Change the current active locale
      * @param locale - The locale to set as default
      */
    @JSGlobal("i18n.setLocale")
    @js.native
    def setLocale(locale: String): Unit = js.native
    /**
      * Change the current active locale for specified response
      * @param objects - The object(s) to change locale on
      * @param locale - The locale to set as default
      * @param [inheritance=false] - Disables inheritance if true
      */
    // tslint:disable-next-line:unified-signatures
    @JSGlobal("i18n.setLocale")
    @js.native
    def setLocale(objects: js.Any, locale: String): Unit = js.native
    @JSGlobal("i18n.setLocale")
    @js.native
    def setLocale(objects: js.Any, locale: String, inheritance: Boolean): Unit = js.native
    @JSGlobal("i18n.setLocale")
    @js.native
    def setLocale(objects: js.Array[_], locale: String): Unit = js.native
    @JSGlobal("i18n.setLocale")
    @js.native
    def setLocale(objects: js.Array[_], locale: String, inheritance: Boolean): Unit = js.native
    /**
      * Change the current active locale for specified response
      * @param response - The request or response to change locale on
      * @param locale - The locale to set as default
      * @param [inheritance=false] - Disables inheritance if true
      */
    @JSGlobal("i18n.setLocale")
    @js.native
    def setLocale(requestOrResponse: Request, locale: String): Unit = js.native
    @JSGlobal("i18n.setLocale")
    @js.native
    def setLocale(requestOrResponse: Request, locale: String, inheritance: Boolean): Unit = js.native
    @JSGlobal("i18n.setLocale")
    @js.native
    def setLocale(requestOrResponse: Response, locale: String): Unit = js.native
    @JSGlobal("i18n.setLocale")
    @js.native
    def setLocale(requestOrResponse: Response, locale: String, inheritance: Boolean): Unit = js.native
    
    /**
      * Get current i18n-node version
      */
    @JSGlobal("i18n.version")
    @js.native
    val version: String = js.native
  }
}
