package typings.jsonToAst.mod

import typings.jsonToAst.jsonToAstStrings.Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectNode
  extends ASTNode
     with ValueNode {
  
  var children: js.Array[PropertyNode] = js.native
  
  @JSName("type")
  var type_ObjectNode: Object = js.native
}
object ObjectNode {
  
  @scala.inline
  def apply(children: js.Array[PropertyNode], `type`: Object): ObjectNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectNode]
  }
  
  @scala.inline
  implicit class ObjectNodeOps[Self <: ObjectNode] (val x: Self) extends AnyVal {
    
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
    def setChildrenVarargs(value: PropertyNode*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: js.Array[PropertyNode]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Object): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
