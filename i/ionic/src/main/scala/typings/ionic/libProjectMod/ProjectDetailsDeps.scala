package typings.ionic.libProjectMod

import typings.minimist.minimistMod.ParsedArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectDetailsDeps extends js.Object {
  val args: js.UndefOr[ParsedArgs] = js.undefined
  val e: ProjectDeps
  val rootDirectory: String
}

object ProjectDetailsDeps {
  @scala.inline
  def apply(e: ProjectDeps, rootDirectory: String, args: ParsedArgs = null): ProjectDetailsDeps = {
    val __obj = js.Dynamic.literal(e = e, rootDirectory = rootDirectory)
    if (args != null) __obj.updateDynamic("args")(args)
    __obj.asInstanceOf[ProjectDetailsDeps]
  }
}

