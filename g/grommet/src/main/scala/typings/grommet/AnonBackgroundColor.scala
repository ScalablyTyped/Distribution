package typings.grommet

import typings.grommet.utilsMod.ColorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBackgroundColor extends js.Object {
  var background: js.UndefOr[AnonColorOpacityColorType] = js.undefined
  var color: js.UndefOr[ColorType] = js.undefined
}

object AnonBackgroundColor {
  @scala.inline
  def apply(background: AnonColorOpacityColorType = null, color: ColorType = null): AnonBackgroundColor = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBackgroundColor]
  }
}

