package typings.karmaBriefReporter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BriefReporterOptions extends js.Object {
  /**
    * Print the test failures immediately instead of at the end
    * @default false
    */
  var earlyErrorReport: js.UndefOr[Boolean] = js.undefined
  /**
    * Omits stack frames from external dependencies like qunit,
    * jasmine or chai, which appear in stack traces of failed
    * tests and which are usually irrelevant to the tested code
    * @default false
    */
  var omitExternalStackFrames: js.UndefOr[Boolean] = js.undefined
  /**
    * Only render the graphic after all tests have finished.
    * This is ideal for using this reporter in a continuous integration environment
    * @default false
    */
  var renderOnRunCompleteOnly: js.UndefOr[Boolean] = js.undefined
  /**
    * Suppress the browser console log at the end of the test run
    * @default false
    */
  var suppressBrowserLogs: js.UndefOr[Boolean] = js.undefined
  /**
    * Suppress the red background on errors in the error
    * report at the end of the test run.
    * @default false
    */
  var suppressErrorHighlighting: js.UndefOr[Boolean] = js.undefined
  /**
    * Suppress the error report at the end of the test run
    * @default false
    */
  var suppressErrorReport: js.UndefOr[Boolean] = js.undefined
}

object BriefReporterOptions {
  @scala.inline
  def apply(
    earlyErrorReport: js.UndefOr[Boolean] = js.undefined,
    omitExternalStackFrames: js.UndefOr[Boolean] = js.undefined,
    renderOnRunCompleteOnly: js.UndefOr[Boolean] = js.undefined,
    suppressBrowserLogs: js.UndefOr[Boolean] = js.undefined,
    suppressErrorHighlighting: js.UndefOr[Boolean] = js.undefined,
    suppressErrorReport: js.UndefOr[Boolean] = js.undefined
  ): BriefReporterOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(earlyErrorReport)) __obj.updateDynamic("earlyErrorReport")(earlyErrorReport.asInstanceOf[js.Any])
    if (!js.isUndefined(omitExternalStackFrames)) __obj.updateDynamic("omitExternalStackFrames")(omitExternalStackFrames.asInstanceOf[js.Any])
    if (!js.isUndefined(renderOnRunCompleteOnly)) __obj.updateDynamic("renderOnRunCompleteOnly")(renderOnRunCompleteOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressBrowserLogs)) __obj.updateDynamic("suppressBrowserLogs")(suppressBrowserLogs.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressErrorHighlighting)) __obj.updateDynamic("suppressErrorHighlighting")(suppressErrorHighlighting.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressErrorReport)) __obj.updateDynamic("suppressErrorReport")(suppressErrorReport.asInstanceOf[js.Any])
    __obj.asInstanceOf[BriefReporterOptions]
  }
}

