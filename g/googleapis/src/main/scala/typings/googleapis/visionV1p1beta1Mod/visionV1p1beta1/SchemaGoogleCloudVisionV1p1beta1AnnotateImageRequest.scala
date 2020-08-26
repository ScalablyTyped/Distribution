package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request for performing Google Cloud Vision API tasks over a user-provided
  * image, with user-requested features, and with context information.
  */
@js.native
trait SchemaGoogleCloudVisionV1p1beta1AnnotateImageRequest extends js.Object {
  /**
    * Requested features.
    */
  var features: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p1beta1Feature]] = js.native
  /**
    * The image to be processed.
    */
  var image: js.UndefOr[SchemaGoogleCloudVisionV1p1beta1Image] = js.native
  /**
    * Additional context that may accompany the image.
    */
  var imageContext: js.UndefOr[SchemaGoogleCloudVisionV1p1beta1ImageContext] = js.native
}

object SchemaGoogleCloudVisionV1p1beta1AnnotateImageRequest {
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p1beta1AnnotateImageRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p1beta1AnnotateImageRequest]
  }
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p1beta1AnnotateImageRequestOps[Self <: SchemaGoogleCloudVisionV1p1beta1AnnotateImageRequest] (val x: Self) extends AnyVal {
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
    def setFeaturesVarargs(value: SchemaGoogleCloudVisionV1p1beta1Feature*): Self = this.set("features", js.Array(value :_*))
    @scala.inline
    def setFeatures(value: js.Array[SchemaGoogleCloudVisionV1p1beta1Feature]): Self = this.set("features", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeatures: Self = this.set("features", js.undefined)
    @scala.inline
    def setImage(value: SchemaGoogleCloudVisionV1p1beta1Image): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    @scala.inline
    def setImageContext(value: SchemaGoogleCloudVisionV1p1beta1ImageContext): Self = this.set("imageContext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageContext: Self = this.set("imageContext", js.undefined)
  }
  
}

