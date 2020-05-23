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
    alpha: js.UndefOr[Double] = js.undefined,
    hue: js.UndefOr[Double] = js.undefined,
    lightness: js.UndefOr[Double] = js.undefined,
    saturation: js.UndefOr[Double] = js.undefined
  ): HslaColor = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alpha)) __obj.updateDynamic("alpha")(alpha.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hue)) __obj.updateDynamic("hue")(hue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lightness)) __obj.updateDynamic("lightness")(lightness.get.asInstanceOf[js.Any])
    if (!js.isUndefined(saturation)) __obj.updateDynamic("saturation")(saturation.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HslaColor]
  }
}

