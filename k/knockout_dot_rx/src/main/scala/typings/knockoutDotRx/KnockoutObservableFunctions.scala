package typings.knockoutDotRx

import typings.knockoutDotRx.Rx.Observable
import typings.rxDashCoreDashBinding.Rx.ISubject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutObservableFunctions[T] extends js.Object {
  def toObservableWithReplyLatest(): Observable[T]
  def toSubject(): ISubject[T]
}

object KnockoutObservableFunctions {
  @scala.inline
  def apply[T](toObservableWithReplyLatest: () => Observable[T], toSubject: () => ISubject[T]): KnockoutObservableFunctions[T] = {
    val __obj = js.Dynamic.literal(toObservableWithReplyLatest = js.Any.fromFunction0(toObservableWithReplyLatest), toSubject = js.Any.fromFunction0(toSubject))
  
    __obj.asInstanceOf[KnockoutObservableFunctions[T]]
  }
}

