package typings.googleapis.storagetransferV1Mod.storagetransferV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request passed to UpdateTransferJob.
  */
@js.native
trait SchemaUpdateTransferJobRequest extends js.Object {
  /**
    * The ID of the Google Cloud Platform Console project that owns the job.
    * Required.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * The job to update. `transferJob` is expected to specify only three
    * fields: `description`, `transferSpec`, and `status`.  An
    * UpdateTransferJobRequest that specifies other fields will be rejected
    * with an error `INVALID_ARGUMENT`. Required.
    */
  var transferJob: js.UndefOr[SchemaTransferJob] = js.native
  /**
    * The field mask of the fields in `transferJob` that are to be updated in
    * this request.  Fields in `transferJob` that can be updated are:
    * `description`, `transferSpec`, and `status`.  To update the
    * `transferSpec` of the job, a complete transfer specification has to be
    * provided. An incomplete specification which misses any required fields
    * will be rejected with the error `INVALID_ARGUMENT`.
    */
  var updateTransferJobFieldMask: js.UndefOr[String] = js.native
}

object SchemaUpdateTransferJobRequest {
  @scala.inline
  def apply(): SchemaUpdateTransferJobRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateTransferJobRequest]
  }
  @scala.inline
  implicit class SchemaUpdateTransferJobRequestOps[Self <: SchemaUpdateTransferJobRequest] (val x: Self) extends AnyVal {
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
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
    @scala.inline
    def setTransferJob(value: SchemaTransferJob): Self = this.set("transferJob", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransferJob: Self = this.set("transferJob", js.undefined)
    @scala.inline
    def setUpdateTransferJobFieldMask(value: String): Self = this.set("updateTransferJobFieldMask", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateTransferJobFieldMask: Self = this.set("updateTransferJobFieldMask", js.undefined)
  }
  
}

