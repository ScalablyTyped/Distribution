package typings.karmaJsonToFileReporter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigOptions extends js.Object {
  /**
    * see {@link https://www.npmjs.com/package/karma-json-to-file-reporter#config}
    */
  var jsonToFileReporter: js.UndefOr[JsonToFileReporterOptions] = js.undefined
}

object ConfigOptions {
  @scala.inline
  def apply(jsonToFileReporter: JsonToFileReporterOptions = null): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    if (jsonToFileReporter != null) __obj.updateDynamic("jsonToFileReporter")(jsonToFileReporter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigOptions]
  }
}

