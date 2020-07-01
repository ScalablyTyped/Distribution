package typings.grommet.anon

import typings.grommet.baseMod.ButtonKindType
import typings.grommet.baseMod.ExtendType
import typings.grommet.utilsMod.BackgroundType
import typings.grommet.utilsMod.ColorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined grommet.grommet/themes/base.ButtonKindType & {  default ? :grommet.grommet/themes/base.ButtonKindType,   primary ? :grommet.grommet/themes/base.ButtonKindType,   secondary ? :grommet.grommet/themes/base.ButtonKindType} */
trait ButtonKindTypedefaultButt extends js.Object {
  var background: js.UndefOr[BackgroundType] = js.undefined
  var border: js.UndefOr[ColorWidth | Boolean] = js.undefined
  var color: js.UndefOr[ColorType] = js.undefined
  var default: js.UndefOr[ButtonKindType] = js.undefined
  var extend: js.UndefOr[ExtendType] = js.undefined
  var padding: js.UndefOr[HorizontalVertical] = js.undefined
  var primary: js.UndefOr[ButtonKindType] = js.undefined
  var secondary: js.UndefOr[ButtonKindType] = js.undefined
}

object ButtonKindTypedefaultButt {
  @scala.inline
  def apply(
    background: BackgroundType = null,
    border: ColorWidth | Boolean = null,
    color: ColorType = null,
    default: ButtonKindType = null,
    extend: ExtendType = null,
    padding: HorizontalVertical = null,
    primary: ButtonKindType = null,
    secondary: ButtonKindType = null
  ): ButtonKindTypedefaultButt = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (primary != null) __obj.updateDynamic("primary")(primary.asInstanceOf[js.Any])
    if (secondary != null) __obj.updateDynamic("secondary")(secondary.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonKindTypedefaultButt]
  }
}

