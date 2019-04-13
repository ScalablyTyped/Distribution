package typings
package i2cDashBusLib.asyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("i2c-bus/async", "mapValuesSeries")
@js.native
object mapValuesSeries extends js.Object {
  def apply[T, R, E](
    obj: i2cDashBusLib.asyncMod.Dictionary[T],
    iteratee: js.Function3[
      /* value */ T, 
      /* key */ java.lang.String, 
      /* callback */ i2cDashBusLib.asyncMod.AsyncResultCallback[R, E], 
      scala.Unit
    ],
    callback: i2cDashBusLib.asyncMod.AsyncResultObjectCallback[R, E]
  ): scala.Unit = js.native
}

