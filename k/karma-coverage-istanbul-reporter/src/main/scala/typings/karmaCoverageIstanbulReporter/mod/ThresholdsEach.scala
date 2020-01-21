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
    branches: Int | Double = null,
    functions: Int | Double = null,
    lines: Int | Double = null,
    overrides: StringDictionary[Threshold] = null,
    statements: Int | Double = null
  ): ThresholdsEach = {
    val __obj = js.Dynamic.literal()
    if (branches != null) __obj.updateDynamic("branches")(branches.asInstanceOf[js.Any])
    if (functions != null) __obj.updateDynamic("functions")(functions.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (statements != null) __obj.updateDynamic("statements")(statements.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThresholdsEach]
  }
}

