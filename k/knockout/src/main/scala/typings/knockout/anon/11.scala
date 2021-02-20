package typings.knockout.anon

import typings.knockout.mod.AllBindings
import typings.knockout.mod.BindingContext
import typings.knockout.mod.BindingHandlerControlsDescendant
import typings.knockout.mod.BindingTemplateOptions
import typings.knockout.mod.MaybeSubscribable
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `11` extends StObject {
  
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
  implicit class `11MutableBuilder`[Self <: `11`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInit(
      value: (Node, js.Function0[MaybeSubscribable[String | BindingTemplateOptions]]) => BindingHandlerControlsDescendant
    ): Self = StObject.set(x, "init", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUpdate(
      value: (Node, js.Function0[MaybeSubscribable[String | BindingTemplateOptions]], AllBindings, js.Any, BindingContext[_]) => Unit
    ): Self = StObject.set(x, "update", js.Any.fromFunction5(value))
  }
}
