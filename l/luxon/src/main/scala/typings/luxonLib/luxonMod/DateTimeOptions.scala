package typings
package luxonLib.luxonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateTimeOptions extends LocaleOptions {
  var setZone: js.UndefOr[scala.Boolean] = js.undefined
  var zone: js.UndefOr[java.lang.String | Zone] = js.undefined
}

object DateTimeOptions {
  @scala.inline
  def apply(
    locale: java.lang.String = null,
    numberingSystem: java.lang.String = null,
    outputCalendar: java.lang.String = null,
    setZone: js.UndefOr[scala.Boolean] = js.undefined,
    zone: java.lang.String | Zone = null
  ): DateTimeOptions = {
    val __obj = js.Dynamic.literal()
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (numberingSystem != null) __obj.updateDynamic("numberingSystem")(numberingSystem)
    if (outputCalendar != null) __obj.updateDynamic("outputCalendar")(outputCalendar)
    if (!js.isUndefined(setZone)) __obj.updateDynamic("setZone")(setZone)
    if (zone != null) __obj.updateDynamic("zone")(zone.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateTimeOptions]
  }
}

