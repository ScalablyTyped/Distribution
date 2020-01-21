package typings.luxon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DurationOptions extends js.Object {
  var conversionAccuracy: js.UndefOr[ConversionAccuracy] = js.undefined
  var locale: js.UndefOr[String] = js.undefined
  var numberingSystem: js.UndefOr[NumberingSystem] = js.undefined
}

object DurationOptions {
  @scala.inline
  def apply(
    conversionAccuracy: ConversionAccuracy = null,
    locale: String = null,
    numberingSystem: NumberingSystem = null
  ): DurationOptions = {
    val __obj = js.Dynamic.literal()
    if (conversionAccuracy != null) __obj.updateDynamic("conversionAccuracy")(conversionAccuracy.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (numberingSystem != null) __obj.updateDynamic("numberingSystem")(numberingSystem.asInstanceOf[js.Any])
    __obj.asInstanceOf[DurationOptions]
  }
}

