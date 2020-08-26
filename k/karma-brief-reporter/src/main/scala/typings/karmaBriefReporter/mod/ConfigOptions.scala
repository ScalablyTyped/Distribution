package typings.karmaBriefReporter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigOptions extends js.Object {
  /**
    * Reports test progress statistics and lists failures at the end of a Karma test run.
    * {@link https://github.com/prantlf/karma-brief-reporter#options}
    */
  var briefReporter: js.UndefOr[BriefReporterOptions] = js.native
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
    def setBriefReporter(value: BriefReporterOptions): Self = this.set("briefReporter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBriefReporter: Self = this.set("briefReporter", js.undefined)
  }
  
}

