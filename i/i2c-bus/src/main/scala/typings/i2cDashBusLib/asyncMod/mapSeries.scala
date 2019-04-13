package typings
package i2cDashBusLib.asyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("i2c-bus/async", "mapSeries")
@js.native
object mapSeries extends js.Object {
  def apply[T, R, E](
    arr: i2cDashBusLib.asyncMod.Dictionary[T],
    iterator: i2cDashBusLib.asyncMod.AsyncResultIterator[T, R, E]
  ): scala.Unit = js.native
  def apply[T, R, E](
    arr: i2cDashBusLib.asyncMod.Dictionary[T],
    iterator: i2cDashBusLib.asyncMod.AsyncResultIterator[T, R, E],
    callback: i2cDashBusLib.asyncMod.AsyncResultArrayCallback[R, E]
  ): scala.Unit = js.native
  def apply[T, R, E](arr: js.Array[T], iterator: i2cDashBusLib.asyncMod.AsyncResultIterator[T, R, E]): scala.Unit = js.native
  def apply[T, R, E](
    arr: js.Array[T],
    iterator: i2cDashBusLib.asyncMod.AsyncResultIterator[T, R, E],
    callback: i2cDashBusLib.asyncMod.AsyncResultArrayCallback[R, E]
  ): scala.Unit = js.native
  def apply[T, R, E](arr: stdLib.IterableIterator[T], iterator: i2cDashBusLib.asyncMod.AsyncResultIterator[T, R, E]): scala.Unit = js.native
  def apply[T, R, E](
    arr: stdLib.IterableIterator[T],
    iterator: i2cDashBusLib.asyncMod.AsyncResultIterator[T, R, E],
    callback: i2cDashBusLib.asyncMod.AsyncResultArrayCallback[R, E]
  ): scala.Unit = js.native
}

