package typings.karmaBriefReporter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BriefReporterOptions extends js.Object {
  /**
    * Print the test failures immediately instead of at the end
    * @default false
    */
  var earlyErrorReport: js.UndefOr[Boolean] = js.native
  /**
    * Omits stack frames from external dependencies like qunit,
    * jasmine or chai, which appear in stack traces of failed
    * tests and which are usually irrelevant to the tested code
    * @default false
    */
  var omitExternalStackFrames: js.UndefOr[Boolean] = js.native
  /**
    * Only render the graphic after all tests have finished.
    * This is ideal for using this reporter in a continuous integration environment
    * @default false
    */
  var renderOnRunCompleteOnly: js.UndefOr[Boolean] = js.native
  /**
    * Suppress the browser console log at the end of the test run
    * @default false
    */
  var suppressBrowserLogs: js.UndefOr[Boolean] = js.native
  /**
    * Suppress the red background on errors in the error
    * report at the end of the test run.
    * @default false
    */
  var suppressErrorHighlighting: js.UndefOr[Boolean] = js.native
  /**
    * Suppress the error report at the end of the test run
    * @default false
    */
  var suppressErrorReport: js.UndefOr[Boolean] = js.native
}

object BriefReporterOptions {
  @scala.inline
  def apply(): BriefReporterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BriefReporterOptions]
  }
  @scala.inline
  implicit class BriefReporterOptionsOps[Self <: BriefReporterOptions] (val x: Self) extends AnyVal {
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
    def setEarlyErrorReport(value: Boolean): Self = this.set("earlyErrorReport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEarlyErrorReport: Self = this.set("earlyErrorReport", js.undefined)
    @scala.inline
    def setOmitExternalStackFrames(value: Boolean): Self = this.set("omitExternalStackFrames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOmitExternalStackFrames: Self = this.set("omitExternalStackFrames", js.undefined)
    @scala.inline
    def setRenderOnRunCompleteOnly(value: Boolean): Self = this.set("renderOnRunCompleteOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderOnRunCompleteOnly: Self = this.set("renderOnRunCompleteOnly", js.undefined)
    @scala.inline
    def setSuppressBrowserLogs(value: Boolean): Self = this.set("suppressBrowserLogs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressBrowserLogs: Self = this.set("suppressBrowserLogs", js.undefined)
    @scala.inline
    def setSuppressErrorHighlighting(value: Boolean): Self = this.set("suppressErrorHighlighting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressErrorHighlighting: Self = this.set("suppressErrorHighlighting", js.undefined)
    @scala.inline
    def setSuppressErrorReport(value: Boolean): Self = this.set("suppressErrorReport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressErrorReport: Self = this.set("suppressErrorReport", js.undefined)
  }
  
}

