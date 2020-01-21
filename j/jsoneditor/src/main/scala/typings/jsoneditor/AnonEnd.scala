package typings.jsoneditor

import typings.jsoneditor.mod.SerializableNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEnd extends js.Object {
  var end: SerializableNode
  var start: SerializableNode
}

object AnonEnd {
  @scala.inline
  def apply(end: SerializableNode, start: SerializableNode): AnonEnd = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEnd]
  }
}

