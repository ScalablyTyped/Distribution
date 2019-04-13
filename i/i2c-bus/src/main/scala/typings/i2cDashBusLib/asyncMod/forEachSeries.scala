package typings
package i2cDashBusLib.asyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("i2c-bus/async", "forEachSeries")
@js.native
object forEachSeries extends js.Object {
  def apply[T, E](
    arr: i2cDashBusLib.asyncMod.IterableCollection[T],
    iterator: i2cDashBusLib.asyncMod.AsyncIterator[T, E]
  ): scala.Unit = js.native
  def apply[T, E](
    arr: i2cDashBusLib.asyncMod.IterableCollection[T],
    iterator: i2cDashBusLib.asyncMod.AsyncIterator[T, E],
    callback: i2cDashBusLib.asyncMod.ErrorCallback[E]
  ): scala.Unit = js.native
}

