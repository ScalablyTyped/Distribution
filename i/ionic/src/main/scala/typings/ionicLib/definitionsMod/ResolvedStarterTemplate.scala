package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolvedStarterTemplate extends BaseStarterTemplate {
  var archive: java.lang.String
}

object ResolvedStarterTemplate {
  @scala.inline
  def apply(
    archive: java.lang.String,
    name: java.lang.String,
    projectType: ProjectType,
    description: java.lang.String = null
  ): ResolvedStarterTemplate = {
    val __obj = js.Dynamic.literal(archive = archive, name = name, projectType = projectType)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[ResolvedStarterTemplate]
  }
}

