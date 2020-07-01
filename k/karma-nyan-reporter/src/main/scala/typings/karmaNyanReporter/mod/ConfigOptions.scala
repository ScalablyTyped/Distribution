package typings.karmaNyanReporter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigOptions extends js.Object {
  /**
    * If you want to suppress the stack trace at the end of the test run you can use the suppressErrorReport option.
    * {@link https://github.com/dgarlitt/karma-nyan-reporter#options}
    */
  var nyanReporter: js.UndefOr[NyanCatOptions] = js.undefined
}

object ConfigOptions {
  @scala.inline
  def apply(nyanReporter: NyanCatOptions = null): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    if (nyanReporter != null) __obj.updateDynamic("nyanReporter")(nyanReporter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigOptions]
  }
}

