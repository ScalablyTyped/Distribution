package typings.i18n.i18n

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("i18n.__mf")
@js.native
object __mf extends js.Object {
  //#endregion
  //#region __mf()
  /**
    * Translate the given phrase using locale configuration and MessageFormat
    * @param phraseOrOptions - The phrase to translate or options for translation
    * @returns The translated phrase
    */
  def apply(phraseOrOptions: String, replace: js.Any*): String = js.native
  /**
    * Translate the given phrase using locale configuration and MessageFormat
    * @param phraseOrOptions - The phrase to translate or options for translation
    * @param replacements - An object containing replacements
    * @returns The translated phrase
    */
  def apply(phraseOrOptions: String, replacements: Replacements): String = js.native
  def apply(phraseOrOptions: TranslateOptions, replace: js.Any*): String = js.native
  def apply(phraseOrOptions: TranslateOptions, replacements: Replacements): String = js.native
}

