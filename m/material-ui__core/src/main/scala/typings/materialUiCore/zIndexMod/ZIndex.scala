package typings.materialUiCore.zIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  @scala.inline
  implicit class ZIndexOps[Self <: ZIndex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAppBar(value: Double): Self = this.set("appBar", value.asInstanceOf[js.Any])
    @scala.inline
    def setDrawer(value: Double): Self = this.set("drawer", value.asInstanceOf[js.Any])
    @scala.inline
    def setMobileStepper(value: Double): Self = this.set("mobileStepper", value.asInstanceOf[js.Any])
    @scala.inline
    def setModal(value: Double): Self = this.set("modal", value.asInstanceOf[js.Any])
    @scala.inline
    def setSnackbar(value: Double): Self = this.set("snackbar", value.asInstanceOf[js.Any])
    @scala.inline
    def setTooltip(value: Double): Self = this.set("tooltip", value.asInstanceOf[js.Any])
  }
  
}

