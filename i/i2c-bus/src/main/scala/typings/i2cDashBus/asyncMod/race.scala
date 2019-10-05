package typings.i2cDashBus.asyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("i2c-bus/async", "race")
@js.native
object race extends js.Object {
  def apply[T, E](tasks: js.Array[AsyncFunction[T, E]], callback: AsyncResultCallback[T, E]): Unit = js.native
}

