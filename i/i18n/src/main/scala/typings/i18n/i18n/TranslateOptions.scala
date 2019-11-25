package typings.i18n.i18n

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
    val __obj = js.Dynamic.literal(phrase = phrase.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranslateOptions]
  }
}

