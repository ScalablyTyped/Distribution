package typings.i18nAbide

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLang extends js.Object {
  var lang: String
  var quality: Double
}

object AnonLang {
  @scala.inline
  def apply(lang: String, quality: Double): AnonLang = {
    val __obj = js.Dynamic.literal(lang = lang.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLang]
  }
}

