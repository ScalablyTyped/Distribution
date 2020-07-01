package typings.googleapis.jobsV2Mod.jobsV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Input only.  Create job request.
  */
@js.native
trait SchemaCreateJobRequest extends js.Object {
  /**
    * Deprecated. Please use processing_options. This flag is ignored if
    * processing_options is set.  Optional.  If set to `true`, the service does
    * not attempt to resolve a more precise address for the job.
    */
  var disableStreetAddressResolution: js.UndefOr[Boolean] = js.native
  /**
    * Required.  The Job to be created.
    */
  var job: js.UndefOr[SchemaJob] = js.native
  /**
    * Optional.  Options for job processing.
    */
  var processingOptions: js.UndefOr[SchemaJobProcessingOptions] = js.native
}

object SchemaCreateJobRequest {
  @scala.inline
  def apply(
    disableStreetAddressResolution: js.UndefOr[Boolean] = js.undefined,
    job: SchemaJob = null,
    processingOptions: SchemaJobProcessingOptions = null
  ): SchemaCreateJobRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disableStreetAddressResolution)) __obj.updateDynamic("disableStreetAddressResolution")(disableStreetAddressResolution.get.asInstanceOf[js.Any])
    if (job != null) __obj.updateDynamic("job")(job.asInstanceOf[js.Any])
    if (processingOptions != null) __obj.updateDynamic("processingOptions")(processingOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCreateJobRequest]
  }
}

