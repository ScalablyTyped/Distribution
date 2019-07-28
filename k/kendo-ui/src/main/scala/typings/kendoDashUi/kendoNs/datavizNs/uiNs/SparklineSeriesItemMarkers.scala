package typings.kendoDashUi.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SparklineSeriesItemMarkers extends js.Object {
  var background: js.UndefOr[String | js.Function] = js.undefined
  var border: js.UndefOr[js.Function | SparklineSeriesItemMarkersBorder] = js.undefined
  var rotation: js.UndefOr[Double | js.Function] = js.undefined
  var size: js.UndefOr[Double | js.Function] = js.undefined
  var `type`: js.UndefOr[String | js.Function] = js.undefined
  var visible: js.UndefOr[Boolean | js.Function] = js.undefined
}

object SparklineSeriesItemMarkers {
  @scala.inline
  def apply(
    background: String | js.Function = null,
    border: js.Function | SparklineSeriesItemMarkersBorder = null,
    rotation: Double | js.Function = null,
    size: Double | js.Function = null,
    `type`: String | js.Function = null,
    visible: Boolean | js.Function = null
  ): SparklineSeriesItemMarkers = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (visible != null) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparklineSeriesItemMarkers]
  }
}

