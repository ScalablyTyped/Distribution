package typings.grommet

import typings.grommet.utilsMod.BackgroundType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBackgroundBackgroundType extends js.Object {
  var background: js.UndefOr[BackgroundType] = js.undefined
}

object AnonBackgroundBackgroundType {
  @scala.inline
  def apply(background: BackgroundType = null): AnonBackgroundBackgroundType = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBackgroundBackgroundType]
  }
}

