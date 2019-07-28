package typings.javascriptDashStateDashMachine.javascriptDashStateDashMachineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("javascript-state-machine", "StateMachine")
@js.native
object StateMachineNs extends js.Object {
  val ASYNC: String = js.native
  val VERSION: String = js.native
  val WILDCARD: String = js.native
  def create(config: StateMachineConfig): StateMachine = js.native
  def create(config: StateMachineConfig, target: StateMachine): StateMachine = js.native
  @js.native
  object Error extends js.Object {
    	// = 200, caller tried to fire an event while an async transition was still pending
    var INVALID_CALLBACK: Double = js.native
    var INVALID_TRANSITION: Double = js.native
    	// = 100, caller tried to fire an event that was innapropriate in the current state
    var PENDING_TRANSITION: Double = js.native
  }
  
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
  
}

