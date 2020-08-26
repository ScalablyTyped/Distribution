package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The desired output location and metadata.
  */
@js.native
trait SchemaGoogleCloudVisionV1p3beta1OutputConfig extends js.Object {
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
  var gcsDestination: js.UndefOr[SchemaGoogleCloudVisionV1p3beta1GcsDestination] = js.native
}

object SchemaGoogleCloudVisionV1p3beta1OutputConfig {
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p3beta1OutputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p3beta1OutputConfig]
  }
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p3beta1OutputConfigOps[Self <: SchemaGoogleCloudVisionV1p3beta1OutputConfig] (val x: Self) extends AnyVal {
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
    def setBatchSize(value: Double): Self = this.set("batchSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBatchSize: Self = this.set("batchSize", js.undefined)
    @scala.inline
    def setGcsDestination(value: SchemaGoogleCloudVisionV1p3beta1GcsDestination): Self = this.set("gcsDestination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGcsDestination: Self = this.set("gcsDestination", js.undefined)
  }
  
}

