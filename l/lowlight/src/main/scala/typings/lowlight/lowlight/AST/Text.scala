package typings.lowlight.lowlight.AST

import typings.lowlight.lowlight.AST.Unist.Data
import typings.lowlight.lowlight.AST.Unist.Location
import typings.lowlight.lowlight.HastNode
import typings.lowlight.lowlightStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Text
  extends typings.lowlight.lowlight.AST.Unist.Text
     with HastNode {
  @JSName("type")
  var type_Text: text
}

object Text {
  @scala.inline
  def apply(`type`: text, value: String, data: Data = null, position: Location = null): Text = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Text]
  }
}

