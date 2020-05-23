package typings.jsoneditor.anon

import typings.jsoneditor.mod.SelectionPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Start extends js.Object {
  var end: SelectionPosition
  var start: SelectionPosition
  var text: String
}

object Start {
  @scala.inline
  def apply(end: SelectionPosition, start: SelectionPosition, text: String): Start = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Start]
  }
}

