package typings.ionic.hooksMod

import typings.ionic.definitionsMod.IConfig
import typings.ionic.definitionsMod.IProject
import typings.ionic.definitionsMod.IShell
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HookDeps extends js.Object {
  val config: IConfig = js.native
  val project: IProject = js.native
  val shell: IShell = js.native
}

object HookDeps {
  @scala.inline
  def apply(config: IConfig, project: IProject, shell: IShell): HookDeps = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], shell = shell.asInstanceOf[js.Any])
    __obj.asInstanceOf[HookDeps]
  }
  @scala.inline
  implicit class HookDepsOps[Self <: HookDeps] (val x: Self) extends AnyVal {
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
    def setConfig(value: IConfig): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def setProject(value: IProject): Self = this.set("project", value.asInstanceOf[js.Any])
    @scala.inline
    def setShell(value: IShell): Self = this.set("shell", value.asInstanceOf[js.Any])
  }
  
}

