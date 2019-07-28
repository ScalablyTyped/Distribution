package typings.ionic.definitionsMod

import typings.ionic.ionicStrings.repo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepoStarterTemplate
  extends BaseStarterTemplate
     with StarterTemplate {
  var repo: String
  var `type`: repo
}

object RepoStarterTemplate {
  @scala.inline
  def apply(name: String, projectType: ProjectType, repo: String, `type`: repo, description: String = null): RepoStarterTemplate = {
    val __obj = js.Dynamic.literal(name = name, projectType = projectType, repo = repo)
    __obj.updateDynamic("type")(`type`)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[RepoStarterTemplate]
  }
}

