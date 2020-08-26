package typings.googleapis.visionV1Mod.visionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response to a single file annotation request. A file may contain one or
  * more images, which individually have their own responses.
  */
@js.native
trait SchemaGoogleCloudVisionV1p4beta1AnnotateFileResponse extends js.Object {
  /**
    * Information about the file for which this response is generated.
    */
  var inputConfig: js.UndefOr[SchemaGoogleCloudVisionV1p4beta1InputConfig] = js.native
  /**
    * Individual responses to images found within the file.
    */
  var responses: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p4beta1AnnotateImageResponse]] = js.native
  /**
    * This field gives the total number of pages in the file.
    */
  var totalPages: js.UndefOr[Double] = js.native
}

object SchemaGoogleCloudVisionV1p4beta1AnnotateFileResponse {
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p4beta1AnnotateFileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p4beta1AnnotateFileResponse]
  }
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p4beta1AnnotateFileResponseOps[Self <: SchemaGoogleCloudVisionV1p4beta1AnnotateFileResponse] (val x: Self) extends AnyVal {
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
    def setInputConfig(value: SchemaGoogleCloudVisionV1p4beta1InputConfig): Self = this.set("inputConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputConfig: Self = this.set("inputConfig", js.undefined)
    @scala.inline
    def setResponsesVarargs(value: SchemaGoogleCloudVisionV1p4beta1AnnotateImageResponse*): Self = this.set("responses", js.Array(value :_*))
    @scala.inline
    def setResponses(value: js.Array[SchemaGoogleCloudVisionV1p4beta1AnnotateImageResponse]): Self = this.set("responses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponses: Self = this.set("responses", js.undefined)
    @scala.inline
    def setTotalPages(value: Double): Self = this.set("totalPages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalPages: Self = this.set("totalPages", js.undefined)
  }
  
}

