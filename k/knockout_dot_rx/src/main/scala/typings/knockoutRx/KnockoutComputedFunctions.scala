package typings.knockoutRx

import typings.knockoutRx.Rx.Observable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnockoutComputedFunctions[T] extends StObject {
  
  def toObservableWithReplyLatest(): Observable[T]
}
object KnockoutComputedFunctions {
  
  inline def apply[T](toObservableWithReplyLatest: () => Observable[T]): KnockoutComputedFunctions[T] = {
    val __obj = js.Dynamic.literal(toObservableWithReplyLatest = js.Any.fromFunction0(toObservableWithReplyLatest))
    __obj.asInstanceOf[KnockoutComputedFunctions[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KnockoutComputedFunctions[?], T] (val x: Self & KnockoutComputedFunctions[T]) extends AnyVal {
    
    inline def setToObservableWithReplyLatest(value: () => Observable[T]): Self = StObject.set(x, "toObservableWithReplyLatest", js.Any.fromFunction0(value))
  }
}
