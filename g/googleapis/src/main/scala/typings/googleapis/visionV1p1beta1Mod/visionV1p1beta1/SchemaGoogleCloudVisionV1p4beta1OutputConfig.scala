package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The desired output location and metadata.
  */
@js.native
trait SchemaGoogleCloudVisionV1p4beta1OutputConfig extends js.Object {
  /**
    * The max number of response protos to put into each output JSON file on
    * Google Cloud Storage. The valid range is [1, 100]. If not specified, the
    * default value is 20.  For example, for one pdf file with 100 pages, 100
    * response protos will be generated. If `batch_size` = 20, then 5 json
    * files each containing 20 response protos will be written under the prefix
    * `gcs_destination`.`uri`.  Currently, batch_size only applies to
    * GcsDestination, with potential future support for other output
    * configurations.
    */
  var batchSize: js.UndefOr[Double] = js.native
  /**
    * The Google Cloud Storage location to write the output(s) to.
    */
  var gcsDestination: js.UndefOr[SchemaGoogleCloudVisionV1p4beta1GcsDestination] = js.native
}

object SchemaGoogleCloudVisionV1p4beta1OutputConfig {
  @scala.inline
  def apply(
    batchSize: Int | Double = null,
    gcsDestination: SchemaGoogleCloudVisionV1p4beta1GcsDestination = null
  ): SchemaGoogleCloudVisionV1p4beta1OutputConfig = {
    val __obj = js.Dynamic.literal()
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    if (gcsDestination != null) __obj.updateDynamic("gcsDestination")(gcsDestination.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p4beta1OutputConfig]
  }
}

