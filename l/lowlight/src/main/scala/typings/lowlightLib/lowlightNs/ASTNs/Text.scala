package typings
package lowlightLib.lowlightNs.ASTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Text
  extends lowlightLib.lowlightNs.ASTNs.UnistNs.Text
     with lowlightLib.lowlightNs.HastNode {
  @JSName("type")
  var type_Text: lowlightLib.lowlightLibStrings.text
}

object Text {
  @scala.inline
  def apply(
    `type`: lowlightLib.lowlightLibStrings.text,
    value: java.lang.String,
    data: lowlightLib.lowlightNs.ASTNs.UnistNs.Data = null,
    position: lowlightLib.lowlightNs.ASTNs.UnistNs.Location = null
  ): Text = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    if (data != null) __obj.updateDynamic("data")(data)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[Text]
  }
}

