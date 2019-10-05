package typings.kendoDashUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SparklineSeriesItemBorder extends js.Object {
  var color: js.UndefOr[String | js.Function] = js.undefined
  var dashType: js.UndefOr[String | js.Function] = js.undefined
  var opacity: js.UndefOr[Double | js.Function] = js.undefined
  var width: js.UndefOr[Double | js.Function] = js.undefined
}

object SparklineSeriesItemBorder {
  @scala.inline
  def apply(
    color: String | js.Function = null,
    dashType: String | js.Function = null,
    opacity: Double | js.Function = null,
    width: Double | js.Function = null
  ): SparklineSeriesItemBorder = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dashType != null) __obj.updateDynamic("dashType")(dashType.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparklineSeriesItemBorder]
  }
}

