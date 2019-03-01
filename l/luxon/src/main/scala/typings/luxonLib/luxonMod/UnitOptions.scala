package typings
package luxonLib.luxonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnitOptions extends InfoOptions {
  var numberingSystem: js.UndefOr[java.lang.String] = js.undefined
  var outputCalendar: js.UndefOr[java.lang.String] = js.undefined
}

object UnitOptions {
  @scala.inline
  def apply(
    locale: java.lang.String = null,
    numberingSystem: java.lang.String = null,
    outputCalendar: java.lang.String = null
  ): UnitOptions = {
    val __obj = js.Dynamic.literal()
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (numberingSystem != null) __obj.updateDynamic("numberingSystem")(numberingSystem)
    if (outputCalendar != null) __obj.updateDynamic("outputCalendar")(outputCalendar)
    __obj.asInstanceOf[UnitOptions]
  }
}

