package typings.intlDashMessageformat.libFormattersMod

import typings.intlDashMessageformat.intlDashMessageformatNumbers.`1`
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
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ArgumentPart]
  }
}

