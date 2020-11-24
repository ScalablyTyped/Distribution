package typings.ionic.definitionsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMultiProjectConfig extends ProjectFile {
  
  var defaultProject: js.UndefOr[String] = js.native
  
  var projects: StringDictionary[js.UndefOr[IProjectConfig]] = js.native
}
object IMultiProjectConfig {
  
  @scala.inline
  def apply(projects: StringDictionary[js.UndefOr[IProjectConfig]]): IMultiProjectConfig = {
    val __obj = js.Dynamic.literal(projects = projects.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMultiProjectConfig]
  }
  
  @scala.inline
  implicit class IMultiProjectConfigOps[Self <: IMultiProjectConfig] (val x: Self) extends AnyVal {
    
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
    def setProjects(value: StringDictionary[js.UndefOr[IProjectConfig]]): Self = this.set("projects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultProject(value: String): Self = this.set("defaultProject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultProject: Self = this.set("defaultProject", js.undefined)
  }
}
