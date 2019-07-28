package typings.kendoDashUi.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartXAxisItemLabelsRotation extends js.Object {
  var align: js.UndefOr[String] = js.undefined
  var angle: js.UndefOr[Double | String] = js.undefined
}

object ChartXAxisItemLabelsRotation {
  @scala.inline
  def apply(align: String = null, angle: Double | String = null): ChartXAxisItemLabelsRotation = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartXAxisItemLabelsRotation]
  }
}

