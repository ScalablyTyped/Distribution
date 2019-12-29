package typings.googlemaps.google.maps.visualization

import typings.googlemaps.google.maps.Map
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeatmapLayerOptions extends js.Object {
  var data: js.Any
  var dissipating: js.UndefOr[Boolean] = js.undefined
  var gradient: js.UndefOr[js.Array[String]] = js.undefined
  var map: js.UndefOr[Map[Element]] = js.undefined
  var maxIntensity: js.UndefOr[Double] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var radius: js.UndefOr[Double] = js.undefined
}

object HeatmapLayerOptions {
  @scala.inline
  def apply(
    data: js.Any,
    dissipating: js.UndefOr[Boolean] = js.undefined,
    gradient: js.Array[String] = null,
    map: Map[Element] = null,
    maxIntensity: Int | Double = null,
    opacity: Int | Double = null,
    radius: Int | Double = null
  ): HeatmapLayerOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (!js.isUndefined(dissipating)) __obj.updateDynamic("dissipating")(dissipating.asInstanceOf[js.Any])
    if (gradient != null) __obj.updateDynamic("gradient")(gradient.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (maxIntensity != null) __obj.updateDynamic("maxIntensity")(maxIntensity.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeatmapLayerOptions]
  }
}

