package typings.kendoDashUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartSeriesItemMarkers extends js.Object {
  var background: js.UndefOr[String | js.Function] = js.undefined
  var border: js.UndefOr[js.Function | ChartSeriesItemMarkersBorder] = js.undefined
  var from: js.UndefOr[ChartSeriesItemMarkersFrom] = js.undefined
  var rotation: js.UndefOr[Double | js.Function] = js.undefined
  var size: js.UndefOr[Double | js.Function] = js.undefined
  var to: js.UndefOr[ChartSeriesItemMarkersTo] = js.undefined
  var `type`: js.UndefOr[String | js.Function] = js.undefined
  var visible: js.UndefOr[Boolean | js.Function] = js.undefined
  var visual: js.UndefOr[js.Function] = js.undefined
}

object ChartSeriesItemMarkers {
  @scala.inline
  def apply(
    background: String | js.Function = null,
    border: js.Function | ChartSeriesItemMarkersBorder = null,
    from: ChartSeriesItemMarkersFrom = null,
    rotation: Double | js.Function = null,
    size: Double | js.Function = null,
    to: ChartSeriesItemMarkersTo = null,
    `type`: String | js.Function = null,
    visible: Boolean | js.Function = null,
    visual: js.Function = null
  ): ChartSeriesItemMarkers = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from)
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (visible != null) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (visual != null) __obj.updateDynamic("visual")(visual)
    __obj.asInstanceOf[ChartSeriesItemMarkers]
  }
}

