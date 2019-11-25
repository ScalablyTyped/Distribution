package typings.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseStarterTemplate extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var name: String
  var projectType: ProjectType
}

object BaseStarterTemplate {
  @scala.inline
  def apply(name: String, projectType: ProjectType, description: String = null): BaseStarterTemplate = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], projectType = projectType.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseStarterTemplate]
  }
}

