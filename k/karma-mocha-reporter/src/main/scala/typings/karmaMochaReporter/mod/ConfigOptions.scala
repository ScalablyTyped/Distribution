package typings.karmaMochaReporter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigOptions extends js.Object {
  /**
    * {@link https://github.com/litixsoft/karma-mocha-reporter#options}
    */
  var mochaReporter: js.UndefOr[MochaReporterOptions] = js.undefined
}

object ConfigOptions {
  @scala.inline
  def apply(mochaReporter: MochaReporterOptions = null): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    if (mochaReporter != null) __obj.updateDynamic("mochaReporter")(mochaReporter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigOptions]
  }
}

