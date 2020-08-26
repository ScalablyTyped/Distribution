package typings.knockoutRx

import typings.knockoutRx.Rx.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutComputedFunctions[T] extends js.Object {
  def toObservableWithReplyLatest(): Observable[T] = js.native
}

object KnockoutComputedFunctions {
  @scala.inline
  def apply[T](toObservableWithReplyLatest: () => Observable[T]): KnockoutComputedFunctions[T] = {
    val __obj = js.Dynamic.literal(toObservableWithReplyLatest = js.Any.fromFunction0(toObservableWithReplyLatest))
    __obj.asInstanceOf[KnockoutComputedFunctions[T]]
  }
  @scala.inline
  implicit class KnockoutComputedFunctionsOps[Self <: KnockoutComputedFunctions[_], T] (val x: Self with KnockoutComputedFunctions[T]) extends AnyVal {
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
  }
  
}

