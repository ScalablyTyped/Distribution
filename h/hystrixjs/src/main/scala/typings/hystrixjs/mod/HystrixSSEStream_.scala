package typings.hystrixjs.mod

import typings.rx.Rx.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HystrixSSEStream_ extends js.Object {
  def toCommandJson(metrics: js.Any): String = js.native
  def toObservable(): Observable[_] = js.native
}

object HystrixSSEStream_ {
  @scala.inline
  def apply(toCommandJson: js.Any => String, toObservable: () => Observable[_]): HystrixSSEStream_ = {
    val __obj = js.Dynamic.literal(toCommandJson = js.Any.fromFunction1(toCommandJson), toObservable = js.Any.fromFunction0(toObservable))
    __obj.asInstanceOf[HystrixSSEStream_]
  }
  @scala.inline
  implicit class HystrixSSEStream_Ops[Self <: HystrixSSEStream_] (val x: Self) extends AnyVal {
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
    def setToCommandJson(value: js.Any => String): Self = this.set("toCommandJson", js.Any.fromFunction1(value))
    @scala.inline
    def setToObservable(value: () => Observable[_]): Self = this.set("toObservable", js.Any.fromFunction0(value))
  }
  
}

