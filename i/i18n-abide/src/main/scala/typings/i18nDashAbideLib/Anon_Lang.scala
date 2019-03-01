package typings
package i18nDashAbideLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Lang extends js.Object {
  var lang: java.lang.String
  var quality: scala.Double
}

object Anon_Lang {
  @scala.inline
  def apply(lang: java.lang.String, quality: scala.Double): Anon_Lang = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("lang")(lang)
    __obj.updateDynamic("quality")(quality)
    __obj.asInstanceOf[Anon_Lang]
  }
}

