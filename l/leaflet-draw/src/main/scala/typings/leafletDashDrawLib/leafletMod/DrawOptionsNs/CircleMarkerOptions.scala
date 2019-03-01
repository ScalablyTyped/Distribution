package typings
package leafletDashDrawLib.leafletMod.DrawOptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CircleMarkerOptions extends js.Object {
  /**
  			 * Whether you can click the circle marker.
  			 *
  			 * Default value: true
  			 */
  var clickable: js.UndefOr[scala.Boolean] = js.undefined
  /**
  			 * The stroke color of the circle marker.
  			 *
  			 * Default value: '#3388ff'
  			 */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /**
  			 * Whether to fill the circle marker with color.
  			 *
  			 * Default value: true
  			 */
  var fill: js.UndefOr[scala.Boolean] = js.undefined
  /**
  			 * The fill color of the circle marker. Defaults to the value of the color option.
  			 *
  			 * Default value: null
  			 */
  var fillColor: js.UndefOr[java.lang.String] = js.undefined
  /**
  			 * The opacity of the circle marker.
  			 *
  			 * Default value: 0.2
  			 */
  var fillOpacity: js.UndefOr[scala.Double] = js.undefined
  /**
  			 * The stroke opacity of the circle marker.
  			 *
  			 * Default value: 0.5
  			 */
  var opacity: js.UndefOr[scala.Double] = js.undefined
  /**
  			 * Whether to draw stroke around the circle marker.
  			 *
  			 * Default value: true
  			 */
  var stroke: js.UndefOr[scala.Boolean] = js.undefined
  /**
  			 * The stroke width in pixels of the circle marker.
  			 *
  			 * Default value: 4
  			 */
  var weight: js.UndefOr[scala.Double] = js.undefined
  /**
  			 * This should be a high number to ensure that you can draw over all other layers on the map.
  			 *
  			 * Default value: 2000
  			 */
  var zIndexOffset: js.UndefOr[scala.Double] = js.undefined
}

object CircleMarkerOptions {
  @scala.inline
  def apply(
    clickable: js.UndefOr[scala.Boolean] = js.undefined,
    color: java.lang.String = null,
    fill: js.UndefOr[scala.Boolean] = js.undefined,
    fillColor: java.lang.String = null,
    fillOpacity: scala.Int | scala.Double = null,
    opacity: scala.Int | scala.Double = null,
    stroke: js.UndefOr[scala.Boolean] = js.undefined,
    weight: scala.Int | scala.Double = null,
    zIndexOffset: scala.Int | scala.Double = null
  ): CircleMarkerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clickable)) __obj.updateDynamic("clickable")(clickable)
    if (color != null) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill)
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor)
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (!js.isUndefined(stroke)) __obj.updateDynamic("stroke")(stroke)
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    if (zIndexOffset != null) __obj.updateDynamic("zIndexOffset")(zIndexOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[CircleMarkerOptions]
  }
}

