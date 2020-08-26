package typings.ionic.libProjectMod

import typings.minimist.mod.ParsedArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectDetailsDeps extends js.Object {
  val args: js.UndefOr[ParsedArgs] = js.native
  val e: ProjectDeps = js.native
  val rootDirectory: String = js.native
}

object ProjectDetailsDeps {
  @scala.inline
  def apply(e: ProjectDeps, rootDirectory: String): ProjectDetailsDeps = {
    val __obj = js.Dynamic.literal(e = e.asInstanceOf[js.Any], rootDirectory = rootDirectory.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectDetailsDeps]
  }
  @scala.inline
  implicit class ProjectDetailsDepsOps[Self <: ProjectDetailsDeps] (val x: Self) extends AnyVal {
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
    def setE(value: ProjectDeps): Self = this.set("e", value.asInstanceOf[js.Any])
    @scala.inline
    def setRootDirectory(value: String): Self = this.set("rootDirectory", value.asInstanceOf[js.Any])
    @scala.inline
    def setArgs(value: ParsedArgs): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
  }
  
}

