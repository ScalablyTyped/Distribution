package typings.i18n.i18n

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("i18n.__")
@js.native
object __ extends js.Object {
  //#region __()
  /**
    * Translate the given phrase using locale configuration
    * @param phraseOrOptions - The phrase to translate or options for translation
    * @returns The translated phrase
    */
  def apply(phraseOrOptions: String, replace: String*): String = js.native
  /**
    * Translate the given phrase using locale configuration
    * @param phraseOrOptions - The phrase to translate or options for translation
    * @param replacements - An object containing replacements
    * @returns The translated phrase
    */
  def apply(phraseOrOptions: String, replacements: Replacements): String = js.native
  def apply(phraseOrOptions: TranslateOptions, replace: String*): String = js.native
  def apply(phraseOrOptions: TranslateOptions, replacements: Replacements): String = js.native
}

