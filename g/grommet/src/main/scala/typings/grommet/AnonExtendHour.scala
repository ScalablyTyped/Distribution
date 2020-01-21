package typings.grommet

import typings.grommet.baseMod.ExtendType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExtendHour extends js.Object {
  var extend: js.UndefOr[ExtendType] = js.undefined
  var hour: js.UndefOr[AnonColorShape] = js.undefined
  var minute: js.UndefOr[AnonColorShape] = js.undefined
  var second: js.UndefOr[AnonColorShape] = js.undefined
  var size: js.UndefOr[AnonHuge] = js.undefined
}

object AnonExtendHour {
  @scala.inline
  def apply(
    extend: ExtendType = null,
    hour: AnonColorShape = null,
    minute: AnonColorShape = null,
    second: AnonColorShape = null,
    size: AnonHuge = null
  ): AnonExtendHour = {
    val __obj = js.Dynamic.literal()
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (hour != null) __obj.updateDynamic("hour")(hour.asInstanceOf[js.Any])
    if (minute != null) __obj.updateDynamic("minute")(minute.asInstanceOf[js.Any])
    if (second != null) __obj.updateDynamic("second")(second.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExtendHour]
  }
}

