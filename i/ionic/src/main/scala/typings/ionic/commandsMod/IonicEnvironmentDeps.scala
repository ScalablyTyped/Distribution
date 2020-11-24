package typings.ionic.commandsMod

import typings.ionic.definitionsMod.IProject
import typings.ionic.definitionsMod.IonicEnvironment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IonicEnvironmentDeps extends js.Object {
  
  val env: IonicEnvironment = js.native
  
  val project: js.UndefOr[IProject] = js.native
}
object IonicEnvironmentDeps {
  
  @scala.inline
  def apply(env: IonicEnvironment): IonicEnvironmentDeps = {
    val __obj = js.Dynamic.literal(env = env.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonicEnvironmentDeps]
  }
  
  @scala.inline
  implicit class IonicEnvironmentDepsOps[Self <: IonicEnvironmentDeps] (val x: Self) extends AnyVal {
    
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
    def setEnv(value: IonicEnvironment): Self = this.set("env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProject(value: IProject): Self = this.set("project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProject: Self = this.set("project", js.undefined)
  }
}
