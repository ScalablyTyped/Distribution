package typings
package intlDashMessageformatLib.libCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiteralPart extends MessageFormatPart {
  var `type`: intlDashMessageformatLib.intlDashMessageformatLibNumbers.`0`
  var value: java.lang.String
}

object LiteralPart {
  @scala.inline
  def apply(`type`: intlDashMessageformatLib.intlDashMessageformatLibNumbers.`0`, value: java.lang.String): LiteralPart = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[LiteralPart]
  }
}

