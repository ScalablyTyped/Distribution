package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response to an async batch image annotation request.
  */
@js.native
trait SchemaGoogleCloudVisionV1p4beta1AsyncBatchAnnotateImagesResponse extends js.Object {
  /**
    * The output location and metadata from AsyncBatchAnnotateImagesRequest.
    */
  var outputConfig: js.UndefOr[SchemaGoogleCloudVisionV1p4beta1OutputConfig] = js.native
}

object SchemaGoogleCloudVisionV1p4beta1AsyncBatchAnnotateImagesResponse {
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p4beta1AsyncBatchAnnotateImagesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p4beta1AsyncBatchAnnotateImagesResponse]
  }
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p4beta1AsyncBatchAnnotateImagesResponseOps[Self <: SchemaGoogleCloudVisionV1p4beta1AsyncBatchAnnotateImagesResponse] (val x: Self) extends AnyVal {
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
    def setOutputConfig(value: SchemaGoogleCloudVisionV1p4beta1OutputConfig): Self = this.set("outputConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputConfig: Self = this.set("outputConfig", js.undefined)
  }
  
}

