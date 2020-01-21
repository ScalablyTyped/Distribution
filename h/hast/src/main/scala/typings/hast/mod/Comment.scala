package typings.hast.mod

import typings.hast.hastStrings.comment
import typings.unist.mod.Data
import typings.unist.mod.Position
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
  def apply(`type`: comment, value: js.Any, data: Data = null, position: Position = null): Comment = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comment]
  }
}

