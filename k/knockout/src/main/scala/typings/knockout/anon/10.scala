package typings.knockout.anon

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `10` extends StObject {
  
  def init(element: HTMLElement, valueAccessor: js.Function0[Boolean]): Unit = js.native
}
object `10` {
  
  @scala.inline
  def apply(init: (HTMLElement, js.Function0[Boolean]) => Unit): `10` = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction2(init))
    __obj.asInstanceOf[`10`]
  }
  
  @scala.inline
  implicit class `10MutableBuilder`[Self <: `10`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInit(value: (HTMLElement, js.Function0[Boolean]) => Unit): Self = StObject.set(x, "init", js.Any.fromFunction2(value))
  }
}
