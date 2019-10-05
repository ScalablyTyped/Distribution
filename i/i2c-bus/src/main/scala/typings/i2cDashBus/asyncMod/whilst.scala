package typings.i2cDashBus.asyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("i2c-bus/async", "whilst")
@js.native
object whilst extends js.Object {
  def apply[E](test: js.Function0[Boolean], fn: AsyncVoidFunction[E], callback: ErrorCallback[E]): Unit = js.native
}

