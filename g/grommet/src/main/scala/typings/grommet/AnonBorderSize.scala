package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBorderSize extends js.Object {
  var borderSize: js.UndefOr[AnonLarge] = js.undefined
  var edgeSize: js.UndefOr[AnonHair] = js.undefined
  var size: js.UndefOr[AnonFull] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object AnonBorderSize {
  @scala.inline
  def apply(
    borderSize: AnonLarge = null,
    edgeSize: AnonHair = null,
    size: AnonFull = null,
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

