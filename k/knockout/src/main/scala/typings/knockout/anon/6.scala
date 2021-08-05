package typings.knockout.anon

import typings.knockout.mod.AllBindings
import typings.knockout.mod.BindingContext
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `6` extends StObject {
  
  def init(
    element: HTMLElement,
    valueAccessor: js.Function0[js.Object],
    allBindings: AllBindings,
    viewModel: js.Any,
    bindingContext: BindingContext[js.Any]
  ): Unit
}
object `6` {
  
  inline def apply(init: (HTMLElement, js.Function0[js.Object], AllBindings, js.Any, BindingContext[js.Any]) => Unit): `6` = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction5(init))
    __obj.asInstanceOf[`6`]
  }
  
  extension [Self <: `6`](x: Self) {
    
    inline def setInit(value: (HTMLElement, js.Function0[js.Object], AllBindings, js.Any, BindingContext[js.Any]) => Unit): Self = StObject.set(x, "init", js.Any.fromFunction5(value))
  }
}
