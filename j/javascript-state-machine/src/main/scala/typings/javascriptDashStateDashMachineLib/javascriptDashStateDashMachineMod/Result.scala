package typings
package javascriptDashStateDashMachineLib.javascriptDashStateDashMachineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("javascript-state-machine", "Result")
@js.native
object Result extends js.Object {
  	    // = 2, the event was successfull but no state transition was necessary
  var CANCELLED: scala.Double = js.native
  	        // = 1, the event transitioned successfully from one state to another
  var NOTRANSITION: scala.Double = js.native
  	        // = 3, the event was cancelled by the caller in a beforeEvent callback
  var PENDING: scala.Double = js.native
  var SUCCEEDED: scala.Double = js.native
}

