package typings.grommet

import typings.grommet.utilsMod.ColorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BackgroundColor extends js.Object {
  var background: js.UndefOr[Anon_ColorOpacity] = js.undefined
  var color: js.UndefOr[ColorType] = js.undefined
}

object Anon_BackgroundColor {
  @scala.inline
  def apply(background: Anon_ColorOpacity = null, color: ColorType = null): Anon_BackgroundColor = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BackgroundColor]
  }
}

