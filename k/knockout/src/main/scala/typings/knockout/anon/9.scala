package typings.knockout.anon

import typings.knockout.mod.AllBindings
import typings.knockout.mod.BindingHandlerControlsDescendant
import typings.knockout.mod.MaybeSubscribable
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `9` extends StObject {
  
  def init(element: HTMLElement): BindingHandlerControlsDescendant
  
  def update(
    element: HTMLElement,
    valueAccessor: js.Function0[MaybeSubscribable[js.Any]],
    allBindings: AllBindings
  ): Unit
}
object `9` {
  
  inline def apply(
    init: HTMLElement => BindingHandlerControlsDescendant,
    update: (HTMLElement, js.Function0[MaybeSubscribable[js.Any]], AllBindings) => Unit
  ): `9` = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction1(init), update = js.Any.fromFunction3(update))
    __obj.asInstanceOf[`9`]
  }
  
  extension [Self <: `9`](x: Self) {
    
    inline def setInit(value: HTMLElement => BindingHandlerControlsDescendant): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
    
    inline def setUpdate(value: (HTMLElement, js.Function0[MaybeSubscribable[js.Any]], AllBindings) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction3(value))
  }
}
