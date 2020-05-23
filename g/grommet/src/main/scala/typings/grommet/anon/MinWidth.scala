package typings.grommet.anon

import typings.grommet.baseMod.ExtendType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MinWidth extends js.Object {
  var border: js.UndefOr[ColorRadius] = js.undefined
  var disabled: js.UndefOr[BorderColor] = js.undefined
  var extend: js.UndefOr[ExtendType] = js.undefined
  var maxWidth: js.UndefOr[String] = js.undefined
  var minWidth: js.UndefOr[String] = js.undefined
  var padding: js.UndefOr[HorizontalVertical] = js.undefined
  var primary: js.UndefOr[ActiveColor] = js.undefined
  var size: js.UndefOr[LargeMedium] = js.undefined
  var transition: js.UndefOr[Properties] = js.undefined
}

object MinWidth {
  @scala.inline
  def apply(
    border: ColorRadius = null,
    disabled: BorderColor = null,
    extend: ExtendType = null,
    maxWidth: String = null,
    minWidth: String = null,
    padding: HorizontalVertical = null,
    primary: ActiveColor = null,
    size: LargeMedium = null,
    transition: Properties = null
  ): MinWidth = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (primary != null) __obj.updateDynamic("primary")(primary.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinWidth]
  }
}

