package typings
package hystrixjsLib.hystrixjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HystrixSSEStream extends js.Object {
  def toObservable(): rxDashLiteDashAggregatesLib.RxNs.Observable[_]
}

object HystrixSSEStream {
  @scala.inline
  def apply(toObservable: js.Function0[rxDashLiteDashAggregatesLib.RxNs.Observable[_]]): HystrixSSEStream = {
    val __obj = js.Dynamic.literal(toObservable = toObservable)
  
    __obj.asInstanceOf[HystrixSSEStream]
  }
}

