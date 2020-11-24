package typings.knockout.anon

import typings.knockout.mod.AllBindings
import typings.knockout.mod.BindingContext
import typings.knockout.mod.BindingHandlerControlsDescendant
import typings.knockout.mod.BindingTemplateOptions
import typings.knockout.mod.MaybeSubscribable
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `11` extends js.Object {
  
  def init(element: Node, valueAccessor: js.Function0[MaybeSubscribable[String | BindingTemplateOptions]]): BindingHandlerControlsDescendant = js.native
  
  def update(
    element: Node,
    valueAccessor: js.Function0[MaybeSubscribable[String | BindingTemplateOptions]],
    allBindings: AllBindings,
    viewModel: js.Any,
    bindingContext: BindingContext[_]
  ): Unit = js.native
}
object `11` {
  
  @scala.inline
  def apply(
    init: (Node, js.Function0[MaybeSubscribable[String | BindingTemplateOptions]]) => BindingHandlerControlsDescendant,
    update: (Node, js.Function0[MaybeSubscribable[String | BindingTemplateOptions]], AllBindings, js.Any, BindingContext[_]) => Unit
  ): `11` = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction2(init), update = js.Any.fromFunction5(update))
    __obj.asInstanceOf[`11`]
  }
  
  @scala.inline
  implicit class `11Ops`[Self <: `11`] (val x: Self) extends AnyVal {
    
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
    def setInit(
      value: (Node, js.Function0[MaybeSubscribable[String | BindingTemplateOptions]]) => BindingHandlerControlsDescendant
    ): Self = this.set("init", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUpdate(
      value: (Node, js.Function0[MaybeSubscribable[String | BindingTemplateOptions]], AllBindings, js.Any, BindingContext[_]) => Unit
    ): Self = this.set("update", js.Any.fromFunction5(value))
  }
}
