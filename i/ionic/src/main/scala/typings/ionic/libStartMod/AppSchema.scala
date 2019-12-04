package typings.ionic.libStartMod

import typings.ionic.definitionsMod.ProjectType
import typings.ionic.ionicNumbers.`false`
import typings.ionic.ionicNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.ionic.libStartMod.NewAppSchema
  - typings.ionic.libStartMod.ClonedAppSchema
*/
trait AppSchema extends js.Object

object AppSchema {
  @scala.inline
  def NewAppSchema(
    cloned: `false`,
    name: String,
    projectDir: String,
    projectId: String,
    template: String,
    `type`: ProjectType,
    appflowId: String = null,
    packageId: String = null
  ): AppSchema = {
    val __obj = js.Dynamic.literal(cloned = cloned.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], projectDir = projectDir.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (appflowId != null) __obj.updateDynamic("appflowId")(appflowId.asInstanceOf[js.Any])
    if (packageId != null) __obj.updateDynamic("packageId")(packageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppSchema]
  }
  @scala.inline
  def ClonedAppSchema(
    cloned: `true`,
    projectDir: String,
    projectId: String,
    url: String,
    appflowId: String = null,
    packageId: String = null
  ): AppSchema = {
    val __obj = js.Dynamic.literal(cloned = cloned.asInstanceOf[js.Any], projectDir = projectDir.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (appflowId != null) __obj.updateDynamic("appflowId")(appflowId.asInstanceOf[js.Any])
    if (packageId != null) __obj.updateDynamic("packageId")(packageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppSchema]
  }
}

