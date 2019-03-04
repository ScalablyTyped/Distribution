package typings
package atMaterialDashUiCoreLib.popoverPopoverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopoverOrigin extends js.Object {
  var horizontal: atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.left | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.center | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.right | scala.Double
  var vertical: atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.top | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.center | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.bottom | scala.Double
}

object PopoverOrigin {
  @scala.inline
  def apply(
    horizontal: atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.left | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.center | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.right | scala.Double,
    vertical: atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.top | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.center | atMaterialDashUiCoreLib.atMaterialDashUiCoreLibStrings.bottom | scala.Double
  ): PopoverOrigin = {
    val __obj = js.Dynamic.literal(horizontal = horizontal.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PopoverOrigin]
  }
}

