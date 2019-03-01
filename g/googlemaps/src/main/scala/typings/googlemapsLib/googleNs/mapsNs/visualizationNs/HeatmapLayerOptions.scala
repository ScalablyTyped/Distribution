package typings
package googlemapsLib.googleNs.mapsNs.visualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeatmapLayerOptions extends js.Object {
  var data: js.Any
  var dissipating: js.UndefOr[scala.Boolean] = js.undefined
  var gradient: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var map: js.UndefOr[googlemapsLib.googleNs.mapsNs.Map] = js.undefined
  var maxIntensity: js.UndefOr[scala.Double] = js.undefined
  var opacity: js.UndefOr[scala.Double] = js.undefined
  var radius: js.UndefOr[scala.Double] = js.undefined
}

object HeatmapLayerOptions {
  @scala.inline
  def apply(
    data: js.Any,
    dissipating: js.UndefOr[scala.Boolean] = js.undefined,
    gradient: js.Array[java.lang.String] = null,
    map: googlemapsLib.googleNs.mapsNs.Map = null,
    maxIntensity: scala.Int | scala.Double = null,
    opacity: scala.Int | scala.Double = null,
    radius: scala.Int | scala.Double = null
  ): HeatmapLayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    if (!js.isUndefined(dissipating)) __obj.updateDynamic("dissipating")(dissipating)
    if (gradient != null) __obj.updateDynamic("gradient")(gradient)
    if (map != null) __obj.updateDynamic("map")(map)
    if (maxIntensity != null) __obj.updateDynamic("maxIntensity")(maxIntensity.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeatmapLayerOptions]
  }
}

