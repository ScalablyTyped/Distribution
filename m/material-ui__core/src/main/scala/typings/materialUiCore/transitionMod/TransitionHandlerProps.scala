package typings.materialUiCore.transitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<react-transition-group.react-transition-group/Transition.TransitionProps, @material-ui/core.@material-ui/core/transitions/transition.TransitionHandlerKeys> */
@js.native
trait TransitionHandlerProps extends js.Object {
  var onEnter: js.Any = js.native
  var onEntered: js.Any = js.native
  var onEntering: js.Any = js.native
  var onExit: js.Any = js.native
  var onExited: js.Any = js.native
  var onExiting: js.Any = js.native
}

object TransitionHandlerProps {
  @scala.inline
  def apply(
    onEnter: js.Any,
    onEntered: js.Any,
    onEntering: js.Any,
    onExit: js.Any,
    onExited: js.Any,
    onExiting: js.Any
  ): TransitionHandlerProps = {
    val __obj = js.Dynamic.literal(onEnter = onEnter.asInstanceOf[js.Any], onEntered = onEntered.asInstanceOf[js.Any], onEntering = onEntering.asInstanceOf[js.Any], onExit = onExit.asInstanceOf[js.Any], onExited = onExited.asInstanceOf[js.Any], onExiting = onExiting.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TransitionHandlerProps]
  }
}

