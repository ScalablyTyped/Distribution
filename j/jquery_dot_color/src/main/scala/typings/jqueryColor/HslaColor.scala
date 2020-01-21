package typings.jqueryColor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HslaColor extends js.Object {
  var alpha: js.UndefOr[Double] = js.undefined
  var hue: js.UndefOr[Double] = js.undefined
  var lightness: js.UndefOr[Double] = js.undefined
  var saturation: js.UndefOr[Double] = js.undefined
}

object HslaColor {
  @scala.inline
  def apply(
    alpha: Int | Double = null,
    hue: Int | Double = null,
    lightness: Int | Double = null,
    saturation: Int | Double = null
  ): HslaColor = {
    val __obj = js.Dynamic.literal()
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (hue != null) __obj.updateDynamic("hue")(hue.asInstanceOf[js.Any])
    if (lightness != null) __obj.updateDynamic("lightness")(lightness.asInstanceOf[js.Any])
    if (saturation != null) __obj.updateDynamic("saturation")(saturation.asInstanceOf[js.Any])
    __obj.asInstanceOf[HslaColor]
  }
}

