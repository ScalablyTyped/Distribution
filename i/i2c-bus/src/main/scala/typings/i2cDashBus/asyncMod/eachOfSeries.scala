package typings.i2cDashBus.asyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("i2c-bus/async", "eachOfSeries")
@js.native
object eachOfSeries extends js.Object {
  def apply[T, E](obj: IterableCollection[T], iterator: AsyncForEachOfIterator[T, E]): Unit = js.native
  def apply[T, E](obj: IterableCollection[T], iterator: AsyncForEachOfIterator[T, E], callback: ErrorCallback[E]): Unit = js.native
}

