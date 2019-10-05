package typings.kendoDashUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartSeriesItemNegativeValues extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object ChartSeriesItemNegativeValues {
  @scala.inline
  def apply(color: String = null, visible: js.UndefOr[Boolean] = js.undefined): ChartSeriesItemNegativeValues = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[ChartSeriesItemNegativeValues]
  }
}

