package typings
package javascriptDashStateDashMachineLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_INVALIDCALLBACK extends js.Object {
  	// = 200, caller tried to fire an event while an async transition was still pending
  var INVALID_CALLBACK: scala.Double
  var INVALID_TRANSITION: scala.Double
  	// = 100, caller tried to fire an event that was innapropriate in the current state
  var PENDING_TRANSITION: scala.Double
}

object Anon_INVALIDCALLBACK {
  @scala.inline
  def apply(INVALID_CALLBACK: scala.Double, INVALID_TRANSITION: scala.Double, PENDING_TRANSITION: scala.Double): Anon_INVALIDCALLBACK = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("INVALID_CALLBACK")(INVALID_CALLBACK)
    __obj.updateDynamic("INVALID_TRANSITION")(INVALID_TRANSITION)
    __obj.updateDynamic("PENDING_TRANSITION")(PENDING_TRANSITION)
    __obj.asInstanceOf[Anon_INVALIDCALLBACK]
  }
}

