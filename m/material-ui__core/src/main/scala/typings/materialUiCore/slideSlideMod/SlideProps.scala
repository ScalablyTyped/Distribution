package typings.materialUiCore.slideSlideMod

import typings.materialUiCore.createMuiThemeMod.Theme
import typings.materialUiCore.materialUiCoreStrings.down
import typings.materialUiCore.materialUiCoreStrings.left
import typings.materialUiCore.materialUiCoreStrings.right
import typings.materialUiCore.materialUiCoreStrings.up
import typings.materialUiCore.transitionMod.TransitionProps
import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SlideProps extends TransitionProps {
  var direction: left | right | up | down = js.native
  var theme: js.UndefOr[Theme] = js.native
}

object SlideProps {
  @scala.inline
  def apply(
    direction: left | right | up | down,
    addEndListener: js.Any = null,
    appear: js.UndefOr[Boolean] = js.undefined,
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
    theme: Theme = null,
    timeout: js.Any = null,
    unmountOnExit: js.Any = null
  ): SlideProps = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any])
    if (addEndListener != null) __obj.updateDynamic("addEndListener")(addEndListener.asInstanceOf[js.Any])
    if (!js.isUndefined(appear)) __obj.updateDynamic("appear")(appear.get.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[SlideProps]
  }
}

