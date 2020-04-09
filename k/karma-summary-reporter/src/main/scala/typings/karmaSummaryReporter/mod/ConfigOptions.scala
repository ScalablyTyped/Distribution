package typings.karmaSummaryReporter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigOptions extends js.Object {
  /**
    * Show a table detailing the test results for all connected browsers at the end of a test run.
    * This gives a better overview which browsers are broken than the output of other reporters.
    * see {@link https://github.com/sth/karma-summary-reporter#config}
    */
  val summaryReporter: js.UndefOr[SummaryReporterConfig] = js.undefined
}

object ConfigOptions {
  @scala.inline
  def apply(summaryReporter: SummaryReporterConfig = null): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    if (summaryReporter != null) __obj.updateDynamic("summaryReporter")(summaryReporter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigOptions]
  }
}

