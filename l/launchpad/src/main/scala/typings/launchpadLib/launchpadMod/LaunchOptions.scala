package typings
package launchpadLib.launchpadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaunchOptions extends js.Object {
  var browser: java.lang.String
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object LaunchOptions {
  @scala.inline
  def apply(browser: java.lang.String, version: java.lang.String = null): LaunchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("browser")(browser)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[LaunchOptions]
  }
}

