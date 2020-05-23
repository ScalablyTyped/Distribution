package typings.karmaCoverageIstanbulReporter.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThresholdsEach extends Threshold {
  /** @default {} */
  val overrides: js.UndefOr[StringDictionary[Threshold]] = js.undefined
}

object ThresholdsEach {
  @scala.inline
  def apply(
    branches: js.UndefOr[Double] = js.undefined,
    functions: js.UndefOr[Double] = js.undefined,
    lines: js.UndefOr[Double] = js.undefined,
    overrides: StringDictionary[Threshold] = null,
    statements: js.UndefOr[Double] = js.undefined
  ): ThresholdsEach = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(branches)) __obj.updateDynamic("branches")(branches.get.asInstanceOf[js.Any])
    if (!js.isUndefined(functions)) __obj.updateDynamic("functions")(functions.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lines)) __obj.updateDynamic("lines")(lines.get.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (!js.isUndefined(statements)) __obj.updateDynamic("statements")(statements.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThresholdsEach]
  }
}

