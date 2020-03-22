package typings.grommet

import typings.grommet.utilsMod.BoxStyleType
import typings.grommet.utilsMod.ColorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSizeStyle extends js.Object {
  var color: js.UndefOr[ColorType] = js.undefined
  var side: js.UndefOr[BoxStyleType] = js.undefined
  var size: js.UndefOr[BoxStyleType] = js.undefined
  var style: js.UndefOr[BoxStyleType] = js.undefined
}

object AnonSizeStyle {
  @scala.inline
  def apply(
    color: ColorType = null,
    side: BoxStyleType = null,
    size: BoxStyleType = null,
    style: BoxStyleType = null
  ): AnonSizeStyle = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (side != null) __obj.updateDynamic("side")(side.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSizeStyle]
  }
}

