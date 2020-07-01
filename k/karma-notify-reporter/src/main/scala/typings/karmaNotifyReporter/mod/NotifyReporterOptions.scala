package typings.karmaNotifyReporter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotifyReporterOptions extends js.Object {
  /**
    * Will notify when a suite was back to successful
    * @default true
    */
  var reportBackToSuccess: js.UndefOr[Boolean] = js.undefined
  /**
    * Will notify on every failed spec
    * @default false
    */
  var reportEachFailure: js.UndefOr[Boolean] = js.undefined
  /**
    * Will notify when a suite was successful
    * @default true
    */
  var reportSuccess: js.UndefOr[Boolean] = js.undefined
}

object NotifyReporterOptions {
  @scala.inline
  def apply(
    reportBackToSuccess: js.UndefOr[Boolean] = js.undefined,
    reportEachFailure: js.UndefOr[Boolean] = js.undefined,
    reportSuccess: js.UndefOr[Boolean] = js.undefined
  ): NotifyReporterOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(reportBackToSuccess)) __obj.updateDynamic("reportBackToSuccess")(reportBackToSuccess.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reportEachFailure)) __obj.updateDynamic("reportEachFailure")(reportEachFailure.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reportSuccess)) __obj.updateDynamic("reportSuccess")(reportSuccess.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotifyReporterOptions]
  }
}

