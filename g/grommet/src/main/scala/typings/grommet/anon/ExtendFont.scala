package typings.grommet.anon

import typings.grommet.baseMod.ExtendType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtendFont extends js.Object {
  var extend: js.UndefOr[ExtendType] = js.undefined
  var font: js.UndefOr[js.Object] = js.undefined
  var level: js.UndefOr[`4`] = js.undefined
  var responsiveBreakpoint: js.UndefOr[String] = js.undefined
  var weight: js.UndefOr[Double] = js.undefined
}

object ExtendFont {
  @scala.inline
  def apply(
    extend: ExtendType = null,
    font: js.Object = null,
    level: `4` = null,
    responsiveBreakpoint: String = null,
    weight: js.UndefOr[Double] = js.undefined
  ): ExtendFont = {
    val __obj = js.Dynamic.literal()
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (responsiveBreakpoint != null) __obj.updateDynamic("responsiveBreakpoint")(responsiveBreakpoint.asInstanceOf[js.Any])
    if (!js.isUndefined(weight)) __obj.updateDynamic("weight")(weight.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendFont]
  }
}

