package typings.knockout.anon

import typings.knockout.mod.AllBindings
import typings.knockout.mod.MaybeSubscribable
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitUpdate extends StObject {
  
  def init(
    element: HTMLElement,
    valueAccessor: js.Function0[MaybeSubscribable[Any]],
    allBindings: AllBindings
  ): Unit
  
  def update(element: HTMLElement, valueAccessor: js.Function0[MaybeSubscribable[Any]]): Unit
}
object InitUpdate {
  
  inline def apply(
    init: (HTMLElement, js.Function0[MaybeSubscribable[Any]], AllBindings) => Unit,
    update: (HTMLElement, js.Function0[MaybeSubscribable[Any]]) => Unit
  ): InitUpdate = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction3(init), update = js.Any.fromFunction2(update))
    __obj.asInstanceOf[InitUpdate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InitUpdate] (val x: Self) extends AnyVal {
    
    inline def setInit(value: (HTMLElement, js.Function0[MaybeSubscribable[Any]], AllBindings) => Unit): Self = StObject.set(x, "init", js.Any.fromFunction3(value))
    
    inline def setUpdate(value: (HTMLElement, js.Function0[MaybeSubscribable[Any]]) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
  }
}
