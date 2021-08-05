package typings.knockout.anon

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `10` extends StObject {
  
  def init(element: HTMLElement, valueAccessor: js.Function0[Boolean]): Unit
}
object `10` {
  
  inline def apply(init: (HTMLElement, js.Function0[Boolean]) => Unit): `10` = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction2(init))
    __obj.asInstanceOf[`10`]
  }
  
  extension [Self <: `10`](x: Self) {
    
    inline def setInit(value: (HTMLElement, js.Function0[Boolean]) => Unit): Self = StObject.set(x, "init", js.Any.fromFunction2(value))
  }
}
