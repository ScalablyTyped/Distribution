package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata for online images.
  */
@js.native
trait SchemaGoogleCloudVisionV1p1beta1WebDetectionWebImage extends js.Object {
  /**
    * (Deprecated) Overall relevancy score for the image.
    */
  var score: js.UndefOr[Double] = js.native
  /**
    * The result image URL.
    */
  var url: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudVisionV1p1beta1WebDetectionWebImage {
  @scala.inline
  def apply(score: js.UndefOr[Double] = js.undefined, url: String = null): SchemaGoogleCloudVisionV1p1beta1WebDetectionWebImage = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(score)) __obj.updateDynamic("score")(score.get.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p1beta1WebDetectionWebImage]
  }
}

