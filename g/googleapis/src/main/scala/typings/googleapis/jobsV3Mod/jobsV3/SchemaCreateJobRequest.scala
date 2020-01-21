package typings.googleapis.jobsV3Mod.jobsV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Input only.  Create job request.
  */
@js.native
trait SchemaCreateJobRequest extends js.Object {
  /**
    * Required.  The Job to be created.
    */
  var job: js.UndefOr[SchemaJob] = js.native
}

object SchemaCreateJobRequest {
  @scala.inline
  def apply(job: SchemaJob = null): SchemaCreateJobRequest = {
    val __obj = js.Dynamic.literal()
    if (job != null) __obj.updateDynamic("job")(job.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCreateJobRequest]
  }
}

