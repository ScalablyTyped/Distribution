package typings
package ionicLib.libProjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateProjectFromDirectoryOptions extends js.Object {
  var logErrors: js.UndefOr[scala.Boolean] = js.undefined
}

object CreateProjectFromDirectoryOptions {
  @scala.inline
  def apply(logErrors: js.UndefOr[scala.Boolean] = js.undefined): CreateProjectFromDirectoryOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(logErrors)) __obj.updateDynamic("logErrors")(logErrors)
    __obj.asInstanceOf[CreateProjectFromDirectoryOptions]
  }
}

