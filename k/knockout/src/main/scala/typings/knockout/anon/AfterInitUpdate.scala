package typings.knockout.anon

import typings.knockout.mod.AllBindings
import typings.knockout.mod.MaybeSubscribable
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AfterInitUpdate extends StObject {
  
  var after: js.Array[String]
  
  def init(
    element: HTMLElement,
    valueAccessor: js.Function0[MaybeSubscribable[Any]],
    allBindings: AllBindings
  ): Unit
  
  def update(element: HTMLElement, valueAccessor: js.Function0[MaybeSubscribable[Any]]): Unit
}
object AfterInitUpdate {
  
  inline def apply(
    after: js.Array[String],
    init: (HTMLElement, js.Function0[MaybeSubscribable[Any]], AllBindings) => Unit,
    update: (HTMLElement, js.Function0[MaybeSubscribable[Any]]) => Unit
  ): AfterInitUpdate = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], init = js.Any.fromFunction3(init), update = js.Any.fromFunction2(update))
    __obj.asInstanceOf[AfterInitUpdate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AfterInitUpdate] (val x: Self) extends AnyVal {
    
    inline def setAfter(value: js.Array[String]): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    
    inline def setAfterVarargs(value: String*): Self = StObject.set(x, "after", js.Array(value*))
    
    inline def setInit(value: (HTMLElement, js.Function0[MaybeSubscribable[Any]], AllBindings) => Unit): Self = StObject.set(x, "init", js.Any.fromFunction3(value))
    
    inline def setUpdate(value: (HTMLElement, js.Function0[MaybeSubscribable[Any]]) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
  }
}
