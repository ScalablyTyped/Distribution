package typings.karmaSpecReporter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigOptions extends js.Object {
  /**
    * {@link https://github.com/mlex/karma-spec-reporter#configuration}
    */
  var specReporter: js.UndefOr[SpecReporterOptions] = js.undefined
}

object ConfigOptions {
  @scala.inline
  def apply(specReporter: SpecReporterOptions = null): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    if (specReporter != null) __obj.updateDynamic("specReporter")(specReporter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigOptions]
  }
}

