package typings
package i2cDashBusLib.asyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("i2c-bus/async", "concatSeries")
@js.native
object concatSeries extends js.Object {
  def apply[T, R, E](
    arr: i2cDashBusLib.asyncMod.IterableCollection[T],
    iterator: i2cDashBusLib.asyncMod.AsyncResultIterator[T, js.Array[R], E]
  ): scala.Unit = js.native
  def apply[T, R, E](
    arr: i2cDashBusLib.asyncMod.IterableCollection[T],
    iterator: i2cDashBusLib.asyncMod.AsyncResultIterator[T, js.Array[R], E],
    callback: i2cDashBusLib.asyncMod.AsyncResultArrayCallback[R, E]
  ): scala.Unit = js.native
}

