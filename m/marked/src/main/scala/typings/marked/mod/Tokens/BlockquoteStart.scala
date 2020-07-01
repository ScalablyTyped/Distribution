package typings.marked.mod.Tokens

import typings.marked.markedStrings.blockquote_start
import typings.marked.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockquoteStart extends Token {
  var raw: String
  var `type`: blockquote_start
}

object BlockquoteStart {
  @scala.inline
  def apply(raw: String, `type`: blockquote_start): BlockquoteStart = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockquoteStart]
  }
}

