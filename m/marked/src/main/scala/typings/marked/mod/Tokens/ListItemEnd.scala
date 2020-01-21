package typings.marked.mod.Tokens

import typings.marked.markedStrings.list_item_end
import typings.marked.mod.Token
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
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListItemEnd]
  }
}

