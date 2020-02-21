package typings.karmaBrowserstackLauncher.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigOptions extends js.Object {
  /**
    * {@link https://github.com/karma-runner/karma-browserstack-launcher#global-options}
    */
  var browserStack: js.UndefOr[BrowserStackOptions] = js.undefined
}

object ConfigOptions {
  @scala.inline
  def apply(browserStack: BrowserStackOptions = null): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    if (browserStack != null) __obj.updateDynamic("browserStack")(browserStack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigOptions]
  }
}

