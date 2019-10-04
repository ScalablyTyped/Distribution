package typings.grommet

import typings.grommet.componentsBoxMod.SideType
import typings.grommet.componentsBoxMod.SizeType
import typings.grommet.componentsBoxMod.StyleType
import typings.grommet.utilsMod.ColorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Color extends js.Object {
  var color: js.UndefOr[ColorType] = js.undefined
  var side: js.UndefOr[SideType] = js.undefined
  var size: js.UndefOr[SizeType] = js.undefined
  var style: js.UndefOr[StyleType] = js.undefined
}

object Anon_Color {
  @scala.inline
  def apply(color: ColorType = null, side: SideType = null, size: SizeType = null, style: StyleType = null): Anon_Color = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (side != null) __obj.updateDynamic("side")(side)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[Anon_Color]
  }
}

