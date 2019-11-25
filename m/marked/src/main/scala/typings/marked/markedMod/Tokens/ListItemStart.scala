package typings.marked.markedMod.Tokens

import typings.marked.markedMod.Token
import typings.marked.markedStrings.list_item_start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListItemStart extends Token {
  var `type`: list_item_start
}

object ListItemStart {
  @scala.inline
  def apply(`type`: list_item_start): ListItemStart = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListItemStart]
  }
}

