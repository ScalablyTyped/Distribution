package typings.grommet.anon

import typings.grommet.utilsMod.ColorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackgroundColor extends js.Object {
  var background: js.UndefOr[ColorColorType] = js.undefined
  var color: js.UndefOr[ColorType] = js.undefined
}

object BackgroundColor {
  @scala.inline
  def apply(background: ColorColorType = null, color: ColorType = null): BackgroundColor = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundColor]
  }
}

