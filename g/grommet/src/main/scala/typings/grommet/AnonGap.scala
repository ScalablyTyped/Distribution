package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGap extends js.Object {
  var border: js.UndefOr[AnonColorWidth] = js.undefined
  var check: js.UndefOr[AnonRadiusString] = js.undefined
  var gap: js.UndefOr[String] = js.undefined
  var hover: js.UndefOr[AnonBorderAnon0] = js.undefined
  var icon: js.UndefOr[AnonExtendExtendType] = js.undefined
  var icons: js.UndefOr[AnonCircle] = js.undefined
  var size: js.UndefOr[String] = js.undefined
}

object AnonGap {
  @scala.inline
  def apply(
    border: AnonColorWidth = null,
    check: AnonRadiusString = null,
    gap: String = null,
    hover: AnonBorderAnon0 = null,
    icon: AnonExtendExtendType = null,
    icons: AnonCircle = null,
    size: String = null
  ): AnonGap = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (check != null) __obj.updateDynamic("check")(check.asInstanceOf[js.Any])
    if (gap != null) __obj.updateDynamic("gap")(gap.asInstanceOf[js.Any])
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (icons != null) __obj.updateDynamic("icons")(icons.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGap]
  }
}

