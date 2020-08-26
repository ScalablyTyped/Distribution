package typings.googleapis.v1alpha2Mod.genomicsV1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to set operation status. Should only be used by VMs created by the
  * Pipelines Service and not by end users.
  */
@js.native
trait SchemaSetOperationStatusRequest extends js.Object {
  var errorCode: js.UndefOr[String] = js.native
  var errorMessage: js.UndefOr[String] = js.native
  var operationId: js.UndefOr[String] = js.native
  var timestampEvents: js.UndefOr[js.Array[SchemaTimestampEvent]] = js.native
  var validationToken: js.UndefOr[String] = js.native
}

object SchemaSetOperationStatusRequest {
  @scala.inline
  def apply(): SchemaSetOperationStatusRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSetOperationStatusRequest]
  }
  @scala.inline
  implicit class SchemaSetOperationStatusRequestOps[Self <: SchemaSetOperationStatusRequest] (val x: Self) extends AnyVal {
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
    def setErrorCode(value: String): Self = this.set("errorCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorCode: Self = this.set("errorCode", js.undefined)
    @scala.inline
    def setErrorMessage(value: String): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorMessage: Self = this.set("errorMessage", js.undefined)
    @scala.inline
    def setOperationId(value: String): Self = this.set("operationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperationId: Self = this.set("operationId", js.undefined)
    @scala.inline
    def setTimestampEventsVarargs(value: SchemaTimestampEvent*): Self = this.set("timestampEvents", js.Array(value :_*))
    @scala.inline
    def setTimestampEvents(value: js.Array[SchemaTimestampEvent]): Self = this.set("timestampEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimestampEvents: Self = this.set("timestampEvents", js.undefined)
    @scala.inline
    def setValidationToken(value: String): Self = this.set("validationToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidationToken: Self = this.set("validationToken", js.undefined)
  }
  
}

