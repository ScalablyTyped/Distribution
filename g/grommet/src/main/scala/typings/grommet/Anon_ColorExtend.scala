package typings.grommet

import typings.grommet.themesBaseMod.ExtendType
import typings.grommet.utilsMod.ColorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorExtend extends js.Object {
  var color: js.UndefOr[ColorType] = js.undefined
  var extend: js.UndefOr[ExtendType] = js.undefined
  var fontWeight: js.UndefOr[Double] = js.undefined
  var hover: js.UndefOr[Anon_Extend] = js.undefined
  var textDecoration: js.UndefOr[String] = js.undefined
}

object Anon_ColorExtend {
  @scala.inline
  def apply(
    color: ColorType = null,
    extend: ExtendType = null,
    fontWeight: Int | Double = null,
    hover: Anon_Extend = null,
    textDecoration: String = null
  ): Anon_ColorExtend = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (hover != null) __obj.updateDynamic("hover")(hover)
    if (textDecoration != null) __obj.updateDynamic("textDecoration")(textDecoration)
    __obj.asInstanceOf[Anon_ColorExtend]
  }
}

