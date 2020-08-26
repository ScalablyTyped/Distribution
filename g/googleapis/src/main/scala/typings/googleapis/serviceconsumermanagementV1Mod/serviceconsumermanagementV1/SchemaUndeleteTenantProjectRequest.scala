package typings.googleapis.serviceconsumermanagementV1Mod.serviceconsumermanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message to undelete tenant project resource previously deleted from
  * the tenancy unit.
  */
@js.native
trait SchemaUndeleteTenantProjectRequest extends js.Object {
  /**
    * Tag of the resource within the tenancy unit.
    */
  var tag: js.UndefOr[String] = js.native
}

object SchemaUndeleteTenantProjectRequest {
  @scala.inline
  def apply(): SchemaUndeleteTenantProjectRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUndeleteTenantProjectRequest]
  }
  @scala.inline
  implicit class SchemaUndeleteTenantProjectRequestOps[Self <: SchemaUndeleteTenantProjectRequest] (val x: Self) extends AnyVal {
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
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
  }
  
}

