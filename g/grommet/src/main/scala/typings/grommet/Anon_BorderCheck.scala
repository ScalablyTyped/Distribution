package typings.grommet

import typings.grommet.themesBaseMod.ExtendType
import typings.grommet.utilsMod.ColorType
import typings.grommet.utilsMod.GapType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BorderCheck extends js.Object {
  var border: js.UndefOr[Anon_ColorWidth] = js.undefined
  var check: js.UndefOr[Anon_ExtendRadius] = js.undefined
  var color: js.UndefOr[ColorType] = js.undefined
  var extend: js.UndefOr[ExtendType] = js.undefined
  var gap: js.UndefOr[GapType] = js.undefined
  var hover: js.UndefOr[Anon_BorderAnonColorColorType] = js.undefined
  var icon: js.UndefOr[Anon_ExtendSize] = js.undefined
  var icons: js.UndefOr[Anon_Checked] = js.undefined
  var size: js.UndefOr[String] = js.undefined
  var toggle: js.UndefOr[Anon_BackgroundColorExtend] = js.undefined
}

object Anon_BorderCheck {
  @scala.inline
  def apply(
    border: Anon_ColorWidth = null,
    check: Anon_ExtendRadius = null,
    color: ColorType = null,
    extend: ExtendType = null,
    gap: GapType = null,
    hover: Anon_BorderAnonColorColorType = null,
    icon: Anon_ExtendSize = null,
    icons: Anon_Checked = null,
    size: String = null,
    toggle: Anon_BackgroundColorExtend = null
  ): Anon_BorderCheck = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border)
    if (check != null) __obj.updateDynamic("check")(check)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (gap != null) __obj.updateDynamic("gap")(gap.asInstanceOf[js.Any])
    if (hover != null) __obj.updateDynamic("hover")(hover)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (icons != null) __obj.updateDynamic("icons")(icons)
    if (size != null) __obj.updateDynamic("size")(size)
    if (toggle != null) __obj.updateDynamic("toggle")(toggle)
    __obj.asInstanceOf[Anon_BorderCheck]
  }
}

