package typings.launchpad.launchpadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaunchOptions extends js.Object {
  var browser: String
  var version: js.UndefOr[String] = js.undefined
}

object LaunchOptions {
  @scala.inline
  def apply(browser: String, version: String = null): LaunchOptions = {
    val __obj = js.Dynamic.literal(browser = browser)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[LaunchOptions]
  }
}

