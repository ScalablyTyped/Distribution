package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseStarterTemplate extends js.Object {
  var description: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
  var projectType: ProjectType
}

object BaseStarterTemplate {
  @scala.inline
  def apply(name: java.lang.String, projectType: ProjectType, description: java.lang.String = null): BaseStarterTemplate = {
    val __obj = js.Dynamic.literal(name = name, projectType = projectType)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[BaseStarterTemplate]
  }
}

