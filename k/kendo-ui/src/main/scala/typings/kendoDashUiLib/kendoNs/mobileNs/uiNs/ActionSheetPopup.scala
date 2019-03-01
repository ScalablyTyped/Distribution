package typings
package kendoDashUiLib.kendoNs.mobileNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionSheetPopup extends js.Object {
  var direction: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var height: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var width: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object ActionSheetPopup {
  @scala.inline
  def apply(
    direction: scala.Double | java.lang.String = null,
    height: scala.Double | java.lang.String = null,
    width: scala.Double | java.lang.String = null
  ): ActionSheetPopup = {
    val __obj = js.Dynamic.literal()
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionSheetPopup]
  }
}

