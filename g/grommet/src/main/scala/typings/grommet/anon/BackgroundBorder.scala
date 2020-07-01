package typings.grommet.anon

import typings.grommet.utilsMod.BackgroundType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackgroundBorder extends js.Object {
  var background: js.UndefOr[BackgroundType] = js.undefined
  var border: js.UndefOr[`1`] = js.undefined
  var label: js.UndefOr[`1`] = js.undefined
}

object BackgroundBorder {
  @scala.inline
  def apply(background: BackgroundType = null, border: `1` = null, label: `1` = null): BackgroundBorder = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundBorder]
  }
}

