package typings.googleapis.serviceconsumermanagementV1Mod.serviceconsumermanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to attach an existing project to the tenancy unit as a new tenant
  * resource.
  */
@js.native
trait SchemaAttachTenantProjectRequest extends js.Object {
  /**
    * When attaching an external project, this is in the format of
    * `projects/{project_number}`.
    */
  var externalResource: js.UndefOr[String] = js.native
  /**
    * When attaching a reserved project already in tenancy units, this is the
    * tag of a tenant resource under the tenancy unit for the managed
    * service&#39;s service producer project. The reserved tenant resource must
    * be in an active state.
    */
  var reservedResource: js.UndefOr[String] = js.native
  /**
    * Tag of the tenant resource after attachment. Must be less than 128
    * characters. Required.
    */
  var tag: js.UndefOr[String] = js.native
}

object SchemaAttachTenantProjectRequest {
  @scala.inline
  def apply(externalResource: String = null, reservedResource: String = null, tag: String = null): SchemaAttachTenantProjectRequest = {
    val __obj = js.Dynamic.literal()
    if (externalResource != null) __obj.updateDynamic("externalResource")(externalResource.asInstanceOf[js.Any])
    if (reservedResource != null) __obj.updateDynamic("reservedResource")(reservedResource.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAttachTenantProjectRequest]
  }
}

