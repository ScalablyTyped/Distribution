package typings.knockout.anon

import typings.knockout.mod.AllBindings
import typings.knockout.mod.MaybeSubscribable
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AfterInit extends StObject {
  
  var after: js.Array[String]
  
  def init(
    element: HTMLElement,
    valueAccessor: js.Function0[MaybeSubscribable[Any]],
    allBindings: AllBindings
  ): Unit
}
object AfterInit {
  
  inline def apply(
    after: js.Array[String],
    init: (HTMLElement, js.Function0[MaybeSubscribable[Any]], AllBindings) => Unit
  ): AfterInit = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], init = js.Any.fromFunction3(init))
    __obj.asInstanceOf[AfterInit]
  }
  
  extension [Self <: AfterInit](x: Self) {
    
    inline def setAfter(value: js.Array[String]): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    
    inline def setAfterVarargs(value: String*): Self = StObject.set(x, "after", js.Array(value*))
    
    inline def setInit(value: (HTMLElement, js.Function0[MaybeSubscribable[Any]], AllBindings) => Unit): Self = StObject.set(x, "init", js.Any.fromFunction3(value))
  }
}
