package typings.jqueryAjaxfile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockoutObservableFunctions[T] extends StObject {
  
  def equalityComparer(a: js.Any, b: js.Any): Boolean = js.native
}
object KnockoutObservableFunctions {
  
  @scala.inline
  def apply[T](equalityComparer: (js.Any, js.Any) => Boolean): KnockoutObservableFunctions[T] = {
    val __obj = js.Dynamic.literal(equalityComparer = js.Any.fromFunction2(equalityComparer))
    __obj.asInstanceOf[KnockoutObservableFunctions[T]]
  }
  
  @scala.inline
  implicit class KnockoutObservableFunctionsMutableBuilder[Self <: KnockoutObservableFunctions[_], T] (val x: Self with KnockoutObservableFunctions[T]) extends AnyVal {
    
    @scala.inline
    def setEqualityComparer(value: (js.Any, js.Any) => Boolean): Self = StObject.set(x, "equalityComparer", js.Any.fromFunction2(value))
  }
}
