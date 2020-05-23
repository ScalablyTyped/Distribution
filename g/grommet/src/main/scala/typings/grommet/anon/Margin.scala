package typings.grommet.anon

import typings.grommet.baseMod.ExtendType
import typings.grommet.utilsMod.BackgroundType
import typings.grommet.utilsMod.ColorType
import typings.grommet.utilsMod.MarginType
import typings.grommet.utilsMod.PadType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Margin extends js.Object {
  var active: js.UndefOr[BackgroundBackgroundType] = js.undefined
  var background: js.UndefOr[BackgroundType] = js.undefined
  var border: js.UndefOr[Hover] = js.undefined
  var color: js.UndefOr[ColorType] = js.undefined
  var extend: js.UndefOr[ExtendType] = js.undefined
  var hover: js.UndefOr[BackgroundColorExtend] = js.undefined
  var margin: js.UndefOr[MarginType] = js.undefined
  var pad: js.UndefOr[PadType] = js.undefined
}

object Margin {
  @scala.inline
  def apply(
    active: BackgroundBackgroundType = null,
    background: BackgroundType = null,
    border: Hover = null,
    color: ColorType = null,
    extend: ExtendType = null,
    hover: BackgroundColorExtend = null,
    margin: MarginType = null,
    pad: PadType = null
  ): Margin = {
    val __obj = js.Dynamic.literal()
    if (active != null) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (pad != null) __obj.updateDynamic("pad")(pad.asInstanceOf[js.Any])
    __obj.asInstanceOf[Margin]
  }
}

