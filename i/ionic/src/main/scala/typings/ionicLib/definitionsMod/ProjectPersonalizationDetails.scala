package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectPersonalizationDetails extends js.Object {
  var description: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
  var packageId: js.UndefOr[java.lang.String] = js.undefined
  var projectId: java.lang.String
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object ProjectPersonalizationDetails {
  @scala.inline
  def apply(
    name: java.lang.String,
    projectId: java.lang.String,
    description: java.lang.String = null,
    packageId: java.lang.String = null,
    version: java.lang.String = null
  ): ProjectPersonalizationDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("projectId")(projectId)
    if (description != null) __obj.updateDynamic("description")(description)
    if (packageId != null) __obj.updateDynamic("packageId")(packageId)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[ProjectPersonalizationDetails]
  }
}

