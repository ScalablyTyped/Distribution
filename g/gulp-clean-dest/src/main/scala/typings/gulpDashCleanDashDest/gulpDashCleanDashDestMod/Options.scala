package typings.gulpDashCleanDashDest.gulpDashCleanDashDestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * The working directory the folder is relative to.
    */
  var cwd: js.UndefOr[String] = js.undefined
  /**
    * Extension of the destination files. Useful if it differs from the original.
    */
  var extension: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(cwd: String = null, extension: String = null): Options = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    __obj.asInstanceOf[Options]
  }
}

