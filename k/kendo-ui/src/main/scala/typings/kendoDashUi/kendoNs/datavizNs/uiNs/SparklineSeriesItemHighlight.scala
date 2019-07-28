package typings.kendoDashUi.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SparklineSeriesItemHighlight extends js.Object {
  var border: js.UndefOr[SparklineSeriesItemHighlightBorder] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object SparklineSeriesItemHighlight {
  @scala.inline
  def apply(
    border: SparklineSeriesItemHighlightBorder = null,
    color: String = null,
    opacity: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): SparklineSeriesItemHighlight = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border)
    if (color != null) __obj.updateDynamic("color")(color)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[SparklineSeriesItemHighlight]
  }
}

