package typings
package i18nLib.i18nNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TranslateOptions extends js.Object {
  var locale: js.UndefOr[java.lang.String] = js.undefined
  var phrase: java.lang.String
}

object TranslateOptions {
  @scala.inline
  def apply(phrase: java.lang.String, locale: java.lang.String = null): TranslateOptions = {
    val __obj = js.Dynamic.literal(phrase = phrase)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    __obj.asInstanceOf[TranslateOptions]
  }
}

