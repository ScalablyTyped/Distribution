package typings.karmaRemapCoverage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
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
  var remapCoverageReporter: js.UndefOr[KarmaRemapCoverageReporter] = js.native
}

object ConfigOptions {
  @scala.inline
  def apply(): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigOptions]
  }
  @scala.inline
  implicit class ConfigOptionsOps[Self <: ConfigOptions] (val x: Self) extends AnyVal {
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
    def setRemapCoverageReporter(value: KarmaRemapCoverageReporter): Self = this.set("remapCoverageReporter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemapCoverageReporter: Self = this.set("remapCoverageReporter", js.undefined)
  }
  
}

