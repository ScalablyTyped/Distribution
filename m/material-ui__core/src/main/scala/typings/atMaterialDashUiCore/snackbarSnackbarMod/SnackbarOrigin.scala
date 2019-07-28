package typings.atMaterialDashUiCore.snackbarSnackbarMod

import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.bottom
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.center
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.left
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.right
import typings.atMaterialDashUiCore.atMaterialDashUiCoreStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnackbarOrigin extends js.Object {
  var horizontal: left | center | right
  var vertical: top | bottom
}

object SnackbarOrigin {
  @scala.inline
  def apply(horizontal: left | center | right, vertical: top | bottom): SnackbarOrigin = {
    val __obj = js.Dynamic.literal(horizontal = horizontal.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SnackbarOrigin]
  }
}

