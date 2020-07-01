package typings.marked.mod.Tokens

import typings.marked.markedStrings.list_start
import typings.marked.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait List extends Token {
  var items: js.Array[ListItem]
  var loose: Boolean
  var ordered: Boolean
  var raw: String
  var start: Boolean
  var `type`: list_start
}

object List {
  @scala.inline
  def apply(
    items: js.Array[ListItem],
    loose: Boolean,
    ordered: Boolean,
    raw: String,
    start: Boolean,
    `type`: list_start
  ): List = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], loose = loose.asInstanceOf[js.Any], ordered = ordered.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[List]
  }
}

