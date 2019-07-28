package typings.ionic.definitionsMod

import typings.ionic.ionicStrings.managed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagedStarterTemplate
  extends BaseStarterTemplate
     with StarterTemplate {
  var id: String
  var `type`: managed
}

object ManagedStarterTemplate {
  @scala.inline
  def apply(id: String, name: String, projectType: ProjectType, `type`: managed, description: String = null): ManagedStarterTemplate = {
    val __obj = js.Dynamic.literal(id = id, name = name, projectType = projectType)
    __obj.updateDynamic("type")(`type`)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[ManagedStarterTemplate]
  }
}

