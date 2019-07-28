package typings.javascriptDashStateDashMachine.javascriptDashStateDashMachineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("javascript-state-machine", "Error")
@js.native
object Error extends js.Object {
  	// = 200, caller tried to fire an event while an async transition was still pending
  var INVALID_CALLBACK: Double = js.native
  var INVALID_TRANSITION: Double = js.native
  	// = 100, caller tried to fire an event that was innapropriate in the current state
  var PENDING_TRANSITION: Double = js.native
}

