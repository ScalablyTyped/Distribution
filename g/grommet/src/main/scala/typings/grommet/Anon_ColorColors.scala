package typings.grommet

import typings.grommet.themesBaseMod.ExtendType
import typings.grommet.utilsMod.ColorType
import typings.grommet.utilsMod.GraphColorsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorColors extends js.Object {
  var color: js.UndefOr[ColorType] = js.undefined
  var colors: js.UndefOr[GraphColorsType] = js.undefined
  var extend: js.UndefOr[ExtendType] = js.undefined
}

object Anon_ColorColors {
  @scala.inline
  def apply(color: ColorType = null, colors: GraphColorsType = null, extend: ExtendType = null): Anon_ColorColors = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ColorColors]
  }
}

