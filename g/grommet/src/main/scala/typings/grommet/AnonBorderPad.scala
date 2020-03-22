package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBorderPad extends js.Object {
  var border: js.UndefOr[AnonRadiusString] = js.undefined
  var pad: js.UndefOr[AnonVertical] = js.undefined
}

object AnonBorderPad {
  @scala.inline
  def apply(border: AnonRadiusString = null, pad: AnonVertical = null): AnonBorderPad = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (pad != null) __obj.updateDynamic("pad")(pad.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBorderPad]
  }
}

