package typings.atMaterialDashUiCore.popoverPopoverMod

import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.bottom
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.center
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.left
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.right
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopoverOrigin extends js.Object {
  var horizontal: left | center | right | Double
  var vertical: top | center | bottom | Double
}

object PopoverOrigin {
  @scala.inline
  def apply(horizontal: left | center | right | Double, vertical: top | center | bottom | Double): PopoverOrigin = {
    val __obj = js.Dynamic.literal(horizontal = horizontal.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PopoverOrigin]
  }
}

