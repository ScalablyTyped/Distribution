package typings.luxon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateTimeOptions extends LocaleOptions {
  var setZone: js.UndefOr[Boolean] = js.undefined
  var zone: js.UndefOr[String | Zone] = js.undefined
}

object DateTimeOptions {
  @scala.inline
  def apply(
    locale: String = null,
    numberingSystem: NumberingSystem = null,
    outputCalendar: CalendarSystem = null,
    setZone: js.UndefOr[Boolean] = js.undefined,
    zone: String | Zone = null
  ): DateTimeOptions = {
    val __obj = js.Dynamic.literal()
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (numberingSystem != null) __obj.updateDynamic("numberingSystem")(numberingSystem.asInstanceOf[js.Any])
    if (outputCalendar != null) __obj.updateDynamic("outputCalendar")(outputCalendar.asInstanceOf[js.Any])
    if (!js.isUndefined(setZone)) __obj.updateDynamic("setZone")(setZone.get.asInstanceOf[js.Any])
    if (zone != null) __obj.updateDynamic("zone")(zone.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateTimeOptions]
  }
}

