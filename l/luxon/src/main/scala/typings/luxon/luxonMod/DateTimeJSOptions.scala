package typings.luxon.luxonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateTimeJSOptions extends LocaleOptions {
  var zone: js.UndefOr[String | Zone] = js.undefined
}

object DateTimeJSOptions {
  @scala.inline
  def apply(
    locale: String = null,
    numberingSystem: NumberingSystem = null,
    outputCalendar: CalendarSystem = null,
    zone: String | Zone = null
  ): DateTimeJSOptions = {
    val __obj = js.Dynamic.literal()
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (numberingSystem != null) __obj.updateDynamic("numberingSystem")(numberingSystem)
    if (outputCalendar != null) __obj.updateDynamic("outputCalendar")(outputCalendar)
    if (zone != null) __obj.updateDynamic("zone")(zone.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateTimeJSOptions]
  }
}

