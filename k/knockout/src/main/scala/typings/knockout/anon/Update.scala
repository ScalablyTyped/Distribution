package typings.knockout.anon

import typings.knockout.mod.MaybeSubscribable
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Update extends StObject {
  
  def update(element: HTMLElement, valueAccessor: js.Function0[MaybeSubscribable[Any]]): Unit
}
object Update {
  
  inline def apply(update: (HTMLElement, js.Function0[MaybeSubscribable[Any]]) => Unit): Update = {
    val __obj = js.Dynamic.literal(update = js.Any.fromFunction2(update))
    __obj.asInstanceOf[Update]
  }
  
  extension [Self <: Update](x: Self) {
    
    inline def setUpdate(value: (HTMLElement, js.Function0[MaybeSubscribable[Any]]) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
  }
}
