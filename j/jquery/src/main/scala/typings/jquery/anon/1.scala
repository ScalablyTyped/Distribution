package typings.jquery.anon

import typings.jquery.JQuery._ValHook
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1`[TElement]
  extends StObject
     with _ValHook[TElement] {
  
  def set(elem: TElement, value: js.Any): js.Any
}
object `1` {
  
  @scala.inline
  def apply[TElement](set: (TElement, js.Any) => js.Any): `1`[TElement] = {
    val __obj = js.Dynamic.literal(set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[`1`[TElement]]
  }
  
  @scala.inline
  implicit class `1MutableBuilder`[Self <: `1`[?], TElement] (val x: Self & `1`[TElement]) extends AnyVal {
    
    @scala.inline
    def setSet(value: (TElement, js.Any) => js.Any): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
  }
}
