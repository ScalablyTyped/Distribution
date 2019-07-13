package typings
package intlDashMessageformatLib.libCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArgumentPart extends MessageFormatPart {
  var `type`: intlDashMessageformatLib.intlDashMessageformatLibNumbers.`1`
  var value: js.Any
}

object ArgumentPart {
  @scala.inline
  def apply(`type`: intlDashMessageformatLib.intlDashMessageformatLibNumbers.`1`, value: js.Any): ArgumentPart = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ArgumentPart]
  }
}

