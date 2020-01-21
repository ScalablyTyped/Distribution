package typings.jsoneditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SerializableNode extends js.Object {
  var path: JSONPath
  var value: js.Any
}

object SerializableNode {
  @scala.inline
  def apply(path: JSONPath, value: js.Any): SerializableNode = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SerializableNode]
  }
}

