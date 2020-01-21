package typings.grommet

import typings.grommet.listMod.BorderType
import typings.grommet.listMod.PadType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBackgroundBorder extends js.Object {
  var background: js.UndefOr[String] = js.undefined
  var border: js.UndefOr[BorderType] = js.undefined
  var pad: js.UndefOr[PadType] = js.undefined
}

object AnonBackgroundBorder {
  @scala.inline
  def apply(background: String = null, border: BorderType = null, pad: PadType = null): AnonBackgroundBorder = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (pad != null) __obj.updateDynamic("pad")(pad.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBackgroundBorder]
  }
}

