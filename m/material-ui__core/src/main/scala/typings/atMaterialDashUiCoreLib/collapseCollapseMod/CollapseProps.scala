package typings
package atMaterialDashUiCoreLib.collapseCollapseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent @material-ui/core.@material-ui/core.StandardProps<@material-ui/core.@material-ui/core/transitions/transition.TransitionProps, @material-ui/core.@material-ui/core/Collapse/Collapse.CollapseClassKey, 'timeout'> */
trait CollapseProps extends js.Object {
  var addEndListener: js.UndefOr[reactDashTransitionDashGroupLib.transitionMod.EndHandler]
  var appear: js.UndefOr[scala.Boolean]
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var classes: js.UndefOr[
    stdLib.Partial[atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[CollapseClassKey]]
  ] = js.undefined
  var collapsedHeight: js.UndefOr[java.lang.String] = js.undefined
  var component: js.UndefOr[reactLib.reactMod.ReactType[CollapseProps]] = js.undefined
  var enter: js.UndefOr[scala.Boolean]
  var exit: js.UndefOr[scala.Boolean]
  var in: js.UndefOr[scala.Boolean]
  var innerRef: js.UndefOr[reactLib.reactMod.Ref[_] | reactLib.reactMod.RefObject[_]] = js.undefined
  var mountOnEnter: js.UndefOr[scala.Boolean]
  var onEnter: js.UndefOr[reactDashTransitionDashGroupLib.transitionMod.EnterHandler]
  var onEntered: js.UndefOr[reactDashTransitionDashGroupLib.transitionMod.EnterHandler]
  var onEntering: js.UndefOr[reactDashTransitionDashGroupLib.transitionMod.EnterHandler]
  var onExit: js.UndefOr[reactDashTransitionDashGroupLib.transitionMod.ExitHandler]
  var onExited: js.UndefOr[reactDashTransitionDashGroupLib.transitionMod.ExitHandler]
  var onExiting: js.UndefOr[reactDashTransitionDashGroupLib.transitionMod.ExitHandler]
  var style: js.UndefOr[reactLib.reactMod.CSSProperties]
  var theme: js.UndefOr[atMaterialDashUiCoreLib.stylesCreateMuiThemeMod.Theme] = js.undefined
  var timeout: js.UndefOr[
    (js.UndefOr[scala.Double | reactDashTransitionDashGroupLib.Anon_Enter]) | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.auto
  ] = js.undefined
  var unmountOnExit: js.UndefOr[scala.Boolean]
}

object CollapseProps {
  @scala.inline
  def apply(
    addEndListener: reactDashTransitionDashGroupLib.transitionMod.EndHandler = null,
    appear: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.ReactNode = null,
    className: java.lang.String = null,
    classes: stdLib.Partial[atMaterialDashUiCoreLib.stylesWithStylesMod.ClassNameMap[CollapseClassKey]] = null,
    collapsedHeight: java.lang.String = null,
    component: reactLib.reactMod.ReactType[CollapseProps] = null,
    enter: js.UndefOr[scala.Boolean] = js.undefined,
    exit: js.UndefOr[scala.Boolean] = js.undefined,
    in: js.UndefOr[scala.Boolean] = js.undefined,
    innerRef: reactLib.reactMod.Ref[_] | reactLib.reactMod.RefObject[_] = null,
    mountOnEnter: js.UndefOr[scala.Boolean] = js.undefined,
    onEnter: reactDashTransitionDashGroupLib.transitionMod.EnterHandler = null,
    onEntered: reactDashTransitionDashGroupLib.transitionMod.EnterHandler = null,
    onEntering: reactDashTransitionDashGroupLib.transitionMod.EnterHandler = null,
    onExit: reactDashTransitionDashGroupLib.transitionMod.ExitHandler = null,
    onExited: reactDashTransitionDashGroupLib.transitionMod.ExitHandler = null,
    onExiting: reactDashTransitionDashGroupLib.transitionMod.ExitHandler = null,
    style: reactLib.reactMod.CSSProperties = null,
    theme: atMaterialDashUiCoreLib.stylesCreateMuiThemeMod.Theme = null,
    timeout: (js.UndefOr[scala.Double | reactDashTransitionDashGroupLib.Anon_Enter]) | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.auto = null,
    unmountOnExit: js.UndefOr[scala.Boolean] = js.undefined
  ): CollapseProps = {
    val __obj = js.Dynamic.literal()
    if (addEndListener != null) __obj.updateDynamic("addEndListener")(addEndListener)
    if (!js.isUndefined(appear)) __obj.updateDynamic("appear")(appear)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (collapsedHeight != null) __obj.updateDynamic("collapsedHeight")(collapsedHeight)
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (!js.isUndefined(enter)) __obj.updateDynamic("enter")(enter)
    if (!js.isUndefined(exit)) __obj.updateDynamic("exit")(exit)
    if (!js.isUndefined(in)) __obj.updateDynamic("in")(in)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[CollapseProps]
  }
}

