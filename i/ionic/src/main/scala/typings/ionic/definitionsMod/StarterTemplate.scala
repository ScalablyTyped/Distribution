package typings.ionic.definitionsMod

import typings.ionic.ionicStrings.managed
import typings.ionic.ionicStrings.repo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.ionic.definitionsMod.RepoStarterTemplate
  - typings.ionic.definitionsMod.ManagedStarterTemplate
*/
trait StarterTemplate extends js.Object

object StarterTemplate {
  @scala.inline
  def RepoStarterTemplate(name: String, projectType: ProjectType, repo: String, `type`: repo, description: String = null): StarterTemplate = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], projectType = projectType.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[StarterTemplate]
  }
  @scala.inline
  def ManagedStarterTemplate(id: String, name: String, projectType: ProjectType, `type`: managed, description: String = null): StarterTemplate = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], projectType = projectType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[StarterTemplate]
  }
}

