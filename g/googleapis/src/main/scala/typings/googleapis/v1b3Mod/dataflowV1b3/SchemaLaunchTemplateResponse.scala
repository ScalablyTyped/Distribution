package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response to the request to launch a template.
  */
@js.native
trait SchemaLaunchTemplateResponse extends js.Object {
  /**
    * The job that was launched, if the request was not a dry run and the job
    * was successfully launched.
    */
  var job: js.UndefOr[SchemaJob] = js.native
}

object SchemaLaunchTemplateResponse {
  @scala.inline
  def apply(job: SchemaJob = null): SchemaLaunchTemplateResponse = {
    val __obj = js.Dynamic.literal()
    if (job != null) __obj.updateDynamic("job")(job.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLaunchTemplateResponse]
  }
}

