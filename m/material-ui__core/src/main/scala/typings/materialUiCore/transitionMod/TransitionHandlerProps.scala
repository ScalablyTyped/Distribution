package typings.materialUiCore.transitionMod

import typings.reactTransitionGroup.transitionMod.EnterHandler
import typings.reactTransitionGroup.transitionMod.ExitHandler
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<react-transition-group.react-transition-group/Transition.TransitionProps, @material-ui/core.@material-ui/core/transitions/transition.TransitionHandlerKeys> */
@js.native
trait TransitionHandlerProps extends js.Object {
  var onEnter: js.UndefOr[EnterHandler] = js.native
  var onEntered: js.UndefOr[EnterHandler] = js.native
  var onEntering: js.UndefOr[EnterHandler] = js.native
  var onExit: js.UndefOr[ExitHandler] = js.native
  var onExited: js.UndefOr[ExitHandler] = js.native
  var onExiting: js.UndefOr[ExitHandler] = js.native
}

object TransitionHandlerProps {
  @scala.inline
  def apply(
    onEnter: (/* node */ HTMLElement, /* isAppearing */ Boolean) => Unit = null,
    onEntered: (/* node */ HTMLElement, /* isAppearing */ Boolean) => Unit = null,
    onEntering: (/* node */ HTMLElement, /* isAppearing */ Boolean) => Unit = null,
    onExit: /* node */ HTMLElement => Unit = null,
    onExited: /* node */ HTMLElement => Unit = null,
    onExiting: /* node */ HTMLElement => Unit = null
  ): TransitionHandlerProps = {
    val __obj = js.Dynamic.literal()
    if (onEnter != null) __obj.updateDynamic("onEnter")(js.Any.fromFunction2(onEnter))
    if (onEntered != null) __obj.updateDynamic("onEntered")(js.Any.fromFunction2(onEntered))
    if (onEntering != null) __obj.updateDynamic("onEntering")(js.Any.fromFunction2(onEntering))
    if (onExit != null) __obj.updateDynamic("onExit")(js.Any.fromFunction1(onExit))
    if (onExited != null) __obj.updateDynamic("onExited")(js.Any.fromFunction1(onExited))
    if (onExiting != null) __obj.updateDynamic("onExiting")(js.Any.fromFunction1(onExiting))
    __obj.asInstanceOf[TransitionHandlerProps]
  }
}

