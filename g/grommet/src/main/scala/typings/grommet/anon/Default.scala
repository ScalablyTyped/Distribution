package typings.grommet.anon

import typings.grommet.baseMod.ButtonKindType
import typings.grommet.baseMod.ExtendType
import typings.grommet.utilsMod.ColorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Default extends js.Object {
  var active: js.UndefOr[ButtonKindTypedefaultButt] = js.undefined
  var border: js.UndefOr[ColorRadius] = js.undefined
  var color: js.UndefOr[ColorType] = js.undefined
  var default: js.UndefOr[ButtonKindType] = js.undefined
  var disabled: js.UndefOr[ButtonKindType] = js.undefined
  var extend: js.UndefOr[ExtendType] = js.undefined
  var hover: js.UndefOr[ButtonKindTypedefaultButt] = js.undefined
  var maxWidth: js.UndefOr[String] = js.undefined
  var minWidth: js.UndefOr[String] = js.undefined
  var option: js.UndefOr[ButtonKindType] = js.undefined
  var padding: js.UndefOr[HorizontalVertical] = js.undefined
  var primary: js.UndefOr[ButtonKindType] = js.undefined
  var secondary: js.UndefOr[ButtonKindType] = js.undefined
  var size: js.UndefOr[LargeMedium] = js.undefined
  var transition: js.UndefOr[Properties] = js.undefined
}

object Default {
  @scala.inline
  def apply(
    active: ButtonKindTypedefaultButt = null,
    border: ColorRadius = null,
    color: ColorType = null,
    default: ButtonKindType = null,
    disabled: ButtonKindType = null,
    extend: ExtendType = null,
    hover: ButtonKindTypedefaultButt = null,
    maxWidth: String = null,
    minWidth: String = null,
    option: ButtonKindType = null,
    padding: HorizontalVertical = null,
    primary: ButtonKindType = null,
    secondary: ButtonKindType = null,
    size: LargeMedium = null,
    transition: Properties = null
  ): Default = {
    val __obj = js.Dynamic.literal()
    if (active != null) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (option != null) __obj.updateDynamic("option")(option.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (primary != null) __obj.updateDynamic("primary")(primary.asInstanceOf[js.Any])
    if (secondary != null) __obj.updateDynamic("secondary")(secondary.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    __obj.asInstanceOf[Default]
  }
}

