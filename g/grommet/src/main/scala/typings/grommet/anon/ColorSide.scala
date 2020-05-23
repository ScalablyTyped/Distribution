package typings.grommet.anon

import typings.grommet.utilsMod.ColorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorSide extends js.Object {
  var color: js.UndefOr[ColorType] = js.undefined
  var side: js.UndefOr[String] = js.undefined
}

object ColorSide {
  @scala.inline
  def apply(color: ColorType = null, side: String = null): ColorSide = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (side != null) __obj.updateDynamic("side")(side.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorSide]
  }
}

