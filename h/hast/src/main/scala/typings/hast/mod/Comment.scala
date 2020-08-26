package typings.hast.mod

import typings.hast.hastStrings.comment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Comment extends Literal {
  /**
    * Represents this variant of a Literal.
    */
  @JSName("type")
  var type_Comment: comment = js.native
}

object Comment {
  @scala.inline
  def apply(`type`: comment, value: js.Any): Comment = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comment]
  }
  @scala.inline
  implicit class CommentOps[Self <: Comment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setType(value: comment): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

