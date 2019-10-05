package typings.kendoDashUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartCategoryAxisItemLabelsRotation extends js.Object {
  var align: js.UndefOr[String] = js.undefined
  var angle: js.UndefOr[Double | String] = js.undefined
}

object ChartCategoryAxisItemLabelsRotation {
  @scala.inline
  def apply(align: String = null, angle: Double | String = null): ChartCategoryAxisItemLabelsRotation = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartCategoryAxisItemLabelsRotation]
  }
}

