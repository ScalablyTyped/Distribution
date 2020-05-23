package typings.leafletHeat.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeatMapOptions extends js.Object {
  var blur: js.UndefOr[Double] = js.undefined
  var gradient: js.UndefOr[ColorGradientConfig] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var maxZoom: js.UndefOr[Double] = js.undefined
  var minOpacity: js.UndefOr[Double] = js.undefined
  var radius: js.UndefOr[Double] = js.undefined
}

object HeatMapOptions {
  @scala.inline
  def apply(
    blur: js.UndefOr[Double] = js.undefined,
    gradient: ColorGradientConfig = null,
    max: js.UndefOr[Double] = js.undefined,
    maxZoom: js.UndefOr[Double] = js.undefined,
    minOpacity: js.UndefOr[Double] = js.undefined,
    radius: js.UndefOr[Double] = js.undefined
  ): HeatMapOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(blur)) __obj.updateDynamic("blur")(blur.get.asInstanceOf[js.Any])
    if (gradient != null) __obj.updateDynamic("gradient")(gradient.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxZoom)) __obj.updateDynamic("maxZoom")(maxZoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minOpacity)) __obj.updateDynamic("minOpacity")(minOpacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(radius)) __obj.updateDynamic("radius")(radius.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeatMapOptions]
  }
}

