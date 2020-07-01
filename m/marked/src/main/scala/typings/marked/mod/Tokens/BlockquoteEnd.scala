package typings.marked.mod.Tokens

import typings.marked.markedStrings.blockquote_end
import typings.marked.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockquoteEnd extends Token {
  var raw: String
  var `type`: blockquote_end
}

object BlockquoteEnd {
  @scala.inline
  def apply(raw: String, `type`: blockquote_end): BlockquoteEnd = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockquoteEnd]
  }
}

