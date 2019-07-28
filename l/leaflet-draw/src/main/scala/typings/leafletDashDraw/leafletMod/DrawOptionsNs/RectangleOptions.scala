package typings.leafletDashDraw.leafletMod.DrawOptionsNs

import typings.leaflet.leafletMod.PathOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RectangleOptions extends SimpleShapeOptions {
  /**
  			 * Whether to use the metric measurement system or imperial
  			 *
  			 * Default value: true
  			 */
  var metric: js.UndefOr[Boolean] = js.undefined
  /**
  			 * The options used when drawing the rectangle on the map.
  			 *
  			 * Default value: See code
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
    if (!js.isUndefined(metric)) __obj.updateDynamic("metric")(metric)
    if (!js.isUndefined(repeatMode)) __obj.updateDynamic("repeatMode")(repeatMode)
    if (shapeOptions != null) __obj.updateDynamic("shapeOptions")(shapeOptions)
    __obj.asInstanceOf[RectangleOptions]
  }
}

