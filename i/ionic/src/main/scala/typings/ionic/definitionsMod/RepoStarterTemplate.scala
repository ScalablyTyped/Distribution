package typings.ionic.definitionsMod

import typings.ionic.ionicStrings.repo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepoStarterTemplate
  extends StObject
     with BaseStarterTemplate
     with StarterTemplate {
  
  var repo: String
  
  var `type`: repo
}
object RepoStarterTemplate {
  
  inline def apply(name: String, projectType: ProjectType, repo: String): RepoStarterTemplate = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], projectType = projectType.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("repo")
    __obj.asInstanceOf[RepoStarterTemplate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RepoStarterTemplate] (val x: Self) extends AnyVal {
    
    inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    inline def setType(value: repo): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
