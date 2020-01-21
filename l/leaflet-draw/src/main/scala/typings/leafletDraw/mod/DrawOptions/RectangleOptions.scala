package typings.leafletDraw.mod.DrawOptions

import typings.leaflet.mod.PathOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RectangleOptions extends SimpleShapeOptions {
  /**
    * Whether to use the metric measurement system or imperial
    *
    * @default true
    */
  var metric: js.UndefOr[Boolean] = js.undefined
  /**
    * The options used when drawing the rectangle on the map.
    *
    * @default {stroke: true, weight: 4, opacity: 0.5, fill: true, fillColor: null, fillOpacity: 0.2, showArea: true, clickable: true }
    */
  var shapeOptions: js.UndefOr[PathOptions] = js.undefined
}

object RectangleOptions {
  @scala.inline
  def apply(
    metric: js.UndefOr[Boolean] = js.undefined,
    repeatMode: js.UndefOr[Boolean] = js.undefined,
    shapeOptions: PathOptions = null
  ): RectangleOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(metric)) __obj.updateDynamic("metric")(metric.asInstanceOf[js.Any])
    if (!js.isUndefined(repeatMode)) __obj.updateDynamic("repeatMode")(repeatMode.asInstanceOf[js.Any])
    if (shapeOptions != null) __obj.updateDynamic("shapeOptions")(shapeOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[RectangleOptions]
  }
}

