package typings.hystrixjs.hystrixjsMod

import typings.rxDashLiteDashAggregates.RxNs.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HystrixSSEStream extends js.Object {
  def toObservable(): Observable[_]
}

object HystrixSSEStream {
  @scala.inline
  def apply(toObservable: () => Observable[_]): HystrixSSEStream = {
    val __obj = js.Dynamic.literal(toObservable = js.Any.fromFunction0(toObservable))
  
    __obj.asInstanceOf[HystrixSSEStream]
  }
}

