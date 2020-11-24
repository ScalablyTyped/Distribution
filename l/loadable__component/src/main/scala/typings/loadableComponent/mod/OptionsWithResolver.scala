package typings.loadableComponent.mod

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionsWithResolver[Props, Module] extends OptionsWithoutResolver[Props] {
  
  var resolveComponent: ComponentResolver[Props, Module] = js.native
}
object OptionsWithResolver {
  
  @scala.inline
  def apply[Props, Module](resolveComponent: (Module, Props) => ComponentType[Props]): OptionsWithResolver[Props, Module] = {
    val __obj = js.Dynamic.literal(resolveComponent = js.Any.fromFunction2(resolveComponent))
    __obj.asInstanceOf[OptionsWithResolver[Props, Module]]
  }
  
  @scala.inline
  implicit class OptionsWithResolverOps[Self <: OptionsWithResolver[_, _], Props, Module] (val x: Self with (OptionsWithResolver[Props, Module])) extends AnyVal {
    
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
    def setResolveComponent(value: (Module, Props) => ComponentType[Props]): Self = this.set("resolveComponent", js.Any.fromFunction2(value))
  }
}
