package typings.grommet

import typings.grommet.componentsListMod.SideType
import typings.grommet.componentsListMod.SizeType
import typings.grommet.componentsListMod._BorderType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorSide extends _BorderType {
  var color: js.UndefOr[String | Anon_Dark] = js.undefined
  var side: js.UndefOr[SideType] = js.undefined
  var size: js.UndefOr[SizeType] = js.undefined
}

object Anon_ColorSide {
  @scala.inline
  def apply(color: String | Anon_Dark = null, side: SideType = null, size: SizeType = null): Anon_ColorSide = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (side != null) __obj.updateDynamic("side")(side)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ColorSide]
  }
}

