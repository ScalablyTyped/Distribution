package typings.grommet

import typings.grommet.baseMod.ExtendType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExtendFont extends js.Object {
  var extend: js.UndefOr[ExtendType] = js.undefined
  var font: js.UndefOr[js.Object] = js.undefined
  var level: js.UndefOr[Anon4] = js.undefined
  var responsiveBreakpoint: js.UndefOr[String] = js.undefined
  var weight: js.UndefOr[Double] = js.undefined
}

object AnonExtendFont {
  @scala.inline
  def apply(
    extend: ExtendType = null,
    font: js.Object = null,
    level: Anon4 = null,
    responsiveBreakpoint: String = null,
    weight: Int | Double = null
  ): AnonExtendFont = {
    val __obj = js.Dynamic.literal()
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (responsiveBreakpoint != null) __obj.updateDynamic("responsiveBreakpoint")(responsiveBreakpoint.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExtendFont]
  }
}

