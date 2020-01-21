package typings.googleapis.dataprocV1Mod.dataprocV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A request to submit a job.
  */
@js.native
trait SchemaSubmitJobRequest extends js.Object {
  /**
    * Required. The job resource.
    */
  var job: js.UndefOr[SchemaJob] = js.native
  /**
    * Optional. A unique id used to identify the request. If the server
    * receives two SubmitJobRequest requests with the same id, then the second
    * request will be ignored and the first Job created and stored in the
    * backend is returned.It is recommended to always set this value to a UUID
    * (https://en.wikipedia.org/wiki/Universally_unique_identifier).The id must
    * contain only letters (a-z, A-Z), numbers (0-9), underscores (_), and
    * hyphens (-). The maximum length is 40 characters.
    */
  var requestId: js.UndefOr[String] = js.native
}

object SchemaSubmitJobRequest {
  @scala.inline
  def apply(job: SchemaJob = null, requestId: String = null): SchemaSubmitJobRequest = {
    val __obj = js.Dynamic.literal()
    if (job != null) __obj.updateDynamic("job")(job.asInstanceOf[js.Any])
    if (requestId != null) __obj.updateDynamic("requestId")(requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSubmitJobRequest]
  }
}

