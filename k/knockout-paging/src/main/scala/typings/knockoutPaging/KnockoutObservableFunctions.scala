package typings.knockoutPaging

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnockoutObservableFunctions[T]
  extends StObject
     with // Ko specific
/* key */ StringDictionary[KnockoutBindingHandler] {
  
  def equalityComparer(a: js.Any, b: js.Any): Boolean
}
object KnockoutObservableFunctions {
  
  @scala.inline
  def apply[T](equalityComparer: (js.Any, js.Any) => Boolean): KnockoutObservableFunctions[T] = {
    val __obj = js.Dynamic.literal(equalityComparer = js.Any.fromFunction2(equalityComparer))
    __obj.asInstanceOf[KnockoutObservableFunctions[T]]
  }
  
  @scala.inline
  implicit class KnockoutObservableFunctionsMutableBuilder[Self <: KnockoutObservableFunctions[?], T] (val x: Self & KnockoutObservableFunctions[T]) extends AnyVal {
    
    @scala.inline
    def setEqualityComparer(value: (js.Any, js.Any) => Boolean): Self = StObject.set(x, "equalityComparer", js.Any.fromFunction2(value))
  }
}
