package typings.grommet

import typings.grommet.utilsMod.ColorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorSide extends js.Object {
  var color: js.UndefOr[ColorType] = js.undefined
  var side: js.UndefOr[String] = js.undefined
}

object Anon_ColorSide {
  @scala.inline
  def apply(color: ColorType = null, side: String = null): Anon_ColorSide = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (side != null) __obj.updateDynamic("side")(side)
    __obj.asInstanceOf[Anon_ColorSide]
  }
}

