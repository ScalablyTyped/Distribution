package typings.jsoneditor.anon

import typings.jsoneditor.mod.SerializableNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait End extends js.Object {
  var end: SerializableNode
  var start: SerializableNode
}

object End {
  @scala.inline
  def apply(end: SerializableNode, start: SerializableNode): End = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[End]
  }
}

