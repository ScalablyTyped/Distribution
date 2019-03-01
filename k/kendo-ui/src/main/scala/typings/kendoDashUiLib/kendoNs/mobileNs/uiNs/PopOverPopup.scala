package typings
package kendoDashUiLib.kendoNs.mobileNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopOverPopup extends js.Object {
  var height: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var width: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object PopOverPopup {
  @scala.inline
  def apply(height: scala.Double | java.lang.String = null, width: scala.Double | java.lang.String = null): PopOverPopup = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopOverPopup]
  }
}

