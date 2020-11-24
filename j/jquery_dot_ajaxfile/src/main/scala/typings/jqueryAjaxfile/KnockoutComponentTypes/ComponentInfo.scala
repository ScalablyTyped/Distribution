package typings.jqueryAjaxfile.KnockoutComponentTypes

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentInfo extends js.Object {
  
  var element: Node = js.native
  
  var templateNodes: js.Array[Node] = js.native
}
object ComponentInfo {
  
  @scala.inline
  def apply(element: Node, templateNodes: js.Array[Node]): ComponentInfo = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], templateNodes = templateNodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentInfo]
  }
  
  @scala.inline
  implicit class ComponentInfoOps[Self <: ComponentInfo] (val x: Self) extends AnyVal {
    
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
    def setElement(value: Node): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateNodesVarargs(value: Node*): Self = this.set("templateNodes", js.Array(value :_*))
    
    @scala.inline
    def setTemplateNodes(value: js.Array[Node]): Self = this.set("templateNodes", value.asInstanceOf[js.Any])
  }
}
