package typings
package gulpDashCleanDashDestLib.gulpDashCleanDashDestMod.gulpCleanDestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * The working directory the folder is relative to.
    */
  var cwd: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Extension of the destination files. Useful if it differs from the original.
    */
  var extension: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(cwd: java.lang.String = null, extension: java.lang.String = null): Options = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    __obj.asInstanceOf[Options]
  }
}

