package typings.grommet.anon

import typings.grommet.utilsMod.ColorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Gap extends js.Object {
  var border: js.UndefOr[ColorWidth] = js.undefined
  var check: js.UndefOr[RadiusString] = js.undefined
  var color: js.UndefOr[ColorType] = js.undefined
  var gap: js.UndefOr[String] = js.undefined
  var hover: js.UndefOr[Border1] = js.undefined
  var icon: js.UndefOr[SizeString] = js.undefined
  var icons: js.UndefOr[Circle] = js.undefined
  var size: js.UndefOr[String] = js.undefined
}

object Gap {
  @scala.inline
  def apply(
    border: ColorWidth = null,
    check: RadiusString = null,
    color: ColorType = null,
    gap: String = null,
    hover: Border1 = null,
    icon: SizeString = null,
    icons: Circle = null,
    size: String = null
  ): Gap = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (check != null) __obj.updateDynamic("check")(check.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (gap != null) __obj.updateDynamic("gap")(gap.asInstanceOf[js.Any])
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (icons != null) __obj.updateDynamic("icons")(icons.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gap]
  }
}

