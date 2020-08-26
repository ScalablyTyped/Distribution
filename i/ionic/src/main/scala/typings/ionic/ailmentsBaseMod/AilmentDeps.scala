package typings.ionic.ailmentsBaseMod

import typings.ionic.definitionsMod.IClient
import typings.ionic.definitionsMod.IConfig
import typings.ionic.definitionsMod.ILogger
import typings.ionic.definitionsMod.IProject
import typings.ionic.definitionsMod.ISession
import typings.ionic.definitionsMod.IShell
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AilmentDeps extends js.Object {
  var client: IClient = js.native
  var config: IConfig = js.native
  var log: ILogger = js.native
  var project: IProject = js.native
  var session: ISession = js.native
  var shell: IShell = js.native
}

object AilmentDeps {
  @scala.inline
  def apply(
    client: IClient,
    config: IConfig,
    log: ILogger,
    project: IProject,
    session: ISession,
    shell: IShell
  ): AilmentDeps = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], shell = shell.asInstanceOf[js.Any])
    __obj.asInstanceOf[AilmentDeps]
  }
  @scala.inline
  implicit class AilmentDepsOps[Self <: AilmentDeps] (val x: Self) extends AnyVal {
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
    def setClient(value: IClient): Self = this.set("client", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfig(value: IConfig): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def setLog(value: ILogger): Self = this.set("log", value.asInstanceOf[js.Any])
    @scala.inline
    def setProject(value: IProject): Self = this.set("project", value.asInstanceOf[js.Any])
    @scala.inline
    def setSession(value: ISession): Self = this.set("session", value.asInstanceOf[js.Any])
    @scala.inline
    def setShell(value: IShell): Self = this.set("shell", value.asInstanceOf[js.Any])
  }
  
}

