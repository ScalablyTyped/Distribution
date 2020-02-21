package typings.karmaRemapCoverage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigOptions extends js.Object {
  /**
    * Key-value pairs where key is report type and value - path to file/dir where to save it.
    * Reporters like `text-summary`, `text-lcov` and `teamcity` can print out to console as well
    * - in this case just provide any falsy value instead of path.
    *
    * @example
    * ```ts
    * 'text-summary': null, // to show summary in console
    * html: './coverage/html',
    * ```
    *
    * {@link https://github.com/sshev/karma-remap-coverage#remapcoveragereporter-format }
    */
  var remapCoverageReporter: js.UndefOr[KarmaRemapCoverageReporter] = js.undefined
}

object ConfigOptions {
  @scala.inline
  def apply(remapCoverageReporter: KarmaRemapCoverageReporter = null): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    if (remapCoverageReporter != null) __obj.updateDynamic("remapCoverageReporter")(remapCoverageReporter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigOptions]
  }
}

