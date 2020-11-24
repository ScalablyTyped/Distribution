package typings.knockout.mod.components

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Component extends js.Object {
  
  var createViewModel: js.UndefOr[CreateViewModel] = js.native
  
  var template: js.Array[Node] = js.native
}
object Component {
  
  @scala.inline
  def apply(template: js.Array[Node]): Component = {
    val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[Component]
  }
  
  @scala.inline
  implicit class ComponentOps[Self <: Component] (val x: Self) extends AnyVal {
    
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
    def setTemplateVarargs(value: Node*): Self = this.set("template", js.Array(value :_*))
    
    @scala.inline
    def setTemplate(value: js.Array[Node]): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateViewModel(value: (/* params */ ViewModelParams, /* componentInfo */ ComponentInfo) => ViewModel): Self = this.set("createViewModel", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCreateViewModel: Self = this.set("createViewModel", js.undefined)
  }
}
