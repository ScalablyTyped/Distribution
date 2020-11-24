package typings.knockoutRx

import typings.knockoutRx.Rx.Observable
import typings.rx.Rx.ISubject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockoutObservableFunctions[T] extends js.Object {
  
  def toObservableWithReplyLatest(): Observable[T] = js.native
  
  def toSubject(): ISubject[T] = js.native
}
object KnockoutObservableFunctions {
  
  @scala.inline
  def apply[T](toObservableWithReplyLatest: () => Observable[T], toSubject: () => ISubject[T]): KnockoutObservableFunctions[T] = {
    val __obj = js.Dynamic.literal(toObservableWithReplyLatest = js.Any.fromFunction0(toObservableWithReplyLatest), toSubject = js.Any.fromFunction0(toSubject))
    __obj.asInstanceOf[KnockoutObservableFunctions[T]]
  }
  
  @scala.inline
  implicit class KnockoutObservableFunctionsOps[Self <: KnockoutObservableFunctions[_], T] (val x: Self with KnockoutObservableFunctions[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setToObservableWithReplyLatest(value: () => Observable[T]): Self = this.set("toObservableWithReplyLatest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToSubject(value: () => ISubject[T]): Self = this.set("toSubject", js.Any.fromFunction0(value))
  }
}
