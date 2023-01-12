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
    viewModel: Any,
    bindingContext: BindingContext[Any]
  ): Unit
}
object `6` {
  
  inline def apply(init: (HTMLElement, js.Function0[js.Object], AllBindings, Any, BindingContext[Any]) => Unit): `6` = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction5(init))
    __obj.asInstanceOf[`6`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `6`] (val x: Self) extends AnyVal {
    
    inline def setInit(value: (HTMLElement, js.Function0[js.Object], AllBindings, Any, BindingContext[Any]) => Unit): Self = StObject.set(x, "init", js.Any.fromFunction5(value))
  }
}
