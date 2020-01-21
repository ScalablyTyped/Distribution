package typings.karmaCoverage.mod

import typings.karmaCoverage.AnonReporters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigOptions extends js.Object {
  /**
    * See https://github.com/karma-runner/karma-coverage/blob/master/docs/configuration.md
    */
  var coverageReporter: js.UndefOr[KarmaCoverageReporter with AnonReporters] = js.undefined
}

object ConfigOptions {
  @scala.inline
  def apply(coverageReporter: KarmaCoverageReporter with AnonReporters = null): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    if (coverageReporter != null) __obj.updateDynamic("coverageReporter")(coverageReporter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigOptions]
  }
}

