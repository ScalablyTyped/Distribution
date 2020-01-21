package typings.marked.mod.Tokens

import typings.marked.markedStrings.list_start
import typings.marked.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListStart extends Token {
  var ordered: Boolean
  var `type`: list_start
}

object ListStart {
  @scala.inline
  def apply(ordered: Boolean, `type`: list_start): ListStart = {
    val __obj = js.Dynamic.literal(ordered = ordered.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListStart]
  }
}

