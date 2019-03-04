package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolvedStarterTemplate extends StarterTemplate {
  var archive: java.lang.String
}

object ResolvedStarterTemplate {
  @scala.inline
  def apply(
    archive: java.lang.String,
    id: java.lang.String,
    name: java.lang.String,
    `type`: ProjectType,
    description: java.lang.String = null
  ): ResolvedStarterTemplate = {
    val __obj = js.Dynamic.literal(archive = archive, id = id, name = name)
    __obj.updateDynamic("type")(`type`)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[ResolvedStarterTemplate]
  }
}

