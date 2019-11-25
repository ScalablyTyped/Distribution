package typings.intlDashMessageformat.intlDashMessageformatMod

import typings.intlDashMessageformat.intlDashMessageformatNumbers.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiteralPart extends MessageFormatPart {
  var `type`: `0`
  var value: String
}

object LiteralPart {
  @scala.inline
  def apply(`type`: `0`, value: String): LiteralPart = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiteralPart]
  }
}

