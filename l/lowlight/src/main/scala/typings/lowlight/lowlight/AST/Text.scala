package typings.lowlight.lowlight.AST

import typings.lowlight.lowlight.HastNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Text
  extends typings.lowlight.lowlight.AST.Unist.Text
     with HastNode

object Text {
  @scala.inline
  def apply(`type`: String, value: String): Text = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Text]
  }
}

