package typings.grommet

import typings.grommet.utilsMod.ColorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorSideSize extends js.Object {
  var color: js.UndefOr[ColorType] = js.undefined
  var side: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[String] = js.undefined
}

object Anon_ColorSideSize {
  @scala.inline
  def apply(color: ColorType = null, side: String = null, size: String = null): Anon_ColorSideSize = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (side != null) __obj.updateDynamic("side")(side)
    if (size != null) __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[Anon_ColorSideSize]
  }
}

