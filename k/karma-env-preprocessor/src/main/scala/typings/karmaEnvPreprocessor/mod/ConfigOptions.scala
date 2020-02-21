package typings.karmaEnvPreprocessor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigOptions extends js.Object {
  /**
    * environment variables available to your tests
    * {@link https://github.com/jsok/karma-env-preprocessor#configuration}
    */
  var envPreprocessor: js.UndefOr[js.Array[String]] = js.undefined
}

object ConfigOptions {
  @scala.inline
  def apply(envPreprocessor: js.Array[String] = null): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    if (envPreprocessor != null) __obj.updateDynamic("envPreprocessor")(envPreprocessor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigOptions]
  }
}

