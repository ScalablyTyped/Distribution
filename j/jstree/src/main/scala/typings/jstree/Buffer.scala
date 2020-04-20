package typings.jstree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Buffer extends js.Object {
  var inst: js.Any
  var mode: String
  var node: js.Array[_]
}

object Buffer {
  @scala.inline
  def apply(inst: js.Any, mode: String, node: js.Array[_]): Buffer = {
    val __obj = js.Dynamic.literal(inst = inst.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buffer]
  }
}

