package typings
package jsoneditorLib.jsoneditorMod

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
    val __obj = js.Dynamic.literal(path = path, value = value)
  
    __obj.asInstanceOf[SerializableNode]
  }
}

