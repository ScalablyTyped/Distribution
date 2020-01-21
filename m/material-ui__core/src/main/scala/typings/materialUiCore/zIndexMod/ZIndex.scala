package typings.materialUiCore.zIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZIndex extends js.Object {
  var appBar: Double = js.native
  var drawer: Double = js.native
  var mobileStepper: Double = js.native
  var modal: Double = js.native
  var snackbar: Double = js.native
  var tooltip: Double = js.native
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

