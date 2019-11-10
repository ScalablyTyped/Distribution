package typings.grommet

import typings.grommet.themesBaseMod.ExtendType
import typings.grommet.utilsMod.BackgroundType
import typings.grommet.utilsMod.PadType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BackgroundBorderExtend extends js.Object {
  var background: js.UndefOr[BackgroundType] = js.undefined
  var border: js.UndefOr[String | Anon_ColorSideSize] = js.undefined
  var extend: js.UndefOr[ExtendType] = js.undefined
  var pad: js.UndefOr[PadType] = js.undefined
}

object Anon_BackgroundBorderExtend {
  @scala.inline
  def apply(
    background: BackgroundType = null,
    border: String | Anon_ColorSideSize = null,
    extend: ExtendType = null,
    pad: PadType = null
  ): Anon_BackgroundBorderExtend = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (pad != null) __obj.updateDynamic("pad")(pad.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BackgroundBorderExtend]
  }
}

