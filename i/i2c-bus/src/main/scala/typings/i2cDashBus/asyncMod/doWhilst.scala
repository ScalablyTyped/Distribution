package typings.i2cDashBus.asyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("i2c-bus/async", "doWhilst")
@js.native
object doWhilst extends js.Object {
  def apply[T, E](
    fn: AsyncFunctionEx[T, E],
    test: js.Function1[/* repeated */ T, Boolean],
    callback: ErrorCallback[E]
  ): Unit = js.native
}

