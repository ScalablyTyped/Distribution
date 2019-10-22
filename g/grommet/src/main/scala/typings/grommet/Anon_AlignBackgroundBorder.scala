package typings.grommet

import typings.grommet.themesBaseMod.ExtendType
import typings.grommet.utilsMod.BackgroundType
import typings.grommet.utilsMod.PadType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AlignBackgroundBorder extends js.Object {
  var align: js.UndefOr[String] = js.undefined
  var background: js.UndefOr[BackgroundType] = js.undefined
  var border: js.UndefOr[String] = js.undefined
  var extend: js.UndefOr[ExtendType] = js.undefined
  var pad: js.UndefOr[PadType] = js.undefined
}

object Anon_AlignBackgroundBorder {
  @scala.inline
  def apply(
    align: String = null,
    background: BackgroundType = null,
    border: String = null,
    extend: ExtendType = null,
    pad: PadType = null
  ): Anon_AlignBackgroundBorder = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border)
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (pad != null) __obj.updateDynamic("pad")(pad.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AlignBackgroundBorder]
  }
}

