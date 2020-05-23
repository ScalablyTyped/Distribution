package typings.grommet.anon

import typings.grommet.baseMod.ExtendType
import typings.grommet.utilsMod.ColorType
import typings.grommet.utilsMod.GapType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Check extends js.Object {
  var border: js.UndefOr[ColorWidth] = js.undefined
  var check: js.UndefOr[Thickness] = js.undefined
  var color: js.UndefOr[ColorType] = js.undefined
  var extend: js.UndefOr[ExtendType] = js.undefined
  var gap: js.UndefOr[GapType] = js.undefined
  var hover: js.UndefOr[Border0] = js.undefined
  var icon: js.UndefOr[ExtendSize] = js.undefined
  var icons: js.UndefOr[Checked] = js.undefined
  var size: js.UndefOr[String] = js.undefined
  var toggle: js.UndefOr[Knob] = js.undefined
}

object Check {
  @scala.inline
  def apply(
    border: ColorWidth = null,
    check: Thickness = null,
    color: ColorType = null,
    extend: ExtendType = null,
    gap: GapType = null,
    hover: Border0 = null,
    icon: ExtendSize = null,
    icons: Checked = null,
    size: String = null,
    toggle: Knob = null
  ): Check = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (check != null) __obj.updateDynamic("check")(check.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (gap != null) __obj.updateDynamic("gap")(gap.asInstanceOf[js.Any])
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (icons != null) __obj.updateDynamic("icons")(icons.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (toggle != null) __obj.updateDynamic("toggle")(toggle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Check]
  }
}

