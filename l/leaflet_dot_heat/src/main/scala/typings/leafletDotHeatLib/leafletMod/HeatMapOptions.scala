package typings
package leafletDotHeatLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeatMapOptions extends js.Object {
  var blur: js.UndefOr[scala.Double] = js.undefined
  var gradient: js.UndefOr[ColorGradientConfig] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  var maxZoom: js.UndefOr[scala.Double] = js.undefined
  var minOpacity: js.UndefOr[scala.Double] = js.undefined
  var radius: js.UndefOr[scala.Double] = js.undefined
}

object HeatMapOptions {
  @scala.inline
  def apply(
    blur: scala.Int | scala.Double = null,
    gradient: ColorGradientConfig = null,
    max: scala.Int | scala.Double = null,
    maxZoom: scala.Int | scala.Double = null,
    minOpacity: scala.Int | scala.Double = null,
    radius: scala.Int | scala.Double = null
  ): HeatMapOptions = {
    val __obj = js.Dynamic.literal()
    if (blur != null) __obj.updateDynamic("blur")(blur.asInstanceOf[js.Any])
    if (gradient != null) __obj.updateDynamic("gradient")(gradient)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (minOpacity != null) __obj.updateDynamic("minOpacity")(minOpacity.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeatMapOptions]
  }
}

