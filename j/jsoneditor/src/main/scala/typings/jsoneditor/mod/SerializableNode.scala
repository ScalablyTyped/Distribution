package typings.jsoneditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SerializableNode extends js.Object {
  var path: JSONPath = js.native
  var value: js.Any = js.native
}

object SerializableNode {
  @scala.inline
  def apply(path: JSONPath, value: js.Any): SerializableNode = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializableNode]
  }
  @scala.inline
  implicit class SerializableNodeOps[Self <: SerializableNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPathVarargs(value: (String | Double)*): Self = this.set("path", js.Array(value :_*))
    @scala.inline
    def setPath(value: JSONPath): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

