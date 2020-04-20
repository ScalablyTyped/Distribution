package typings.jsoneditor

import typings.jsoneditor.mod.SelectionPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStart extends js.Object {
  var end: SelectionPosition
  var start: SelectionPosition
  var text: String
}

object AnonStart {
  @scala.inline
  def apply(end: SelectionPosition, start: SelectionPosition, text: String): AnonStart = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStart]
  }
}

