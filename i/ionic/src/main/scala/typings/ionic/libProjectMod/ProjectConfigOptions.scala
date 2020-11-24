package typings.ionic.libProjectMod

import typings.ionic.definitionsMod.ProjectType
import typings.ionicCliFramework.configMod.BaseConfigOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectConfigOptions extends BaseConfigOptions {
  
  val `type`: js.UndefOr[ProjectType] = js.native
}
object ProjectConfigOptions {
  
  @scala.inline
  def apply(): ProjectConfigOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectConfigOptions]
  }
  
  @scala.inline
  implicit class ProjectConfigOptionsOps[Self <: ProjectConfigOptions] (val x: Self) extends AnyVal {
    
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
    def setType(value: ProjectType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
