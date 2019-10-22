package typings.grommet

import typings.grommet.themesBaseMod.ExtendType
import typings.grommet.utilsMod.BackgroundType
import typings.grommet.utilsMod.ColorType
import typings.grommet.utilsMod.MarginType
import typings.grommet.utilsMod.PadType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActiveBackground extends js.Object {
  var active: js.UndefOr[Anon_BackgroundColorBackgroundType] = js.undefined
  var background: js.UndefOr[BackgroundType] = js.undefined
  var border: js.UndefOr[Anon_ActiveColor] = js.undefined
  var color: js.UndefOr[ColorType] = js.undefined
  var extend: js.UndefOr[ExtendType] = js.undefined
  var hover: js.UndefOr[Anon_BackgroundColorExtendBackgroundType] = js.undefined
  var margin: js.UndefOr[MarginType] = js.undefined
  var pad: js.UndefOr[PadType] = js.undefined
}

object Anon_ActiveBackground {
  @scala.inline
  def apply(
    active: Anon_BackgroundColorBackgroundType = null,
    background: BackgroundType = null,
    border: Anon_ActiveColor = null,
    color: ColorType = null,
    extend: ExtendType = null,
    hover: Anon_BackgroundColorExtendBackgroundType = null,
    margin: MarginType = null,
    pad: PadType = null
  ): Anon_ActiveBackground = {
    val __obj = js.Dynamic.literal()
    if (active != null) __obj.updateDynamic("active")(active)
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (hover != null) __obj.updateDynamic("hover")(hover)
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (pad != null) __obj.updateDynamic("pad")(pad.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ActiveBackground]
  }
}

