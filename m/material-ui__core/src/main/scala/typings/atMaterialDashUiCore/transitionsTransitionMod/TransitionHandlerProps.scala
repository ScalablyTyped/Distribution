package typings.atMaterialDashUiCore.transitionsTransitionMod

import typings.reactDashTransitionDashGroup.transitionMod.EnterHandler
import typings.reactDashTransitionDashGroup.transitionMod.ExitHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<react-transition-group.react-transition-group/Transition.TransitionProps, @material-ui/core.@material-ui/core/transitions/transition.TransitionHandlerKeys> */
trait TransitionHandlerProps extends js.Object {
  var onEnter: js.UndefOr[EnterHandler] = js.undefined
  var onEntered: js.UndefOr[EnterHandler] = js.undefined
  var onEntering: js.UndefOr[EnterHandler] = js.undefined
  var onExit: js.UndefOr[ExitHandler] = js.undefined
  var onExited: js.UndefOr[ExitHandler] = js.undefined
  var onExiting: js.UndefOr[ExitHandler] = js.undefined
}

object TransitionHandlerProps {
  @scala.inline
  def apply(
    onEnter: EnterHandler = null,
    onEntered: EnterHandler = null,
    onEntering: EnterHandler = null,
    onExit: ExitHandler = null,
    onExited: ExitHandler = null,
    onExiting: ExitHandler = null
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

