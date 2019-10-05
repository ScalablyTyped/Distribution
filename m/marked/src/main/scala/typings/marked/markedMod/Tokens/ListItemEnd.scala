package typings.marked.markedMod.Tokens

import typings.marked.markedMod.Token
import typings.marked.markedStrings.list_item_end
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListItemEnd extends Token {
  var `type`: list_item_end
}

object ListItemEnd {
  @scala.inline
  def apply(`type`: list_item_end): ListItemEnd = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ListItemEnd]
  }
}

