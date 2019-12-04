package typings.ionic.libStartMod

import typings.ionic.definitionsMod.ProjectType
import typings.ionic.ionicNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewAppSchema
  extends BaseAppSchema
     with AppSchema {
  var cloned: `false`
  var name: String
  var template: String
  var `type`: ProjectType
}

object NewAppSchema {
  @scala.inline
  def apply(
    cloned: `false`,
    name: String,
    projectDir: String,
    projectId: String,
    template: String,
    `type`: ProjectType,
    appflowId: String = null,
    packageId: String = null
  ): NewAppSchema = {
    val __obj = js.Dynamic.literal(cloned = cloned.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], projectDir = projectDir.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (appflowId != null) __obj.updateDynamic("appflowId")(appflowId.asInstanceOf[js.Any])
    if (packageId != null) __obj.updateDynamic("packageId")(packageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewAppSchema]
  }
}

