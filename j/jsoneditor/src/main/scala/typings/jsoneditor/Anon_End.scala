package typings.jsoneditor

import typings.jsoneditor.jsoneditorMod.SerializableNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_End extends js.Object {
  var end: SerializableNode
  var start: SerializableNode
}

object Anon_End {
  @scala.inline
  def apply(end: SerializableNode, start: SerializableNode): Anon_End = {
    val __obj = js.Dynamic.literal(end = end, start = start)
  
    __obj.asInstanceOf[Anon_End]
  }
}

