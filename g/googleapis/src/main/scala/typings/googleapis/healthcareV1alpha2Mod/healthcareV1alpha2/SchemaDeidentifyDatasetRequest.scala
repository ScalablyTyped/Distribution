package typings.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Redacts identifying information from the specified dataset.
  */
@js.native
trait SchemaDeidentifyDatasetRequest extends js.Object {
  /**
    * Deidentify configuration.
    */
  var config: js.UndefOr[SchemaDeidentifyConfig] = js.native
  /**
    * The name of the dataset resource to create and write the redacted data to
    * (e.g.,
    * `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}`).
    * * The destination dataset must not exist.  * The destination dataset must
    * be in the same project as the source    dataset. De-identifying data
    * across multiple projects is not supported.
    */
  var destinationDataset: js.UndefOr[String] = js.native
}

object SchemaDeidentifyDatasetRequest {
  @scala.inline
  def apply(config: SchemaDeidentifyConfig = null, destinationDataset: String = null): SchemaDeidentifyDatasetRequest = {
    val __obj = js.Dynamic.literal()
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (destinationDataset != null) __obj.updateDynamic("destinationDataset")(destinationDataset.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDeidentifyDatasetRequest]
  }
}

