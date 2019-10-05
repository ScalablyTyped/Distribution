package typings.i2cDashBus.asyncMod

import typings.i2cDashBus.Anon_Interval
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("i2c-bus/async", "retryable")
@js.native
object retryable extends js.Object {
  def apply[T, E](opts: Double, task: AsyncFunction[T, E]): AsyncFunction[T, E] = js.native
  def apply[T, E](opts: Anon_Interval, task: AsyncFunction[T, E]): AsyncFunction[T, E] = js.native
}

