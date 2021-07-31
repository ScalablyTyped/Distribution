package typings.ionic.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseStarterTemplate extends StObject {
  
  var description: js.UndefOr[String] = js.undefined
  
  var name: String
  
  var projectType: ProjectType
}
object BaseStarterTemplate {
  
  @scala.inline
  def apply(name: String, projectType: ProjectType): BaseStarterTemplate = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], projectType = projectType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseStarterTemplate]
  }
  
  @scala.inline
  implicit class BaseStarterTemplateMutableBuilder[Self <: BaseStarterTemplate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectType(value: ProjectType): Self = StObject.set(x, "projectType", value.asInstanceOf[js.Any])
  }
}
