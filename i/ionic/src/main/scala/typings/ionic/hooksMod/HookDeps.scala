package typings.ionic.hooksMod

import typings.ionic.definitionsMod.IConfig
import typings.ionic.definitionsMod.IProject
import typings.ionic.definitionsMod.IShell
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HookDeps extends js.Object {
  val config: IConfig
  val project: IProject
  val shell: IShell
}

object HookDeps {
  @scala.inline
  def apply(config: IConfig, project: IProject, shell: IShell): HookDeps = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], shell = shell.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HookDeps]
  }
}

