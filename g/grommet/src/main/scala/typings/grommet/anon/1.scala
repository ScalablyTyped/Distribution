package typings.grommet.anon

import typings.grommet.utilsMod.BackgroundType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `1` extends js.Object {
  var background: js.UndefOr[BackgroundType] = js.undefined
}

object `1` {
  @scala.inline
  def apply(background: BackgroundType = null): `1` = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`]
  }
}

