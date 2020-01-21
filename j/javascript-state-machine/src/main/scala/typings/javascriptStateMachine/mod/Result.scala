package typings.javascriptStateMachine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("javascript-state-machine", "Result")
@js.native
object Result extends js.Object {
  	    // = 2, the event was successfull but no state transition was necessary
  var CANCELLED: Double = js.native
  	        // = 1, the event transitioned successfully from one state to another
  var NOTRANSITION: Double = js.native
  	        // = 3, the event was cancelled by the caller in a beforeEvent callback
  var PENDING: Double = js.native
  var SUCCEEDED: Double = js.native
}

