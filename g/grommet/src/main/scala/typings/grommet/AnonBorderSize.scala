package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBorderSize extends js.Object {
  var borderSize: js.UndefOr[AnonLargeMedium] = js.undefined
  var edgeSize: js.UndefOr[AnonHair] = js.undefined
  var size: js.UndefOr[AnonFullLarge] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object AnonBorderSize {
  @scala.inline
  def apply(
    borderSize: AnonLargeMedium = null,
    edgeSize: AnonHair = null,
    size: AnonFullLarge = null,
    value: Int | Double = null
  ): AnonBorderSize = {
    val __obj = js.Dynamic.literal()
    if (borderSize != null) __obj.updateDynamic("borderSize")(borderSize.asInstanceOf[js.Any])
    if (edgeSize != null) __obj.updateDynamic("edgeSize")(edgeSize.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBorderSize]
  }
}

