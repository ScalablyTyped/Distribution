package typings.grommet.anon

import typings.grommet.utilsMod.BackgroundType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackgroundBackgroundTypeBorder1 extends js.Object {
  var background: js.UndefOr[BackgroundType] = js.undefined
  var border: js.UndefOr[`1`] = js.undefined
}

object BackgroundBackgroundTypeBorder1 {
  @scala.inline
  def apply(background: BackgroundType = null, border: `1` = null): BackgroundBackgroundTypeBorder1 = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundBackgroundTypeBorder1]
  }
}

