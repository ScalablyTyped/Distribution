package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapTypeStyler extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var gamma: js.UndefOr[scala.Double] = js.undefined
  var hue: js.UndefOr[java.lang.String] = js.undefined
  var invert_lightness: js.UndefOr[scala.Boolean] = js.undefined
  var lightness: js.UndefOr[scala.Double] = js.undefined
  var saturation: js.UndefOr[scala.Double] = js.undefined
  var visibility: js.UndefOr[java.lang.String] = js.undefined
  var weight: js.UndefOr[scala.Double] = js.undefined
}

object MapTypeStyler {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    gamma: scala.Int | scala.Double = null,
    hue: java.lang.String = null,
    invert_lightness: js.UndefOr[scala.Boolean] = js.undefined,
    lightness: scala.Int | scala.Double = null,
    saturation: scala.Int | scala.Double = null,
    visibility: java.lang.String = null,
    weight: scala.Int | scala.Double = null
  ): MapTypeStyler = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (gamma != null) __obj.updateDynamic("gamma")(gamma.asInstanceOf[js.Any])
    if (hue != null) __obj.updateDynamic("hue")(hue)
    if (!js.isUndefined(invert_lightness)) __obj.updateDynamic("invert_lightness")(invert_lightness)
    if (lightness != null) __obj.updateDynamic("lightness")(lightness.asInstanceOf[js.Any])
    if (saturation != null) __obj.updateDynamic("saturation")(saturation.asInstanceOf[js.Any])
    if (visibility != null) __obj.updateDynamic("visibility")(visibility)
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapTypeStyler]
  }
}

