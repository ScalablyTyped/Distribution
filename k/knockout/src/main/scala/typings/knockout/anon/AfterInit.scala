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
    valueAccessor: js.Function0[MaybeSubscribable[js.Any]],
    allBindings: AllBindings
  ): Unit
}
object AfterInit {
  
  @scala.inline
  def apply(
    after: js.Array[String],
    init: (HTMLElement, js.Function0[MaybeSubscribable[js.Any]], AllBindings) => Unit
  ): AfterInit = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], init = js.Any.fromFunction3(init))
    __obj.asInstanceOf[AfterInit]
  }
  
  @scala.inline
  implicit class AfterInitMutableBuilder[Self <: AfterInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfter(value: js.Array[String]): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterVarargs(value: String*): Self = StObject.set(x, "after", js.Array(value :_*))
    
    @scala.inline
    def setInit(value: (HTMLElement, js.Function0[MaybeSubscribable[js.Any]], AllBindings) => Unit): Self = StObject.set(x, "init", js.Any.fromFunction3(value))
  }
}
