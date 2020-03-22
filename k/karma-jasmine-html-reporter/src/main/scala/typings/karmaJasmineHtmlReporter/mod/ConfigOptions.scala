package typings.karmaJasmineHtmlReporter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigOptions extends js.Object {
  /**
    * In combination with multiple reporters you may want to disable failed messages
    * because it's already handled by another reporter
    * See {@link https://github.com/dfederm/karma-jasmine-html-reporter#with-options}
    */
  var jasmineHtmlReporter: js.UndefOr[JasmineHtmlReporterOptions] = js.undefined
}

object ConfigOptions {
  @scala.inline
  def apply(jasmineHtmlReporter: JasmineHtmlReporterOptions = null): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    if (jasmineHtmlReporter != null) __obj.updateDynamic("jasmineHtmlReporter")(jasmineHtmlReporter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigOptions]
  }
}

