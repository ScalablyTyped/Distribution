package typings.karmaChromeLauncher.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomLauncher extends js.Object {
  /**
    * The `--user-data-dir` is set to a temporary directory,
    * but can be overridden on a custom launcher as shown below.
    * One reason to do this is to have a permanent Chrome user data directory inside the project directory
    * to be able to install plugins there (e.g. JetBrains IDE Support plugin).
    */
  var chromeDataDir: js.UndefOr[String] = js.undefined
}

object CustomLauncher {
  @scala.inline
  def apply(chromeDataDir: String = null): CustomLauncher = {
    val __obj = js.Dynamic.literal()
    if (chromeDataDir != null) __obj.updateDynamic("chromeDataDir")(chromeDataDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomLauncher]
  }
}

