package typings.grommet

import typings.grommet.utilsMod.BackgroundType
import typings.grommet.utilsMod.PadType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBackgroundBorderFill extends js.Object {
  var background: js.UndefOr[BackgroundType] = js.undefined
  var border: js.UndefOr[AnonSide] = js.undefined
  var fill: js.UndefOr[String] = js.undefined
  var pad: js.UndefOr[PadType] = js.undefined
}

object AnonBackgroundBorderFill {
  @scala.inline
  def apply(
    background: BackgroundType = null,
    border: AnonSide = null,
    fill: String = null,
    pad: PadType = null
  ): AnonBackgroundBorderFill = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (pad != null) __obj.updateDynamic("pad")(pad.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBackgroundBorderFill]
  }
}

