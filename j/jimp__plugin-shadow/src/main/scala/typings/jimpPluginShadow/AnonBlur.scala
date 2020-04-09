package typings.jimpPluginShadow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBlur extends js.Object {
  var blur: Double
  var opacity: js.UndefOr[Double] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var x: js.UndefOr[Double] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
}

object AnonBlur {
  @scala.inline
  def apply(
    blur: Double,
    opacity: Int | Double = null,
    size: Int | Double = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): AnonBlur = {
    val __obj = js.Dynamic.literal(blur = blur.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBlur]
  }
}

