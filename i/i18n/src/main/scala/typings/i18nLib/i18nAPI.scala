package typings
package i18nLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait i18nAPI extends js.Object {
  var locale: java.lang.String = js.native
  def __(phraseOrOptions: i18nLib.i18nNs.TranslateOptions, replace: java.lang.String*): java.lang.String = js.native
  def __(phraseOrOptions: i18nLib.i18nNs.TranslateOptions, replacements: i18nLib.i18nNs.Replacements): java.lang.String = js.native
  //#region __()
  /**
    * Translate the given phrase using locale configuration
    * @param phraseOrOptions - The phrase to translate or options for translation
    * @returns The translated phrase
    */
  def __(phraseOrOptions: java.lang.String, replace: java.lang.String*): java.lang.String = js.native
  /**
    * Translate the given phrase using locale configuration
    * @param phraseOrOptions - The phrase to translate or options for translation
    * @param replacements - An object containing replacements
    * @returns The translated phrase
    */
  def __(phraseOrOptions: java.lang.String, replacements: i18nLib.i18nNs.Replacements): java.lang.String = js.native
  //#endregion
  //#region __h()
  /**
    * Returns a hashed list of translations for a given phrase in each language.
    * @param phrase - The phrase to get translations in each language
    * @returns The phrase in each language
    */
  def __h(phrase: java.lang.String): js.Array[i18nLib.i18nNs.HashedList] = js.native
  //#endregion
  //#region __l()
  /**
    * Returns a list of translations for a given phrase in each language.
    * @param phrase - The phrase to get translations in each language
    * @returns The phrase in each language
    */
  def __l(phrase: java.lang.String): js.Array[java.lang.String] = js.native
  def __mf(phraseOrOptions: i18nLib.i18nNs.TranslateOptions, replace: js.Any*): java.lang.String = js.native
  def __mf(phraseOrOptions: i18nLib.i18nNs.TranslateOptions, replacements: i18nLib.i18nNs.Replacements): java.lang.String = js.native
  //#endregion
  //#region __mf()
  /**
    * Translate the given phrase using locale configuration and MessageFormat
    * @param phraseOrOptions - The phrase to translate or options for translation
    * @returns The translated phrase
    */
  def __mf(phraseOrOptions: java.lang.String, replace: js.Any*): java.lang.String = js.native
  /**
    * Translate the given phrase using locale configuration and MessageFormat
    * @param phraseOrOptions - The phrase to translate or options for translation
    * @param replacements - An object containing replacements
    * @returns The translated phrase
    */
  def __mf(phraseOrOptions: java.lang.String, replacements: i18nLib.i18nNs.Replacements): java.lang.String = js.native
  /**
    * Translate with plural condition the given phrase and count using locale configuration
    * @param options - Options for plural translate
    * @param [count] - The number which allow to select from plural to singular
    * @returns The translated phrase
    */
  def __n(options: i18nLib.i18nNs.PluralOptions): java.lang.String = js.native
  def __n(options: i18nLib.i18nNs.PluralOptions, count: scala.Double): java.lang.String = js.native
  //#endregion
  //#region __n()
  /**
    * Translate with plural condition the given phrase and count using locale configuration
    * @param phrase - Short phrase to be translated. All plural options ("one", "few", other", ...) have to be provided by your translation file
    * @param count - The number which allow to select from plural to singular
    * @returns The translated phrase
    */
  def __n(phrase: java.lang.String, count: scala.Double): java.lang.String = js.native
  def __n(singular: java.lang.String, plural: java.lang.String, count: java.lang.String): java.lang.String = js.native
  /**
    * Translate with plural condition the given phrase and count using locale configuration
    * @param singular - The singular phrase to translate if count is <= 1
    * @param plural - The plural phrase to translate if count is > 1
    * @param count - The number which allow to select from plural to singular
    * @returns The translated phrase
    */
  def __n(singular: java.lang.String, plural: java.lang.String, count: scala.Double): java.lang.String = js.native
  /**
    * Get the catalog for the given locale
    * @param locale - The locale to get catalog for
    * @returns The specified locale catalog
    */
  def getCatalog(): i18nLib.i18nNs.LocaleCatalog = js.native
  def getCatalog(locale: java.lang.String): i18nLib.i18nNs.LocaleCatalog = js.native
  /**
    * Get the current global catalog
    * @returns The current global catalog
    */
  @JSName("getCatalog")
  def getCatalog_GlobalCatalog(): i18nLib.i18nNs.GlobalCatalog = js.native
  //#endregion
  /**
    * Get the current active locale
    * @returns The current locale in request
    */
  def getLocale(): java.lang.String = js.native
  /**
    * Change the current active locale
    * @param locale - The locale to set as default
    */
  def setLocale(locale: java.lang.String): scala.Unit = js.native
}

