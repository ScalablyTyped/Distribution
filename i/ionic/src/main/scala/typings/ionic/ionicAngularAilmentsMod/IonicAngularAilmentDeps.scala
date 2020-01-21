package typings.ionic.ionicAngularAilmentsMod

import typings.ionic.ailmentsBaseMod.AilmentDeps
import typings.ionic.definitionsMod.IClient
import typings.ionic.definitionsMod.IConfig
import typings.ionic.definitionsMod.ILogger
import typings.ionic.definitionsMod.ISession
import typings.ionic.definitionsMod.IShell
import typings.ionic.ionicAngularMod.IonicAngularProject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonicAngularAilmentDeps extends AilmentDeps {
  @JSName("project")
  val project_IonicAngularAilmentDeps: IonicAngularProject
}

object IonicAngularAilmentDeps {
  @scala.inline
  def apply(
    client: IClient,
    config: IConfig,
    log: ILogger,
    project: IonicAngularProject,
    session: ISession,
    shell: IShell
  ): IonicAngularAilmentDeps = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], shell = shell.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IonicAngularAilmentDeps]
  }
}

