package typings
package luxonLib.luxonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateTimeJSOptions extends LocaleOptions {
  var zone: js.UndefOr[java.lang.String | Zone] = js.undefined
}

object DateTimeJSOptions {
  @scala.inline
  def apply(
    locale: java.lang.String = null,
    numberingSystem: java.lang.String = null,
    outputCalendar: java.lang.String = null,
    zone: java.lang.String | Zone = null
  ): DateTimeJSOptions = {
    val __obj = js.Dynamic.literal()
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (numberingSystem != null) __obj.updateDynamic("numberingSystem")(numberingSystem)
    if (outputCalendar != null) __obj.updateDynamic("outputCalendar")(outputCalendar)
    if (zone != null) __obj.updateDynamic("zone")(zone.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateTimeJSOptions]
  }
}

