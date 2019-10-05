package typings.hystrixjs.hystrixjsMod

import org.scalablytyped.runtime.TopLevel
import typings.rxDashLiteDashAggregates.Rx.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HystrixSSEStream extends js.Object {
  def toCommandJson(metrics: js.Any): String
  def toObservable(): Observable[_]
}

object HystrixSSEStream {
  @scala.inline
  def apply(toCommandJson: js.Any => String, toObservable: () => Observable[_]): HystrixSSEStream = {
    val __obj = js.Dynamic.literal(toCommandJson = js.Any.fromFunction1(toCommandJson), toObservable = js.Any.fromFunction0(toObservable))
  
    __obj.asInstanceOf[HystrixSSEStream]
  }
}

@JSImport("hystrixjs", "hystrixSSEStream")
@js.native
object hystrixSSEStream extends TopLevel[HystrixSSEStream]

