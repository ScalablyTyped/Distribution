package typings.knockout.anon

import typings.knockout.mod.MaybeSubscribable
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2` extends StObject {
  
  def update(element: HTMLElement, valueAccessor: js.Function0[MaybeSubscribable[js.Object]]): Unit
}
object `2` {
  
  inline def apply(update: (HTMLElement, js.Function0[MaybeSubscribable[js.Object]]) => Unit): `2` = {
    val __obj = js.Dynamic.literal(update = js.Any.fromFunction2(update))
    __obj.asInstanceOf[`2`]
  }
  
  extension [Self <: `2`](x: Self) {
    
    inline def setUpdate(value: (HTMLElement, js.Function0[MaybeSubscribable[js.Object]]) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
  }
}
