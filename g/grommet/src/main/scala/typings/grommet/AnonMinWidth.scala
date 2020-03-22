package typings.grommet

import typings.grommet.baseMod.ExtendType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMinWidth extends js.Object {
  var border: js.UndefOr[AnonColorRadius] = js.undefined
  var disabled: js.UndefOr[Anon3] = js.undefined
  var extend: js.UndefOr[ExtendType] = js.undefined
  var maxWidth: js.UndefOr[String] = js.undefined
  var minWidth: js.UndefOr[String] = js.undefined
  var padding: js.UndefOr[AnonVertical] = js.undefined
  var primary: js.UndefOr[Anon0] = js.undefined
  var size: js.UndefOr[AnonLargeMedium] = js.undefined
  var transition: js.UndefOr[AnonProperties] = js.undefined
}

object AnonMinWidth {
  @scala.inline
  def apply(
    border: AnonColorRadius = null,
    disabled: Anon3 = null,
    extend: ExtendType = null,
    maxWidth: String = null,
    minWidth: String = null,
    padding: AnonVertical = null,
    primary: Anon0 = null,
    size: AnonLargeMedium = null,
    transition: AnonProperties = null
  ): AnonMinWidth = {
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
    __obj.asInstanceOf[AnonMinWidth]
  }
}

