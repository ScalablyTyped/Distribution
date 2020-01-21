package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An offline file annotation request.
  */
@js.native
trait SchemaGoogleCloudVisionV1p1beta1AsyncAnnotateFileRequest extends js.Object {
  /**
    * Required. Requested features.
    */
  var features: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p1beta1Feature]] = js.native
  /**
    * Additional context that may accompany the image(s) in the file.
    */
  var imageContext: js.UndefOr[SchemaGoogleCloudVisionV1p1beta1ImageContext] = js.native
  /**
    * Required. Information about the input file.
    */
  var inputConfig: js.UndefOr[SchemaGoogleCloudVisionV1p1beta1InputConfig] = js.native
  /**
    * Required. The desired output location and metadata (e.g. format).
    */
  var outputConfig: js.UndefOr[SchemaGoogleCloudVisionV1p1beta1OutputConfig] = js.native
}

object SchemaGoogleCloudVisionV1p1beta1AsyncAnnotateFileRequest {
  @scala.inline
  def apply(
    features: js.Array[SchemaGoogleCloudVisionV1p1beta1Feature] = null,
    imageContext: SchemaGoogleCloudVisionV1p1beta1ImageContext = null,
    inputConfig: SchemaGoogleCloudVisionV1p1beta1InputConfig = null,
    outputConfig: SchemaGoogleCloudVisionV1p1beta1OutputConfig = null
  ): SchemaGoogleCloudVisionV1p1beta1AsyncAnnotateFileRequest = {
    val __obj = js.Dynamic.literal()
    if (features != null) __obj.updateDynamic("features")(features.asInstanceOf[js.Any])
    if (imageContext != null) __obj.updateDynamic("imageContext")(imageContext.asInstanceOf[js.Any])
    if (inputConfig != null) __obj.updateDynamic("inputConfig")(inputConfig.asInstanceOf[js.Any])
    if (outputConfig != null) __obj.updateDynamic("outputConfig")(outputConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p1beta1AsyncAnnotateFileRequest]
  }
}

