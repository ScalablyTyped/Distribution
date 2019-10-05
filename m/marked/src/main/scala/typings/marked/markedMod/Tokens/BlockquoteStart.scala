package typings.marked.markedMod.Tokens

import typings.marked.markedMod.Token
import typings.marked.markedStrings.blockquote_start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockquoteStart extends Token {
  var `type`: blockquote_start
}

object BlockquoteStart {
  @scala.inline
  def apply(`type`: blockquote_start): BlockquoteStart = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BlockquoteStart]
  }
}

