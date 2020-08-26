package typings.javascriptObfuscator.estreeMod

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseNode extends js.Object {
  var metadata: js.UndefOr[BaseNodeMetadata] = js.native
  var parentNode: js.UndefOr[Node] = js.native
}

object BaseNode {
  @scala.inline
  def apply(): BaseNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseNode]
  }
  @scala.inline
  implicit class BaseNodeOps[Self <: BaseNode] (val x: Self) extends AnyVal {
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
    def setMetadata(value: BaseNodeMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setParentNode(value: Node): Self = this.set("parentNode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentNode: Self = this.set("parentNode", js.undefined)
  }
  
}

