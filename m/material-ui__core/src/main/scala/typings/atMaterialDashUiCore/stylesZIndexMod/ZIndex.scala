package typings.atMaterialDashUiCore.stylesZIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZIndex extends js.Object {
  var appBar: Double
  var drawer: Double
  var mobileStepper: Double
  var modal: Double
  var snackbar: Double
  var tooltip: Double
}

object ZIndex {
  @scala.inline
  def apply(
    appBar: Double,
    drawer: Double,
    mobileStepper: Double,
    modal: Double,
    snackbar: Double,
    tooltip: Double
  ): ZIndex = {
    val __obj = js.Dynamic.literal(appBar = appBar.asInstanceOf[js.Any], drawer = drawer.asInstanceOf[js.Any], mobileStepper = mobileStepper.asInstanceOf[js.Any], modal = modal.asInstanceOf[js.Any], snackbar = snackbar.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ZIndex]
  }
}

