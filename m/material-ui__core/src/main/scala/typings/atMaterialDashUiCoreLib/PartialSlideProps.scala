package typings
package atMaterialDashUiCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/Slide.SlideProps> */
trait PartialSlideProps extends js.Object {
  var addEndListener: js.UndefOr[reactDashTransitionDashGroupLib.transitionMod.EndHandler] = js.undefined
  var appear: js.UndefOr[scala.Boolean] = js.undefined
  var direction: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.left | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.right | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.up | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.down
  ] = js.undefined
  var enter: js.UndefOr[scala.Boolean] = js.undefined
  var exit: js.UndefOr[scala.Boolean] = js.undefined
  var in: js.UndefOr[scala.Boolean] = js.undefined
  var mountOnEnter: js.UndefOr[scala.Boolean] = js.undefined
  var onEnter: js.UndefOr[reactDashTransitionDashGroupLib.transitionMod.EnterHandler] = js.undefined
  var onEntered: js.UndefOr[reactDashTransitionDashGroupLib.transitionMod.EnterHandler] = js.undefined
  var onEntering: js.UndefOr[reactDashTransitionDashGroupLib.transitionMod.EnterHandler] = js.undefined
  var onExit: js.UndefOr[reactDashTransitionDashGroupLib.transitionMod.ExitHandler] = js.undefined
  var onExited: js.UndefOr[reactDashTransitionDashGroupLib.transitionMod.ExitHandler] = js.undefined
  var onExiting: js.UndefOr[reactDashTransitionDashGroupLib.transitionMod.ExitHandler] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var theme: js.UndefOr[atMaterialDashUiCoreLib.stylesCreateMuiThemeMod.Theme] = js.undefined
  var timeout: js.UndefOr[scala.Double | reactDashTransitionDashGroupLib.Anon_Appear] = js.undefined
  var unmountOnExit: js.UndefOr[scala.Boolean] = js.undefined
}

object PartialSlideProps {
  @scala.inline
  def apply(
    addEndListener: reactDashTransitionDashGroupLib.transitionMod.EndHandler = null,
    appear: js.UndefOr[scala.Boolean] = js.undefined,
    direction: atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.left | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.right | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.up | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.down = null,
    enter: js.UndefOr[scala.Boolean] = js.undefined,
    exit: js.UndefOr[scala.Boolean] = js.undefined,
    in: js.UndefOr[scala.Boolean] = js.undefined,
    mountOnEnter: js.UndefOr[scala.Boolean] = js.undefined,
    onEnter: reactDashTransitionDashGroupLib.transitionMod.EnterHandler = null,
    onEntered: reactDashTransitionDashGroupLib.transitionMod.EnterHandler = null,
    onEntering: reactDashTransitionDashGroupLib.transitionMod.EnterHandler = null,
    onExit: reactDashTransitionDashGroupLib.transitionMod.ExitHandler = null,
    onExited: reactDashTransitionDashGroupLib.transitionMod.ExitHandler = null,
    onExiting: reactDashTransitionDashGroupLib.transitionMod.ExitHandler = null,
    style: reactLib.reactMod.CSSProperties = null,
    theme: atMaterialDashUiCoreLib.stylesCreateMuiThemeMod.Theme = null,
    timeout: scala.Double | reactDashTransitionDashGroupLib.Anon_Appear = null,
    unmountOnExit: js.UndefOr[scala.Boolean] = js.undefined
  ): PartialSlideProps = {
    val __obj = js.Dynamic.literal()
    if (addEndListener != null) __obj.updateDynamic("addEndListener")(addEndListener)
    if (!js.isUndefined(appear)) __obj.updateDynamic("appear")(appear)
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(enter)) __obj.updateDynamic("enter")(enter)
    if (!js.isUndefined(exit)) __obj.updateDynamic("exit")(exit)
    if (!js.isUndefined(in)) __obj.updateDynamic("in")(in)
    if (!js.isUndefined(mountOnEnter)) __obj.updateDynamic("mountOnEnter")(mountOnEnter)
    if (onEnter != null) __obj.updateDynamic("onEnter")(onEnter)
    if (onEntered != null) __obj.updateDynamic("onEntered")(onEntered)
    if (onEntering != null) __obj.updateDynamic("onEntering")(onEntering)
    if (onExit != null) __obj.updateDynamic("onExit")(onExit)
    if (onExited != null) __obj.updateDynamic("onExited")(onExited)
    if (onExiting != null) __obj.updateDynamic("onExiting")(onExiting)
    if (style != null) __obj.updateDynamic("style")(style)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(unmountOnExit)) __obj.updateDynamic("unmountOnExit")(unmountOnExit)
    __obj.asInstanceOf[PartialSlideProps]
  }
}

