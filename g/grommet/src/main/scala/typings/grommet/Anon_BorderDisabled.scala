package typings.grommet

import typings.grommet.themesBaseMod.ExtendType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BorderDisabled extends js.Object {
  var border: js.UndefOr[Anon_ColorRadiusWidth] = js.undefined
  var disabled: js.UndefOr[Anon_OpacityOpacityType] = js.undefined
  var extend: js.UndefOr[ExtendType] = js.undefined
  var maxWidth: js.UndefOr[String] = js.undefined
  var minWidth: js.UndefOr[String] = js.undefined
  var padding: js.UndefOr[Anon_Horizontal] = js.undefined
  var primary: js.UndefOr[Anon_ColorColorType] = js.undefined
}

object Anon_BorderDisabled {
  @scala.inline
  def apply(
    border: Anon_ColorRadiusWidth = null,
    disabled: Anon_OpacityOpacityType = null,
    extend: ExtendType = null,
    maxWidth: String = null,
    minWidth: String = null,
    padding: Anon_Horizontal = null,
    primary: Anon_ColorColorType = null
  ): Anon_BorderDisabled = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (primary != null) __obj.updateDynamic("primary")(primary.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BorderDisabled]
  }
}

