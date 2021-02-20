package typings.ionic.definitionsMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
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
  implicit class IMultiProjectConfigMutableBuilder[Self <: IMultiProjectConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProject(value: String): Self = StObject.set(x, "defaultProject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultProjectUndefined: Self = StObject.set(x, "defaultProject", js.undefined)
    
    @scala.inline
    def setProjects(value: StringDictionary[js.UndefOr[IProjectConfig]]): Self = StObject.set(x, "projects", value.asInstanceOf[js.Any])
  }
}
