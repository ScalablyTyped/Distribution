package typings.grommet

import typings.grommet.utilsMod.ColorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHover extends js.Object {
  var active: js.UndefOr[Anon0] = js.undefined
  var color: js.UndefOr[ColorType] = js.undefined
  var hover: js.UndefOr[AnonColorExtend] = js.undefined
  var side: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[String] = js.undefined
}

object AnonHover {
  @scala.inline
  def apply(
    active: Anon0 = null,
    color: ColorType = null,
    hover: AnonColorExtend = null,
    side: String = null,
    size: String = null
  ): AnonHover = {
    val __obj = js.Dynamic.literal()
    if (active != null) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    if (side != null) __obj.updateDynamic("side")(side.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHover]
  }
}

