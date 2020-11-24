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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IonicAngularAilmentDeps extends AilmentDeps {
  
  @JSName("project")
  val project_IonicAngularAilmentDeps: IonicAngularProject = js.native
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
  
  @scala.inline
  implicit class IonicAngularAilmentDepsOps[Self <: IonicAngularAilmentDeps] (val x: Self) extends AnyVal {
    
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
    def setProject(value: IonicAngularProject): Self = this.set("project", value.asInstanceOf[js.Any])
  }
}
