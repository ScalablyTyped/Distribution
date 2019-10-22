package typings.grommet

import typings.grommet.themesBaseMod.ExtendType
import typings.grommet.utilsMod.BackgroundType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BackgroundExtendBackgroundType extends js.Object {
  var background: js.UndefOr[BackgroundType] = js.undefined
  var extend: js.UndefOr[ExtendType] = js.undefined
}

object Anon_BackgroundExtendBackgroundType {
  @scala.inline
  def apply(background: BackgroundType = null, extend: ExtendType = null): Anon_BackgroundExtendBackgroundType = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BackgroundExtendBackgroundType]
  }
}

