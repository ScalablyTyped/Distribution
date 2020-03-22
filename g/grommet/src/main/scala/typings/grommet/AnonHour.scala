package typings.grommet

import typings.grommet.baseMod.ExtendType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHour extends js.Object {
  var extend: js.UndefOr[ExtendType] = js.undefined
  var hour: js.UndefOr[AnonShape] = js.undefined
  var minute: js.UndefOr[AnonShape] = js.undefined
  var second: js.UndefOr[AnonShape] = js.undefined
  var size: js.UndefOr[AnonHuge] = js.undefined
}

object AnonHour {
  @scala.inline
  def apply(
    extend: ExtendType = null,
    hour: AnonShape = null,
    minute: AnonShape = null,
    second: AnonShape = null,
    size: AnonHuge = null
  ): AnonHour = {
    val __obj = js.Dynamic.literal()
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (hour != null) __obj.updateDynamic("hour")(hour.asInstanceOf[js.Any])
    if (minute != null) __obj.updateDynamic("minute")(minute.asInstanceOf[js.Any])
    if (second != null) __obj.updateDynamic("second")(second.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHour]
  }
}

