package typings.knockoutPreRendered

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnockoutObservableFunctions[T]
  extends StObject
     with // Ko specific
/* key */ StringDictionary[KnockoutBindingHandler] {
  
  def equalityComparer(a: Any, b: Any): Boolean
}
object KnockoutObservableFunctions {
  
  inline def apply[T](equalityComparer: (Any, Any) => Boolean): KnockoutObservableFunctions[T] = {
    val __obj = js.Dynamic.literal(equalityComparer = js.Any.fromFunction2(equalityComparer))
    __obj.asInstanceOf[KnockoutObservableFunctions[T]]
  }
  
  extension [Self <: KnockoutObservableFunctions[?], T](x: Self & KnockoutObservableFunctions[T]) {
    
    inline def setEqualityComparer(value: (Any, Any) => Boolean): Self = StObject.set(x, "equalityComparer", js.Any.fromFunction2(value))
  }
}
