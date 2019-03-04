package typings
package atMaterialDashUiCoreLib.clickawaylistenerClickAwayListenerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClickAwayListenerProps extends js.Object {
  var children: reactLib.reactMod.ReactNs.ReactNode
  var mouseEvent: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.onClick | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.onMouseDown | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.onMouseUp | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibNumbers.`false`
  ] = js.undefined
  var touchEvent: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.onTouchStart | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.onTouchEnd | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibNumbers.`false`
  ] = js.undefined
  def onClickAway(event: reactLib.reactMod.ReactNs.ChangeEvent[js.Object]): scala.Unit
}

object ClickAwayListenerProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNs.ReactNode,
    onClickAway: js.Function1[reactLib.reactMod.ReactNs.ChangeEvent[js.Object], scala.Unit],
    mouseEvent: atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.onClick | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.onMouseDown | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.onMouseUp | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibNumbers.`false` = null,
    touchEvent: atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.onTouchStart | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.onTouchEnd | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibNumbers.`false` = null
  ): ClickAwayListenerProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], onClickAway = onClickAway)
    if (mouseEvent != null) __obj.updateDynamic("mouseEvent")(mouseEvent.asInstanceOf[js.Any])
    if (touchEvent != null) __obj.updateDynamic("touchEvent")(touchEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClickAwayListenerProps]
  }
}

