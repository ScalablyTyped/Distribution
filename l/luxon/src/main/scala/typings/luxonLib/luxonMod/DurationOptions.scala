package typings
package luxonLib.luxonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DurationOptions extends js.Object {
  var conversionAccuracy: js.UndefOr[ConversionAccuracy] = js.undefined
  var locale: js.UndefOr[java.lang.String] = js.undefined
  var numberingSystem: js.UndefOr[NumberingSystem] = js.undefined
}

object DurationOptions {
  @scala.inline
  def apply(
    conversionAccuracy: ConversionAccuracy = null,
    locale: java.lang.String = null,
    numberingSystem: NumberingSystem = null
  ): DurationOptions = {
    val __obj = js.Dynamic.literal()
    if (conversionAccuracy != null) __obj.updateDynamic("conversionAccuracy")(conversionAccuracy)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (numberingSystem != null) __obj.updateDynamic("numberingSystem")(numberingSystem)
    __obj.asInstanceOf[DurationOptions]
  }
}

