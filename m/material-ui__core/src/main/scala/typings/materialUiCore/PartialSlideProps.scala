package typings.materialUiCore

import typings.materialUiCore.createMuiThemeMod.Theme
import typings.materialUiCore.materialUiCoreStrings.down
import typings.materialUiCore.materialUiCoreStrings.left
import typings.materialUiCore.materialUiCoreStrings.right
import typings.materialUiCore.materialUiCoreStrings.up
import typings.react.mod.CSSProperties
import typings.reactTransitionGroup.AnonAppear
import typings.reactTransitionGroup.transitionMod.EndHandler
import typings.reactTransitionGroup.transitionMod.EnterHandler
import typings.reactTransitionGroup.transitionMod.ExitHandler
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/Slide.SlideProps> */
@js.native
trait PartialSlideProps extends js.Object {
  var addEndListener: js.UndefOr[EndHandler] = js.native
  var appear: js.UndefOr[Boolean] = js.native
  var direction: js.UndefOr[left | right | up | down] = js.native
  var enter: js.UndefOr[Boolean] = js.native
  var exit: js.UndefOr[Boolean] = js.native
  var in: js.UndefOr[Boolean] = js.native
  var mountOnEnter: js.UndefOr[Boolean] = js.native
  var onEnter: js.UndefOr[EnterHandler] = js.native
  var onEntered: js.UndefOr[EnterHandler] = js.native
  var onEntering: js.UndefOr[EnterHandler] = js.native
  var onExit: js.UndefOr[ExitHandler] = js.native
  var onExited: js.UndefOr[ExitHandler] = js.native
  var onExiting: js.UndefOr[ExitHandler] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var theme: js.UndefOr[Theme] = js.native
  var timeout: js.UndefOr[Double | AnonAppear] = js.native
  var unmountOnExit: js.UndefOr[Boolean] = js.native
}

object PartialSlideProps {
  @scala.inline
  def apply(
    addEndListener: (/* node */ HTMLElement, /* done */ js.Function0[Unit]) => Unit = null,
    appear: js.UndefOr[Boolean] = js.undefined,
    direction: left | right | up | down = null,
    enter: js.UndefOr[Boolean] = js.undefined,
    exit: js.UndefOr[Boolean] = js.undefined,
    in: js.UndefOr[Boolean] = js.undefined,
    mountOnEnter: js.UndefOr[Boolean] = js.undefined,
    onEnter: (/* node */ HTMLElement, /* isAppearing */ Boolean) => Unit = null,
    onEntered: (/* node */ HTMLElement, /* isAppearing */ Boolean) => Unit = null,
    onEntering: (/* node */ HTMLElement, /* isAppearing */ Boolean) => Unit = null,
    onExit: /* node */ HTMLElement => Unit = null,
    onExited: /* node */ HTMLElement => Unit = null,
    onExiting: /* node */ HTMLElement => Unit = null,
    style: CSSProperties = null,
    theme: Theme = null,
    timeout: Double | AnonAppear = null,
    unmountOnExit: js.UndefOr[Boolean] = js.undefined
  ): PartialSlideProps = {
    val __obj = js.Dynamic.literal()
    if (addEndListener != null) __obj.updateDynamic("addEndListener")(js.Any.fromFunction2(addEndListener))
    if (!js.isUndefined(appear)) __obj.updateDynamic("appear")(appear.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(enter)) __obj.updateDynamic("enter")(enter.asInstanceOf[js.Any])
    if (!js.isUndefined(exit)) __obj.updateDynamic("exit")(exit.asInstanceOf[js.Any])
    if (!js.isUndefined(in)) __obj.updateDynamic("in")(in.asInstanceOf[js.Any])
    if (!js.isUndefined(mountOnEnter)) __obj.updateDynamic("mountOnEnter")(mountOnEnter.asInstanceOf[js.Any])
    if (onEnter != null) __obj.updateDynamic("onEnter")(js.Any.fromFunction2(onEnter))
    if (onEntered != null) __obj.updateDynamic("onEntered")(js.Any.fromFunction2(onEntered))
    if (onEntering != null) __obj.updateDynamic("onEntering")(js.Any.fromFunction2(onEntering))
    if (onExit != null) __obj.updateDynamic("onExit")(js.Any.fromFunction1(onExit))
    if (onExited != null) __obj.updateDynamic("onExited")(js.Any.fromFunction1(onExited))
    if (onExiting != null) __obj.updateDynamic("onExiting")(js.Any.fromFunction1(onExiting))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(unmountOnExit)) __obj.updateDynamic("unmountOnExit")(unmountOnExit.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialSlideProps]
  }
}

