package typings.grommet

import typings.grommet.utilsMod.BackgroundType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon1 extends js.Object {
  var background: js.UndefOr[BackgroundType] = js.undefined
}

object Anon1 {
  @scala.inline
  def apply(background: BackgroundType = null): Anon1 = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon1]
  }
}

