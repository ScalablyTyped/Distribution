package typings
package hastDashFormatLib.hastDashFormatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Text extends Literal {
  /**
    * Represents this variant of a Literal.
    */
  @JSName("type")
  var type_Text: hastDashFormatLib.hastDashFormatLibStrings.text
}

object Text {
  @scala.inline
  def apply(
    `type`: hastDashFormatLib.hastDashFormatLibStrings.text,
    value: java.lang.String,
    data: unistLib.unistMod.Data = null,
    position: unistLib.unistMod.Position = null
  ): Text = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    if (data != null) __obj.updateDynamic("data")(data)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[Text]
  }
}

