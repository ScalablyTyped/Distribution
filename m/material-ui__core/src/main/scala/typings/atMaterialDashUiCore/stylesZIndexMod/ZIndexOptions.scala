package typings.atMaterialDashUiCore.stylesZIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/zIndex.ZIndex> */
trait ZIndexOptions extends js.Object {
  var appBar: js.UndefOr[Double] = js.undefined
  var drawer: js.UndefOr[Double] = js.undefined
  var mobileStepper: js.UndefOr[Double] = js.undefined
  var modal: js.UndefOr[Double] = js.undefined
  var snackbar: js.UndefOr[Double] = js.undefined
  var tooltip: js.UndefOr[Double] = js.undefined
}

object ZIndexOptions {
  @scala.inline
  def apply(
    appBar: Int | Double = null,
    drawer: Int | Double = null,
    mobileStepper: Int | Double = null,
    modal: Int | Double = null,
    snackbar: Int | Double = null,
    tooltip: Int | Double = null
  ): ZIndexOptions = {
    val __obj = js.Dynamic.literal()
    if (appBar != null) __obj.updateDynamic("appBar")(appBar.asInstanceOf[js.Any])
    if (drawer != null) __obj.updateDynamic("drawer")(drawer.asInstanceOf[js.Any])
    if (mobileStepper != null) __obj.updateDynamic("mobileStepper")(mobileStepper.asInstanceOf[js.Any])
    if (modal != null) __obj.updateDynamic("modal")(modal.asInstanceOf[js.Any])
    if (snackbar != null) __obj.updateDynamic("snackbar")(snackbar.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZIndexOptions]
  }
}

