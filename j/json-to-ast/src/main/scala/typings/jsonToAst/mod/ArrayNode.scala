package typings.jsonToAst.mod

import typings.jsonToAst.jsonToAstStrings.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayNode
  extends ASTNode
     with ValueNode {
  var children: js.Array[ValueNode] = js.native
  @JSName("type")
  var type_ArrayNode: Array = js.native
}

object ArrayNode {
  @scala.inline
  def apply(children: js.Array[ValueNode], `type`: Array): ArrayNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayNode]
  }
  @scala.inline
  implicit class ArrayNodeOps[Self <: ArrayNode] (val x: Self) extends AnyVal {
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
    def setChildrenVarargs(value: ValueNode*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[ValueNode]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: Array): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

