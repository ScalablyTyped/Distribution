package typings.ionic.definitionsMod

import typings.ionic.ionicStrings.repo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RepoStarterTemplate
  extends BaseStarterTemplate
     with StarterTemplate {
  
  var repo: String = js.native
  
  var `type`: repo = js.native
}
object RepoStarterTemplate {
  
  @scala.inline
  def apply(name: String, projectType: ProjectType, repo: String, `type`: repo): RepoStarterTemplate = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], projectType = projectType.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepoStarterTemplate]
  }
  
  @scala.inline
  implicit class RepoStarterTemplateMutableBuilder[Self <: RepoStarterTemplate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: repo): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
