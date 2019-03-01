package typings
package gulpDashTslintLib.gulpDashTslintMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportOptions extends js.Object {
  var allowWarnings: js.UndefOr[scala.Boolean] = js.undefined
  var emitError: js.UndefOr[scala.Boolean] = js.undefined
  var reportLimit: js.UndefOr[scala.Double] = js.undefined
  var summarizeFailureOutput: js.UndefOr[scala.Boolean] = js.undefined
}

object ReportOptions {
  @scala.inline
  def apply(
    allowWarnings: js.UndefOr[scala.Boolean] = js.undefined,
    emitError: js.UndefOr[scala.Boolean] = js.undefined,
    reportLimit: scala.Int | scala.Double = null,
    summarizeFailureOutput: js.UndefOr[scala.Boolean] = js.undefined
  ): ReportOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowWarnings)) __obj.updateDynamic("allowWarnings")(allowWarnings)
    if (!js.isUndefined(emitError)) __obj.updateDynamic("emitError")(emitError)
    if (reportLimit != null) __obj.updateDynamic("reportLimit")(reportLimit.asInstanceOf[js.Any])
    if (!js.isUndefined(summarizeFailureOutput)) __obj.updateDynamic("summarizeFailureOutput")(summarizeFailureOutput)
    __obj.asInstanceOf[ReportOptions]
  }
}

