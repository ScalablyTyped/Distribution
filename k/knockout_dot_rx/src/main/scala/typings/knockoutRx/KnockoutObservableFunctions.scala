package typings.knockoutRx

import typings.knockoutRx.Rx.Observable
import typings.rx.Rx.ISubject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnockoutObservableFunctions[T] extends StObject {
  
  def toObservableWithReplyLatest(): Observable[T]
  
  def toSubject(): ISubject[T]
}
object KnockoutObservableFunctions {
  
  @scala.inline
  def apply[T](toObservableWithReplyLatest: () => Observable[T], toSubject: () => ISubject[T]): KnockoutObservableFunctions[T] = {
    val __obj = js.Dynamic.literal(toObservableWithReplyLatest = js.Any.fromFunction0(toObservableWithReplyLatest), toSubject = js.Any.fromFunction0(toSubject))
    __obj.asInstanceOf[KnockoutObservableFunctions[T]]
  }
  
  @scala.inline
  implicit class KnockoutObservableFunctionsMutableBuilder[Self <: KnockoutObservableFunctions[?], T] (val x: Self & KnockoutObservableFunctions[T]) extends AnyVal {
    
    @scala.inline
    def setToObservableWithReplyLatest(value: () => Observable[T]): Self = StObject.set(x, "toObservableWithReplyLatest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToSubject(value: () => ISubject[T]): Self = StObject.set(x, "toSubject", js.Any.fromFunction0(value))
  }
}
