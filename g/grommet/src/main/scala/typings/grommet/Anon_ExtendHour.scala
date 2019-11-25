package typings.grommet

import typings.grommet.themesBaseMod.ExtendType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExtendHour extends js.Object {
  var extend: js.UndefOr[ExtendType] = js.undefined
  var hour: js.UndefOr[Anon_ColorShape] = js.undefined
  var minute: js.UndefOr[Anon_ColorShape] = js.undefined
  var second: js.UndefOr[Anon_ColorShape] = js.undefined
  var size: js.UndefOr[Anon_Huge] = js.undefined
}

object Anon_ExtendHour {
  @scala.inline
  def apply(
    extend: ExtendType = null,
    hour: Anon_ColorShape = null,
    minute: Anon_ColorShape = null,
    second: Anon_ColorShape = null,
    size: Anon_Huge = null
  ): Anon_ExtendHour = {
    val __obj = js.Dynamic.literal()
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (hour != null) __obj.updateDynamic("hour")(hour.asInstanceOf[js.Any])
    if (minute != null) __obj.updateDynamic("minute")(minute.asInstanceOf[js.Any])
    if (second != null) __obj.updateDynamic("second")(second.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ExtendHour]
  }
}

