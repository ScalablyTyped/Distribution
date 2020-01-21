package typings.googleapis.peopleV1Mod.peopleV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response for a specific contact group.
  */
@js.native
trait SchemaContactGroupResponse extends js.Object {
  /**
    * The contact group.
    */
  var contactGroup: js.UndefOr[SchemaContactGroup] = js.native
  /**
    * The original requested resource name.
    */
  var requestedResourceName: js.UndefOr[String] = js.native
  /**
    * The status of the response.
    */
  var status: js.UndefOr[SchemaStatus] = js.native
}

object SchemaContactGroupResponse {
  @scala.inline
  def apply(
    contactGroup: SchemaContactGroup = null,
    requestedResourceName: String = null,
    status: SchemaStatus = null
  ): SchemaContactGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (contactGroup != null) __obj.updateDynamic("contactGroup")(contactGroup.asInstanceOf[js.Any])
    if (requestedResourceName != null) __obj.updateDynamic("requestedResourceName")(requestedResourceName.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaContactGroupResponse]
  }
}

