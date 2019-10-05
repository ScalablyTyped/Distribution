package typings.i2cDashBus.asyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("i2c-bus/async", "forever")
@js.native
object forever extends js.Object {
  def apply[E](next: js.Function1[/* next */ ErrorCallback[E], Unit], errBack: ErrorCallback[E]): Unit = js.native
}

