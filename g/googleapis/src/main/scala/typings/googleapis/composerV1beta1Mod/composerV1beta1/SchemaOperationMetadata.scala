package typings.googleapis.composerV1beta1Mod.composerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata describing an operation.
  */
@js.native
trait SchemaOperationMetadata extends js.Object {
  /**
    * Output only. The time the operation was submitted to the server.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Output only. The time when the operation terminated, regardless of its
    * success. This field is unset if the operation is still ongoing.
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * Output only. The type of operation being performed.
    */
  var operationType: js.UndefOr[String] = js.native
  /**
    * Output only. The resource being operated on, as a [relative resource
    * name]( /apis/design/resource_names#relative_resource_name).
    */
  var resource: js.UndefOr[String] = js.native
  /**
    * Output only. The UUID of the resource being operated on.
    */
  var resourceUuid: js.UndefOr[String] = js.native
  /**
    * Output only. The current operation state.
    */
  var state: js.UndefOr[String] = js.native
}

object SchemaOperationMetadata {
  @scala.inline
  def apply(): SchemaOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOperationMetadata]
  }
  @scala.inline
  implicit class SchemaOperationMetadataOps[Self <: SchemaOperationMetadata] (val x: Self) extends AnyVal {
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
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    @scala.inline
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    @scala.inline
    def setOperationType(value: String): Self = this.set("operationType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperationType: Self = this.set("operationType", js.undefined)
    @scala.inline
    def setResource(value: String): Self = this.set("resource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResource: Self = this.set("resource", js.undefined)
    @scala.inline
    def setResourceUuid(value: String): Self = this.set("resourceUuid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceUuid: Self = this.set("resourceUuid", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
  
}

