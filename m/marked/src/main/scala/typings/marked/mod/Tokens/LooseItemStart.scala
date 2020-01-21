package typings.marked.mod.Tokens

import typings.marked.markedStrings.loose_item_start
import typings.marked.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LooseItemStart extends Token {
  var `type`: loose_item_start
}

object LooseItemStart {
  @scala.inline
  def apply(`type`: loose_item_start): LooseItemStart = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LooseItemStart]
  }
}

