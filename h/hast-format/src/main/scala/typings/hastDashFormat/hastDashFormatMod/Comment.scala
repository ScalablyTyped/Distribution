package typings.hastDashFormat.hastDashFormatMod

import typings.hastDashFormat.hastDashFormatStrings.comment
import typings.unist.unistMod.Data
import typings.unist.unistMod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comment extends Literal {
  /**
    * Represents this variant of a Literal.
    */
  @JSName("type")
  var type_Comment: comment
}

object Comment {
  @scala.inline
  def apply(`type`: comment, value: String, data: Data = null, position: Position = null): Comment = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    if (data != null) __obj.updateDynamic("data")(data)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[Comment]
  }
}

