package typings
package i2cDashBusLib.asyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("i2c-bus/async", "foldr")
@js.native
object foldr extends js.Object {
  def apply[T, R, E](arr: js.Array[T], memo: R, iterator: i2cDashBusLib.asyncMod.AsyncMemoIterator[T, R, E]): scala.Unit = js.native
  def apply[T, R, E](
    arr: js.Array[T],
    memo: R,
    iterator: i2cDashBusLib.asyncMod.AsyncMemoIterator[T, R, E],
    callback: i2cDashBusLib.asyncMod.AsyncResultCallback[R, E]
  ): scala.Unit = js.native
  def apply[T, R, E](
    arr: stdLib.IterableIterator[T],
    memo: R,
    iterator: i2cDashBusLib.asyncMod.AsyncMemoIterator[T, R, E]
  ): scala.Unit = js.native
  def apply[T, R, E](
    arr: stdLib.IterableIterator[T],
    memo: R,
    iterator: i2cDashBusLib.asyncMod.AsyncMemoIterator[T, R, E],
    callback: i2cDashBusLib.asyncMod.AsyncResultCallback[R, E]
  ): scala.Unit = js.native
}

