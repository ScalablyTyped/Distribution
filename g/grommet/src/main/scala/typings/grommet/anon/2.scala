package typings.grommet.anon

import typings.grommet.utilsMod.BackgroundType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `2` extends js.Object {
  var background: js.UndefOr[BackgroundType] = js.undefined
}

object `2` {
  @scala.inline
  def apply(background: BackgroundType = null): `2` = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    __obj.asInstanceOf[`2`]
  }
}

