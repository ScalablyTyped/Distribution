package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockChartSeriesItemMarkers extends js.Object {
  var background: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var border: js.UndefOr[js.Function | StockChartSeriesItemMarkersBorder] = js.undefined
  var rotation: js.UndefOr[scala.Double | js.Function] = js.undefined
  var size: js.UndefOr[scala.Double | js.Function] = js.undefined
  var `type`: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var visible: js.UndefOr[scala.Boolean | js.Function] = js.undefined
}

object StockChartSeriesItemMarkers {
  @scala.inline
  def apply(
    background: java.lang.String | js.Function = null,
    border: js.Function | StockChartSeriesItemMarkersBorder = null,
    rotation: scala.Double | js.Function = null,
    size: scala.Double | js.Function = null,
    `type`: java.lang.String | js.Function = null,
    visible: scala.Boolean | js.Function = null
  ): StockChartSeriesItemMarkers = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (visible != null) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[StockChartSeriesItemMarkers]
  }
}

