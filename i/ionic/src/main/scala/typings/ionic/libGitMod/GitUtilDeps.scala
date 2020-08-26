package typings.ionic.libGitMod

import typings.ionic.definitionsMod.IShell
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitUtilDeps extends js.Object {
  var shell: IShell = js.native
}

object GitUtilDeps {
  @scala.inline
  def apply(shell: IShell): GitUtilDeps = {
    val __obj = js.Dynamic.literal(shell = shell.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitUtilDeps]
  }
  @scala.inline
  implicit class GitUtilDepsOps[Self <: GitUtilDeps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setShell(value: IShell): Self = this.set("shell", value.asInstanceOf[js.Any])
  }
  
}

