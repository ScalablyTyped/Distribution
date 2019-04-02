package typings
package luxonLib.luxonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocaleOptions extends js.Object {
  var locale: js.UndefOr[java.lang.String] = js.undefined
  var numberingSystem: js.UndefOr[NumberingSystem] = js.undefined
  var outputCalendar: js.UndefOr[CalendarSystem] = js.undefined
}

object LocaleOptions {
  @scala.inline
  def apply(
    locale: java.lang.String = null,
    numberingSystem: NumberingSystem = null,
    outputCalendar: CalendarSystem = null
  ): LocaleOptions = {
    val __obj = js.Dynamic.literal()
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (numberingSystem != null) __obj.updateDynamic("numberingSystem")(numberingSystem)
    if (outputCalendar != null) __obj.updateDynamic("outputCalendar")(outputCalendar)
    __obj.asInstanceOf[LocaleOptions]
  }
}

