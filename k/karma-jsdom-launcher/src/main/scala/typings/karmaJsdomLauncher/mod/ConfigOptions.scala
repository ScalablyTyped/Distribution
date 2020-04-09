package typings.karmaJsdomLauncher.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigOptions extends js.Object {
  /**
    * Launcher for jsdom configuration
    */
  var jsdomLauncher: js.UndefOr[JsdomLauncherOptions] = js.undefined
}

object ConfigOptions {
  @scala.inline
  def apply(jsdomLauncher: JsdomLauncherOptions = null): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    if (jsdomLauncher != null) __obj.updateDynamic("jsdomLauncher")(jsdomLauncher.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigOptions]
  }
}

