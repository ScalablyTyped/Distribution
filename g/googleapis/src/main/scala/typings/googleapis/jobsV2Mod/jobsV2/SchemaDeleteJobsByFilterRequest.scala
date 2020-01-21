package typings.googleapis.jobsV2Mod.jobsV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Deprecated. Use BatchDeleteJobsRequest instead.  Input only.  Delete job by
  * filter request.  The job typically becomes unsearchable within 10 seconds,
  * but it may take up to 5 minutes.
  */
@js.native
trait SchemaDeleteJobsByFilterRequest extends js.Object {
  /**
    * Optional.  If set to true, this call waits for all processing steps to
    * complete before the job is cleaned up. Otherwise, the call returns while
    * some steps are still taking place asynchronously, hence faster.
    */
  var disableFastProcess: js.UndefOr[Boolean] = js.native
  /**
    * Required.  Restrictions on the scope of the delete request.
    */
  var filter: js.UndefOr[SchemaFilter] = js.native
}

object SchemaDeleteJobsByFilterRequest {
  @scala.inline
  def apply(disableFastProcess: js.UndefOr[Boolean] = js.undefined, filter: SchemaFilter = null): SchemaDeleteJobsByFilterRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disableFastProcess)) __obj.updateDynamic("disableFastProcess")(disableFastProcess.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDeleteJobsByFilterRequest]
  }
}

