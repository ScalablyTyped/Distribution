package typings
package atMaterialDashUiCoreLib.transitionsTransitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof std.Pick<react-transition-group.react-transition-group/Transition.TransitionProps, @material-ui/core.@material-ui/core/transitions/transition.TransitionKeys> ]:? std.Pick<react-transition-group.react-transition-group/Transition.TransitionProps, @material-ui/core.@material-ui/core/transitions/transition.TransitionKeys>[P]} */ trait TransitionProps
  extends reactDashTransitionDashGroupLib.transitionMod.TransitionActions {
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
}

object TransitionProps {
  @scala.inline
  def apply(
    appear: js.UndefOr[scala.Boolean] = js.undefined,
    enter: js.UndefOr[scala.Boolean] = js.undefined,
    exit: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.CSSProperties = null
  ): TransitionProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(appear)) __obj.updateDynamic("appear")(appear)
    if (!js.isUndefined(enter)) __obj.updateDynamic("enter")(enter)
    if (!js.isUndefined(exit)) __obj.updateDynamic("exit")(exit)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[TransitionProps]
  }
}

