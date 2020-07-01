package typings.marked.mod.Tokens

import typings.marked.markedStrings.blockquote
import typings.marked.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Blockquote extends Token {
  var raw: String
  var text: String
  var `type`: blockquote
}

object Blockquote {
  @scala.inline
  def apply(raw: String, text: String, `type`: blockquote): Blockquote = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Blockquote]
  }
}

