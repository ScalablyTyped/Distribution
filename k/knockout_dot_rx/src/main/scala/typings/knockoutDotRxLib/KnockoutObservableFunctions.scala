package typings
package knockoutDotRxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutObservableFunctions[T] extends js.Object {
  def toObservableWithReplyLatest(): knockoutDotRxLib.RxNs.Observable[T]
  def toSubject(): rxDashCoreDashBindingLib.RxNs.ISubject[T]
}

object KnockoutObservableFunctions {
  @scala.inline
  def apply[T](
    toObservableWithReplyLatest: () => knockoutDotRxLib.RxNs.Observable[T],
    toSubject: () => rxDashCoreDashBindingLib.RxNs.ISubject[T]
  ): KnockoutObservableFunctions[T] = {
    val __obj = js.Dynamic.literal(toObservableWithReplyLatest = js.Any.fromFunction0(toObservableWithReplyLatest), toSubject = js.Any.fromFunction0(toSubject))
  
    __obj.asInstanceOf[KnockoutObservableFunctions[T]]
  }
}

