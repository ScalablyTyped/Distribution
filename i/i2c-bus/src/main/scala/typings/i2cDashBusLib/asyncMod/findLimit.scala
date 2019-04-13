package typings
package i2cDashBusLib.asyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("i2c-bus/async", "findLimit")
@js.native
object findLimit extends js.Object {
  def apply[T, E](
    arr: i2cDashBusLib.asyncMod.IterableCollection[T],
    limit: scala.Double,
    iterator: i2cDashBusLib.asyncMod.AsyncBooleanIterator[T, E]
  ): scala.Unit = js.native
  def apply[T, E](
    arr: i2cDashBusLib.asyncMod.IterableCollection[T],
    limit: scala.Double,
    iterator: i2cDashBusLib.asyncMod.AsyncBooleanIterator[T, E],
    callback: i2cDashBusLib.asyncMod.AsyncResultCallback[T, E]
  ): scala.Unit = js.native
}

