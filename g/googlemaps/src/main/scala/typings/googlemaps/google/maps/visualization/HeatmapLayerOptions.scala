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
    maxIntensity: js.UndefOr[Double] = js.undefined,
    opacity: js.UndefOr[Double] = js.undefined,
    radius: js.UndefOr[Double] = js.undefined
  ): HeatmapLayerOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (!js.isUndefined(dissipating)) __obj.updateDynamic("dissipating")(dissipating.get.asInstanceOf[js.Any])
    if (gradient != null) __obj.updateDynamic("gradient")(gradient.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (!js.isUndefined(maxIntensity)) __obj.updateDynamic("maxIntensity")(maxIntensity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(radius)) __obj.updateDynamic("radius")(radius.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeatmapLayerOptions]
  }
}

