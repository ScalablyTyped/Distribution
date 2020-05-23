package typings.leaflet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridLayerOptions extends js.Object {
  var attribution: js.UndefOr[String] = js.undefined
  var bounds: js.UndefOr[LatLngBoundsExpression] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var keepBuffer: js.UndefOr[Double] = js.undefined
  var maxZoom: js.UndefOr[Double] = js.undefined
  var minZoom: js.UndefOr[Double] = js.undefined
  var noWrap: js.UndefOr[Boolean] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var pane: js.UndefOr[String] = js.undefined
  var tileSize: js.UndefOr[Double | Point_] = js.undefined
  var updateInterval: js.UndefOr[Double] = js.undefined
  var updateWhenIdle: js.UndefOr[Boolean] = js.undefined
  var updateWhenZooming: js.UndefOr[Boolean] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object GridLayerOptions {
  @scala.inline
  def apply(
    attribution: String = null,
    bounds: LatLngBoundsExpression = null,
    className: String = null,
    keepBuffer: js.UndefOr[Double] = js.undefined,
    maxZoom: js.UndefOr[Double] = js.undefined,
    minZoom: js.UndefOr[Double] = js.undefined,
    noWrap: js.UndefOr[Boolean] = js.undefined,
    opacity: js.UndefOr[Double] = js.undefined,
    pane: String = null,
    tileSize: Double | Point_ = null,
    updateInterval: js.UndefOr[Double] = js.undefined,
    updateWhenIdle: js.UndefOr[Boolean] = js.undefined,
    updateWhenZooming: js.UndefOr[Boolean] = js.undefined,
    zIndex: js.UndefOr[Double] = js.undefined
  ): GridLayerOptions = {
    val __obj = js.Dynamic.literal()
    if (attribution != null) __obj.updateDynamic("attribution")(attribution.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(keepBuffer)) __obj.updateDynamic("keepBuffer")(keepBuffer.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxZoom)) __obj.updateDynamic("maxZoom")(maxZoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minZoom)) __obj.updateDynamic("minZoom")(minZoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noWrap)) __obj.updateDynamic("noWrap")(noWrap.get.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (pane != null) __obj.updateDynamic("pane")(pane.asInstanceOf[js.Any])
    if (tileSize != null) __obj.updateDynamic("tileSize")(tileSize.asInstanceOf[js.Any])
    if (!js.isUndefined(updateInterval)) __obj.updateDynamic("updateInterval")(updateInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(updateWhenIdle)) __obj.updateDynamic("updateWhenIdle")(updateWhenIdle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(updateWhenZooming)) __obj.updateDynamic("updateWhenZooming")(updateWhenZooming.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridLayerOptions]
  }
}

