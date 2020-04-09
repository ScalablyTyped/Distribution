package typings.grommet

import typings.grommet.baseMod.ExtendType
import typings.grommet.utilsMod.ColorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExtendFontWeight extends js.Object {
  var color: js.UndefOr[ColorType] = js.undefined
  var extend: js.UndefOr[ExtendType] = js.undefined
  var fontWeight: js.UndefOr[Double] = js.undefined
  var hover: js.UndefOr[AnonTextDecoration] = js.undefined
  var textDecoration: js.UndefOr[String] = js.undefined
}

object AnonExtendFontWeight {
  @scala.inline
  def apply(
    color: ColorType = null,
    extend: ExtendType = null,
    fontWeight: Int | Double = null,
    hover: AnonTextDecoration = null,
    textDecoration: String = null
  ): AnonExtendFontWeight = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    if (textDecoration != null) __obj.updateDynamic("textDecoration")(textDecoration.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExtendFontWeight]
  }
}

