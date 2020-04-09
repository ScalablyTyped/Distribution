package typings.karmaSummaryReporter.mod

import typings.karmaSummaryReporter.karmaSummaryReporterStrings.all
import typings.karmaSummaryReporter.karmaSummaryReporterStrings.failed
import typings.karmaSummaryReporter.karmaSummaryReporterStrings.skipped
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SummaryReporterConfig extends js.Object {
  /**
    * Shows a overview column in the results table, showing the total result of a test over all browsers
    * ("failed" if the test failed anywhere, ...)
    */
  var overviewColumn: js.UndefOr[Boolean] = js.undefined
  /**
    * Select which tests are displayed in the summary:
    * * 'failed': Only show tests that failed in some browser (default)
    * * 'skipped': Additionally show tests that got skipped in some browser
    * * 'all': Show all test, also ones that didn't fail specLength
    */
  var show: js.UndefOr[failed | skipped | all] = js.undefined
  /**
    * Space reserved to display the spec label (width of the first column in the results table).
    */
  var specLength: js.UndefOr[Double] = js.undefined
}

object SummaryReporterConfig {
  @scala.inline
  def apply(
    overviewColumn: js.UndefOr[Boolean] = js.undefined,
    show: failed | skipped | all = null,
    specLength: Int | Double = null
  ): SummaryReporterConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(overviewColumn)) __obj.updateDynamic("overviewColumn")(overviewColumn.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (specLength != null) __obj.updateDynamic("specLength")(specLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[SummaryReporterConfig]
  }
}

