package typings.grommet

import typings.grommet.baseMod.ExtendType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBorderDisabled extends js.Object {
  var border: js.UndefOr[AnonColorRadiusWidth] = js.undefined
  var disabled: js.UndefOr[AnonOpacityOpacityType] = js.undefined
  var extend: js.UndefOr[ExtendType] = js.undefined
  var maxWidth: js.UndefOr[String] = js.undefined
  var minWidth: js.UndefOr[String] = js.undefined
  var padding: js.UndefOr[AnonHorizontal] = js.undefined
  var primary: js.UndefOr[AnonColorColorType] = js.undefined
}

object AnonBorderDisabled {
  @scala.inline
  def apply(
    border: AnonColorRadiusWidth = null,
    disabled: AnonOpacityOpacityType = null,
    extend: ExtendType = null,
    maxWidth: String = null,
    minWidth: String = null,
    padding: AnonHorizontal = null,
    primary: AnonColorColorType = null
  ): AnonBorderDisabled = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (primary != null) __obj.updateDynamic("primary")(primary.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBorderDisabled]
  }
}

