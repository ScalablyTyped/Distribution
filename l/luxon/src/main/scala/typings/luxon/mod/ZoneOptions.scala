package typings.luxon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoneOptions extends js.Object {
  /**
    * @deprecated since 0.2.12. Use keepLocalTime instead
    */
  var keepCalendarTime: js.UndefOr[Boolean] = js.undefined
  var keepLocalTime: js.UndefOr[Boolean] = js.undefined
}

object ZoneOptions {
  @scala.inline
  def apply(
    keepCalendarTime: js.UndefOr[Boolean] = js.undefined,
    keepLocalTime: js.UndefOr[Boolean] = js.undefined
  ): ZoneOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(keepCalendarTime)) __obj.updateDynamic("keepCalendarTime")(keepCalendarTime.asInstanceOf[js.Any])
    if (!js.isUndefined(keepLocalTime)) __obj.updateDynamic("keepLocalTime")(keepLocalTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoneOptions]
  }
}

