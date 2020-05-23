package typings.materialUiCore.transitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<react-transition-group.react-transition-group/Transition.TransitionProps<undefined>, @material-ui/core.@material-ui/core/transitions/transition.TransitionHandlerKeys> */
@js.native
trait TransitionHandlerProps extends js.Object {
  var onEnter: js.UndefOr[js.Any] = js.native
  var onEntered: js.UndefOr[js.Any] = js.native
  var onEntering: js.UndefOr[js.Any] = js.native
  var onExit: js.UndefOr[js.Any] = js.native
  var onExited: js.UndefOr[js.Any] = js.native
  var onExiting: js.UndefOr[js.Any] = js.native
}

object TransitionHandlerProps {
  @scala.inline
  def apply(
    onEnter: js.Any = null,
    onEntered: js.Any = null,
    onEntering: js.Any = null,
    onExit: js.Any = null,
    onExited: js.Any = null,
    onExiting: js.Any = null
  ): TransitionHandlerProps = {
    val __obj = js.Dynamic.literal()
    if (onEnter != null) __obj.updateDynamic("onEnter")(onEnter.asInstanceOf[js.Any])
    if (onEntered != null) __obj.updateDynamic("onEntered")(onEntered.asInstanceOf[js.Any])
    if (onEntering != null) __obj.updateDynamic("onEntering")(onEntering.asInstanceOf[js.Any])
    if (onExit != null) __obj.updateDynamic("onExit")(onExit.asInstanceOf[js.Any])
    if (onExited != null) __obj.updateDynamic("onExited")(onExited.asInstanceOf[js.Any])
    if (onExiting != null) __obj.updateDynamic("onExiting")(onExiting.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionHandlerProps]
  }
}

