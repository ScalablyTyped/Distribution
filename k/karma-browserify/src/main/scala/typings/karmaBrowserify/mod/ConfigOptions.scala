package typings.karmaBrowserify.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigOptions extends js.Object {
  /**
    * Config entry to configure how the bundle gets created
    * see {@link https://github.com/nikku/karma-browserify#usage}
    */
  var browserify: js.UndefOr[BrowserifyOptions] = js.undefined
  /**
    * You can configure the underlying watchify instance
    * see {@link https://github.com/nikku/karma-browserify#watchify-config}
    */
  var watchify: js.UndefOr[WatchifyOptions] = js.undefined
}

object ConfigOptions {
  @scala.inline
  def apply(browserify: BrowserifyOptions = null, watchify: WatchifyOptions = null): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    if (browserify != null) __obj.updateDynamic("browserify")(browserify.asInstanceOf[js.Any])
    if (watchify != null) __obj.updateDynamic("watchify")(watchify.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigOptions]
  }
}

