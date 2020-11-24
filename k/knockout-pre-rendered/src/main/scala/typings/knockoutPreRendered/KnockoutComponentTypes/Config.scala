package typings.knockoutPreRendered.KnockoutComponentTypes

import typings.std.DocumentFragment
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Config extends js.Object {
  
  var synchronous: js.UndefOr[Boolean] = js.native
  
  var template: String | js.Array[Node] | DocumentFragment | TemplateElement | AMDModule = js.native
  
  var viewModel: js.UndefOr[
    ViewModelFunction | ViewModelSharedInstance | ViewModelFactoryFunction | AMDModule
  ] = js.native
}
object Config {
  
  @scala.inline
  def apply(template: String | js.Array[Node] | DocumentFragment | TemplateElement | AMDModule): Config = {
    val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    
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
    def setTemplate(value: String | js.Array[Node] | DocumentFragment | TemplateElement | AMDModule): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSynchronous(value: Boolean): Self = this.set("synchronous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSynchronous: Self = this.set("synchronous", js.undefined)
    
    @scala.inline
    def setViewModelFunction1(value: /* params */ js.UndefOr[js.Any] => js.Any): Self = this.set("viewModel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setViewModel(value: ViewModelFunction | ViewModelSharedInstance | ViewModelFactoryFunction | AMDModule): Self = this.set("viewModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewModel: Self = this.set("viewModel", js.undefined)
  }
}
