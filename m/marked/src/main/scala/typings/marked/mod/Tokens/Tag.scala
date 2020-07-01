package typings.marked.mod.Tokens

import typings.marked.markedStrings.html
import typings.marked.markedStrings.text
import typings.marked.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tag extends Token {
  var inLink: Boolean
  var inRawBlock: Boolean
  var raw: String
  var text: String
  var `type`: text | html
}

object Tag {
  @scala.inline
  def apply(inLink: Boolean, inRawBlock: Boolean, raw: String, text: String, `type`: text | html): Tag = {
    val __obj = js.Dynamic.literal(inLink = inLink.asInstanceOf[js.Any], inRawBlock = inRawBlock.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tag]
  }
}

