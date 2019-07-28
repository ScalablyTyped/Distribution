package typings.i18n.i18nNs

import typings.i18n.ExpressNs.Request
import typings.i18n.ExpressNs.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("i18n")
@js.native
object ^ extends js.Object {
  /**
    * Get current i18n-node version
    */
  val version: String = js.native
  //#region __()
  /**
    * Translate the given phrase using locale configuration
    * @param phraseOrOptions - The phrase to translate or options for translation
    * @returns The translated phrase
    */
  def __(phraseOrOptions: String, replace: String*): String = js.native
  /**
    * Translate the given phrase using locale configuration
    * @param phraseOrOptions - The phrase to translate or options for translation
    * @param replacements - An object containing replacements
    * @returns The translated phrase
    */
  def __(phraseOrOptions: String, replacements: Replacements): String = js.native
  def __(phraseOrOptions: TranslateOptions, replace: String*): String = js.native
  def __(phraseOrOptions: TranslateOptions, replacements: Replacements): String = js.native
  //#endregion
  //#region __h()
  /**
    * Returns a hashed list of translations for a given phrase in each language.
    * @param phrase - The phrase to get translations in each language
    * @returns The phrase in each language
    */
  def __h(phrase: String): js.Array[HashedList] = js.native
  //#endregion
  //#region __l()
  /**
    * Returns a list of translations for a given phrase in each language.
    * @param phrase - The phrase to get translations in each language
    * @returns The phrase in each language
    */
  def __l(phrase: String): js.Array[String] = js.native
  //#endregion
  //#region __mf()
  /**
    * Translate the given phrase using locale configuration and MessageFormat
    * @param phraseOrOptions - The phrase to translate or options for translation
    * @returns The translated phrase
    */
  def __mf(phraseOrOptions: String, replace: js.Any*): String = js.native
  /**
    * Translate the given phrase using locale configuration and MessageFormat
    * @param phraseOrOptions - The phrase to translate or options for translation
    * @param replacements - An object containing replacements
    * @returns The translated phrase
    */
  def __mf(phraseOrOptions: String, replacements: Replacements): String = js.native
  def __mf(phraseOrOptions: TranslateOptions, replace: js.Any*): String = js.native
  def __mf(phraseOrOptions: TranslateOptions, replacements: Replacements): String = js.native
  /**
    * Translate with plural condition the given phrase and count using locale configuration
    * @param options - Options for plural translate
    * @param [count] - The number which allow to select from plural to singular
    * @returns The translated phrase
    */
  def __n(options: PluralOptions): String = js.native
  def __n(options: PluralOptions, count: Double): String = js.native
  //#endregion
  //#region __n()
  /**
    * Translate with plural condition the given phrase and count using locale configuration
    * @param phrase - Short phrase to be translated. All plural options ("one", "few", other", ...) have to be provided by your translation file
    * @param count - The number which allow to select from plural to singular
    * @returns The translated phrase
    */
  def __n(phrase: String, count: Double): String = js.native
  def __n(singular: String, plural: String, count: String): String = js.native
  /**
    * Translate with plural condition the given phrase and count using locale configuration
    * @param singular - The singular phrase to translate if count is <= 1
    * @param plural - The plural phrase to translate if count is > 1
    * @param count - The number which allow to select from plural to singular
    * @returns The translated phrase
    */
  def __n(singular: String, plural: String, count: Double): String = js.native
  /**
    * Configure current i18n instance
    * @param options - configuration options for i18n
    */
  def configure(options: ConfigurationOptions): Unit = js.native
  //#endregion
  //#region Catalog
  /**
    * Get the current global catalog
    * @returns The current global catalog
    */
  def getCatalog(): GlobalCatalog = js.native
  /**
    * Get the catalog for the given locale
    * @param locale - The locale to get catalog for
    * @returns The specified locale catalog
    */
  def getCatalog(locale: String): LocaleCatalog = js.native
  /**
    * Get the current active locale catalog for specified request
    * @param request - The request to get locale catalog for
    * @param [locale] - The locale to get catalog for
    * @returns The current locale catalog for the specified request
    */
  def getCatalog(request: Request): LocaleCatalog = js.native
  def getCatalog(request: Request, locale: String): LocaleCatalog = js.native
  /**
    * Get the current active locale for specified request
    * @param [request] - The request to get locale for
    * @returns The current locale in request
    */
  def getLocale(): String = js.native
  def getLocale(request: Request): String = js.native
  /**
    * Get a list with all configured locales
    */
  def getLocales(): js.Array[String] = js.native
  /**
    * Initialize i18n middleware for express
    * @param request - Current express request
    * @param response - Current express response
    * @param next - Callback to continue process
    */
  def init(request: Request, response: Response): Unit = js.native
  def init(request: Request, response: Response, next: js.Function0[Unit]): Unit = js.native
  //#endregion
  /**
    * Override the current request locale by using the query param (?locale=en)
    * @param [request] - The request to override locale for
    */
  def overrideLocaleFromQuery(): Unit = js.native
  def overrideLocaleFromQuery(request: Request): Unit = js.native
  //#endregion
  //#region Locale
  /**
    * Change the current active locale
    * @param locale - The locale to set as default
    */
  def setLocale(locale: String): Unit = js.native
  /**
    * Change the current active locale for specified response
    * @param objects - The object(s) to change locale on
    * @param locale - The locale to set as default
    * @param [inheritance=false] - Disables inheritance if true
    */
  // tslint:disable-next-line:unified-signatures
  def setLocale(objects: js.Any, locale: String): Unit = js.native
  def setLocale(objects: js.Any, locale: String, inheritance: Boolean): Unit = js.native
  def setLocale(objects: js.Array[_], locale: String): Unit = js.native
  def setLocale(objects: js.Array[_], locale: String, inheritance: Boolean): Unit = js.native
  /**
    * Change the current active locale for specified response
    * @param response - The request or response to change locale on
    * @param locale - The locale to set as default
    * @param [inheritance=false] - Disables inheritance if true
    */
  // tslint:disable-next-line:unified-signatures
  def setLocale(requestOrResponse: Request, locale: String): Unit = js.native
  def setLocale(requestOrResponse: Request, locale: String, inheritance: Boolean): Unit = js.native
  def setLocale(requestOrResponse: Response, locale: String): Unit = js.native
  def setLocale(requestOrResponse: Response, locale: String, inheritance: Boolean): Unit = js.native
}

