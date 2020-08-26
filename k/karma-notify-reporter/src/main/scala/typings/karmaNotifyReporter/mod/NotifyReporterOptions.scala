package typings.karmaNotifyReporter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotifyReporterOptions extends js.Object {
  /**
    * Will notify when a suite was back to successful
    * @default true
    */
  var reportBackToSuccess: js.UndefOr[Boolean] = js.native
  /**
    * Will notify on every failed spec
    * @default false
    */
  var reportEachFailure: js.UndefOr[Boolean] = js.native
  /**
    * Will notify when a suite was successful
    * @default true
    */
  var reportSuccess: js.UndefOr[Boolean] = js.native
}

object NotifyReporterOptions {
  @scala.inline
  def apply(): NotifyReporterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotifyReporterOptions]
  }
  @scala.inline
  implicit class NotifyReporterOptionsOps[Self <: NotifyReporterOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setReportBackToSuccess(value: Boolean): Self = this.set("reportBackToSuccess", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReportBackToSuccess: Self = this.set("reportBackToSuccess", js.undefined)
    @scala.inline
    def setReportEachFailure(value: Boolean): Self = this.set("reportEachFailure", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReportEachFailure: Self = this.set("reportEachFailure", js.undefined)
    @scala.inline
    def setReportSuccess(value: Boolean): Self = this.set("reportSuccess", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReportSuccess: Self = this.set("reportSuccess", js.undefined)
  }
  
}

