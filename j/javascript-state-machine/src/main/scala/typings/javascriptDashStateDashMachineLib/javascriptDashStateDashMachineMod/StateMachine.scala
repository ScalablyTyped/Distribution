package typings
package javascriptDashStateDashMachineLib.javascriptDashStateDashMachineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StateMachine extends js.Object {
  @JSName("can")
  var can_Original: StateMachineCan = js.native
  @JSName("cannot")
  var cannot_Original: StateMachineCan = js.native
  var current: java.lang.String = js.native
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
  def can(evt: java.lang.String): scala.Boolean = js.native
  def cannot(evt: java.lang.String): scala.Boolean = js.native
  def error(
    eventName: js.UndefOr[java.lang.String],
    from: js.UndefOr[java.lang.String],
    to: js.UndefOr[java.lang.String],
    args: js.UndefOr[js.Array[_]],
    errorCode: js.UndefOr[scala.Double],
    errorMessage: js.UndefOr[java.lang.String],
    ex: js.UndefOr[stdLib.Error]
  ): scala.Unit = js.native
  def is(state: java.lang.String): scala.Boolean = js.native
  def isFinished(state: java.lang.String): scala.Boolean = js.native
  /*  transition - only available when performing async state transitions; otherwise null. Can be a:
  		[1] fsm.transition(); // called from async callback
  		[2] fsm.transition.cancel();
  	*/
  def transition(): scala.Unit = js.native
  def transitions(): js.Array[java.lang.String] = js.native
}

