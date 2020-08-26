package typings.jstree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Buffer extends js.Object {
  var inst: js.Any = js.native
  var mode: String = js.native
  var node: js.Array[_] = js.native
}

object Buffer {
  @scala.inline
  def apply(inst: js.Any, mode: String, node: js.Array[_]): Buffer = {
    val __obj = js.Dynamic.literal(inst = inst.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buffer]
  }
  @scala.inline
  implicit class BufferOps[Self <: Buffer] (val x: Self) extends AnyVal {
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
    def setInst(value: js.Any): Self = this.set("inst", value.asInstanceOf[js.Any])
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodeVarargs(value: js.Any*): Self = this.set("node", js.Array(value :_*))
    @scala.inline
    def setNode(value: js.Array[_]): Self = this.set("node", value.asInstanceOf[js.Any])
  }
  
}

