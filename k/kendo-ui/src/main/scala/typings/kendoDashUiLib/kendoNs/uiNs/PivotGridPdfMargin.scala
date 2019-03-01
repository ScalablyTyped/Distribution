package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotGridPdfMargin extends js.Object {
  var bottom: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var left: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var right: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var top: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object PivotGridPdfMargin {
  @scala.inline
  def apply(
    bottom: scala.Double | java.lang.String = null,
    left: scala.Double | java.lang.String = null,
    right: scala.Double | java.lang.String = null,
    top: scala.Double | java.lang.String = null
  ): PivotGridPdfMargin = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotGridPdfMargin]
  }
}

