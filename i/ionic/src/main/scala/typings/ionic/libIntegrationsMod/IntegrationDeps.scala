package typings.ionic.libIntegrationsMod

import typings.ionic.definitionsMod.IConfig
import typings.ionic.definitionsMod.ILogger
import typings.ionic.definitionsMod.IProject
import typings.ionic.definitionsMod.IShell
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntegrationDeps extends js.Object {
  
  val config: IConfig = js.native
  
  val log: ILogger = js.native
  
  val project: IProject = js.native
  
  val shell: IShell = js.native
}
object IntegrationDeps {
  
  @scala.inline
  def apply(config: IConfig, log: ILogger, project: IProject, shell: IShell): IntegrationDeps = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], shell = shell.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntegrationDeps]
  }
  
  @scala.inline
  implicit class IntegrationDepsOps[Self <: IntegrationDeps] (val x: Self) extends AnyVal {
    
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
    def setLog(value: ILogger): Self = this.set("log", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProject(value: IProject): Self = this.set("project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShell(value: IShell): Self = this.set("shell", value.asInstanceOf[js.Any])
  }
}
