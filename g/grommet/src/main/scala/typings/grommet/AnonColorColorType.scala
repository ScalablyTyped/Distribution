package typings.grommet

import typings.grommet.utilsMod.ColorType
import typings.grommet.utilsMod.OpacityType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColorColorType extends js.Object {
  var color: js.UndefOr[ColorType] = js.undefined
  var opacity: js.UndefOr[OpacityType] = js.undefined
}

object AnonColorColorType {
  @scala.inline
  def apply(color: ColorType = null, opacity: OpacityType = null): AnonColorColorType = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColorColorType]
  }
}

