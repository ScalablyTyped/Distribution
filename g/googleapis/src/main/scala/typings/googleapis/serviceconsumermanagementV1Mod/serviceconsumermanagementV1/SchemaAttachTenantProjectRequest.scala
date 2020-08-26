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
  def apply(): SchemaAttachTenantProjectRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAttachTenantProjectRequest]
  }
  @scala.inline
  implicit class SchemaAttachTenantProjectRequestOps[Self <: SchemaAttachTenantProjectRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExternalResource(value: String): Self = this.set("externalResource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternalResource: Self = this.set("externalResource", js.undefined)
    @scala.inline
    def setReservedResource(value: String): Self = this.set("reservedResource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReservedResource: Self = this.set("reservedResource", js.undefined)
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
  }
  
}

