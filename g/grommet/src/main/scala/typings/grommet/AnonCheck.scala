package typings.grommet

import typings.grommet.baseMod.ExtendType
import typings.grommet.utilsMod.ColorType
import typings.grommet.utilsMod.GapType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCheck extends js.Object {
  var border: js.UndefOr[AnonColorWidth] = js.undefined
  var check: js.UndefOr[AnonThickness] = js.undefined
  var color: js.UndefOr[ColorType] = js.undefined
  var extend: js.UndefOr[ExtendType] = js.undefined
  var gap: js.UndefOr[GapType] = js.undefined
  var hover: js.UndefOr[AnonBorderAnon0] = js.undefined
  var icon: js.UndefOr[AnonExtendSize] = js.undefined
  var icons: js.UndefOr[AnonChecked] = js.undefined
  var size: js.UndefOr[String] = js.undefined
  var toggle: js.UndefOr[AnonKnob] = js.undefined
}

object AnonCheck {
  @scala.inline
  def apply(
    border: AnonColorWidth = null,
    check: AnonThickness = null,
    color: ColorType = null,
    extend: ExtendType = null,
    gap: GapType = null,
    hover: AnonBorderAnon0 = null,
    icon: AnonExtendSize = null,
    icons: AnonChecked = null,
    size: String = null,
    toggle: AnonKnob = null
  ): AnonCheck = {
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
    __obj.asInstanceOf[AnonCheck]
  }
}

