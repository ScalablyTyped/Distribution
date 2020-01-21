package typings.grommet

import typings.grommet.utilsMod.ColorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColorColorType extends js.Object {
  var color: js.UndefOr[ColorType] = js.undefined
}

object AnonColorColorType {
  @scala.inline
  def apply(color: ColorType = null): AnonColorColorType = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColorColorType]
  }
}

