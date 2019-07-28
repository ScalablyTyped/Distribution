package typings.lowlight.lowlightNs.ASTNs

import typings.lowlight.lowlightNs.ASTNs.UnistNs.Data
import typings.lowlight.lowlightNs.ASTNs.UnistNs.Location
import typings.lowlight.lowlightNs.HastNode
import typings.lowlight.lowlightStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Text
  extends typings.lowlight.lowlightNs.ASTNs.UnistNs.Text
     with HastNode {
  @JSName("type")
  var type_Text: text
}

object Text {
  @scala.inline
  def apply(`type`: text, value: String, data: Data = null, position: Location = null): Text = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    if (data != null) __obj.updateDynamic("data")(data)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[Text]
  }
}

