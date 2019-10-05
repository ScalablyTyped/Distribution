package typings.i2cDashBus.asyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("i2c-bus/async", "parallelLimit")
@js.native
object parallelLimit extends js.Object {
  def apply[T, E](tasks: js.Array[AsyncFunction[T, E]], limit: Double): Unit = js.native
  def apply[T, E](tasks: js.Array[AsyncFunction[T, E]], limit: Double, callback: AsyncResultArrayCallback[T, E]): Unit = js.native
  def apply[T, E](tasks: Dictionary[AsyncFunction[T, E]], limit: Double): Unit = js.native
  def apply[T, E](tasks: Dictionary[AsyncFunction[T, E]], limit: Double, callback: AsyncResultObjectCallback[T, E]): Unit = js.native
}

