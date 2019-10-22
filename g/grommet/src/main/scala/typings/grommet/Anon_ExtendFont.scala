package typings.grommet

import typings.grommet.themesBaseMod.ExtendType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExtendFont extends js.Object {
  var extend: js.UndefOr[ExtendType] = js.undefined
  var font: js.UndefOr[js.Object] = js.undefined
  var level: js.UndefOr[Anon_1] = js.undefined
  var responsiveBreakpoint: js.UndefOr[String] = js.undefined
  var weight: js.UndefOr[Double] = js.undefined
}

object Anon_ExtendFont {
  @scala.inline
  def apply(
    extend: ExtendType = null,
    font: js.Object = null,
    level: Anon_1 = null,
    responsiveBreakpoint: String = null,
    weight: Int | Double = null
  ): Anon_ExtendFont = {
    val __obj = js.Dynamic.literal()
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font)
    if (level != null) __obj.updateDynamic("level")(level)
    if (responsiveBreakpoint != null) __obj.updateDynamic("responsiveBreakpoint")(responsiveBreakpoint)
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ExtendFont]
  }
}

