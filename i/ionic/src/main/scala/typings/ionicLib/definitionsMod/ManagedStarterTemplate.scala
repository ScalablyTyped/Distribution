package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagedStarterTemplate
  extends BaseStarterTemplate
     with StarterTemplate {
  var id: java.lang.String
  var `type`: ionicLib.ionicLibStrings.managed
}

object ManagedStarterTemplate {
  @scala.inline
  def apply(
    id: java.lang.String,
    name: java.lang.String,
    projectType: ProjectType,
    `type`: ionicLib.ionicLibStrings.managed,
    description: java.lang.String = null
  ): ManagedStarterTemplate = {
    val __obj = js.Dynamic.literal(id = id, name = name, projectType = projectType)
    __obj.updateDynamic("type")(`type`)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[ManagedStarterTemplate]
  }
}

