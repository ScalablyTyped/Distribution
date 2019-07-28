package typings.i2cDashBus.asyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("i2c-bus/async", "forEach")
@js.native
object forEach extends js.Object {
  def apply[T, E](arr: IterableCollection[T], iterator: AsyncIterator[T, E]): Unit = js.native
  def apply[T, E](arr: IterableCollection[T], iterator: AsyncIterator[T, E], callback: ErrorCallback[E]): Unit = js.native
}

