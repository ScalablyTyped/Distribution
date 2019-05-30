package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepoStarterTemplate
  extends BaseStarterTemplate
     with StarterTemplate {
  var repo: java.lang.String
  var `type`: ionicLib.ionicLibStrings.repo
}

object RepoStarterTemplate {
  @scala.inline
  def apply(
    name: java.lang.String,
    projectType: ProjectType,
    repo: java.lang.String,
    `type`: ionicLib.ionicLibStrings.repo,
    description: java.lang.String = null
  ): RepoStarterTemplate = {
    val __obj = js.Dynamic.literal(name = name, projectType = projectType, repo = repo)
    __obj.updateDynamic("type")(`type`)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[RepoStarterTemplate]
  }
}

