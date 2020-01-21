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
  def apply(jobId: String = null, projectId: String = null): SchemaJobReference = {
    val __obj = js.Dynamic.literal()
    if (jobId != null) __obj.updateDynamic("jobId")(jobId.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaJobReference]
  }
}

