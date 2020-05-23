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
    reportLimit: js.UndefOr[Double] = js.undefined,
    summarizeFailureOutput: js.UndefOr[Boolean] = js.undefined
  ): ReportOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowWarnings)) __obj.updateDynamic("allowWarnings")(allowWarnings.get.asInstanceOf[js.Any])
    if (!js.isUndefined(emitError)) __obj.updateDynamic("emitError")(emitError.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reportLimit)) __obj.updateDynamic("reportLimit")(reportLimit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(summarizeFailureOutput)) __obj.updateDynamic("summarizeFailureOutput")(summarizeFailureOutput.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportOptions]
  }
}

