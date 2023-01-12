package typings.jqueryAjaxfile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnockoutObservableFunctions[T] extends StObject {
  
  def equalityComparer(a: Any, b: Any): Boolean
}
object KnockoutObservableFunctions {
  
  inline def apply[T](equalityComparer: (Any, Any) => Boolean): KnockoutObservableFunctions[T] = {
    val __obj = js.Dynamic.literal(equalityComparer = js.Any.fromFunction2(equalityComparer))
    __obj.asInstanceOf[KnockoutObservableFunctions[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KnockoutObservableFunctions[?], T] (val x: Self & KnockoutObservableFunctions[T]) extends AnyVal {
    
    inline def setEqualityComparer(value: (Any, Any) => Boolean): Self = StObject.set(x, "equalityComparer", js.Any.fromFunction2(value))
  }
}
