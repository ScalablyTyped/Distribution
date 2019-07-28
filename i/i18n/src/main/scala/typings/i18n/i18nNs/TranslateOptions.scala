package typings.i18n.i18nNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TranslateOptions extends js.Object {
  var locale: js.UndefOr[String] = js.undefined
  var phrase: String
}

object TranslateOptions {
  @scala.inline
  def apply(phrase: String, locale: String = null): TranslateOptions = {
    val __obj = js.Dynamic.literal(phrase = phrase)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    __obj.asInstanceOf[TranslateOptions]
  }
}

