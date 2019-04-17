package typings
package humanizeDashDurationLib.humanizeDashDurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HumanizerOptions extends Options {
  var languages: js.UndefOr[org.scalablytyped.runtime.StringDictionary[UnitTranslationOptions]] = js.undefined
}

object HumanizerOptions {
  @scala.inline
  def apply(
    conjunction: java.lang.String = null,
    decimal: java.lang.String = null,
    delimiter: java.lang.String = null,
    fallbacks: js.Array[java.lang.String] = null,
    language: java.lang.String = null,
    languages: org.scalablytyped.runtime.StringDictionary[UnitTranslationOptions] = null,
    largest: scala.Int | scala.Double = null,
    maxDecimalPoints: scala.Int | scala.Double = null,
    round: js.UndefOr[scala.Boolean] = js.undefined,
    serialComma: js.UndefOr[scala.Boolean] = js.undefined,
    spacer: java.lang.String = null,
    unitMeasures: UnitMeasuresOptions = null,
    units: js.Array[Unit] = null
  ): HumanizerOptions = {
    val __obj = js.Dynamic.literal()
    if (conjunction != null) __obj.updateDynamic("conjunction")(conjunction)
    if (decimal != null) __obj.updateDynamic("decimal")(decimal)
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter)
    if (fallbacks != null) __obj.updateDynamic("fallbacks")(fallbacks)
    if (language != null) __obj.updateDynamic("language")(language)
    if (languages != null) __obj.updateDynamic("languages")(languages)
    if (largest != null) __obj.updateDynamic("largest")(largest.asInstanceOf[js.Any])
    if (maxDecimalPoints != null) __obj.updateDynamic("maxDecimalPoints")(maxDecimalPoints.asInstanceOf[js.Any])
    if (!js.isUndefined(round)) __obj.updateDynamic("round")(round)
    if (!js.isUndefined(serialComma)) __obj.updateDynamic("serialComma")(serialComma)
    if (spacer != null) __obj.updateDynamic("spacer")(spacer)
    if (unitMeasures != null) __obj.updateDynamic("unitMeasures")(unitMeasures)
    if (units != null) __obj.updateDynamic("units")(units)
    __obj.asInstanceOf[HumanizerOptions]
  }
}

