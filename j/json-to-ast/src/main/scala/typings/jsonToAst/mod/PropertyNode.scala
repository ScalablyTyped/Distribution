package typings.jsonToAst.mod

import typings.jsonToAst.jsonToAstStrings.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropertyNode extends ASTNode {
  
  var key: IdentifierNode = js.native
  
  @JSName("type")
  var type_PropertyNode: Property = js.native
  
  var value: ValueNode = js.native
}
object PropertyNode {
  
  @scala.inline
  def apply(key: IdentifierNode, `type`: Property, value: ValueNode): PropertyNode = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyNode]
  }
  
  @scala.inline
  implicit class PropertyNodeOps[Self <: PropertyNode] (val x: Self) extends AnyVal {
    
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
    def setKey(value: IdentifierNode): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Property): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: ValueNode): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
