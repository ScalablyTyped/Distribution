package typings.googleapis.storagetransferV1Mod.storagetransferV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This resource represents the configuration of a transfer job that runs
  * periodically.
  */
@js.native
trait SchemaTransferJob extends js.Object {
  /**
    * This field cannot be changed by user requests.
    */
  var creationTime: js.UndefOr[String] = js.native
  /**
    * This field cannot be changed by user requests.
    */
  var deletionTime: js.UndefOr[String] = js.native
  /**
    * A description provided by the user for the job. Its max length is 1024
    * bytes when Unicode-encoded.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * This field cannot be changed by user requests.
    */
  var lastModificationTime: js.UndefOr[String] = js.native
  /**
    * A globally unique name assigned by Storage Transfer Service when the job
    * is created. This field should be left empty in requests to create a new
    * transfer job; otherwise, the requests result in an `INVALID_ARGUMENT`
    * error.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The ID of the Google Cloud Platform Project that owns the job.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * Schedule specification.
    */
  var schedule: js.UndefOr[SchemaSchedule] = js.native
  /**
    * Status of the job. This value MUST be specified for
    * `CreateTransferJobRequests`.  NOTE: The effect of the new job status
    * takes place during a subsequent job run. For example, if you change the
    * job status from `ENABLED` to `DISABLED`, and an operation spawned by the
    * transfer is running, the status change would not affect the current
    * operation.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * Transfer specification.
    */
  var transferSpec: js.UndefOr[SchemaTransferSpec] = js.native
}

object SchemaTransferJob {
  @scala.inline
  def apply(): SchemaTransferJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTransferJob]
  }
  @scala.inline
  implicit class SchemaTransferJobOps[Self <: SchemaTransferJob] (val x: Self) extends AnyVal {
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
    def setCreationTime(value: String): Self = this.set("creationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTime: Self = this.set("creationTime", js.undefined)
    @scala.inline
    def setDeletionTime(value: String): Self = this.set("deletionTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeletionTime: Self = this.set("deletionTime", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setLastModificationTime(value: String): Self = this.set("lastModificationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModificationTime: Self = this.set("lastModificationTime", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
    @scala.inline
    def setSchedule(value: SchemaSchedule): Self = this.set("schedule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchedule: Self = this.set("schedule", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setTransferSpec(value: SchemaTransferSpec): Self = this.set("transferSpec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransferSpec: Self = this.set("transferSpec", js.undefined)
  }
  
}

