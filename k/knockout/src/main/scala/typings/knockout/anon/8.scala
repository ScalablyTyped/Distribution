package typings.knockout.anon

import typings.knockout.mod.AllBindings
import typings.knockout.mod.MaybeSubscribable
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `8` extends StObject {
  
  def init(
    element: HTMLElement,
    valueAccessor: js.Function0[MaybeSubscribable[String]],
    allBindings: AllBindings
  ): Unit
}
object `8` {
  
  inline def apply(init: (HTMLElement, js.Function0[MaybeSubscribable[String]], AllBindings) => Unit): `8` = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction3(init))
    __obj.asInstanceOf[`8`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `8`] (val x: Self) extends AnyVal {
    
    inline def setInit(value: (HTMLElement, js.Function0[MaybeSubscribable[String]], AllBindings) => Unit): Self = StObject.set(x, "init", js.Any.fromFunction3(value))
  }
}
