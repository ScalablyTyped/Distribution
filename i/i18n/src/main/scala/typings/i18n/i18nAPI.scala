package typings.i18n

import typings.i18n.i18n.GlobalCatalog
import typings.i18n.i18n.HashedList
import typings.i18n.i18n.LocaleCatalog
import typings.i18n.i18n.PluralOptions
import typings.i18n.i18n.Replacements
import typings.i18n.i18n.TranslateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait i18nAPI extends js.Object {
  var locale: String = js.native
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
    * Get the catalog for the given locale
    * @param locale - The locale to get catalog for
    * @returns The specified locale catalog
    */
  def getCatalog(): LocaleCatalog = js.native
  def getCatalog(locale: String): LocaleCatalog = js.native
  /**
    * Get the current global catalog
    * @returns The current global catalog
    */
  @JSName("getCatalog")
  def getCatalog_GlobalCatalog(): GlobalCatalog = js.native
  //#endregion
  /**
    * Get the current active locale
    * @returns The current locale in request
    */
  def getLocale(): String = js.native
  /**
    * Change the current active locale
    * @param locale - The locale to set as default
    */
  def setLocale(locale: String): Unit = js.native
}

