package typings.grommet

import typings.grommet.utilsMod.BackgroundType
import typings.grommet.utilsMod.ColorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBackgroundBackgroundType extends js.Object {
  var background: js.UndefOr[BackgroundType] = js.undefined
  var color: js.UndefOr[ColorType] = js.undefined
}

object AnonBackgroundBackgroundType {
  @scala.inline
  def apply(background: BackgroundType = null, color: ColorType = null): AnonBackgroundBackgroundType = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBackgroundBackgroundType]
  }
}

