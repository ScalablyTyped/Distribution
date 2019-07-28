package typings.javascriptDashStateDashMachine.javascriptDashStateDashMachineMod

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
    ex: js.UndefOr[typings.std.Error]
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

