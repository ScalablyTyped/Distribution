package typings.grommet

import typings.grommet.baseMod.ExtendType
import typings.grommet.utilsMod.BackgroundType
import typings.grommet.utilsMod.PadType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlignBackground extends js.Object {
  var align: js.UndefOr[String] = js.undefined
  var background: js.UndefOr[BackgroundType] = js.undefined
  var border: js.UndefOr[String] = js.undefined
  var extend: js.UndefOr[ExtendType] = js.undefined
  var pad: js.UndefOr[PadType] = js.undefined
}

object AnonAlignBackground {
  @scala.inline
  def apply(
    align: String = null,
    background: BackgroundType = null,
    border: String = null,
    extend: ExtendType = null,
    pad: PadType = null
  ): AnonAlignBackground = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (pad != null) __obj.updateDynamic("pad")(pad.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAlignBackground]
  }
}

