package typings.googleapis.serviceconsumermanagementV1Mod.serviceconsumermanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message to remove a tenant project resource from the tenancy unit.
  */
@js.native
trait SchemaRemoveTenantProjectRequest extends js.Object {
  /**
    * Tag of the resource within the tenancy unit.
    */
  var tag: js.UndefOr[String] = js.native
}

object SchemaRemoveTenantProjectRequest {
  @scala.inline
  def apply(tag: String = null): SchemaRemoveTenantProjectRequest = {
    val __obj = js.Dynamic.literal()
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRemoveTenantProjectRequest]
  }
}

