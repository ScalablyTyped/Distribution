package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Relevant information for the image from the Internet.
  */
@js.native
trait SchemaWebDetection extends js.Object {
  /**
    * The service&#39;s best guess as to the topic of the request image.
    * Inferred from similar images on the open web.
    */
  var bestGuessLabels: js.UndefOr[js.Array[SchemaWebLabel]] = js.native
  /**
    * Fully matching images from the Internet. Can include resized copies of
    * the query image.
    */
  var fullMatchingImages: js.UndefOr[js.Array[SchemaWebImage]] = js.native
  /**
    * Web pages containing the matching images from the Internet.
    */
  var pagesWithMatchingImages: js.UndefOr[js.Array[SchemaWebPage]] = js.native
  /**
    * Partial matching images from the Internet. Those images are similar
    * enough to share some key-point features. For example an original image
    * will likely have partial matching for its crops.
    */
  var partialMatchingImages: js.UndefOr[js.Array[SchemaWebImage]] = js.native
  /**
    * The visually similar image results.
    */
  var visuallySimilarImages: js.UndefOr[js.Array[SchemaWebImage]] = js.native
  /**
    * Deduced entities from similar images on the Internet.
    */
  var webEntities: js.UndefOr[js.Array[SchemaWebEntity]] = js.native
}

object SchemaWebDetection {
  @scala.inline
  def apply(
    bestGuessLabels: js.Array[SchemaWebLabel] = null,
    fullMatchingImages: js.Array[SchemaWebImage] = null,
    pagesWithMatchingImages: js.Array[SchemaWebPage] = null,
    partialMatchingImages: js.Array[SchemaWebImage] = null,
    visuallySimilarImages: js.Array[SchemaWebImage] = null,
    webEntities: js.Array[SchemaWebEntity] = null
  ): SchemaWebDetection = {
    val __obj = js.Dynamic.literal()
    if (bestGuessLabels != null) __obj.updateDynamic("bestGuessLabels")(bestGuessLabels.asInstanceOf[js.Any])
    if (fullMatchingImages != null) __obj.updateDynamic("fullMatchingImages")(fullMatchingImages.asInstanceOf[js.Any])
    if (pagesWithMatchingImages != null) __obj.updateDynamic("pagesWithMatchingImages")(pagesWithMatchingImages.asInstanceOf[js.Any])
    if (partialMatchingImages != null) __obj.updateDynamic("partialMatchingImages")(partialMatchingImages.asInstanceOf[js.Any])
    if (visuallySimilarImages != null) __obj.updateDynamic("visuallySimilarImages")(visuallySimilarImages.asInstanceOf[js.Any])
    if (webEntities != null) __obj.updateDynamic("webEntities")(webEntities.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaWebDetection]
  }
}

