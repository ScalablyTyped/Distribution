package typings.ink.anon

import typings.ink.domMod.NodeNames
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeName extends js.Object {
  var nodeName: NodeNames = js.native
}

object NodeName {
  @scala.inline
  def apply(nodeName: NodeNames): NodeName = {
    val __obj = js.Dynamic.literal(nodeName = nodeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeName]
  }
  @scala.inline
  implicit class NodeNameOps[Self <: NodeName] (val x: Self) extends AnyVal {
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
    def setNodeName(value: NodeNames): Self = this.set("nodeName", value.asInstanceOf[js.Any])
  }
  
}

