package typings
package atMaterialDashUiCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/ClickAwayListener.ClickAwayListenerProps> */
trait PartialClickAwayListenerProps extends js.Object {
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var mouseEvent: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.onClick | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.onMouseDown | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.onMouseUp | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibNumbers.`false`
  ] = js.undefined
  var onClickAway: js.UndefOr[js.Function1[/* event */ reactLib.reactMod.ChangeEvent[js.Object], scala.Unit]] = js.undefined
  var touchEvent: js.UndefOr[
    atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.onTouchStart | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.onTouchEnd | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibNumbers.`false`
  ] = js.undefined
}

object PartialClickAwayListenerProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNode = null,
    mouseEvent: atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.onClick | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.onMouseDown | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.onMouseUp | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibNumbers.`false` = null,
    onClickAway: /* event */ reactLib.reactMod.ChangeEvent[js.Object] => scala.Unit = null,
    touchEvent: atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.onTouchStart | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.onTouchEnd | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibNumbers.`false` = null
  ): PartialClickAwayListenerProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (mouseEvent != null) __obj.updateDynamic("mouseEvent")(mouseEvent.asInstanceOf[js.Any])
    if (onClickAway != null) __obj.updateDynamic("onClickAway")(js.Any.fromFunction1(onClickAway))
    if (touchEvent != null) __obj.updateDynamic("touchEvent")(touchEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialClickAwayListenerProps]
  }
}

