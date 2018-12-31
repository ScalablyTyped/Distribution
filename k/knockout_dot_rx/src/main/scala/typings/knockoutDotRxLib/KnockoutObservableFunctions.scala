package typings
package knockoutDotRxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutObservableFunctions[T] extends js.Object {
  def toObservableWithReplyLatest(): knockoutDotRxLib.RxNs.Observable[T]
  def toSubject(): rxDashCoreDashBindingLib.RxNs.ISubject[T]
}

