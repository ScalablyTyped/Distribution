package typings.intlMessageformat.mod

import typings.intlMessageformat.intlMessageformatNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArgumentPart extends MessageFormatPart {
  var `type`: `1`
  var value: js.Any
}

object ArgumentPart {
  @scala.inline
  def apply(`type`: `1`, value: js.Any): ArgumentPart = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgumentPart]
  }
}

