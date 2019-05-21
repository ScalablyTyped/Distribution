package typings
package atMaterialDashUiCoreLib.transitionsTransitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<react-transition-group.react-transition-group/Transition.TransitionProps, @material-ui/core.@material-ui/core/transitions/transition.TransitionHandlerKeys> */
trait TransitionHandlerProps extends js.Object {
  var onEnter: js.UndefOr[reactDashTransitionDashGroupLib.transitionMod.EnterHandler] = js.undefined
  var onEntered: js.UndefOr[reactDashTransitionDashGroupLib.transitionMod.EnterHandler] = js.undefined
  var onEntering: js.UndefOr[reactDashTransitionDashGroupLib.transitionMod.EnterHandler] = js.undefined
  var onExit: js.UndefOr[reactDashTransitionDashGroupLib.transitionMod.ExitHandler] = js.undefined
  var onExited: js.UndefOr[reactDashTransitionDashGroupLib.transitionMod.ExitHandler] = js.undefined
  var onExiting: js.UndefOr[reactDashTransitionDashGroupLib.transitionMod.ExitHandler] = js.undefined
}

object TransitionHandlerProps {
  @scala.inline
  def apply(
    onEnter: reactDashTransitionDashGroupLib.transitionMod.EnterHandler = null,
    onEntered: reactDashTransitionDashGroupLib.transitionMod.EnterHandler = null,
    onEntering: reactDashTransitionDashGroupLib.transitionMod.EnterHandler = null,
    onExit: reactDashTransitionDashGroupLib.transitionMod.ExitHandler = null,
    onExited: reactDashTransitionDashGroupLib.transitionMod.ExitHandler = null,
    onExiting: reactDashTransitionDashGroupLib.transitionMod.ExitHandler = null
  ): TransitionHandlerProps = {
    val __obj = js.Dynamic.literal()
    if (onEnter != null) __obj.updateDynamic("onEnter")(onEnter)
    if (onEntered != null) __obj.updateDynamic("onEntered")(onEntered)
    if (onEntering != null) __obj.updateDynamic("onEntering")(onEntering)
    if (onExit != null) __obj.updateDynamic("onExit")(onExit)
    if (onExited != null) __obj.updateDynamic("onExited")(onExited)
    if (onExiting != null) __obj.updateDynamic("onExiting")(onExiting)
    __obj.asInstanceOf[TransitionHandlerProps]
  }
}

