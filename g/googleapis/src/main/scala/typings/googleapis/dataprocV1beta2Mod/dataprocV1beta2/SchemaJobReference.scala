package typings.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Encapsulates the full scoping used to reference a job.
  */
@js.native
trait SchemaJobReference extends js.Object {
  /**
    * Optional. The job ID, which must be unique within the project.The ID must
    * contain only letters (a-z, A-Z), numbers (0-9), underscores (_), or
    * hyphens (-). The maximum length is 100 characters.If not specified by the
    * caller, the job ID will be provided by the server.
    */
  var jobId: js.UndefOr[String] = js.native
  /**
    * Required. The ID of the Google Cloud Platform project that the job
    * belongs to.
    */
  var projectId: js.UndefOr[String] = js.native
}

object SchemaJobReference {
  @scala.inline
  def apply(): SchemaJobReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJobReference]
  }
  @scala.inline
  implicit class SchemaJobReferenceOps[Self <: SchemaJobReference] (val x: Self) extends AnyVal {
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
    def setJobId(value: String): Self = this.set("jobId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobId: Self = this.set("jobId", js.undefined)
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
  }
  
}

