package typings
package knockoutDotRxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutComputedFunctions[T] extends js.Object {
  def toObservableWithReplyLatest(): knockoutDotRxLib.RxNs.Observable[T]
}

object KnockoutComputedFunctions {
  @scala.inline
  def apply[T](toObservableWithReplyLatest: js.Function0[knockoutDotRxLib.RxNs.Observable[T]]): KnockoutComputedFunctions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("toObservableWithReplyLatest")(toObservableWithReplyLatest)
    __obj.asInstanceOf[KnockoutComputedFunctions[T]]
  }
}

