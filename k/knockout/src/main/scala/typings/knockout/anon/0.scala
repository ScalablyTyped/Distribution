package typings.knockout.anon

import typings.knockout.mod.MaybeSubscribable
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  def update(element: HTMLElement, valueAccessor: js.Function0[MaybeSubscribable[String]]): Unit
}
object `0` {
  
  inline def apply(update: (HTMLElement, js.Function0[MaybeSubscribable[String]]) => Unit): `0` = {
    val __obj = js.Dynamic.literal(update = js.Any.fromFunction2(update))
    __obj.asInstanceOf[`0`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
    
    inline def setUpdate(value: (HTMLElement, js.Function0[MaybeSubscribable[String]]) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
  }
}
