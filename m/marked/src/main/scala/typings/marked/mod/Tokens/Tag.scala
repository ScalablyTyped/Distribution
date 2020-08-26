package typings.marked.mod.Tokens

import typings.marked.markedStrings.html
import typings.marked.markedStrings.text
import typings.marked.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tag extends Token {
  var inLink: Boolean = js.native
  var inRawBlock: Boolean = js.native
  var raw: String = js.native
  var text: String = js.native
  var `type`: text | html = js.native
}

object Tag {
  @scala.inline
  def apply(inLink: Boolean, inRawBlock: Boolean, raw: String, text: String, `type`: text | html): Tag = {
    val __obj = js.Dynamic.literal(inLink = inLink.asInstanceOf[js.Any], inRawBlock = inRawBlock.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tag]
  }
  @scala.inline
  implicit class TagOps[Self <: Tag] (val x: Self) extends AnyVal {
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
    def setInLink(value: Boolean): Self = this.set("inLink", value.asInstanceOf[js.Any])
    @scala.inline
    def setInRawBlock(value: Boolean): Self = this.set("inRawBlock", value.asInstanceOf[js.Any])
    @scala.inline
    def setRaw(value: String): Self = this.set("raw", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: text | html): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

