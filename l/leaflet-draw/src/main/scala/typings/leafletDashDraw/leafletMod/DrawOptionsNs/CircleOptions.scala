package typings.leafletDashDraw.leafletMod.DrawOptionsNs

import typings.leaflet.leafletMod.PathOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CircleOptions extends SimpleShapeOptions {
  /**
    * When not metric, use feet instead of yards for display
    *
    * @default true
    */
  var feet: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to use the metric measurement system or imperial
    *
    * @default true
    */
  var metric: js.UndefOr[Boolean] = js.undefined
  /**
    * When not metric, not feet use nautic mile for display
    *
    * @default false
    */
  var nautic: js.UndefOr[Boolean] = js.undefined
  /**
    * The options used when drawing the circle on the map.
    *
    * @default { stroke: true, color: '#3388ff', weight: 4, opacity: 0.5, fill: true, fillColor: null, fillOpacity: 0.2, clickable: true }
    */
  var shapeOptions: js.UndefOr[PathOptions] = js.undefined
  /**
    * Whether to show the radius in the tooltip
    *
    * @default true
    */
  var showRadius: js.UndefOr[Boolean] = js.undefined
}

object CircleOptions {
  @scala.inline
  def apply(
    feet: js.UndefOr[Boolean] = js.undefined,
    metric: js.UndefOr[Boolean] = js.undefined,
    nautic: js.UndefOr[Boolean] = js.undefined,
    repeatMode: js.UndefOr[Boolean] = js.undefined,
    shapeOptions: PathOptions = null,
    showRadius: js.UndefOr[Boolean] = js.undefined
  ): CircleOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(feet)) __obj.updateDynamic("feet")(feet)
    if (!js.isUndefined(metric)) __obj.updateDynamic("metric")(metric)
    if (!js.isUndefined(nautic)) __obj.updateDynamic("nautic")(nautic)
    if (!js.isUndefined(repeatMode)) __obj.updateDynamic("repeatMode")(repeatMode)
    if (shapeOptions != null) __obj.updateDynamic("shapeOptions")(shapeOptions)
    if (!js.isUndefined(showRadius)) __obj.updateDynamic("showRadius")(showRadius)
    __obj.asInstanceOf[CircleOptions]
  }
}

