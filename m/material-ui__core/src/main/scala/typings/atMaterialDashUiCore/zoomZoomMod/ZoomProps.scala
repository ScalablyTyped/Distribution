package typings.atMaterialDashUiCore.zoomZoomMod

import typings.atMaterialDashUiCore.stylesCreateMuiThemeMod.Theme
import typings.react.reactMod.CSSProperties
import typings.reactDashTransitionDashGroup.Anon_Appear
import typings.reactDashTransitionDashGroup.transitionMod.EndHandler
import typings.reactDashTransitionDashGroup.transitionMod.EnterHandler
import typings.reactDashTransitionDashGroup.transitionMod.ExitHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent @material-ui/core.@material-ui/core/transitions/transition.TransitionProps */
trait ZoomProps extends js.Object {
  var addEndListener: js.UndefOr[EndHandler] = js.undefined
  /**
    * Normally a component is not transitioned if it is shown when the
    * `<Transition>` component mounts. If you want to transition on the first
    * mount set  appear to true, and the component will transition in as soon
    * as the `<Transition>` mounts. Note: there are no specific "appear" states.
    * appear only adds an additional enter transition.
    */
  var appear: js.UndefOr[Boolean] = js.undefined
  /**
    * Enable or disable enter transitions.
    */
  var enter: js.UndefOr[Boolean] = js.undefined
  /**
    * Enable or disable exit transitions.
    */
  var exit: js.UndefOr[Boolean] = js.undefined
  var in: js.UndefOr[Boolean] = js.undefined
  var mountOnEnter: js.UndefOr[Boolean] = js.undefined
  var onEnter: js.UndefOr[EnterHandler] = js.undefined
  var onEntered: js.UndefOr[EnterHandler] = js.undefined
  var onEntering: js.UndefOr[EnterHandler] = js.undefined
  var onExit: js.UndefOr[ExitHandler] = js.undefined
  var onExited: js.UndefOr[ExitHandler] = js.undefined
  var onExiting: js.UndefOr[ExitHandler] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var theme: js.UndefOr[Theme] = js.undefined
  var timeout: js.UndefOr[Double | Anon_Appear] = js.undefined
  var unmountOnExit: js.UndefOr[Boolean] = js.undefined
}

object ZoomProps {
  @scala.inline
  def apply(
    addEndListener: EndHandler = null,
    appear: js.UndefOr[Boolean] = js.undefined,
    enter: js.UndefOr[Boolean] = js.undefined,
    exit: js.UndefOr[Boolean] = js.undefined,
    in: js.UndefOr[Boolean] = js.undefined,
    mountOnEnter: js.UndefOr[Boolean] = js.undefined,
    onEnter: EnterHandler = null,
    onEntered: EnterHandler = null,
    onEntering: EnterHandler = null,
    onExit: ExitHandler = null,
    onExited: ExitHandler = null,
    onExiting: ExitHandler = null,
    style: CSSProperties = null,
    theme: Theme = null,
    timeout: Double | Anon_Appear = null,
    unmountOnExit: js.UndefOr[Boolean] = js.undefined
  ): ZoomProps = {
    val __obj = js.Dynamic.literal()
    if (addEndListener != null) __obj.updateDynamic("addEndListener")(addEndListener)
    if (!js.isUndefined(appear)) __obj.updateDynamic("appear")(appear)
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
    __obj.asInstanceOf[ZoomProps]
  }
}

