package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BorderPad extends js.Object {
  var border: js.UndefOr[RadiusString] = js.undefined
  var pad: js.UndefOr[HorizontalVertical] = js.undefined
}

object BorderPad {
  @scala.inline
  def apply(border: RadiusString = null, pad: HorizontalVertical = null): BorderPad = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (pad != null) __obj.updateDynamic("pad")(pad.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderPad]
  }
}

