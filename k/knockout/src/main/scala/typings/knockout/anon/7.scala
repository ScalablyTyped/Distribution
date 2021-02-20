package typings.knockout.anon

import typings.knockout.mod.AllBindings
import typings.knockout.mod.BindingContext
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `7` extends StObject {
  
  def init(
    element: HTMLElement,
    valueAccessor: js.Function0[js.Function],
    allBindings: AllBindings,
    viewModel: js.Any,
    bindingContext: BindingContext[_]
  ): Unit = js.native
}
object `7` {
  
  @scala.inline
  def apply(init: (HTMLElement, js.Function0[js.Function], AllBindings, js.Any, BindingContext[_]) => Unit): `7` = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction5(init))
    __obj.asInstanceOf[`7`]
  }
  
  @scala.inline
  implicit class `7MutableBuilder`[Self <: `7`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInit(value: (HTMLElement, js.Function0[js.Function], AllBindings, js.Any, BindingContext[_]) => Unit): Self = StObject.set(x, "init", js.Any.fromFunction5(value))
  }
}
