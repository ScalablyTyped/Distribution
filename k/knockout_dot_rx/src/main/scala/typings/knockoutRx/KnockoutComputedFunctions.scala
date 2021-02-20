package typings.knockoutRx

import typings.knockoutRx.Rx.Observable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockoutComputedFunctions[T] extends StObject {
  
  def toObservableWithReplyLatest(): Observable[T] = js.native
}
object KnockoutComputedFunctions {
  
  @scala.inline
  def apply[T](toObservableWithReplyLatest: () => Observable[T]): KnockoutComputedFunctions[T] = {
    val __obj = js.Dynamic.literal(toObservableWithReplyLatest = js.Any.fromFunction0(toObservableWithReplyLatest))
    __obj.asInstanceOf[KnockoutComputedFunctions[T]]
  }
  
  @scala.inline
  implicit class KnockoutComputedFunctionsMutableBuilder[Self <: KnockoutComputedFunctions[_], T] (val x: Self with KnockoutComputedFunctions[T]) extends AnyVal {
    
    @scala.inline
    def setToObservableWithReplyLatest(value: () => Observable[T]): Self = StObject.set(x, "toObservableWithReplyLatest", js.Any.fromFunction0(value))
  }
}
