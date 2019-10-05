package typings.atMaterialDashUiCore.collapseCollapseMod

import typings.atMaterialDashUiCore.PartialClassNameMapCollapseClassKey
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.auto
import typings.atMaterialDashUiCore.stylesCreateMuiThemeMod.Theme
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactNode
import typings.react.reactMod.ReactType
import typings.react.reactMod.Ref
import typings.react.reactMod.RefObject
import typings.reactDashTransitionDashGroup.Anon_Appear
import typings.reactDashTransitionDashGroup.transitionMod.EndHandler
import typings.reactDashTransitionDashGroup.transitionMod.EnterHandler
import typings.reactDashTransitionDashGroup.transitionMod.ExitHandler
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent @material-ui/core.@material-ui/core.StandardProps<@material-ui/core.@material-ui/core/transitions/transition.TransitionProps, @material-ui/core.@material-ui/core/Collapse/Collapse.CollapseClassKey, 'timeout'> */
trait CollapseProps extends js.Object {
  var addEndListener: js.UndefOr[EndHandler] = js.undefined
  var appear: js.UndefOr[Boolean] = js.undefined
  var children: js.UndefOr[ReactNode] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var classes: js.UndefOr[PartialClassNameMapCollapseClassKey] = js.undefined
  var collapsedHeight: js.UndefOr[String] = js.undefined
  var component: js.UndefOr[ReactType[CollapseProps]] = js.undefined
  var enter: js.UndefOr[Boolean] = js.undefined
  var exit: js.UndefOr[Boolean] = js.undefined
  var in: js.UndefOr[Boolean] = js.undefined
  var innerRef: js.UndefOr[Ref[_] | RefObject[_]] = js.undefined
  var mountOnEnter: js.UndefOr[Boolean] = js.undefined
  var onEnter: js.UndefOr[EnterHandler] = js.undefined
  var onEntered: js.UndefOr[EnterHandler] = js.undefined
  var onEntering: js.UndefOr[EnterHandler] = js.undefined
  var onExit: js.UndefOr[ExitHandler] = js.undefined
  var onExited: js.UndefOr[ExitHandler] = js.undefined
  var onExiting: js.UndefOr[ExitHandler] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var theme: js.UndefOr[Theme] = js.undefined
  var timeout: js.UndefOr[Double | Anon_Appear | auto] = js.undefined
  var unmountOnExit: js.UndefOr[Boolean] = js.undefined
}

object CollapseProps {
  @scala.inline
  def apply(
    addEndListener: (/* node */ HTMLElement, /* done */ js.Function0[Unit]) => Unit = null,
    appear: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode = null,
    className: String = null,
    classes: PartialClassNameMapCollapseClassKey = null,
    collapsedHeight: String = null,
    component: ReactType[CollapseProps] = null,
    enter: js.UndefOr[Boolean] = js.undefined,
    exit: js.UndefOr[Boolean] = js.undefined,
    in: js.UndefOr[Boolean] = js.undefined,
    innerRef: Ref[_] | RefObject[_] = null,
    mountOnEnter: js.UndefOr[Boolean] = js.undefined,
    onEnter: (/* node */ HTMLElement, /* isAppearing */ Boolean) => Unit = null,
    onEntered: (/* node */ HTMLElement, /* isAppearing */ Boolean) => Unit = null,
    onEntering: (/* node */ HTMLElement, /* isAppearing */ Boolean) => Unit = null,
    onExit: /* node */ HTMLElement => Unit = null,
    onExited: /* node */ HTMLElement => Unit = null,
    onExiting: /* node */ HTMLElement => Unit = null,
    style: CSSProperties = null,
    theme: Theme = null,
    timeout: Double | Anon_Appear | auto = null,
    unmountOnExit: js.UndefOr[Boolean] = js.undefined
  ): CollapseProps = {
    val __obj = js.Dynamic.literal()
    if (addEndListener != null) __obj.updateDynamic("addEndListener")(js.Any.fromFunction2(addEndListener))
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
    if (onEnter != null) __obj.updateDynamic("onEnter")(js.Any.fromFunction2(onEnter))
    if (onEntered != null) __obj.updateDynamic("onEntered")(js.Any.fromFunction2(onEntered))
    if (onEntering != null) __obj.updateDynamic("onEntering")(js.Any.fromFunction2(onEntering))
    if (onExit != null) __obj.updateDynamic("onExit")(js.Any.fromFunction1(onExit))
    if (onExited != null) __obj.updateDynamic("onExited")(js.Any.fromFunction1(onExited))
    if (onExiting != null) __obj.updateDynamic("onExiting")(js.Any.fromFunction1(onExiting))
    if (style != null) __obj.updateDynamic("style")(style)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(unmountOnExit)) __obj.updateDynamic("unmountOnExit")(unmountOnExit)
    __obj.asInstanceOf[CollapseProps]
  }
}

