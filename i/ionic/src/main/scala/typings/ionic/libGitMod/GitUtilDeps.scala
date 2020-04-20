package typings.ionic.libGitMod

import typings.ionic.definitionsMod.IShell
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitUtilDeps extends js.Object {
  var shell: IShell
}

object GitUtilDeps {
  @scala.inline
  def apply(shell: IShell): GitUtilDeps = {
    val __obj = js.Dynamic.literal(shell = shell.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitUtilDeps]
  }
}

