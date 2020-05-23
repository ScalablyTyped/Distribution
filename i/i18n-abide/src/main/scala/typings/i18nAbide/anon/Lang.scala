package typings.i18nAbide.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Lang extends js.Object {
  var lang: String
  var quality: Double
}

object Lang {
  @scala.inline
  def apply(lang: String, quality: Double): Lang = {
    val __obj = js.Dynamic.literal(lang = lang.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lang]
  }
}

