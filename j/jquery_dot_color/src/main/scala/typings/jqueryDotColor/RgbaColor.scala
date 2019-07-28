package typings.jqueryDotColor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RgbaColor extends js.Object {
  var alpha: js.UndefOr[Double] = js.undefined
  var blue: js.UndefOr[Double] = js.undefined
  var green: js.UndefOr[Double] = js.undefined
  var red: js.UndefOr[Double] = js.undefined
}

object RgbaColor {
  @scala.inline
  def apply(
    alpha: Int | Double = null,
    blue: Int | Double = null,
    green: Int | Double = null,
    red: Int | Double = null
  ): RgbaColor = {
    val __obj = js.Dynamic.literal()
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (blue != null) __obj.updateDynamic("blue")(blue.asInstanceOf[js.Any])
    if (green != null) __obj.updateDynamic("green")(green.asInstanceOf[js.Any])
    if (red != null) __obj.updateDynamic("red")(red.asInstanceOf[js.Any])
    __obj.asInstanceOf[RgbaColor]
  }
}

