package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowPosition extends js.Object {
  var left: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var top: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object WindowPosition {
  @scala.inline
  def apply(left: scala.Double | java.lang.String = null, top: scala.Double | java.lang.String = null): WindowPosition = {
    val __obj = js.Dynamic.literal()
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowPosition]
  }
}

