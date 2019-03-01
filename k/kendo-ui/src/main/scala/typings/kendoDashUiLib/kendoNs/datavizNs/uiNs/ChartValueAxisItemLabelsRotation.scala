package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartValueAxisItemLabelsRotation extends js.Object {
  var align: js.UndefOr[java.lang.String] = js.undefined
  var angle: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object ChartValueAxisItemLabelsRotation {
  @scala.inline
  def apply(align: java.lang.String = null, angle: scala.Double | java.lang.String = null): ChartValueAxisItemLabelsRotation = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartValueAxisItemLabelsRotation]
  }
}

