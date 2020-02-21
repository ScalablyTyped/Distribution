package typings.karmaDetectBrowsers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigOptions extends js.Object {
  /**
    * See https://github.com/karma-runner/karma-coverage/blob/master/docs/configuration.md
    */
  var detectBrowsers: js.UndefOr[KarmaDetectBrowsers] = js.undefined
}

object ConfigOptions {
  @scala.inline
  def apply(detectBrowsers: KarmaDetectBrowsers = null): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    if (detectBrowsers != null) __obj.updateDynamic("detectBrowsers")(detectBrowsers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigOptions]
  }
}

