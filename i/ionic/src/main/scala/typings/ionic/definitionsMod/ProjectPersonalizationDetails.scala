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
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (packageId != null) __obj.updateDynamic("packageId")(packageId.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectPersonalizationDetails]
  }
}

