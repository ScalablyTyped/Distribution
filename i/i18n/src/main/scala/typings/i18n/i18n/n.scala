package typings.i18n.i18n

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("i18n.__n")
@js.native
object n extends js.Object {
  /**
    * Translate with plural condition the given phrase and count using locale configuration
    * @param options - Options for plural translate
    * @param [count] - The number which allow to select from plural to singular
    * @returns The translated phrase
    */
  def apply(options: PluralOptions): String = js.native
  def apply(options: PluralOptions, count: Double): String = js.native
  //#endregion
  //#region __n()
  /**
    * Translate with plural condition the given phrase and count using locale configuration
    * @param phrase - Short phrase to be translated. All plural options ("one", "few", other", ...) have to be provided by your translation file
    * @param count - The number which allow to select from plural to singular
    * @returns The translated phrase
    */
  def apply(phrase: String, count: Double): String = js.native
  def apply(singular: String, plural: String, count: String): String = js.native
  /**
    * Translate with plural condition the given phrase and count using locale configuration
    * @param singular - The singular phrase to translate if count is <= 1
    * @param plural - The plural phrase to translate if count is > 1
    * @param count - The number which allow to select from plural to singular
    * @returns The translated phrase
    */
  def apply(singular: String, plural: String, count: Double): String = js.native
}

