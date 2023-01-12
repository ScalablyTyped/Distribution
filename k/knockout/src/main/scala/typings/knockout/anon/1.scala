package typings.knockout.anon

import typings.knockout.mod.MaybeSubscribable
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  def update(element: HTMLElement, valueAccessor: js.Function0[MaybeSubscribable[String | js.Object]]): Unit
}
object `1` {
  
  inline def apply(update: (HTMLElement, js.Function0[MaybeSubscribable[String | js.Object]]) => Unit): `1` = {
    val __obj = js.Dynamic.literal(update = js.Any.fromFunction2(update))
    __obj.asInstanceOf[`1`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `1`] (val x: Self) extends AnyVal {
    
    inline def setUpdate(value: (HTMLElement, js.Function0[MaybeSubscribable[String | js.Object]]) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
  }
}
