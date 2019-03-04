package typings
package atLedgerhqHwDashTransportLib.atLedgerhqHwDashTransportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Observer[Ev] extends js.Object {
  def complete(): js.Any
  def error(e: js.Any): js.Any
  def next(event: Ev): js.Any
}

object Observer {
  @scala.inline
  def apply[Ev](
    complete: js.Function0[js.Any],
    error: js.Function1[js.Any, js.Any],
    next: js.Function1[Ev, js.Any]
  ): Observer[Ev] = {
    val __obj = js.Dynamic.literal(complete = complete, error = error, next = next)
  
    __obj.asInstanceOf[Observer[Ev]]
  }
}

