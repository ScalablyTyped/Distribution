package typings.kendoDashUi.kendoNs.mobileNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionSheetPopup extends js.Object {
  var direction: js.UndefOr[Double | String] = js.undefined
  var height: js.UndefOr[Double | String] = js.undefined
  var width: js.UndefOr[Double | String] = js.undefined
}

object ActionSheetPopup {
  @scala.inline
  def apply(direction: Double | String = null, height: Double | String = null, width: Double | String = null): ActionSheetPopup = {
    val __obj = js.Dynamic.literal()
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionSheetPopup]
  }
}

