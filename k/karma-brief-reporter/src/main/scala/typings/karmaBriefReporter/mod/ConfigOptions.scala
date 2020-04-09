package typings.karmaBriefReporter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigOptions extends js.Object {
  /**
    * Reports test progress statistics and lists failures at the end of a Karma test run.
    * {@link https://github.com/prantlf/karma-brief-reporter#options}
    */
  var briefReporter: js.UndefOr[BriefReporterOptions] = js.undefined
}

object ConfigOptions {
  @scala.inline
  def apply(briefReporter: BriefReporterOptions = null): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    if (briefReporter != null) __obj.updateDynamic("briefReporter")(briefReporter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigOptions]
  }
}

