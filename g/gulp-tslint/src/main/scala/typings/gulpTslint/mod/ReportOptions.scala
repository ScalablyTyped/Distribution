package typings.gulpTslint.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportOptions extends js.Object {
  var allowWarnings: js.UndefOr[Boolean] = js.undefined
  var emitError: js.UndefOr[Boolean] = js.undefined
  var reportLimit: js.UndefOr[Double] = js.undefined
  var summarizeFailureOutput: js.UndefOr[Boolean] = js.undefined
}

object ReportOptions {
  @scala.inline
  def apply(
    allowWarnings: js.UndefOr[Boolean] = js.undefined,
    emitError: js.UndefOr[Boolean] = js.undefined,
    reportLimit: Int | Double = null,
    summarizeFailureOutput: js.UndefOr[Boolean] = js.undefined
  ): ReportOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowWarnings)) __obj.updateDynamic("allowWarnings")(allowWarnings.asInstanceOf[js.Any])
    if (!js.isUndefined(emitError)) __obj.updateDynamic("emitError")(emitError.asInstanceOf[js.Any])
    if (reportLimit != null) __obj.updateDynamic("reportLimit")(reportLimit.asInstanceOf[js.Any])
    if (!js.isUndefined(summarizeFailureOutput)) __obj.updateDynamic("summarizeFailureOutput")(summarizeFailureOutput.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportOptions]
  }
}

