package typings.karmaJsonPreprocessor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigOptions extends js.Object {
  /**
    * see {@link https://github.com/mjeanroy/karma-json-preprocessor#configuration-1}
    */
  var jsonPreprocessor: js.UndefOr[JsonPreprocessorOptions] = js.undefined
}

object ConfigOptions {
  @scala.inline
  def apply(jsonPreprocessor: JsonPreprocessorOptions = null): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    if (jsonPreprocessor != null) __obj.updateDynamic("jsonPreprocessor")(jsonPreprocessor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigOptions]
  }
}

