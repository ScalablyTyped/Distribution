package typings.ionic.libIntegrationsMod

import typings.ionic.definitionsMod.IConfig
import typings.ionic.definitionsMod.ILogger
import typings.ionic.definitionsMod.IProject
import typings.ionic.definitionsMod.IShell
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntegrationDeps extends js.Object {
  val config: IConfig
  val log: ILogger
  val project: IProject
  val shell: IShell
}

object IntegrationDeps {
  @scala.inline
  def apply(config: IConfig, log: ILogger, project: IProject, shell: IShell): IntegrationDeps = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], shell = shell.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntegrationDeps]
  }
}

