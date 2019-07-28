package typings.atMaterialDashUiCore

import typings.atMaterialDashUiCore.atMaterialDashUiCoreNumbers.`false`
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.onClick
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.onMouseDown
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.onMouseUp
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.onTouchEnd
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.onTouchStart
import typings.react.reactMod.ChangeEvent
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/ClickAwayListener.ClickAwayListenerProps> */
trait PartialClickAwayListenerProps extends js.Object {
  var children: js.UndefOr[ReactNode] = js.undefined
  var mouseEvent: js.UndefOr[onClick | onMouseDown | onMouseUp | `false`] = js.undefined
  var onClickAway: js.UndefOr[js.Function1[/* event */ ChangeEvent[js.Object], Unit]] = js.undefined
  var touchEvent: js.UndefOr[onTouchStart | onTouchEnd | `false`] = js.undefined
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

