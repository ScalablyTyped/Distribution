package typings.humanizeDashDuration.humanizeDashDurationMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HumanizerOptions extends Options {
  var languages: js.UndefOr[StringDictionary[UnitTranslationOptions]] = js.undefined
}

object HumanizerOptions {
  @scala.inline
  def apply(
    conjunction: String = null,
    decimal: String = null,
    delimiter: String = null,
    fallbacks: js.Array[String] = null,
    language: String = null,
    languages: StringDictionary[UnitTranslationOptions] = null,
    largest: Int | Double = null,
    maxDecimalPoints: Int | Double = null,
    round: js.UndefOr[Boolean] = js.undefined,
    serialComma: js.UndefOr[Boolean] = js.undefined,
    spacer: String = null,
    unitMeasures: UnitMeasuresOptions = null,
    units: js.Array[Unit] = null
  ): HumanizerOptions = {
    val __obj = js.Dynamic.literal()
    if (conjunction != null) __obj.updateDynamic("conjunction")(conjunction.asInstanceOf[js.Any])
    if (decimal != null) __obj.updateDynamic("decimal")(decimal.asInstanceOf[js.Any])
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (fallbacks != null) __obj.updateDynamic("fallbacks")(fallbacks.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (languages != null) __obj.updateDynamic("languages")(languages.asInstanceOf[js.Any])
    if (largest != null) __obj.updateDynamic("largest")(largest.asInstanceOf[js.Any])
    if (maxDecimalPoints != null) __obj.updateDynamic("maxDecimalPoints")(maxDecimalPoints.asInstanceOf[js.Any])
    if (!js.isUndefined(round)) __obj.updateDynamic("round")(round.asInstanceOf[js.Any])
    if (!js.isUndefined(serialComma)) __obj.updateDynamic("serialComma")(serialComma.asInstanceOf[js.Any])
    if (spacer != null) __obj.updateDynamic("spacer")(spacer.asInstanceOf[js.Any])
    if (unitMeasures != null) __obj.updateDynamic("unitMeasures")(unitMeasures.asInstanceOf[js.Any])
    if (units != null) __obj.updateDynamic("units")(units.asInstanceOf[js.Any])
    __obj.asInstanceOf[HumanizerOptions]
  }
}

