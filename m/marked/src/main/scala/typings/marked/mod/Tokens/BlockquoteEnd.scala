package typings.marked.mod.Tokens

import typings.marked.markedStrings.blockquote_end
import typings.marked.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlockquoteEnd extends Token {
  var raw: String = js.native
  var `type`: blockquote_end = js.native
}

object BlockquoteEnd {
  @scala.inline
  def apply(raw: String, `type`: blockquote_end): BlockquoteEnd = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockquoteEnd]
  }
  @scala.inline
  implicit class BlockquoteEndOps[Self <: BlockquoteEnd] (val x: Self) extends AnyVal {
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
    def setRaw(value: String): Self = this.set("raw", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: blockquote_end): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

