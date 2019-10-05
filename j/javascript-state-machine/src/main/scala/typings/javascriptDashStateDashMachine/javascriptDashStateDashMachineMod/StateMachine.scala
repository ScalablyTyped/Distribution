package typings.javascriptDashStateDashMachine.javascriptDashStateDashMachineMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StateMachine extends js.Object {
  @JSName("can")
  var can_Original: StateMachineCan = js.native
  @JSName("cannot")
  var cannot_Original: StateMachineCan = js.native
  var current: String = js.native
  @JSName("error")
  var error_Original: StateMachineErrorCallback = js.native
  @JSName("isFinished")
  var isFinished_Original: StateMachineIsFinished = js.native
  @JSName("is")
  var is_Original: StateMachineIs = js.native
  /*  transition - only available when performing async state transitions; otherwise null. Can be a:
  		[1] fsm.transition(); // called from async callback
  		[2] fsm.transition.cancel();
  	*/
  @JSName("transition")
  var transition_Original: StateMachineTransition = js.native
  @JSName("transitions")
  var transitions_Original: StateMachineTransitions = js.native
  def can(evt: String): Boolean = js.native
  def cannot(evt: String): Boolean = js.native
  def error(
    eventName: js.UndefOr[String],
    from: js.UndefOr[String],
    to: js.UndefOr[String],
    args: js.UndefOr[js.Array[_]],
    errorCode: js.UndefOr[Double],
    errorMessage: js.UndefOr[String],
    ex: js.UndefOr[Error]
  ): Unit = js.native
  def is(state: String): Boolean = js.native
  def isFinished(state: String): Boolean = js.native
  /*  transition - only available when performing async state transitions; otherwise null. Can be a:
  		[1] fsm.transition(); // called from async callback
  		[2] fsm.transition.cancel();
  	*/
  def transition(): Unit = js.native
  def transitions(): js.Array[String] = js.native
}

@JSImport("javascript-state-machine", "StateMachine")
@js.native
object StateMachine extends js.Object {
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

