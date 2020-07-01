package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata for web pages.
  */
@js.native
trait SchemaGoogleCloudVisionV1p4beta1WebDetectionWebPage extends js.Object {
  /**
    * Fully matching images on the page. Can include resized copies of the
    * query image.
    */
  var fullMatchingImages: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p4beta1WebDetectionWebImage]] = js.native
  /**
    * Title for the web page, may contain HTML markups.
    */
  var pageTitle: js.UndefOr[String] = js.native
  /**
    * Partial matching images on the page. Those images are similar enough to
    * share some key-point features. For example an original image will likely
    * have partial matching for its crops.
    */
  var partialMatchingImages: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p4beta1WebDetectionWebImage]] = js.native
  /**
    * (Deprecated) Overall relevancy score for the web page.
    */
  var score: js.UndefOr[Double] = js.native
  /**
    * The result web page URL.
    */
  var url: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudVisionV1p4beta1WebDetectionWebPage {
  @scala.inline
  def apply(
    fullMatchingImages: js.Array[SchemaGoogleCloudVisionV1p4beta1WebDetectionWebImage] = null,
    pageTitle: String = null,
    partialMatchingImages: js.Array[SchemaGoogleCloudVisionV1p4beta1WebDetectionWebImage] = null,
    score: js.UndefOr[Double] = js.undefined,
    url: String = null
  ): SchemaGoogleCloudVisionV1p4beta1WebDetectionWebPage = {
    val __obj = js.Dynamic.literal()
    if (fullMatchingImages != null) __obj.updateDynamic("fullMatchingImages")(fullMatchingImages.asInstanceOf[js.Any])
    if (pageTitle != null) __obj.updateDynamic("pageTitle")(pageTitle.asInstanceOf[js.Any])
    if (partialMatchingImages != null) __obj.updateDynamic("partialMatchingImages")(partialMatchingImages.asInstanceOf[js.Any])
    if (!js.isUndefined(score)) __obj.updateDynamic("score")(score.get.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p4beta1WebDetectionWebPage]
  }
}

