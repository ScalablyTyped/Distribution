package typings.grommet

import typings.grommet.baseMod.ExtendType
import typings.grommet.utilsMod.BackgroundType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIcons extends js.Object {
  var background: js.UndefOr[BackgroundType] = js.undefined
  var extend: js.UndefOr[ExtendType] = js.undefined
  var icons: js.UndefOr[AnonDown] = js.undefined
}

object AnonIcons {
  @scala.inline
  def apply(background: BackgroundType = null, extend: ExtendType = null, icons: AnonDown = null): AnonIcons = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (icons != null) __obj.updateDynamic("icons")(icons.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIcons]
  }
}

