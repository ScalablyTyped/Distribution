package typings.i2cDashBus.asyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("i2c-bus/async", "mapValuesSeries")
@js.native
object mapValuesSeries extends js.Object {
  def apply[T, R, E](
    obj: Dictionary[T],
    iteratee: js.Function3[/* value */ T, /* key */ String, /* callback */ AsyncResultCallback[R, E], Unit]
  ): js.Promise[R] = js.native
  def apply[T, R, E](
    obj: Dictionary[T],
    iteratee: js.Function3[/* value */ T, /* key */ String, /* callback */ AsyncResultCallback[R, E], Unit],
    callback: AsyncResultObjectCallback[R, E]
  ): Unit = js.native
}

