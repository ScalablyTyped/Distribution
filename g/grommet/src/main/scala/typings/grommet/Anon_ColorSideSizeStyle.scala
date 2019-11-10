package typings.grommet

import typings.grommet.utilsMod.ColorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorSideSizeStyle extends js.Object {
  var color: js.UndefOr[ColorType] = js.undefined
  var side: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SideType */ js.Any
  ] = js.undefined
  var size: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SizeType */ js.Any
  ] = js.undefined
  var style: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify StyleType */ js.Any
  ] = js.undefined
}

object Anon_ColorSideSizeStyle {
  @scala.inline
  def apply(
    color: ColorType = null,
    side: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SideType */ js.Any = null,
    size: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SizeType */ js.Any = null,
    style: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify StyleType */ js.Any = null
  ): Anon_ColorSideSizeStyle = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (side != null) __obj.updateDynamic("side")(side)
    if (size != null) __obj.updateDynamic("size")(size)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[Anon_ColorSideSizeStyle]
  }
}

