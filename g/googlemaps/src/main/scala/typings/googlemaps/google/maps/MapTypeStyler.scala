package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapTypeStyler extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var gamma: js.UndefOr[Double] = js.undefined
  var hue: js.UndefOr[String] = js.undefined
  var invert_lightness: js.UndefOr[Boolean] = js.undefined
  var lightness: js.UndefOr[Double] = js.undefined
  var saturation: js.UndefOr[Double] = js.undefined
  var visibility: js.UndefOr[String] = js.undefined
  var weight: js.UndefOr[Double] = js.undefined
}

object MapTypeStyler {
  @scala.inline
  def apply(
    color: String = null,
    gamma: js.UndefOr[Double] = js.undefined,
    hue: String = null,
    invert_lightness: js.UndefOr[Boolean] = js.undefined,
    lightness: js.UndefOr[Double] = js.undefined,
    saturation: js.UndefOr[Double] = js.undefined,
    visibility: String = null,
    weight: js.UndefOr[Double] = js.undefined
  ): MapTypeStyler = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(gamma)) __obj.updateDynamic("gamma")(gamma.get.asInstanceOf[js.Any])
    if (hue != null) __obj.updateDynamic("hue")(hue.asInstanceOf[js.Any])
    if (!js.isUndefined(invert_lightness)) __obj.updateDynamic("invert_lightness")(invert_lightness.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lightness)) __obj.updateDynamic("lightness")(lightness.get.asInstanceOf[js.Any])
    if (!js.isUndefined(saturation)) __obj.updateDynamic("saturation")(saturation.get.asInstanceOf[js.Any])
    if (visibility != null) __obj.updateDynamic("visibility")(visibility.asInstanceOf[js.Any])
    if (!js.isUndefined(weight)) __obj.updateDynamic("weight")(weight.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapTypeStyler]
  }
}

