package typings.grommet.anon

import typings.grommet.baseMod.ExtendType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hour extends js.Object {
  var extend: js.UndefOr[ExtendType] = js.undefined
  var hour: js.UndefOr[Shape] = js.undefined
  var minute: js.UndefOr[Shape] = js.undefined
  var second: js.UndefOr[Shape] = js.undefined
  var size: js.UndefOr[Huge] = js.undefined
}

object Hour {
  @scala.inline
  def apply(
    extend: ExtendType = null,
    hour: Shape = null,
    minute: Shape = null,
    second: Shape = null,
    size: Huge = null
  ): Hour = {
    val __obj = js.Dynamic.literal()
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (hour != null) __obj.updateDynamic("hour")(hour.asInstanceOf[js.Any])
    if (minute != null) __obj.updateDynamic("minute")(minute.asInstanceOf[js.Any])
    if (second != null) __obj.updateDynamic("second")(second.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hour]
  }
}

