package typings.knockoutDotRx

import typings.knockoutDotRx.RxNs.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutComputedFunctions[T] extends js.Object {
  def toObservableWithReplyLatest(): Observable[T]
}

object KnockoutComputedFunctions {
  @scala.inline
  def apply[T](toObservableWithReplyLatest: () => Observable[T]): KnockoutComputedFunctions[T] = {
    val __obj = js.Dynamic.literal(toObservableWithReplyLatest = js.Any.fromFunction0(toObservableWithReplyLatest))
  
    __obj.asInstanceOf[KnockoutComputedFunctions[T]]
  }
}

