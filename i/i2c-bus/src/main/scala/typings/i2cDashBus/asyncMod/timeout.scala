package typings.i2cDashBus.asyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("i2c-bus/async", "timeout")
@js.native
object timeout extends js.Object {
  def apply[T, E](fn: AsyncFunction[T, E], milliseconds: Double): AsyncFunction[T, E] = js.native
  def apply[T, E](fn: AsyncFunction[T, E], milliseconds: Double, info: js.Any): AsyncFunction[T, E] = js.native
  def apply[T, R, E](fn: AsyncResultIterator[T, R, E], milliseconds: Double): AsyncResultIterator[T, R, E] = js.native
  def apply[T, R, E](fn: AsyncResultIterator[T, R, E], milliseconds: Double, info: js.Any): AsyncResultIterator[T, R, E] = js.native
}

