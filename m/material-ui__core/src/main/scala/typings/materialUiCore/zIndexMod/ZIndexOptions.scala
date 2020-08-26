package typings.materialUiCore.zIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/zIndex.ZIndex> */
@js.native
trait ZIndexOptions extends js.Object {
  var appBar: js.UndefOr[Double] = js.native
  var drawer: js.UndefOr[Double] = js.native
  var mobileStepper: js.UndefOr[Double] = js.native
  var modal: js.UndefOr[Double] = js.native
  var snackbar: js.UndefOr[Double] = js.native
  var tooltip: js.UndefOr[Double] = js.native
}

object ZIndexOptions {
  @scala.inline
  def apply(): ZIndexOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZIndexOptions]
  }
  @scala.inline
  implicit class ZIndexOptionsOps[Self <: ZIndexOptions] (val x: Self) extends AnyVal {
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
    def deleteAppBar: Self = this.set("appBar", js.undefined)
    @scala.inline
    def setDrawer(value: Double): Self = this.set("drawer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrawer: Self = this.set("drawer", js.undefined)
    @scala.inline
    def setMobileStepper(value: Double): Self = this.set("mobileStepper", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMobileStepper: Self = this.set("mobileStepper", js.undefined)
    @scala.inline
    def setModal(value: Double): Self = this.set("modal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModal: Self = this.set("modal", js.undefined)
    @scala.inline
    def setSnackbar(value: Double): Self = this.set("snackbar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnackbar: Self = this.set("snackbar", js.undefined)
    @scala.inline
    def setTooltip(value: Double): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
  }
  
}

