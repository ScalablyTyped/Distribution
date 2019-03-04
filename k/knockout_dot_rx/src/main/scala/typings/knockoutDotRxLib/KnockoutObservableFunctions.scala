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
    toObservableWithReplyLatest: js.Function0[knockoutDotRxLib.RxNs.Observable[T]],
    toSubject: js.Function0[rxDashCoreDashBindingLib.RxNs.ISubject[T]]
  ): KnockoutObservableFunctions[T] = {
    val __obj = js.Dynamic.literal(toObservableWithReplyLatest = toObservableWithReplyLatest, toSubject = toSubject)
  
    __obj.asInstanceOf[KnockoutObservableFunctions[T]]
  }
}

