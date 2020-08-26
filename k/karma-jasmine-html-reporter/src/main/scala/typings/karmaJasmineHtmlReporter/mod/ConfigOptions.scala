package typings.karmaJasmineHtmlReporter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigOptions extends js.Object {
  /**
    * In combination with multiple reporters you may want to disable failed messages
    * because it's already handled by another reporter
    * See {@link https://github.com/dfederm/karma-jasmine-html-reporter#with-options}
    */
  var jasmineHtmlReporter: js.UndefOr[JasmineHtmlReporterOptions] = js.native
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
    def setJasmineHtmlReporter(value: JasmineHtmlReporterOptions): Self = this.set("jasmineHtmlReporter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJasmineHtmlReporter: Self = this.set("jasmineHtmlReporter", js.undefined)
  }
  
}

