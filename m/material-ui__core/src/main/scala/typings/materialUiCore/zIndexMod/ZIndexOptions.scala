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
  def apply(
    appBar: js.UndefOr[Double] = js.undefined,
    drawer: js.UndefOr[Double] = js.undefined,
    mobileStepper: js.UndefOr[Double] = js.undefined,
    modal: js.UndefOr[Double] = js.undefined,
    snackbar: js.UndefOr[Double] = js.undefined,
    tooltip: js.UndefOr[Double] = js.undefined
  ): ZIndexOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(appBar)) __obj.updateDynamic("appBar")(appBar.get.asInstanceOf[js.Any])
    if (!js.isUndefined(drawer)) __obj.updateDynamic("drawer")(drawer.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mobileStepper)) __obj.updateDynamic("mobileStepper")(mobileStepper.get.asInstanceOf[js.Any])
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal.get.asInstanceOf[js.Any])
    if (!js.isUndefined(snackbar)) __obj.updateDynamic("snackbar")(snackbar.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tooltip)) __obj.updateDynamic("tooltip")(tooltip.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZIndexOptions]
  }
}

