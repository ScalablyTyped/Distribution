package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The results of an inspect DataSource job.
  */
@js.native
trait SchemaGooglePrivacyDlpV2InspectDataSourceDetails extends js.Object {
  /**
    * The configuration used for this job.
    */
  var requestedOptions: js.UndefOr[SchemaGooglePrivacyDlpV2RequestedOptions] = js.native
  /**
    * A summary of the outcome of this inspect job.
    */
  var result: js.UndefOr[SchemaGooglePrivacyDlpV2Result] = js.native
}

object SchemaGooglePrivacyDlpV2InspectDataSourceDetails {
  @scala.inline
  def apply(
    requestedOptions: SchemaGooglePrivacyDlpV2RequestedOptions = null,
    result: SchemaGooglePrivacyDlpV2Result = null
  ): SchemaGooglePrivacyDlpV2InspectDataSourceDetails = {
    val __obj = js.Dynamic.literal()
    if (requestedOptions != null) __obj.updateDynamic("requestedOptions")(requestedOptions.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2InspectDataSourceDetails]
  }
}

