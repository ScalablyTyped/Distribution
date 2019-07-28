package typings.i2cDashBus.asyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("i2c-bus/async", "rejectLimit")
@js.native
object rejectLimit extends js.Object {
  def apply[T, E](arr: IterableCollection[T], limit: Double, iterator: AsyncBooleanIterator[T, E]): Unit = js.native
  def apply[T, E](
    arr: IterableCollection[T],
    limit: Double,
    iterator: AsyncBooleanIterator[T, E],
    callback: AsyncResultArrayCallback[T, E]
  ): Unit = js.native
}

