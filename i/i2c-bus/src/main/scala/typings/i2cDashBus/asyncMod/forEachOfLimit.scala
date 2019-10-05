package typings.i2cDashBus.asyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("i2c-bus/async", "forEachOfLimit")
@js.native
object forEachOfLimit extends js.Object {
  def apply[T, E](obj: IterableCollection[T], limit: Double, iterator: AsyncForEachOfIterator[T, E]): Unit = js.native
  def apply[T, E](
    obj: IterableCollection[T],
    limit: Double,
    iterator: AsyncForEachOfIterator[T, E],
    callback: ErrorCallback[E]
  ): Unit = js.native
}

