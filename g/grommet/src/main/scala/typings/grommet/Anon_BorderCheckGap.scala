package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BorderCheckGap extends js.Object {
  var border: js.UndefOr[Anon_ColorWidth] = js.undefined
  var check: js.UndefOr[Anon_RadiusString] = js.undefined
  var gap: js.UndefOr[String] = js.undefined
  var hover: js.UndefOr[Anon_BorderAnonColorColorType] = js.undefined
  var icon: js.UndefOr[Anon_ExtendSizeExtendType] = js.undefined
  var icons: js.UndefOr[Anon_Circle] = js.undefined
  var size: js.UndefOr[String] = js.undefined
}

object Anon_BorderCheckGap {
  @scala.inline
  def apply(
    border: Anon_ColorWidth = null,
    check: Anon_RadiusString = null,
    gap: String = null,
    hover: Anon_BorderAnonColorColorType = null,
    icon: Anon_ExtendSizeExtendType = null,
    icons: Anon_Circle = null,
    size: String = null
  ): Anon_BorderCheckGap = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (check != null) __obj.updateDynamic("check")(check.asInstanceOf[js.Any])
    if (gap != null) __obj.updateDynamic("gap")(gap.asInstanceOf[js.Any])
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (icons != null) __obj.updateDynamic("icons")(icons.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BorderCheckGap]
  }
}

