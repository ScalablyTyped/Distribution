package typings
package inflectedLib.inflectedMod.OptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transliterate extends js.Object {
  var locale: java.lang.String
  var replacement: java.lang.String
}

object Transliterate {
  @scala.inline
  def apply(locale: java.lang.String, replacement: java.lang.String): Transliterate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("locale")(locale)
    __obj.updateDynamic("replacement")(replacement)
    __obj.asInstanceOf[Transliterate]
  }
}

