package typings.marked.markedMod.Tokens

import typings.marked.markedMod.Token
import typings.marked.markedStrings.loose_item_start
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
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[LooseItemStart]
  }
}

