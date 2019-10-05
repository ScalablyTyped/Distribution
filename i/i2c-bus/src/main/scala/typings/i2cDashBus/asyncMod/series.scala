package typings.i2cDashBus.asyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("i2c-bus/async", "series")
@js.native
object series extends js.Object {
  def apply[T, E](tasks: js.Array[AsyncFunction[T, E]]): Unit = js.native
  def apply[T, E](tasks: js.Array[AsyncFunction[T, E]], callback: AsyncResultArrayCallback[T, E]): Unit = js.native
  def apply[T, E](tasks: Dictionary[AsyncFunction[T, E]]): Unit = js.native
  def apply[T, E](tasks: Dictionary[AsyncFunction[T, E]], callback: AsyncResultObjectCallback[T, E]): Unit = js.native
}

