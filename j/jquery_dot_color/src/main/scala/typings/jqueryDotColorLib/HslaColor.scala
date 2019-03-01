package typings
package jqueryDotColorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HslaColor extends js.Object {
  var alpha: js.UndefOr[scala.Double] = js.undefined
  var hue: js.UndefOr[scala.Double] = js.undefined
  var lightness: js.UndefOr[scala.Double] = js.undefined
  var saturation: js.UndefOr[scala.Double] = js.undefined
}

object HslaColor {
  @scala.inline
  def apply(
    alpha: scala.Int | scala.Double = null,
    hue: scala.Int | scala.Double = null,
    lightness: scala.Int | scala.Double = null,
    saturation: scala.Int | scala.Double = null
  ): HslaColor = {
    val __obj = js.Dynamic.literal()
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (hue != null) __obj.updateDynamic("hue")(hue.asInstanceOf[js.Any])
    if (lightness != null) __obj.updateDynamic("lightness")(lightness.asInstanceOf[js.Any])
    if (saturation != null) __obj.updateDynamic("saturation")(saturation.asInstanceOf[js.Any])
    __obj.asInstanceOf[HslaColor]
  }
}

