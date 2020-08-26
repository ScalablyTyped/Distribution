package typings.karmaSpecReporter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpecReporterOptions extends js.Object {
  /** test would finish with error when a first fail occurs */
  var failFast: js.UndefOr[Boolean] = js.native
  /** limit number of lines logged per test */
  var maxLogLines: js.UndefOr[Double] = js.native
  /** print the time elapsed for each spec */
  var showSpecTiming: js.UndefOr[Boolean] = js.native
  /** do not print error summary */
  var suppressErrorSummary: js.UndefOr[Boolean] = js.native
  /** do not print information about failed tests */
  var suppressFailed: js.UndefOr[Boolean] = js.native
  /** do not print information about passed tests */
  var suppressPassed: js.UndefOr[Boolean] = js.native
  /** do not print information about skipped tests */
  var suppressSkipped: js.UndefOr[Boolean] = js.native
}

object SpecReporterOptions {
  @scala.inline
  def apply(): SpecReporterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpecReporterOptions]
  }
  @scala.inline
  implicit class SpecReporterOptionsOps[Self <: SpecReporterOptions] (val x: Self) extends AnyVal {
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
    def setFailFast(value: Boolean): Self = this.set("failFast", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailFast: Self = this.set("failFast", js.undefined)
    @scala.inline
    def setMaxLogLines(value: Double): Self = this.set("maxLogLines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxLogLines: Self = this.set("maxLogLines", js.undefined)
    @scala.inline
    def setShowSpecTiming(value: Boolean): Self = this.set("showSpecTiming", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowSpecTiming: Self = this.set("showSpecTiming", js.undefined)
    @scala.inline
    def setSuppressErrorSummary(value: Boolean): Self = this.set("suppressErrorSummary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressErrorSummary: Self = this.set("suppressErrorSummary", js.undefined)
    @scala.inline
    def setSuppressFailed(value: Boolean): Self = this.set("suppressFailed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressFailed: Self = this.set("suppressFailed", js.undefined)
    @scala.inline
    def setSuppressPassed(value: Boolean): Self = this.set("suppressPassed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressPassed: Self = this.set("suppressPassed", js.undefined)
    @scala.inline
    def setSuppressSkipped(value: Boolean): Self = this.set("suppressSkipped", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressSkipped: Self = this.set("suppressSkipped", js.undefined)
  }
  
}

