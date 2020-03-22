package typings.karmaCoverage.mod

import typings.karmaCoverage.KarmaCoverageReporterrepo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigOptions extends js.Object {
  /**
    * {@link https://github.com/karma-runner/karma-coverage/blob/v1.1.2/docs/configuration.md }
    */
  var coverageReporter: js.UndefOr[KarmaCoverageReporterrepo] = js.undefined
}

object ConfigOptions {
  @scala.inline
  def apply(coverageReporter: KarmaCoverageReporterrepo = null): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    if (coverageReporter != null) __obj.updateDynamic("coverageReporter")(coverageReporter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigOptions]
  }
}

