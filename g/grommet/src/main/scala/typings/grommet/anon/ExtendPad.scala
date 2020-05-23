package typings.grommet.anon

import typings.grommet.baseMod.ExtendType
import typings.grommet.utilsMod.BackgroundType
import typings.grommet.utilsMod.PadType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtendPad extends js.Object {
  var background: js.UndefOr[BackgroundType] = js.undefined
  var border: js.UndefOr[String | ColorSideSize] = js.undefined
  var extend: js.UndefOr[ExtendType] = js.undefined
  var pad: js.UndefOr[PadType] = js.undefined
}

object ExtendPad {
  @scala.inline
  def apply(
    background: BackgroundType = null,
    border: String | ColorSideSize = null,
    extend: ExtendType = null,
    pad: PadType = null
  ): ExtendPad = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (pad != null) __obj.updateDynamic("pad")(pad.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendPad]
  }
}

