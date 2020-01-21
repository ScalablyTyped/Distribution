package typings.materialUiCore

import typings.materialUiCore.materialUiCoreBooleans.`false`
import typings.materialUiCore.materialUiCoreStrings.onClick
import typings.materialUiCore.materialUiCoreStrings.onMouseDown
import typings.materialUiCore.materialUiCoreStrings.onMouseUp
import typings.materialUiCore.materialUiCoreStrings.onTouchEnd
import typings.materialUiCore.materialUiCoreStrings.onTouchStart
import typings.react.mod.ChangeEvent
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/ClickAwayListener.ClickAwayListenerProps> */
@js.native
trait PartialClickAwayListenerProps extends js.Object {
  var children: js.UndefOr[ReactNode] = js.native
  var mouseEvent: js.UndefOr[onClick | onMouseDown | onMouseUp | `false`] = js.native
  var onClickAway: js.UndefOr[js.Function1[/* event */ ChangeEvent[js.Object], Unit]] = js.native
  var touchEvent: js.UndefOr[onTouchStart | onTouchEnd | `false`] = js.native
}

object PartialClickAwayListenerProps {
  @scala.inline
  def apply(
    children: ReactNode = null,
    mouseEvent: onClick | onMouseDown | onMouseUp | `false` = null,
    onClickAway: /* event */ ChangeEvent[js.Object] => Unit = null,
    touchEvent: onTouchStart | onTouchEnd | `false` = null
  ): PartialClickAwayListenerProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (mouseEvent != null) __obj.updateDynamic("mouseEvent")(mouseEvent.asInstanceOf[js.Any])
    if (onClickAway != null) __obj.updateDynamic("onClickAway")(js.Any.fromFunction1(onClickAway))
    if (touchEvent != null) __obj.updateDynamic("touchEvent")(touchEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClickAwayListenerProps]
  }
}

