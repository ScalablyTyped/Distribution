package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SparklineSeriesItemTargetBorder extends js.Object {
  var color: js.UndefOr[String | js.Function] = js.undefined
  var dashType: js.UndefOr[String | js.Function] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object SparklineSeriesItemTargetBorder {
  @scala.inline
  def apply(
    color: String | js.Function = null,
    dashType: String | js.Function = null,
    width: js.UndefOr[Double] = js.undefined
  ): SparklineSeriesItemTargetBorder = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dashType != null) __obj.updateDynamic("dashType")(dashType.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparklineSeriesItemTargetBorder]
  }
}

