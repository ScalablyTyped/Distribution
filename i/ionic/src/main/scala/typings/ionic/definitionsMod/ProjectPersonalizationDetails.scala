package typings.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectPersonalizationDetails extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var name: String
  var packageId: js.UndefOr[String] = js.undefined
  var projectId: String
  var version: js.UndefOr[String] = js.undefined
}

object ProjectPersonalizationDetails {
  @scala.inline
  def apply(
    name: String,
    projectId: String,
    description: String = null,
    packageId: String = null,
    version: String = null
  ): ProjectPersonalizationDetails = {
    val __obj = js.Dynamic.literal(name = name, projectId = projectId)
    if (description != null) __obj.updateDynamic("description")(description)
    if (packageId != null) __obj.updateDynamic("packageId")(packageId)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[ProjectPersonalizationDetails]
  }
}

