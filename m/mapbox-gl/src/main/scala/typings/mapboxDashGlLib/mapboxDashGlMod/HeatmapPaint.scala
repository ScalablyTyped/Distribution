package typings
package mapboxDashGlLib.mapboxDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeatmapPaint extends js.Object {
  var `heatmap-color`: js.UndefOr[java.lang.String | StyleFunction | Expression] = js.undefined
  var `heatmap-intensity`: js.UndefOr[scala.Double | StyleFunction | Expression] = js.undefined
  var `heatmap-intensity-transition`: js.UndefOr[Transition] = js.undefined
  var `heatmap-opacity`: js.UndefOr[scala.Double | StyleFunction | Expression] = js.undefined
  var `heatmap-opacity-transition`: js.UndefOr[Transition] = js.undefined
  var `heatmap-radius`: js.UndefOr[scala.Double | StyleFunction | Expression] = js.undefined
  var `heatmap-radius-transition`: js.UndefOr[Transition] = js.undefined
  var `heatmap-weight`: js.UndefOr[scala.Double | StyleFunction | Expression] = js.undefined
}

object HeatmapPaint {
  @scala.inline
  def apply(
    `heatmap-color`: java.lang.String | StyleFunction | Expression = null,
    `heatmap-intensity`: scala.Double | StyleFunction | Expression = null,
    `heatmap-intensity-transition`: Transition = null,
    `heatmap-opacity`: scala.Double | StyleFunction | Expression = null,
    `heatmap-opacity-transition`: Transition = null,
    `heatmap-radius`: scala.Double | StyleFunction | Expression = null,
    `heatmap-radius-transition`: Transition = null,
    `heatmap-weight`: scala.Double | StyleFunction | Expression = null
  ): HeatmapPaint = {
    val __obj = js.Dynamic.literal()
    if (`heatmap-color` != null) __obj.updateDynamic("heatmap-color")(`heatmap-color`.asInstanceOf[js.Any])
    if (`heatmap-intensity` != null) __obj.updateDynamic("heatmap-intensity")(`heatmap-intensity`.asInstanceOf[js.Any])
    if (`heatmap-intensity-transition` != null) __obj.updateDynamic("heatmap-intensity-transition")(`heatmap-intensity-transition`)
    if (`heatmap-opacity` != null) __obj.updateDynamic("heatmap-opacity")(`heatmap-opacity`.asInstanceOf[js.Any])
    if (`heatmap-opacity-transition` != null) __obj.updateDynamic("heatmap-opacity-transition")(`heatmap-opacity-transition`)
    if (`heatmap-radius` != null) __obj.updateDynamic("heatmap-radius")(`heatmap-radius`.asInstanceOf[js.Any])
    if (`heatmap-radius-transition` != null) __obj.updateDynamic("heatmap-radius-transition")(`heatmap-radius-transition`)
    if (`heatmap-weight` != null) __obj.updateDynamic("heatmap-weight")(`heatmap-weight`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeatmapPaint]
  }
}

