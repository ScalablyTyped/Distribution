package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes a resource associated with this operation.
  */
@js.native
trait SchemaResourceInfo extends js.Object {
  /**
    * The identifier of the parent of this resource instance. Must be in one of
    * the following formats:     - “projects/&lt;project-id or
    * project-number&gt;”     - “folders/&lt;folder-id&gt;”     -
    * “organizations/&lt;organization-id&gt;”
    */
  var resourceContainer: js.UndefOr[String] = js.native
  /**
    * The location of the resource. If not empty, the resource will be checked
    * against location policy. The value must be a valid zone, region or
    * multiregion. For example: &quot;europe-west4&quot; or
    * &quot;northamerica-northeast1-a&quot;
    */
  var resourceLocation: js.UndefOr[String] = js.native
  /**
    * Name of the resource. This is used for auditing purposes.
    */
  var resourceName: js.UndefOr[String] = js.native
}

object SchemaResourceInfo {
  @scala.inline
  def apply(resourceContainer: String = null, resourceLocation: String = null, resourceName: String = null): SchemaResourceInfo = {
    val __obj = js.Dynamic.literal()
    if (resourceContainer != null) __obj.updateDynamic("resourceContainer")(resourceContainer.asInstanceOf[js.Any])
    if (resourceLocation != null) __obj.updateDynamic("resourceLocation")(resourceLocation.asInstanceOf[js.Any])
    if (resourceName != null) __obj.updateDynamic("resourceName")(resourceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaResourceInfo]
  }
}

