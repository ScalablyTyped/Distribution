package typings.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolvedStarterTemplate extends BaseStarterTemplate {
  var archive: String
}

object ResolvedStarterTemplate {
  @scala.inline
  def apply(archive: String, name: String, projectType: ProjectType, description: String = null): ResolvedStarterTemplate = {
    val __obj = js.Dynamic.literal(archive = archive, name = name, projectType = projectType)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[ResolvedStarterTemplate]
  }
}

