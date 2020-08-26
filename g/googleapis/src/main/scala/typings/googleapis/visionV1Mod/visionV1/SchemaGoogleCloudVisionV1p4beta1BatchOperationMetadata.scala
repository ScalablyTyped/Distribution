package typings.googleapis.visionV1Mod.visionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata for the batch operations such as the current state.  This is
  * included in the `metadata` field of the `Operation` returned by the
  * `GetOperation` call of the `google::longrunning::Operations` service.
  */
@js.native
trait SchemaGoogleCloudVisionV1p4beta1BatchOperationMetadata extends js.Object {
  /**
    * The time when the batch request is finished and
    * google.longrunning.Operation.done is set to true.
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * The current state of the batch operation.
    */
  var state: js.UndefOr[String] = js.native
  /**
    * The time when the batch request was submitted to the server.
    */
  var submitTime: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudVisionV1p4beta1BatchOperationMetadata {
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p4beta1BatchOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p4beta1BatchOperationMetadata]
  }
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p4beta1BatchOperationMetadataOps[Self <: SchemaGoogleCloudVisionV1p4beta1BatchOperationMetadata] (val x: Self) extends AnyVal {
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
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setSubmitTime(value: String): Self = this.set("submitTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubmitTime: Self = this.set("submitTime", js.undefined)
  }
  
}

