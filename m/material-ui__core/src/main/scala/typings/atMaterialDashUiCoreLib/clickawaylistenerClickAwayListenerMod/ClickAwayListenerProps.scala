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

