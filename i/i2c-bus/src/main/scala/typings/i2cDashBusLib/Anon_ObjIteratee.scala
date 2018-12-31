package typings
package i2cDashBusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ObjIteratee extends js.Object {
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

