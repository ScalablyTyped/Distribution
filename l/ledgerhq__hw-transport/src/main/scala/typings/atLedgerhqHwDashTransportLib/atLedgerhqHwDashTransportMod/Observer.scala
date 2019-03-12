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
  def apply[Ev](complete: () => js.Any, error: js.Any => js.Any, next: Ev => js.Any): Observer[Ev] = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete), error = js.Any.fromFunction1(error), next = js.Any.fromFunction1(next))
  
    __obj.asInstanceOf[Observer[Ev]]
  }
}

