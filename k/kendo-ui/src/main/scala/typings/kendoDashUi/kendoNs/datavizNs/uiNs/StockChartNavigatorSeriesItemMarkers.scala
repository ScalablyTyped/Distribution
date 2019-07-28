package typings.kendoDashUi.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockChartNavigatorSeriesItemMarkers extends js.Object {
  var background: js.UndefOr[String] = js.undefined
  var border: js.UndefOr[StockChartNavigatorSeriesItemMarkersBorder] = js.undefined
  var rotation: js.UndefOr[Double | js.Function] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object StockChartNavigatorSeriesItemMarkers {
  @scala.inline
  def apply(
    background: String = null,
    border: StockChartNavigatorSeriesItemMarkersBorder = null,
    rotation: Double | js.Function = null,
    size: Int | Double = null,
    `type`: String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): StockChartNavigatorSeriesItemMarkers = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background)
    if (border != null) __obj.updateDynamic("border")(border)
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[StockChartNavigatorSeriesItemMarkers]
  }
}

