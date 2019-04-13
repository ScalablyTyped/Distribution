package typings
package ionicLib.libProjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectDetailsDeps extends js.Object {
  val args: js.UndefOr[minimistLib.minimistMod.ParsedArgs] = js.undefined
  val e: ProjectDeps
  val rootDirectory: java.lang.String
}

object ProjectDetailsDeps {
  @scala.inline
  def apply(e: ProjectDeps, rootDirectory: java.lang.String, args: minimistLib.minimistMod.ParsedArgs = null): ProjectDetailsDeps = {
    val __obj = js.Dynamic.literal(e = e, rootDirectory = rootDirectory)
    if (args != null) __obj.updateDynamic("args")(args)
    __obj.asInstanceOf[ProjectDetailsDeps]
  }
}

