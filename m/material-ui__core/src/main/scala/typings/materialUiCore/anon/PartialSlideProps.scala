package typings.materialUiCore.anon

import typings.materialUiCore.materialUiCoreStrings.down
import typings.materialUiCore.materialUiCoreStrings.left
import typings.materialUiCore.materialUiCoreStrings.right
import typings.materialUiCore.materialUiCoreStrings.up
import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/Slide.SlideProps> */
@js.native
trait PartialSlideProps extends js.Object {
  var addEndListener: js.UndefOr[js.Any] = js.native
  var appear: js.UndefOr[Boolean] = js.native
  var direction: js.UndefOr[left | right | up | down] = js.native
  var enter: js.UndefOr[Boolean] = js.native
  var exit: js.UndefOr[Boolean] = js.native
  var in: js.UndefOr[js.Any] = js.native
  var mountOnEnter: js.UndefOr[js.Any] = js.native
  var onEnter: js.UndefOr[js.Any] = js.native
  var onEntered: js.UndefOr[js.Any] = js.native
  var onEntering: js.UndefOr[js.Any] = js.native
  var onExit: js.UndefOr[js.Any] = js.native
  var onExited: js.UndefOr[js.Any] = js.native
  var onExiting: js.UndefOr[js.Any] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var theme: js.UndefOr[typings.materialUiCore.createMuiThemeMod.Theme] = js.native
  var timeout: js.UndefOr[js.Any] = js.native
  var unmountOnExit: js.UndefOr[js.Any] = js.native
}

object PartialSlideProps {
  @scala.inline
  def apply(
    addEndListener: js.Any = null,
    appear: js.UndefOr[Boolean] = js.undefined,
    direction: left | right | up | down = null,
    enter: js.UndefOr[Boolean] = js.undefined,
    exit: js.UndefOr[Boolean] = js.undefined,
    in: js.Any = null,
    mountOnEnter: js.Any = null,
    onEnter: js.Any = null,
    onEntered: js.Any = null,
    onEntering: js.Any = null,
    onExit: js.Any = null,
    onExited: js.Any = null,
    onExiting: js.Any = null,
    style: CSSProperties = null,
    theme: typings.materialUiCore.createMuiThemeMod.Theme = null,
    timeout: js.Any = null,
    unmountOnExit: js.Any = null
  ): PartialSlideProps = {
    val __obj = js.Dynamic.literal()
    if (addEndListener != null) __obj.updateDynamic("addEndListener")(addEndListener.asInstanceOf[js.Any])
    if (!js.isUndefined(appear)) __obj.updateDynamic("appear")(appear.get.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(enter)) __obj.updateDynamic("enter")(enter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(exit)) __obj.updateDynamic("exit")(exit.get.asInstanceOf[js.Any])
    if (in != null) __obj.updateDynamic("in")(in.asInstanceOf[js.Any])
    if (mountOnEnter != null) __obj.updateDynamic("mountOnEnter")(mountOnEnter.asInstanceOf[js.Any])
    if (onEnter != null) __obj.updateDynamic("onEnter")(onEnter.asInstanceOf[js.Any])
    if (onEntered != null) __obj.updateDynamic("onEntered")(onEntered.asInstanceOf[js.Any])
    if (onEntering != null) __obj.updateDynamic("onEntering")(onEntering.asInstanceOf[js.Any])
    if (onExit != null) __obj.updateDynamic("onExit")(onExit.asInstanceOf[js.Any])
    if (onExited != null) __obj.updateDynamic("onExited")(onExited.asInstanceOf[js.Any])
    if (onExiting != null) __obj.updateDynamic("onExiting")(onExiting.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (unmountOnExit != null) __obj.updateDynamic("unmountOnExit")(unmountOnExit.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialSlideProps]
  }
}

