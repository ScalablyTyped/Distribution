package typings.grommet

import typings.grommet.utilsMod.BackgroundType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BackgroundBackgroundType extends js.Object {
  var background: js.UndefOr[BackgroundType] = js.undefined
}

object Anon_BackgroundBackgroundType {
  @scala.inline
  def apply(background: BackgroundType = null): Anon_BackgroundBackgroundType = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BackgroundBackgroundType]
  }
}

