package typings.atMaterialDashUiCore.clickAwayListenerClickAwayListenerMod

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

trait ClickAwayListenerProps extends js.Object {
  var children: ReactNode
  var mouseEvent: js.UndefOr[onClick | onMouseDown | onMouseUp | `false`] = js.undefined
  var touchEvent: js.UndefOr[onTouchStart | onTouchEnd | `false`] = js.undefined
  def onClickAway(event: ChangeEvent[js.Object]): Unit
}

object ClickAwayListenerProps {
  @scala.inline
  def apply(
    children: ReactNode,
    onClickAway: ChangeEvent[js.Object] => Unit,
    mouseEvent: onClick | onMouseDown | onMouseUp | `false` = null,
    touchEvent: onTouchStart | onTouchEnd | `false` = null
  ): ClickAwayListenerProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], onClickAway = js.Any.fromFunction1(onClickAway))
    if (mouseEvent != null) __obj.updateDynamic("mouseEvent")(mouseEvent.asInstanceOf[js.Any])
    if (touchEvent != null) __obj.updateDynamic("touchEvent")(touchEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClickAwayListenerProps]
  }
}

