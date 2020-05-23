package typings.karmaDetectBrowsers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KarmaDetectBrowsers extends js.Object {
  /** enable/disable, default is true */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /** use headless mode, for browsers that support it, default is false */
  var preferHeadless: js.UndefOr[Boolean] = js.undefined
  /** enable/disable phantomjs support, default is true */
  var usePhantomJS: js.UndefOr[Boolean] = js.undefined
  /**
    * post processing of browsers list
    * here you can edit the list of browsers used by karma
    */
  def postDetection(availableBrowsers: js.Array[String]): js.Array[String]
}

object KarmaDetectBrowsers {
  @scala.inline
  def apply(
    postDetection: js.Array[String] => js.Array[String],
    enabled: js.UndefOr[Boolean] = js.undefined,
    preferHeadless: js.UndefOr[Boolean] = js.undefined,
    usePhantomJS: js.UndefOr[Boolean] = js.undefined
  ): KarmaDetectBrowsers = {
    val __obj = js.Dynamic.literal(postDetection = js.Any.fromFunction1(postDetection))
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(preferHeadless)) __obj.updateDynamic("preferHeadless")(preferHeadless.get.asInstanceOf[js.Any])
    if (!js.isUndefined(usePhantomJS)) __obj.updateDynamic("usePhantomJS")(usePhantomJS.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[KarmaDetectBrowsers]
  }
}

