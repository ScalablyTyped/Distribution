package typings.hystrixjs.mod

import typings.rxLiteAggregates.Rx.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HystrixSSEStream_ extends js.Object {
  def toCommandJson(metrics: js.Any): String
  def toObservable(): Observable[_]
}

object HystrixSSEStream_ {
  @scala.inline
  def apply(toCommandJson: js.Any => String, toObservable: () => Observable[_]): HystrixSSEStream_ = {
    val __obj = js.Dynamic.literal(toCommandJson = js.Any.fromFunction1(toCommandJson), toObservable = js.Any.fromFunction0(toObservable))
  
    __obj.asInstanceOf[HystrixSSEStream_]
  }
}

