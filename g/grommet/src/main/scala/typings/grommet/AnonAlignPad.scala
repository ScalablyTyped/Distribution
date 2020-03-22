package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlignPad extends js.Object {
  var align: js.UndefOr[String] = js.undefined
  var pad: js.UndefOr[String] = js.undefined
}

object AnonAlignPad {
  @scala.inline
  def apply(align: String = null, pad: String = null): AnonAlignPad = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (pad != null) __obj.updateDynamic("pad")(pad.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAlignPad]
  }
}

