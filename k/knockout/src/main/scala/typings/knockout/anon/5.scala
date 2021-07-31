package typings.knockout.anon

import typings.knockout.mod.AllBindings
import typings.knockout.mod.BindingContext
import typings.knockout.mod.BindingHandlerControlsDescendant
import typings.knockout.mod.MaybeSubscribable
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `5` extends StObject {
  
  def init(
    element: Node,
    valueAccessor: js.Function0[MaybeSubscribable[js.Object]],
    allBindings: AllBindings,
    viewModel: js.Any,
    bindingContext: BindingContext[js.Any]
  ): BindingHandlerControlsDescendant
}
object `5` {
  
  @scala.inline
  def apply(
    init: (Node, js.Function0[MaybeSubscribable[js.Object]], AllBindings, js.Any, BindingContext[js.Any]) => BindingHandlerControlsDescendant
  ): `5` = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction5(init))
    __obj.asInstanceOf[`5`]
  }
  
  @scala.inline
  implicit class `5MutableBuilder`[Self <: `5`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInit(
      value: (Node, js.Function0[MaybeSubscribable[js.Object]], AllBindings, js.Any, BindingContext[js.Any]) => BindingHandlerControlsDescendant
    ): Self = StObject.set(x, "init", js.Any.fromFunction5(value))
  }
}
