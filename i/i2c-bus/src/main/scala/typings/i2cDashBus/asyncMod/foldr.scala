package typings.i2cDashBus.asyncMod

import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("i2c-bus/async", "foldr")
@js.native
object foldr extends js.Object {
  def apply[T, R, E](arr: js.Array[T], memo: R, iterator: AsyncMemoIterator[T, R, E]): Unit = js.native
  def apply[T, R, E](
    arr: js.Array[T],
    memo: R,
    iterator: AsyncMemoIterator[T, R, E],
    callback: AsyncResultCallback[R, E]
  ): Unit = js.native
  def apply[T, R, E](arr: IterableIterator[T], memo: R, iterator: AsyncMemoIterator[T, R, E]): Unit = js.native
  def apply[T, R, E](
    arr: IterableIterator[T],
    memo: R,
    iterator: AsyncMemoIterator[T, R, E],
    callback: AsyncResultCallback[R, E]
  ): Unit = js.native
}

