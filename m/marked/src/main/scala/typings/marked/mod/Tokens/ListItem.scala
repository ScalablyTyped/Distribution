package typings.marked.mod.Tokens

import typings.marked.markedStrings.list_item
import typings.marked.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListItem extends Token {
  var checked: Boolean
  var loose: Boolean
  var raw: String
  var task: Boolean
  var text: String
  var `type`: list_item
}

object ListItem {
  @scala.inline
  def apply(checked: Boolean, loose: Boolean, raw: String, task: Boolean, text: String, `type`: list_item): ListItem = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], loose = loose.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListItem]
  }
}

